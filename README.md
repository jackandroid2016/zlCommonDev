# zlCommonDev
implementation 'com.github.jackandroid2016:zlCommonDev:Tag'
Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
		implementation 'com.github.jackandroid2016:zlCommonDev:Tag'
	}
