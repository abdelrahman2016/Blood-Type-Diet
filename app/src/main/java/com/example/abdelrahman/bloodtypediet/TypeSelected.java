package com.example.abdelrahman.bloodtypediet;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TypeSelected extends AppCompatActivity {
    final String LOG_TAG=TypeSelectedFragment.class.getSimpleName();
    final String category="category";
    final String type="type";
    String typeSelected;
    boolean checkType;

    @Override
    public void onStart() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext());
         typeSelected=preferences.getString(type,null);


        Log.v(LOG_TAG,"Ha5osh aho");
        if(!typeSelected.equals(getIntent().getStringExtra(type))){
            checkType=true;
        }
        super.onStart();
    }


    public void imageClicked(View view){
        int id=view.getId();
        Intent intent=new Intent(this,CategorySelected.class);
//        String typeSelected1=getIntent().getStringExtra("type");
/*
        if (!typeSelected.equals(typeSelected1)){
        typeSelected
        }
        else{
*/
        switch (id){
            case R.id.fish:
            case  R.id.fishB:
                intent.putExtra(category,"fish");
                intent.putExtra(type,typeSelected);
                startActivity(intent);
                break;
            case R.id.oil:
            case  R.id.oilB:
                intent.putExtra(category,"oil");
                intent.putExtra(type,typeSelected);
                startActivity(intent);

                break;
            case R.id.meat:
            case  R.id.meatB:
                intent.putExtra(category,"meat");
                intent.putExtra(type,typeSelected);
                startActivity(intent);

                break;
            case R.id.egg:
            case  R.id.eggB:
                intent.putExtra(category,"egg");
                intent.putExtra(type,typeSelected);
                startActivity(intent);

                break;
            case R.id.beverage:
            case  R.id.beverageB:
                intent.putExtra(category,"beverage");
                intent.putExtra(type,typeSelected);
                startActivity(intent);

                break;

            case R.id.fruit:
            case  R.id.fruitB:
                intent.putExtra(category,"fruit");
                intent.putExtra(type,typeSelected);
                startActivity(intent);
                break;

            case R.id.vegetables:
            case  R.id.vegetablesB:
                intent.putExtra(category,"vegetables");
                intent.putExtra(type,typeSelected);
                startActivity(intent);

                break;

            case R.id.grain:
            case  R.id.grainB:
                intent.putExtra(category,"grain");
                intent.putExtra(type,typeSelected);
                startActivity(intent);

                break;
            case R.id.cheese:
            case  R.id.cheeseB:
                intent.putExtra(category,"dairy");
                intent.putExtra(type,typeSelected);
                startActivity(intent);
                break;
            case R.id.salt:
            case  R.id.saltB:
                intent.putExtra(category,"herb");
                intent.putExtra(type,typeSelected);
                startActivity(intent);
                break;
            case R.id.sugar:
            case  R.id.sugarB:
                intent.putExtra(category,"sweetener");
                intent.putExtra(type,typeSelected);
                startActivity(intent);

                break;

            case R.id.leaf:
            case  R.id.leafB:
                intent.putExtra(category,"bean");
                intent.putExtra(type,typeSelected);
                startActivity(intent);
                break;




    /*    }
    */}
//
//        String extra=getIntent().getStringExtra("type");
//        Log.v(LOG_TAG,extra);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_selected);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
  /*      int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
*/
        return super.onOptionsItemSelected(item);
    }
}


