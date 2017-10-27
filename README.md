# react-native-change-launcher
Dynamic replace launcher icon
## Installation

Install package from npm

```sh
yarn add --save react-native-change-launcher
```

## Usage

ES6

The module uses ES6 style export statement, simply use `import` to load the module.

```js
import changeLuancher from 'react-native-change-launcher'
```

ES5

If you're using ES5 require statement to load the module, please add `default`. See [here](https://github.com/wkh237/react-native-fetch-blob/wiki/Trouble-Shooting#rnfetchblobfetch-is-not-a-function) for more detail.

```
var changeLuancher = require('react-native-change-launcher').default
```
Link

settings.gradle

```
include ':react-native-change-launcher'
project(':react-native-change-launcher').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-change-launcher/android')
```

build.gradle

```
compile project(':react-native-change-launcher')
```

MainApplication.java

```
new ChangeLuancherPackage()
```

AndroidManifest.xml

```
<application>
  <activity-alias
        android:name=".MainActivity1"
        android:enabled="false"
        android:icon="@mipmap/icon_1"
        android:label="@string/app_name"
        android:targetActivity=".MainActivity">
        <intent-filter>
          <action android:name="android.intent.action.MAIN"/>

          <category android:name="android.intent.category.LAUNCHER"/>
        </intent-filter>
  </activity-alias>

</application>
```
