package com.example.abdelrahman.bloodtypediet;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment  {
    final String LOG_TAG=MainActivityFragment.class.getSimpleName();

    private String type="type";
    public MainActivityFragment() {

    }

    @Override
    public void onStart() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
        String type1=preferences.getString(type,null);

/*
        SharedPreferences shared= PreferenceManager.getDefaultSharedPreferences(getActivity());
        String channel = (shared.getString(getString(R.string.blood_type),getString(R.string.default_value)));
*/

        Log.v(LOG_TAG,"Ha5osh aho");
        if(type1!=null){
            Intent intent=new Intent(getActivity(),TypeSelected.class);
            intent.putExtra(type,type1);
            Log.v(LOG_TAG,"da5alt"+type1);

            startActivity(intent);
            Log.v(LOG_TAG,"da5alt");

        }
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View rootview=(View) inflater.inflate(R.layout.fragment_main, container, false);

        Typeface typeFace= Typeface.createFromAsset(getActivity().getAssets(),"gothic_0.TTF");
        //rootview.findViewById(R.id.)
       final SharedPreferences  preferences = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
// Storing

        LinearLayout ab=(LinearLayout) rootview.findViewById(R.id.ab);
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),TypeSelected.class);
                intent.putExtra(type,"ab");
                preferences.edit().putString(type,"ab").commit();
               // preferences.edit().putString("category",category).commit();

                startActivity(intent);
            }
        });
        ImageView a=(ImageView) rootview.findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),TypeSelected.class);
                intent.putExtra(type,"a");
                preferences.edit().putString(type,"a").commit();

                startActivity(intent);

            }
        });
        ImageView b=(ImageView) rootview.findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),TypeSelected.class);
                intent.putExtra(type,"b");
                preferences.edit().putString(type,"b").commit();

                startActivity(intent);

            }
        });
        ImageView o=(ImageView) rootview.findViewById(R.id.o);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),TypeSelected.class);
                intent.putExtra(type,"o");
                preferences.edit().putString(type,"o").commit();
                startActivity(intent);
            }
        });
        return rootview;
    }
}
