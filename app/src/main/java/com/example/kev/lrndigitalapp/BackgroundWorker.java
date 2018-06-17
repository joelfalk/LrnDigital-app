package com.example.kev.lrndigitalapp;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.renderscript.ScriptGroup;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundWorker extends AsyncTask<String, Void ,String> {

    private Context context;
    private AlertDialog alertDialog;

    BackgroundWorker (Context ctx) {
        context = ctx;
    }

    @Override
    protected String doInBackground(String... params) {
        String type = params[0];
        String login_url = "http://cdae88bc.ngrok.io/login.php";
        String register_url ="http://cdae88bc.ngrok.io/register.php";
        if (type.equals("login")) {
            try {
                URL url = new URL(login_url);
                try {
                    String user_name = params [1];
                    String password = params [2];
                    HttpURLConnection httpURLConnection =  (HttpURLConnection)url.openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    //httpURLConnection.connect();
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    Log.d("lol1", "lol1");
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                    String post_data = URLEncoder.encode("user_name", "UTF-8") + "=" +URLEncoder.encode(user_name, "UTF-8")+"&"
                            + URLEncoder.encode("password", "UTF-8") + "=" +URLEncoder.encode(password, "UTF-8");
                    bufferedWriter.write(post_data);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                    String result = "";
                    String line ="";
                    while ((line = bufferedReader.readLine()) != null) {
                        result = result + line;
                    }
                    bufferedReader.close();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    return result;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else if (type.equals("register")) {

        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Login Status");
    }

    @Override
    protected void onPostExecute(String result) {
        alertDialog.setMessage(result);
        alertDialog.show();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }


}
