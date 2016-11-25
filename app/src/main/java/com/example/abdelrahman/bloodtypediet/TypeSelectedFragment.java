package com.example.abdelrahman.bloodtypediet;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class TypeSelectedFragment extends Fragment {
    final String LOG_TAG=TypeSelectedFragment.class.getSimpleName();
/*    public void imageClicked(View view){
        Log.v(LOG_TAG,"ana get aho");
    }*/
    public TypeSelectedFragment() {
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.refresh,menu);
    /*    super.onCreateOptionsMenu(menu, inflater);
    */}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.settings){
            Intent intent=new Intent(getActivity(),Settings.class);
            /*intent.putExtra("item",data[i]);*/
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment_type_selected, container, false);
        //String extra=getActivity().getIntent().getStringExtra("type");
        //Log.v(LOG_TAG,extra);
        return rootview;
    }
}
