package com.example.sample

import android.content.Intent
import android.util.Log
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class TestConnectNativeModule internal constructor(private val reactContext: ReactApplicationContext): ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "TextConnectNative"
    }

    @ReactMethod
    fun sendMessageToNative(rnMessage: String?) {
        Log.d("This log is from Java", rnMessage ?: "")
    }

    @ReactMethod
    fun sendCallbackToNative(rnCallback: Callback) {
        rnCallback.invoke("A greeeting from java")
    }

    @ReactMethod
    fun finishActivity() {
        currentActivity?.finish()
    }

    @ReactMethod
    fun goToSecondActivity() {
        val intent = Intent(currentActivity, SecondActivity::class.java)
        currentActivity?.startActivity(intent)
    }

    companion object
}