package com.example.catalogmakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item> itemList;

    public ItemAdapter(Context context, ArrayList<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
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

        Item currentItem = (Item) getItem(position);

        ImageView imageView = convertView.findViewById(R.id.itemImage);
        TextView titleView = convertView.findViewById(R.id.itemTitle);
        TextView descriptionView = convertView.findViewById(R.id.itemDescription);

        imageView.setImageResource(currentItem.getImageResource());
        titleView.setText(currentItem.getTitle());
        descriptionView.setText(currentItem.getDescription());

        return convertView;
    }
}
