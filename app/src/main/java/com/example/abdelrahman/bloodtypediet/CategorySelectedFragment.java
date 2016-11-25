package com.example.abdelrahman.bloodtypediet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
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
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.abdelrahman.bloodtypediet.categories.AllCategories;

/**
 * A placeholder fragment containing a simple view.
 */
public class CategorySelectedFragment extends Fragment{
private final static String LOG_TAG=CategorySelected.class.getSimpleName();
    private  String type;
    private String category;
    private AllCategories cat;
    CustomAdapter adapter;




    public CategorySelectedFragment() {
    }
    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
   SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
// Storing
        preferences.edit().putString("type",type).commit();
        preferences.edit().putString("category",category).commit();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.fragment_category_selected, container, false);
                if(getActivity().getIntent().getStringExtra("category")!=null) {
                    type = getActivity().getIntent().getStringExtra("type");
                       category = getActivity().getIntent().getStringExtra("category");
                }
        else{
                    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
                    type=preferences.getString("type",null);
                   category= preferences.getString("category", null);
                }
        cat=new AllCategories(category);

        ListView view=(ListView) rootview.findViewById(R.id.list_view);
        adapter=new CustomAdapter(getActivity());
        view.setAdapter(adapter);

        return rootview;
    }



    class CustomAdapter extends BaseAdapter{

        Context context;
        private String[] data=cat.getResult();
        private  LayoutInflater inflater = null;
        public CustomAdapter(Context c){
            context=c;
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }
        @Override
        public int getCount() {
            if (data!=null){
                return data.length;
            }
            return 0;
        }

        @Override
        public View getView(final int i, View convertView, ViewGroup viewGroup) {
            LinearLayout view;
            if(convertView==null){
                view=(LinearLayout) inflater.inflate(R.layout.list_item,null);
            }else{
                view=(LinearLayout) convertView;}
               TextView text= (TextView)view.findViewById(R.id.item);
            Typeface typeFace= Typeface.createFromAsset(getActivity().getAssets(),"gothic_0.TTF");

            text.setText(data[i]);
            text.setTypeface(typeFace);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(context,ListOfItems.class);
                    intent.putExtra("item",data[i]);
                    startActivity(intent);
                }
            });
            ImageView imageView= (ImageView)view.findViewById(R.id.image1);
            int k=cat.getImage(i,type);
           // Log.v(LOG_TAG,k+"");
            imageView.setImageResource(k);
            return view;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return  data[i];
            //return null;
        }
    }



}
