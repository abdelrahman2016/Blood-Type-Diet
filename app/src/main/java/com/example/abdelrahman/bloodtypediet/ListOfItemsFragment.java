package com.example.abdelrahman.bloodtypediet;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class ListOfItemsFragment extends Fragment  implements  DataFetched{
    private Background background;
    CustomAdapter adapter;
    private final static String LOG_TAG=CategorySelected.class.getSimpleName();

    public ListOfItemsFragment() {
    }
    @Override
    public Uri.Builder buildUri(String st) {
        Uri.Builder uri=new Uri.Builder();
        uri.scheme("http");
        uri.authority("api.nal.usda.gov");
        uri.appendPath("ndb");
        uri.appendPath("search");
        uri.appendQueryParameter("format","json");
        uri.appendQueryParameter("q",st);
        uri.appendQueryParameter("sort","n");
        uri.appendQueryParameter("max","5");
        uri.appendQueryParameter("api_key","mFQ1sfd7um6GSUyQcTX9v6FJPwI247sOlxoTIGhi");
        return uri;
    }

    @Override
    public void update(String data) {
       String dataItems=data;
        try {
            //Log.v(LOG_TAG,data);
            JSONObject jsonObject=new JSONObject(data);
            JSONObject jsonArray=jsonObject.getJSONObject("list");
            JSONArray array =jsonArray.getJSONArray("item");
            adapter.data=array;
            adapter.notifyDataSetChanged();
           // Log.v(LOG_TAG, array.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Log.v(LOG_TAG,data);
    }

    @Override
    public void onStart() {
        super.onStart();
        background=new Background(getActivity(),(DataFetched) this);
        background.execute(getActivity().getIntent().getStringExtra("item"));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=(View) inflater.inflate(R.layout.fragment_list_of_items, container, false);

/*
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,R.layout.list_item_for_list_of_items,null);
*/
        ListView view=(ListView) rootView.findViewById(R.id.list_view_items);
        adapter=new CustomAdapter(this);
        view.setAdapter(adapter);
        final EditText edit=(EditText)rootView.findViewById(R.id.search);
        Button button=(Button)rootView.findViewById(R.id.search_button);
        final DataFetched data=this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background=new Background(getActivity(),data);
                background.execute(edit.getText().toString());

            }
        });
        return rootView;
    }




    class CustomAdapter extends BaseAdapter {

        Context context;
        private JSONArray data = new JSONArray();
        private LayoutInflater inflater = null;
        ListOfItemsFragment listOfItemsFragment;

        public CustomAdapter(ListOfItemsFragment c) {
            ListOfItemsFragment listOfItemsFragment = c;
            context = c.getActivity();
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            if (data != null) {
                return data.length();
            }
            return 0;
        }

        @Override
        public View getView(final int i, View convertView, ViewGroup viewGroup) {
            LinearLayout view;
            if (convertView == null) {
                view = (LinearLayout) inflater.inflate(R.layout.list_item_for_list_of_items, null);
            } else {
                view = (LinearLayout) convertView;
            }
            TextView text = (TextView) view.findViewById(R.id.list_item_textview);
            Typeface typeFace= Typeface.createFromAsset(getActivity().getAssets(),"gothic_0.TTF");
            text.setTypeface(typeFace);
            text.setTypeface(typeFace);

            try {
               final JSONObject object = (JSONObject) data.get(i);
                text.setText(object.getString("name"));

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent=new Intent(context,NutritionFacts.class);
                            intent.putExtra("ndbno",object.getString("ndbno"));
                            intent.putExtra("name",object.getString("name"));

                            startActivity(intent);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                });
            } catch (JSONException e) {
                e.printStackTrace();
            }
/*
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    background = new Background(getActivity(), (DataFetched) listOfItemsFragment);
                    background.execute(data.get(i));

                }
            });*/
            return view;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public Object getItem(int i) {

            try {
                return
                        data.get(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
    }


}



