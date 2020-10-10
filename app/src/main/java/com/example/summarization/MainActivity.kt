package com.example.summarization

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.TextRecognition
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException

class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG= MainActivity::class.simpleName
    }

    private lateinit var image: InputImage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    fun setListener(){
        rl_select_img.setOnClickListener {
            openImagePicker()
        }
    }

    private fun openImagePicker(){
        ImagePicker.with(this)
            .crop() //Crop image(Optional), Check Customization for more option
            .compress(1024)			//Final image size will be less than 1 MB(Optional)
            .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
            .start()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            setViewVisibility()
            //Image Uri will not be null for RESULT_OK
            val fileUri = data?.data
            Log.d(TAG, "onActivityResult: fileUri:"+ fileUri)
            iv_selected_img.setImageURI(fileUri)

            if(fileUri != null) {
                processImage(fileUri)
            }

        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(this, ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, resources.getString(R.string.task_cancelled), Toast.LENGTH_SHORT).show()
        }
    }
    private fun processImage(fileUri: Uri){
        tv_converted_text.text = ""
        progressBar.visibility = View.VISIBLE
        try {
            image = InputImage.fromFilePath(this, fileUri)
            val recognizer = TextRecognition.getClient()
            //Image Processing
            val result = recognizer.process(image)
                .addOnSuccessListener { visionText ->
                    // Task completed successfully
                    //This VisionText holds the actual text information
                    Log.d(TAG, "processImage:success ")
                    val resultText = visionText.text
                    Log.d(TAG, "processImage: extractedText:"+resultText)

                    if(TextUtils.isEmpty(resultText)){
                        progressBar.visibility = View.GONE
                        // show message
                        tv_converted_text.text = resources.getString(R.string.no_text_found)
                    }
                    else
                    {
                        progressBar.visibility = View.GONE
                        // set TextView
                        tv_converted_text.text=resultText
                    }


                }
                .addOnFailureListener { e ->
                    // Task failed with an exception
                    Log.e(TAG, "processImage: failure:"+e.message )
                }
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

    fun setViewVisibility(){
        iv_selected_img.visibility = View.VISIBLE
        tv_img_details.visibility = View.VISIBLE
        scrollView.visibility = View.VISIBLE
        ll_noselect_message.visibility = View.GONE
    }
}