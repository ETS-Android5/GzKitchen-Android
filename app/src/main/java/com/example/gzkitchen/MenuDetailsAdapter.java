package com.example.gzkitchen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class MenuDetailsAdapter extends BaseAdapter {
    Context context;
    JSONArray jsonArray;

    public MenuDetailsAdapter(Context contextParam, JSONArray jsonArrayParam) {
        this.context = contextParam;
        this.jsonArray = jsonArrayParam;
    }

    @Override
    public int getCount() {
        return jsonArray.length();
    }

    @Override
    public Object getItem(int i) {
        return -1;
    }

    @Override
    public long getItemId(int i) {
        return -1;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.menu_details_layout, null, false);

        try {
            ((TextView)viewInflate.findViewById(R.id.menuDetailsLayoutLbl)).setText(jsonArray.getString(i));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return viewInflate;
    }
}
