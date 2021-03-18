package com.example.hcs_teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    String message= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy =
                    new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btn = (ImageButton) findViewById(R.id.imageButton);
    //    Button stio_btn = (Button) findViewById(R.id.stop_btn);
    }
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.imageButton:
                message = "lock";
                MessageSender messageSender=new MessageSender();
                messageSender.execute(message);
                break;

//            case R.id.stop_btn:
//                message = "stop";
//                MessageSender msgSender=new MessageSender();
//                msgSender.execute(message);
//                break;
//            case R.id.r_btn:
//                if (mBoundService != null) {
//                    mBoundService.sendMessage(("rightclick").toString());
//                }
//                break;
        }
    }
//    public void onClick(){
//        message = "lock";
//        MessageSender messageSender=new MessageSender();
//        messageSender.execute(message);
//    }
}
