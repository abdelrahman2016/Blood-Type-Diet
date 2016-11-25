package com.example.abdelrahman.bloodtypediet;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext());
// Storing
        Button button=(Button) findViewById(R.id.done);
        final EditText edit=(EditText)findViewById(R.id.edit_blood);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data =edit.getText().toString();
                switch (data){
                    case "a":

                        preferences.edit().putString("type","a").commit();
                        Toast.makeText(getApplicationContext(),"A Blood type is selected",Toast.LENGTH_LONG).show();

                        //  preferences.edit().putString("category",category).commit();

                        break;
                    case "b":
                        preferences.edit().putString("type","b").commit();

                        Toast.makeText(getApplicationContext(),"B Blood type is selected",Toast.LENGTH_LONG).show();

                        break;
                    case "ab":
                        preferences.edit().putString("type","ab").commit();

                        Toast.makeText(getApplicationContext(),"AB Blood type is selected",Toast.LENGTH_LONG).show();

                        break;

                    case "o":
                        preferences.edit().putString("type","o").commit();

                        Toast.makeText(getApplicationContext(),"O Blood type is selected",Toast.LENGTH_LONG).show();

                        break;
                    default:

                        Toast.makeText(getApplicationContext(),"Please enter a valid blood type (a-ab-b-o)",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
