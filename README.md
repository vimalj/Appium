# Appium
Appium automation (JAVA_HOME(eclipse/intellij), ANDROID_HOME (android studio), appiumCLI, appiuminspector, Maven, TestNG  
or any other required dependencies required for working

[Appium Commands](https://www.lambdatest.com/learning-hub/appium-commands-cheat-sheet)
  
  # Pre requirements for installation
  [Download Node Js](https://nodejs.org/en/download/package-manager)

  [Download Java JDK](https://www.oracle.com/java/technologies/downloads/#jdk21-windows)

  > Setup Environment Variables for JAVA <br>
  Variable Name: JAVA_HOME <br>
  variabe value: C:\Program Files\Java\jdk-21 <br>
  
  > Path (add new values to path system variable) <br>
  %JAVA_HOME%\lib <br>
  %JAVA_HOME%\bin <br>

  
  **Eclipse** (IDE already have maven plugin + can install testNG, Junit from eclipse marketplace)<br>
 [Download Eclipse](https://www.eclipse.org/downloads/download.php?file=%2Foomph%2Fepp%2F2023-09%2FR%2Feclipse-inst-jre-win64.exe)

  **Android Studio** <br>
  [Download Android Studio](https://developer.android.com/studio)

  --Setup Environment Variables for android Studio:-- <br>
  
  > ANDRIOD_HOME    C:\Users\username\AppData\Local\Android\sdk <br>

  > Path <br>
  %ANDROID_HOME%\build-tools <br>
  %ANDROID_HOME%\platforms <br>
  %MAVEN_HOME%\bin <br>
  C:\Users\Username\AppData\Local\Android\sdk <br>
  C:\Users\Username\AppData\Local\Android\sdk\platform-tools <br>

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
> appium driver install <plugin name>
**To install a new driver from npm**
> appium driver install --source=npm <plugin name>[@<version>]
**To install a driver from a local folder (useful for developers)**
> appium driver install --source=local /Users/me/sources/<plugin name>
**To install a new driver from github** 
> appium driver install --source=github --package=<plugin name> appium/<plugin name>

**To list already installed drivers**
> appium driver list --installed

**To update a driver (it must be already installed)**
> appium driver update xcuitest

**To uninstall a driver (it won't last forever, wouldn't it?)**
> appium driver uninstall xcuitest


**appium plugin list**

**To install an officially supported plugin**
> appium plugin install <plugin-name>

**To install a plugin from a local folder (useful for developers)**
> appium plugin install --source=local /Users/me/sources/<plugin name>

**To install a new plugin from npm**
> appium plugin install --source=npm <plugin name>

**To list already installed plugins**
> appium plugin list --installed

**To update a plugins (it must be already installed)**
> appium plugin update <plugin name>

**To uninstall a plugin**
> appium plugin uninstall <plugin name>


# Download and install appium inspector on your system
[Download Appium Inspector](https://github.com/appium/appium-inspector/releases)

> Appium or Inspector also need settings for mobile : Click on settings, about phone and click on android version more than 7 times to open developer tools <br>
USB debugging on - (developer tools) <br> 
USB debugging (security settings) <br>
install via USB on <br>
allow appium mobile app when connected via USB <br>
allow uiautomator2 app as well if requied <br>

Restart PC and check by running everything works.........



# Appium inspector Capabilities
when you have connected mobile device via USB available on Android studio(ckick mirror screen on Android studio to focus on screen)
Goto cmd to check capabilities App package and App activity for appium inspector

> C:\Users\username>adb shell <br>
gauguininpro:/ $ dumpsys window displays | grep -e 'mCurrentFocus' <br>
--output should be like--- <br>
> mCurrentFocus=Window{22c3dbd u0 com.miui.calculator/com.miui.calculator.cal.CalculatorActivity}  <br>

(Alternatively, **Apk info app** can be installed from **playstore** to check App package and App activity details on mobile)

-----Another Useful cmd command adb devices-------
> C:\Users\vimal>adb devices <br>
List of devices attached <br>
6a518668       device <br>


# Desired capabilities Example:
> desired_caps = { <br>
    'platformName': 'Android', <br>
    'platformVersion': '13', <br>
    'deviceName': 'Google Pixel 7pro', <br>
    'app': '/apk/com.slot.spin.game.play.apk', <br>
    'appPackage': 'com.slot.spin.game.play', <br>
    'appActivity': 'com.slot.spin.game.play.MainActivity', <br>
    'automationName': 'UiAutomator2'  # Use UiAutomator2 for Android <br>
}
<br>

![2024-06-20 22_31_49-Appium](https://github.com/vimalj/Appium/assets/45177365/aa9b934f-9cb3-4ed4-982b-9b48755f12c7)


# Creating eclipse project and Other Compatibility checks for debugging
> Create maven project simple ;<br>
> create new package under src/test/java ;<br>
> create new class under the package created and include your test java code ;<br>
> Dependency need to be added in **pom.xml** file of the simple maven project according to compatible version as required. You need to change versions if getting errors;<br>

**Appium Java Client version must be compatible with Selenium client**

[Appium Java Client Github](https://github.com/appium/java-client)


[dependencies]

[dependency]

    <groupId>io.appium</groupId>
    
    <artifactId>java-client</artifactId>
    
    <version>9.2.2</version>
    
[/dependency]

[dependency]

    <groupId>org.seleniumhq.selenium</groupId>
    
     <artifactId>selenium-java </artifactId>
     
    <version>4.21.0</version>
    
[/dependency]

[/dependencies]





