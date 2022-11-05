# Mobile-Resume app
Project Title : Mobile Resume

Software used: Android Studio

Languages & Technologies: XML,Kotlin 

This mobile resume is a task given to me by HNG Internship. It is the mobile version  of my resume

This app has the following features:
1. The optimal view layout is portrait and can switch to landscape
2.The App has a dark mode feature
3. It supports the following languages:English and French
4. It contains social media icons which links the user to my social media page(GitHub,Linkedin and Twitter)

Description of The Code Base
in the build.gradle file, I used the buildFeatures property to set the viewBinding feature to true. I did this to save the time used to declare each android component used in the activity_main.xml layout file. In the main Activity, I created an object of the binding class which is automatically generated when the viewBinding feature is set to "true". 

I also connected the binding class to my root which returns the outermost View in the associated layout file. I also added the onclickListener function to the social media icons(which i got from Flaticons)  and i used an Implicit Intent so that when the icons are clicked it takes the user to the url which i added in the code.

Deign/How it Works

I used the following Android Components in my Design
1. Constraint Layout
2. Image View
3. text View

The main colours used were:
A dark shade of Blue -#211E2E
White - #FFFFFF & #FCFCFC
Dark Grey(for Dark theme)_:#211E2E

I used the Material Design Components theming design for the app colour theme
I also created two color.xml files,one for light theme and one for the dark theme and specified the colors in both files. I used the co lours in the layout file so that the themes can switch with ease.

The Design Contained my:
1. Name
2. Job Title
3. An About me Heading and a Description about me.
4. My Skills
5. My Experience

Libraries used: 
1. Material Design Components Library: For the colour themes
2. Constraint Layout Library: To use the layout in my XML file

Features I would Like to add:
1. To Have Animation added to the buttons
2. A Splash Screen

Challenges I Faced
1. It was Difficult for me to add the dark theme feature to my app as this was my first time
2. Designing the Landscape Layout

Appetize link
https://appetize.io/app/5j4tb32iblcfntybhlmgkcwi6m

APK File link
https://drive.google.com/file/d/1Gmdzij6brkdBCaF1XV9cw3VXAiaKIDgY/view?usp=share_link
