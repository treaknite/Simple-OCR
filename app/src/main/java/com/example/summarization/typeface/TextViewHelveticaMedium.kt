package com.example.summarization.typeface

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class TextViewHelveticaMedium(context: Context, attrs: AttributeSet?) : AppCompatTextView(context, attrs) {
    init {
        val typeface = Typeface.createFromAsset(getContext().assets, "font/HelveticaNeue_Medium.ttf")
        if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB ||
            android.os.Build.VERSION.SDK_INT > android.os.Build.VERSION_CODES.HONEYCOMB_MR2) {
            setTypeface(typeface)
        }
    }
}