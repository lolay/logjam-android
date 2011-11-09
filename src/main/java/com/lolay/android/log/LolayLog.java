/*
 * Created by Lolay, Inc.
 * Copyright 2011 Lolay, Inc. All rights reserved.
 */
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
