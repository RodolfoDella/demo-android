package org.gujavasc.demoandroid;

import org.gujavasc.demoandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebVieww extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);
		
		WebView webview = new WebView(this); setContentView(webview);
		webview.loadUrl("file:///android_asset/exemplo/index.html");
    }

}
