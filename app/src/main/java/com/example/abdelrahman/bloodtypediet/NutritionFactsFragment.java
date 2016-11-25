package com.example.abdelrahman.bloodtypediet;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * A placeholder fragment containing a simple view.
 */
public class NutritionFactsFragment extends Fragment implements  DataFetched {
    private Background background;
    String name;
    String measure;
    String weight;
    JSONArray arrayItems;
View rootView;
    private final  String LOG_TAG=NutritionFactsFragment.class.getSimpleName();
    public NutritionFactsFragment() {
    }

    @Override
    public void update(String data) {
        try {
          //  Log.v(LOG_TAG,data);
            JSONObject obj3=new JSONObject(data);
            JSONObject obj=obj3.getJSONObject("report");

            JSONArray array= obj.getJSONArray("foods");

            JSONObject obj1= array.getJSONObject(0);
            //Log.v(LOG_TAG,obj1.toString());

            name=obj1.getString("name");
             measure =obj1.getString("measure");
            weight=obj1.getString("weight");

            this.arrayItems= obj1.getJSONArray("nutrients");
            //Log.v(LOG_TAG,arrayItems.toString());
            if (rootView!=null) {
                TextView textName = (TextView) rootView.findViewById(R.id.name);
                textName.setText(name);
                TextView textMeasure = (TextView) rootView.findViewById(R.id.measure);
                textMeasure.setText(measure);
                TextView textWeight = (TextView) rootView.findViewById(R.id.net_weight);
                textWeight.setText(weight);
                JSONObject item = null;
                try {

                    item = arrayItems.getJSONObject(0);
                    String unit = item.getString("unit");
                    String value = item.getString("value");
                    TextView protein = (TextView) rootView.findViewById(R.id.protein);
                    protein.setText(value+" "+unit);


                    item = arrayItems.getJSONObject(1);
                    unit = item.getString("unit");
                     value = item.getString("value");
                    TextView sugar = (TextView) rootView.findViewById(R.id.sugar);
                    sugar.setText(value+" "+unit);

                    item = arrayItems.getJSONObject(2);
                    unit = item.getString("unit");
                    //Log.v(LOG_TAG,unit);
                    value = item.getString("value");
                    TextView fats = (TextView) rootView.findViewById(R.id.fats);
                    fats.setText(value+" "+unit);

                    item = arrayItems.getJSONObject(3);
                    unit = item.getString("unit");
                    value = item.getString("value");
                    TextView carbs = (TextView) rootView.findViewById(R.id.carbs);
                    carbs.setText(value+" "+unit);

                    item = arrayItems.getJSONObject(4);
                    unit = item.getString("unit");
                    value = item.getString("value");
                    TextView energy = (TextView) rootView.findViewById(R.id.energy);
                    energy.setText(value+" "+unit);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Uri.Builder buildUri(String st) {
        Uri.Builder uri=new Uri.Builder();
        uri.scheme("http");
        uri.authority("api.nal.usda.gov");
        uri.appendPath("ndb");
        uri.appendPath("nutrients");
        uri.appendQueryParameter("format","json");
        uri.appendQueryParameter("ndbno",st);
        uri.appendQueryParameter("nutrients","205");
        uri.appendQueryParameter("nutrients","204");
        uri.appendQueryParameter("nutrients","208");
        uri.appendQueryParameter("nutrients","269");
        uri.appendQueryParameter("nutrients","203");

        uri.appendQueryParameter("api_key","mFQ1sfd7um6GSUyQcTX9v6FJPwI247sOlxoTIGhi");
        Log.v(LOG_TAG,uri.toString());

        return uri;
    }

    @Override
    public void onStart() {
        super.onStart();
        background=new Background(getActivity(),this);
        //Log.v(LOG_TAG,getActivity().getIntent().getStringExtra("ndbno"));
        background.execute(getActivity().getIntent().getStringExtra("ndbno"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       rootView =inflater.inflate(R.layout.fragment_nutrition_facts, container, false);

        return rootView;
    }
}
