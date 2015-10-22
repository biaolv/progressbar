package com.example.progressbar;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    
	private TextView txt;
	private Button Btn;
	private Button Btn2;
	private ProgressDialog pd;
	private boolean pptv = false;
	private static final String TAG = "pptv";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.txt);
        Btn = (Button)findViewById(R.id.btn);
        Btn2 = (Button)findViewById(R.id.btn2);
        Btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
				builder.setIcon(R.drawable.ic_launcher);
				builder.setTitle("Title"); 
				builder.setMessage("Message"); 
				AlertDialog dialog = builder.create();
				dialog.show();
				WindowManager.LayoutParams layoutParams = dialog.getWindow().getAttributes();
				layoutParams.width = 540;  
		        layoutParams.height = 9000;  
		        dialog.getWindow().setAttributes(layoutParams);  
			}
        });
				
    }
}