# Awesome Hacktoberfest ![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)

  

>  [Hacktoberfest](https://hacktoberfest.digitalocean.com/) is a chance to level up your coding skills and get small goodies in reward.

  

<br  />

<p  align="center">

<a  href="https://hacktoberfest.digitalocean.com/">

<img  src="https://i.ibb.co/4FjRdbH/Logo-Sponsors-Light.png"  alt="Logo">

</a>

</p>

  

<!-- [![Hacktoberfest 2019 logo](https://i.ibb.co/4FjRdbH/Logo-Sponsors-Light.png)](https://hacktoberfest.digitalocean.com/) -->

  

## Official website for registration and tips on how to get started

  

-  [Hacktoberfest Official Website](https://hacktoberfest.digitalocean.com/)

-  [Hacktoberfest Tutorial](https://youtu.be/0mjJS1Y8wrI) - Introduction to Hacktoberfest

-  [Hacktoberfest Swag List](https://benbarth.github.io/hacktoberfest-swag/) - List of all goodies given away by companies

  

# Table of Contents

-  [Awesome Hacktoberfest !Awesome](#awesome-hacktoberfest-img-srchttpscdnrawgitcomsindresorhusawesomed7305f38d29fed78fa85652e3a63e154dd8e8829mediabadgesvg-altawesome)

-  [Official website for registration and tips on how to get started](#official-website-for-registration-and-tips-on-how-to-get-started)

-  [Table of Contents](#table-of-contents)

-  [Simple_OCR](#simple_ocr)

-  [Built With](#built-with)

-  [Getting Started](#getting-started)

-  [1. Register yourself to Hacktoberfest 2020](#1-register-yourself-to-hacktoberfest-2020)

-  [Link to register: https://hacktoberfest.digitalocean.com/](#link-to-register-httpshacktoberfestdigitaloceancom)

-  [2. Get Started to start contributing](#2-get-started-to-start-contributing)

-  [3. Star and Fork this Repository](#3-star-and-fork-this-repository)

-  [You can star ⭐ and fork 🍽️ this repository on GitHub by navigating at the top of this repository.](#you-can-star--and-fork-️-this-repository-on-github-by-navigating-at-the-top-of-this-repository)

-  [GitHub repository URLs will reference both the username associated with the owner of the repository, as well as the repository name.](#github-repository-urls-will-reference-both-the-username-associated-with-the-owner-of-the-repository-as-well-as-the-repository-name)

-  [When you’re on the main page for the repository, you’ll see a button to "Star" and “Fork” the repository on your upper right-hand side of the page, underneath your user icon.](#when-youre-on-the-main-page-for-the-repository-youll-see-a-button-to-star-and-fork-the-repository-on-your-upper-right-hand-side-of-the-page-underneath-your-user-icon)

-  [4. Clone the Repository](#4-clone-the-repository)

-  [To make your own local copy of the repository you would like to contribute to, let’s first open up a terminal window.](#to-make-your-own-local-copy-of-the-repository-you-would-like-to-contribute-to-lets-first-open-up-a-terminal-window)

-  [We’ll use the git clone command along with the URL that points to your fork of the repository.](#well-use-the-git-clone-command-along-with-the-url-that-points-to-your-fork-of-the-repository)

-  [This URL will be similar to the URL above, except now it will end with .git. In the example above, the URL will look like this:](#this-url-will-be-similar-to-the-url-above-except-now-it-will-end-with-git-in-the-example-above-the-url-will-look-like-this)

-  [You can alternatively copy the URL by using the green “Clone or download” button from your repository page that you just forked from the original repository page. Once you click the button, you’ll be able to copy the URL by clicking the binder button next to the URL:](#you-can-alternatively-copy-the-url-by-using-the-green-clone-or-download-button-from-your-repository-page-that-you-just-forked-from-the-original-repository-page-once-you-click-the-button-youll-be-able-to-copy-the-url-by-clicking-the-binder-button-next-to-the-url)

-  [Once we have the URL, we’re ready to clone the repository. To do this, we’ll combine the git clone command with the repository URL from the command line in a terminal window:](#once-we-have-the-url-were-ready-to-clone-the-repository-to-do-this-well-combine-the-git-clone-command-with-the-repository-url-from-the-command-line-in-a-terminal-window)

-  [5. Create New Branch](#5-create-new-branch)

-  [Once the project is opened create a new branch and checkout in it where you can make the changes in the code.](#once-the-project-is-opened-create-a-new-branch-and-checkout-in-it-where-you-can-make-the-changes-in-the-code)

-  [You can do this either from terminal or Directly in your text editor.](#you-can-do-this-either-from-terminal-or-directly-in-your-text-editor)

-  [To do from Terminal:](#to-do-from-terminal)

-  [6. Commit and Push](#6-commit-and-push)

-  [After making the required changes commit and push your code](#after-making-the-required-changes-commit-and-push-your-code)

-  [Terminal:](#terminal)

-  [To add the changes after you have made the modifications](#to-add-the-changes-after-you-have-made-the-modifications)

-  [To commit and push the changes](#to-commit-and-push-the-changes)

-  [7. Update Local Repository](#7-update-local-repository)

-  [While working on a project alongside other contributors, it is important for you to keep your local repository up-to-date with the project as you don’t want to make a pull request for code that will cause conflicts. To keep your local copy of the code base updated, you’ll need to sync changes.](#while-working-on-a-project-alongside-other-contributors-it-is-important-for-you-to-keep-your-local-repository-up-to-date-with-the-project-as-you-dont-want-to-make-a-pull-request-for-code-that-will-cause-conflicts-to-keep-your-local-copy-of-the-code-base-updated-youll-need-to-sync-changes)

-  [We’ll first go over configuring a remote for the fork, then syncing the fork.](#well-first-go-over-configuring-a-remote-for-the-fork-then-syncing-the-fork)

-  [8. Configure a Remote for the Fork](#8-configure-a-remote-for-the-fork)

-  [You’ll have to specify a new remote upstream repository for us to sync with the fork. This will be the original repository that you forked from. you’ll have to do this with the git remote add command.](#youll-have-to-specify-a-new-remote-upstream-repository-for-us-to-sync-with-the-fork-this-will-be-the-original-repository-that-you-forked-from-youll-have-to-do-this-with-the-git-remote-add-command)

-  [In this example, // upstream // is the shortname we have supplied for the remote repository since in terms of Git, “upstream” refers to the repository that you cloned from. If you want to add a remote pointer to the repository of a collaborator, you may want to provide that collaborator’s username or a shortened nickname for the shortname.](#in-this-example--upstream--is-the-shortname-we-have-supplied-for-the-remote-repository-since-in-terms-of-git-upstream-refers-to-the-repository-that-you-cloned-from-if-you-want-to-add-a-remote-pointer-to-the-repository-of-a-collaborator-you-may-want-to-provide-that-collaborators-username-or-a-shortened-nickname-for-the-shortname)

-  [9. Sync the Fork](#9-sync-the-fork)

-  [Once you have configured a remote that references the upstream and original repository on GitHub, you are ready to sync your fork of the repository to keep it up-to-date.](#once-you-have-configured-a-remote-that-references-the-upstream-and-original-repository-on-github-you-are-ready-to-sync-your-fork-of-the-repository-to-keep-it-up-to-date)

-  [Switch to the local master branch of our repository:](#switch-to-the-local-master-branch-of-our-repository)

-  [Now merge any changes that were made in the original repository’s master branch, that you will access through your local upstream/master branch, with your local master branch:](#now-merge-any-changes-that-were-made-in-the-original-repositorys-master-branch-that-you-will-access-through-your-local-upstreammaster-branch-with-your-local-master-branch)

-  [10. Create Pull Request](#10-create-pull-request)

-  [At this point, you are ready to make a pull request to the original repository.](#at-this-point-you-are-ready-to-make-a-pull-request-to-the-original-repository)

-  [Now navigate to your forked repository, and press the “New pull request” button on your left-hand side of the page.](#now-navigate-to-your-forked-repository-and-press-the-new-pull-request-button-on-your-left-hand-side-of-the-page)

-  [Prerequisites](#prerequisites)

-  [Installation](#installation)

-  [Deployment](#deployment)

-  [License](#license)

-  [Author](#author)

- [Contributors](#contributors)


  

<br/>

  

# Simple_OCR
![](https://i.ibb.co/d76txJc/Screenshot-20201002-005429.jpg)![](https://i.ibb.co/hdH0ddZ/Screenshot-20201002-010348.jpg)

![](https://i.ibb.co/stFPZcQ/Screenshot-20201002-005617.jpg)![](https://i.ibb.co/bsxKG8N/Screenshot-20201002-005635.jpg)

  


  
  

This was just a fun project in order to explore the field of Android development using Kotlin.

  

## Built With

  

*  [Kotlin](https://kotlinlang.org/)
*  [Android Studio](https://developer.android.com/?authuser=2)

  

  

## Getting Started

  

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

  

### 1. Register yourself to Hacktoberfest 2020

###### Link to register: https://hacktoberfest.digitalocean.com/

![](https://i.ibb.co/SXFDCFm/hacktoberfest_website.png)

  

### 2. Get Started to start contributing

![](https://i.ibb.co/n3ftSNG/hacktoberfest_get_started.png)

  

### 3. Star and Fork this Repository

###### You can star ⭐ and fork 🍽️ this repository on GitHub by navigating at the top of this repository.

![](https://i.ibb.co/KVx0wHc/star-fork.jpg)

###### GitHub repository URLs will reference both the username associated with the owner of the repository, as well as the repository name.

  

###### When you’re on the main page for the repository, you’ll see a button to "Star" and “Fork” the repository on your upper right-hand side of the page, underneath your user icon.

  

### 4. Clone the Repository

###### To make your own local copy of the repository you would like to contribute to, let’s first open up a terminal window.

###### We’ll use the git clone command along with the URL that points to your fork of the repository.

###### This URL will be similar to the URL above, except now it will end with .git. In the example above, the URL will look like this:

  

https://github.com/dscabesit/Simple-OCR.git

  

###### You can alternatively copy the URL by using the green “Clone or download” button from your repository page that you just forked from the original repository page. Once you click the button, you’ll be able to copy the URL by clicking the binder button next to the URL:

![](https://i.ibb.co/JrtYpYP/clone-link.jpg)

  

###### Once we have the URL, we’re ready to clone the repository. To do this, we’ll combine the git clone command with the repository URL from the command line in a terminal window:

```

git clone https://github.com/dscabesit/Simple-OCR.git

```

  

### 5. Create New Branch

###### Once the project is opened create a new branch and checkout in it where you can make the changes in the code.

###### You can do this either from terminal or Directly in your text editor.

###### To do from Terminal:

```

git branch new-branch

git checkout new-branch

```

  

### 6. Commit and Push

###### After making the required changes commit and push your code

###### Terminal:

###### To add the changes after you have made the modifications

``` git add . ``` or ``` git add -A ```

###### To commit and push the changes

```

git commit -m <Your-commit-message>

```

```

git push --set-upstream origin new-branch

```

  

### 7. Update Local Repository

###### While working on a project alongside other contributors, it is important for you to keep your local repository up-to-date with the project as you don’t want to make a pull request for code that will cause conflicts. To keep your local copy of the code base updated, you’ll need to sync changes.

###### We’ll first go over configuring a remote for the fork, then syncing the fork.

  

### 8. Configure a Remote for the Fork

###### You’ll have to specify a new remote upstream repository for us to sync with the fork. This will be the original repository that you forked from. you’ll have to do this with the git remote add command.

```

git remote add upstream https://github.com/dscabesit/Simple_OCR

```

###### In this example, // upstream // is the shortname we have supplied for the remote repository since in terms of Git, “upstream” refers to the repository that you cloned from. If you want to add a remote pointer to the repository of a collaborator, you may want to provide that collaborator’s username or a shortened nickname for the shortname.

  

### 9. Sync the Fork

###### Once you have configured a remote that references the upstream and original repository on GitHub, you are ready to sync your fork of the repository to keep it up-to-date.

To sync your fork, from the directory of your local repository in a terminal window, you’ll have to use the // git fetch // command to fetch the branches along with their respective commits from the upstream repository. Since you used the shortname “upstream” to refer to the upstream repository, you’ll have to pass that to the command:

  

``` git fetch upstream ```

###### Switch to the local master branch of our repository:

``` git checkout master ```

###### Now merge any changes that were made in the original repository’s master branch, that you will access through your local upstream/master branch, with your local master branch:

``` git merge upstream/master ```

  

### 10. Create Pull Request

###### At this point, you are ready to make a pull request to the original repository.

###### Now navigate to your forked repository, and press the “New pull request” button on your left-hand side of the page.

  

### Prerequisites

  

1. Android Studio
2. An android phone (with USB debugging turned on)
3. Java JDK 14.0.1

  

### Installation

  

You will need to install Android Studio (download link - https://developer.android.com/studio) 

Download java jdk 14.0.1  (download link - https://www.oracle.com/in/java/technologies/javase-downloads.html) 


Preferably an android phone to run the app (check here how to turn on USB debugging - https://developer.android.com/studio/debug/dev-options) avoid using the emulator provided by the android studio itself.

  

### Deployment

  

Start android studio and when prompted to open the project choose this cloned repository and

IMPORTANT NOTE: when the project gets opened then proceed to the file menu on the top left -> project structure -> project and then -

1.now first go to android gradle version and select  "4.0.0" 

2. choose "gradle version" from the same project menu and choose "6.5" 

Now, simply wait for the gradle build to finish whose running status will be visible on the bottom (will take about 10 minutes or so)

Leave the system idle as this will require some heavy usage of RAM.
 
Meanwhile connect your phone and MAKE SURE THE USB DEBUGGING IS ON TURNED and then your phone name will show up on the top of the android studio devices list.

Once the gradle build is finished then simply click "run" option which will be visible on the top right right the device listing.

  

<!-- ## Contributing

  

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

  

1. Fork the Project

2. Create your Feature Branch

```md

git checkout -b feature/AmazingFeature

```

3. Commit your Changes

```md

git commit -m 'Add some AmazingFeature'

```

4. Push to the Branch

```md

git push origin feature/AmazingFeature

```

5. Open a Pull Request -->

  

### License

  

Distributed under the MIT License. See `LICENSE` for more information.

  

### Author

  

*  [Pawan Tanay Tripathi](https://www.linkedin.com/in/pawan-tanay-tripathi-07637151/)
<div align="center">
<a href="https://github.com/pawantanaytripathi" target="_blank">
<img src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 5px;" />
</a>
<a href="https://www.linkedin.com/in/pawan-tanay-tripathi-07637151/" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 5px;" />
</a>
<a href="https://www.instagram.com/pawantanay.tripathi/" target="_blank">
<img src=https://img.shields.io/badge/instagram-%23000000.svg?&style=for-the-badge&logo=instagram&logoColor=white alt=instagram style="margin-bottom: 5px;" />
</a>

</div>

*  [Naman Bhardwaj](https://www.linkedin.com/in/naman-bhardwaj-07076b149/)
<div align="center">
<a href="https://github.com/namanbhardwaj94" target="_blank">
<img src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 5px;" />
</a>
<a href="https://www.linkedin.com/in/naman-bhardwaj-07076b149/" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 5px;" />
</a>
<a href="https://www.instagram.com/t.naman.18/" target="_blank">
<img src=https://img.shields.io/badge/instagram-%23000000.svg?&style=for-the-badge&logo=instagram&logoColor=white alt=instagram style="margin-bottom: 5px;" />
</a>

</div>
  
### Contributors
  * [Mansi Jaiswal](https://www.linkedin.com/in/mansi-jaiswal-8896b2194/)
<div align="center">

<a href="https://www.linkedin.com/in/mansi-jaiswal-8896b2194/" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 5px;" />
</a>


</div>

 * [Harsh Tiwari](https://www.linkedin.com/in/harsh-tiwari-224a95195/) 
<div align="center">

<a href="https://www.linkedin.com/in/harsh-tiwari-224a95195/" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 5px;" />
</a>

</div>
