package com.example.bee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class RequestAdapter extends ArrayAdapter<Request> {
    static final int LAYOUT = R.layout.request;

    public RequestAdapter(Context context, ArrayList<Request> requests) {
        super(context, LAYOUT, requests);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(LAYOUT, null);
        }
        return v;
    }
}