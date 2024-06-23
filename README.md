# Appium
Appium automation (JAVA_HOME(eclipse/intellij), ANDROID_HOME (android studio), appiumCLI, appiuminspector, Maven, TestNG  or any other required dependencies required for working
<link> https://www.lambdatest.com/learning-hub/appium-commands-cheat-sheet </link>
  
  # Pre requirements for installation
  **Node Js**
  <link>https://nodejs.org/en/download/package-manager</link>

  **Java (JDK)**
  <link> https://www.oracle.com/java/technologies/downloads/#jdk21-windows </link>

  --Setup Environment Variables for JAVA:-- <br>
  Variable Name: JAVA_HOME 
  variabe value: C:\Program Files\Java\jdk-21
  
  Path (add new values to path system variable)
  %JAVA_HOME%\lib
  %JAVA_HOME%\bin

  
  **Eclipse** (IDE already have maven plugin + can install testNG, Junit from eclipse marketplace)
  <link> https://www.eclipse.org/downloads/download.php?file=%2Foomph%2Fepp%2F2023-09%2FR%2Feclipse-inst-jre-win64.exe </link>

  **Android Studio**
  <link> https://developer.android.com/studio</link>

  --Setup Environment Variables for android Studio:--
  ANDRIOD_HOME    C:\Users\username\AppData\Local\Android\sdk

  Path
  %ANDROID_HOME%\build-tools
  %ANDROID_HOME%\platforms
  %MAVEN_HOME%\bin
  C:\Users\Username\AppData\Local\Android\sdk
  C:\Users\Username\AppData\Local\Android\sdk\platform-tools

# Installing Appium Command line (cmd)

> npm install -g appium
> appium --version
> appium (run appium)

> appium driver list
> appium driver install uiautomator2

> npm install appium-doctor -g
> appium-doctor --android

>npm install -g appium-installer
>appium-installer

# Other useful commands
install the missing packages (mjpeg-consumer) with the below command if needed
>npm i -g mjpeg-consumer

>pip install Appium-Python-Client

**To install, uninstall, or update an Appium driver we can use the respective commands as instructed below.**

 **To install a new driver**
appium driver install <plugin name>
**To install a new driver from npm**
appium driver install --source=npm <plugin name>[@<version>]
**To install a driver from a local folder (useful for developers)**
appium driver install --source=local /Users/me/sources/<plugin name>
**To install a new driver from github** 
appium driver install --source=github --package=<plugin name> appium/<plugin name>

**To list already installed drivers**
appium driver list --installed

**To update a driver (it must be already installed)**
appium driver update xcuitest

**To uninstall a driver (it won't last forever, wouldn't it?)**
appium driver uninstall xcuitest


**appium plugin list**

**To install an officially supported plugin**
appium plugin install <plugin-name>

**To install a plugin from a local folder (useful for developers)**
appium plugin install --source=local /Users/me/sources/<plugin name>

**To install a new plugin from npm**
appium plugin install --source=npm <plugin name>

**To list already installed plugins**
appium plugin list --installed

**To update a plugins (it must be already installed)**
appium plugin update <plugin name>

**To uninstall a plugin**
appium plugin uninstall <plugin name>


# Download and install appium inspector on your system
<link> https://github.com/appium/appium-inspector/releases </link>

Appium or Inspector also need settings for mobile : Click on settings, about phone and click on android version more than 7 times to open developer tools
USB debugging on - (developer tools)
USB debugging (security settings)
install via USB on
allow appium mobile app when connected via USB
allow uiautomator2 as well if requied

Restart PC and check by running everything works.........



# Appium inspector Capabilities
when you have connected mobile device via USB available on Android studio(ckick mirror screen on Android studio to focus on screen)
Goto cmd to check capabilities App package and App activity for appium inspector

C:\Users\username>adb shell
gauguininpro:/ $ dumpsys window displays | grep -e 'mCurrentFocus'
--output should be like--- mCurrentFocus=Window{22c3dbd u0 com.miui.calculator/com.miui.calculator.cal.CalculatorActivity}  

(Alternatively, Apk info app can be installed from playstore to check App package and App activity details on mobile)

-----Another Useful cmd command adb devices-------
C:\Users\vimal>adb devices
List of devices attached
6a518668       device


# Desired capabilities Example:
desired_caps = {
    'platformName': 'Android',
    'platformVersion': '13',
    'deviceName': 'Google Pixel 7pro',
    'app': '/apk/com.slot.spin.game.play.apk',
    'appPackage': 'com.slot.spin.game.play',
    'appActivity': 'com.slot.spin.game.play.MainActivity',
    'automationName': 'UiAutomator2'  # Use UiAutomator2 for Android
}

![2024-06-20 22_31_49-Appium](https://github.com/vimalj/Appium/assets/45177365/aa9b934f-9cb3-4ed4-982b-9b48755f12c7)



# Creating eclipse project and Other Compatibility checks for debugging
> Create maven project simple ;
> create new package under src/test/java ;
> create new class under the package created and include your test java code ;
> Dependency need to be added in **pom.xml** file of the simple maven project according to compatible version as required. You need to change versions if getting errors;

**Appium Java Client version must be compatible with Selenium client**
<link> https://github.com/appium/java-client </link>

<dependencies>
<!-- https://mvnrepository.com/artifact/io.appium/java-client -->
<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>9.2.2</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
</dependency>
  </dependencies>
 




