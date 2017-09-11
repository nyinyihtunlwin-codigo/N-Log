# Library-LogDebug
A Simple and Pretty Log Library.
### How to
###### Step 1. Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
 ###### Step 2. Add the dependency
 ```
 	dependencies {
	        compile 'com.github.nyinyihtunlwin:N-Log:0.1.1'
	}


```

### Options
```
        L.d("Debug-Tag", "HelloWorld, This is Debug log.");
        L.e("Error-Tag", "HelloWorld, This is Error log.");
        L.i("Info-Tag", "HelloWorld,This is Info log.");
        L.w("Warn-Tag", "HelloWorld, This is Warn log.");
        L.wtf("WTF-Tag", "HelloWorld, This is WTF log.");
```
### Outputs


- L.d("Debug-Tag", "HelloWorld, This is Debug log.");

![alt text](https://github.com/nyinyihtunlwin/Library-LogDebug/blob/master/app/src/main/res/drawable/debug.PNG)

-  L.e("Error-Tag", "HelloWorld, This is Error log.");

![alt text](https://github.com/nyinyihtunlwin/Library-LogDebug/blob/master/app/src/main/res/drawable/error.PNG)

- L.i("Info-Tag", "HelloWorld,This is Info log.");

![alt text](https://github.com/nyinyihtunlwin/Library-LogDebug/blob/master/app/src/main/res/drawable/info.PNG)

- L.w("Warn-Tag", "HelloWorld, This is Warn log.");

![alt text](https://github.com/nyinyihtunlwin/Library-LogDebug/blob/master/app/src/main/res/drawable/warn.PNG)

- L.wtf("WTF-Tag", "HelloWorld, This is WTF log.");

![alt text](https://github.com/nyinyihtunlwin/Library-LogDebug/blob/master/app/src/main/res/drawable/wtf.PNG)

### License

[MIT](https://github.com/nyinyihtunlwin/Library-LogDebug/blob/master/LICENSE)
