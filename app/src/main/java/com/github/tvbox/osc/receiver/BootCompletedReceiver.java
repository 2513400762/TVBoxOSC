package com.github.tvbox.osc.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pj567
 * @date :2021/1/5
 * @description:
 */
public class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent == null) return
        if (TextUtils.equals(intent.action, "android.intent.action.BOOT_COMPLETED")) {
            val newIntent = Intent(context, MainActivity::class.java)
            ContextCompat.startActivity(context, newIntent, null)
        }
    }
}
