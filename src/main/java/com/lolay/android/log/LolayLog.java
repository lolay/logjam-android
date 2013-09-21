//
//  Copyright 2011, 2012, 2013 Lolay, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//
package com.lolay.android.log;

import android.util.Log;

public class LolayLog {
	private static final int MAX_TAG_LENGTH = 23;
	private static final String FORMAT = "%s: %s";
	
	public static String buildTag(Class<?> clazz) {
		String tag = clazz.getSimpleName();
		int length = tag.length();
		if (length > MAX_TAG_LENGTH) {
			tag = tag.substring(0, length < MAX_TAG_LENGTH ? length : MAX_TAG_LENGTH); 
		}
		return tag;
	}
	
	public boolean isLoggable(String tag, int priority) {
		return Log.isLoggable(tag, priority);
	}
	
	public static void println(int priority, String tag, String method, String message) {
		Log.println(priority, tag, message);
	}
	public static void println(int priority, String tag, String method, String format, Object... params) {
		String message = String.format(format, params);
		Log.println(priority, tag, message);
	}
	
	public static void v(String tag, String method, Throwable throwable) {
		Log.v(tag, String.format(FORMAT, method), throwable);
	}
	public static void v(String tag, String method, String message) {
		Log.v(tag, String.format(FORMAT, method, message));
	}
	public static void v(String tag, String method, String format, Object... params) {
		String message = String.format(format, params);
		Log.v(tag, String.format(FORMAT, method, message));
	}
	public static void v(String tag, String method, String message, Throwable throwable) {
		Log.v(tag, String.format(FORMAT, method, message), throwable);
	}
	public static void v(String tag, String method, Throwable throwable, String format, Object... params) {
		String message = String.format(format, params);
		Log.v(tag, String.format(FORMAT, method, message), throwable);
	}

	public static void d(String tag, String method, Throwable throwable) {
		Log.d(tag, String.format(FORMAT, method), throwable);
	}
	public static void d(String tag, String method, String message) {
		Log.d(tag, String.format(FORMAT, method, message));
	}
	public static void d(String tag, String method, String format, Object... params) {
		String message = String.format(format, params);
		Log.d(tag, String.format(FORMAT, method, message));
	}
	public static void d(String tag, String method, String message, Throwable throwable) {
		Log.d(tag, String.format(FORMAT, method, message), throwable);
	}
	public static void d(String tag, String method, Throwable throwable, String format, Object... params) {
		String message = String.format(format, params);
		Log.d(tag, String.format(FORMAT, method, message), throwable);
	}
	
	public static void i(String tag, String method, Throwable throwable) {
		Log.i(tag, String.format(FORMAT, method), throwable);
	}
	public static void i(String tag, String method, String message) {
		Log.i(tag, String.format(FORMAT, method, message));
	}
	public static void i(String tag, String method, String format, Object... params) {
		String message = String.format(format, params);
		Log.i(tag, String.format(FORMAT, method, message));
	}
	public static void i(String tag, String method, String message, Throwable throwable) {
		Log.i(tag, String.format(FORMAT, method, message), throwable);
	}
	public static void i(String tag, String method, Throwable throwable, String format, Object... params) {
		String message = String.format(format, params);
		Log.i(tag, String.format(FORMAT, method, message), throwable);
	}
	
	public static void w(String tag, String method, Throwable throwable) {
		Log.w(tag, String.format(FORMAT, method), throwable);
	}
	public static void w(String tag, String method, String message) {
		Log.w(tag, String.format(FORMAT, method, message));
	}
	public static void w(String tag, String method, String format, Object... params) {
		String message = String.format(format, params);
		Log.w(tag, String.format(FORMAT, method, message));
	}
	public static void w(String tag, String method, String message, Throwable throwable) {
		Log.w(tag, String.format(FORMAT, method, message), throwable);
	}
	public static void w(String tag, String method, Throwable throwable, String format, Object... params) {
		String message = String.format(format, params);
		Log.w(tag, String.format(FORMAT, method, message), throwable);
	}

	public static void e(String tag, String method, String message) {
		Log.e(tag, String.format(FORMAT, method, message));
	}
	public static void e(String tag, String method, Throwable throwable) {
		Log.e(tag, String.format(FORMAT, method), throwable);
	}
	public static void e(String tag, String method, String format, Object... params) {
		String message = String.format(format, params);
		Log.e(tag, String.format(FORMAT, method, message));
	}
	public static void e(String tag, String method, String message, Throwable throwable) {
		Log.e(tag, String.format(FORMAT, method, message), throwable);
	}
	public static void e(String tag, String method, Throwable throwable, String format, Object... params) {
		String message = String.format(format, params);
		Log.e(tag, String.format(FORMAT, method, message), throwable);
	}

	public static void wtf(String tag, String method, String message) {
		Log.wtf(tag, String.format(FORMAT, method, message));
	}
	public static void wtf(String tag, String method, Throwable throwable) {
		Log.wtf(tag, String.format(FORMAT, method), throwable);
	}
	public static void wtf(String tag, String method, String format, Object... params) {
		String message = String.format(format, params);
		Log.wtf(tag, String.format(FORMAT, method, message));
	}
	public static void wtf(String tag, String method, String message, Throwable throwable) {
		Log.wtf(tag, String.format(FORMAT, method, message), throwable);
	}
	public static void wtf(String tag, String method, Throwable throwable, String format, Object... params) {
		String message = String.format(format, params);
		Log.wtf(tag, String.format(FORMAT, method, message), throwable);
	}

}
