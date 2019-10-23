# BottomSheetDilog Calendar
BottomSheetDilogCalendarExample
![](run.gif)
1. Using Example
```kotlin
// onCaller
  BottomDate().apply {
                addOnSelectorDateListener { Year, Month, DayOfMonth ->
                    btn.text =  "${Year}년 ${Month}월 ${DayOfMonth}일 "
                }
            }.show(supportFragmentManager, "ippsome")
```

2. Depences
```gradle
dependencies {
...
  implementation 'com.google.android.material:material:1.0.0'
  }
```

3. use Style and drawable
```xml
    <style name="BootomSelectDialogTheme" parent="Animation.Design.BottomSheetDialog">
        <item name="android:windowIsTranslucent">true</item>
        <item name="android:windowBackground">@color/halftransparent</item>
    </style>
```
```xml
<?xml version="1.0" encoding="UTF-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <solid android:color="#FFFFFF" />
    <stroke
        android:width="3dip"
        android:color="#B1BCBE" />
    <corners android:topLeftRadius="50dp" android:topRightRadius="50dp"/>
    <padding
        android:bottom="0dip"
        android:start="0dip"
        android:end="0dip"
        android:top="0dip" />
</shape>
```
