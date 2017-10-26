/**
 * @providesModule react-native-change-launcher
 */
'use strict';

import { NativeModules } from "react-native"

const ChangeLuancher = NativeModules.ChangeLuancher

export default function changeLuancher(componentName){
		ChangeLuancher.changeLuancher(componentName);
	}