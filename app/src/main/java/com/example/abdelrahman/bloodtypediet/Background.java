package com.example.abdelrahman.bloodtypediet;

import android.app.Activity;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by abdelrahman on 27/10/16.
 */
public class Background  extends AsyncTask<String,Void,String> {

   private DataFetched dataFetched;
    private Activity activity;
    private  final  String LOG_TAG=Background.class.getSimpleName();

    public Background(Activity act,DataFetched fetch){
    activity=act;
        dataFetched=fetch;
    }
    @Override
    protected String doInBackground(String... strings) {
        String data;
        HttpURLConnection connection=null;
        BufferedReader bufferedReader=null;
      Uri.Builder uri=dataFetched.buildUri(strings[0]);

        Log.v(LOG_TAG,uri.toString());
        try {
            URL url=new URL(uri.build().toString());
            connection=(HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            InputStreamReader input=new InputStreamReader(connection.getInputStream());
            if(input==null)
                return null;
            bufferedReader=new BufferedReader(input);
            StringBuffer buffer=new StringBuffer();
            String line;
            while((line=bufferedReader.readLine())!=null){
                buffer.append(line+"\n");
            }
            data=buffer.toString();
            return data;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } /*catch (JSONException e) {
            e.printStackTrace();
        }*/
        finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                if (connection!=null){
                    connection.disconnect();
                }
            }
        }


        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        if (s!=null){
            dataFetched.update(s);
        }
        else {
            Toast.makeText(activity.getApplicationContext(),"The internet connection is not stable",Toast.LENGTH_LONG).show();
        }
        super.onPostExecute(s);
    }
}
