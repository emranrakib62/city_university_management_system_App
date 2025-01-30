package com.example.myuniversity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<ListData> listData;

    public ListAdapter(Context context, ArrayList<ListData> listData) {
        this.context = context;
        this.listData = listData;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        ListData currentItem = listData.get(position);

        ImageView imageView = convertView.findViewById(R.id.item_image);
        TextView titleView = convertView.findViewById(R.id.item_title);
        TextView descriptionView = convertView.findViewById(R.id.item_description);

        imageView.setImageResource(currentItem.getImage());
        titleView.setText(currentItem.getTitle());
        descriptionView.setText(currentItem.getDescription());

        return convertView;
    }
}
