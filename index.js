/**
 * @providesModule react-native-change-launcher
 */
'use strict';

import { NativeModules } from "react-native"

const ChangeLuancher = NativeModules.ChangeLuancher

export default {
	changeLuancher: function(componentName){
		ChangeLuancher.changeLuancher(componentName);
	}
}