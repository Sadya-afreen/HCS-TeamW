package com.example.hcs_teamproject;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class MessageSender extends AsyncTask<String,Void,Void> {
    Socket s;
    DataOutputStream dos;
    PrintWriter pw;
    //private boolean isConnected = false;

    @Override
    protected Void doInBackground(String... voids) {

        //    boolean result = true;
        String message = voids[0];

        try {
            s = new Socket("192.168.1.90", 5000);
            pw = new PrintWriter(s.getOutputStream());
            pw.write(message);
            pw.flush();
            pw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("remotedroid", "Error while connecting", e);
            //     result = false;
        }
        return null;
    }
}