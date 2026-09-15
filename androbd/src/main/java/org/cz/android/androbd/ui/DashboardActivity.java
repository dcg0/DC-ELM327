package org.cz.android.androbd.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.fr3ts0n.ecu.gui.androbd.R;

import org.json.JSONObject;

/**
 * WebView dashboard that renders the live values emitted by the OBD list adapter.
 */
public class DashboardActivity extends Activity {

    private static final String ACTION_OBD_DATA = "com.cz.android.androbd.OBD_DATA";

    private WebView webView;
    private boolean receiverRegistered;

    private final BroadcastReceiver obdReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String pid = intent.getStringExtra("pid_name");
            String value = intent.getStringExtra("pid_value");

            if (pid != null && value != null && webView != null) {
                String safePid = JSONObject.quote(pid);
                String safeValue = JSONObject.quote(value);
                webView.evaluateJavascript(
                        "if(window.updateOBDData) { window.updateOBDData(" + safePid + ", " + safeValue + "); }",
                        null);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_webview);

        webView = findViewById(R.id.dashboardWebView);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        webView.loadUrl("file:///android_asset/index.html");
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter(ACTION_OBD_DATA);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(obdReceiver, filter, Context.RECEIVER_NOT_EXPORTED);
        } else {
            registerReceiver(obdReceiver, filter);
        }
        receiverRegistered = true;
    }

    @Override
    protected void onPause() {
        if (receiverRegistered) {
            unregisterReceiver(obdReceiver);
            receiverRegistered = false;
        }
        super.onPause();
    }
}
