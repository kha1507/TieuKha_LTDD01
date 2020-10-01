package com.example.customlist_activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.customlist_activity.Model.Contact;
import com.example.customlist_activity.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private ArrayList<Contact> arrContact;
        public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Contact> objects) {
            super(context, resource, objects);
            this.context = context;
            this.resource = resource;
            this.arrContact = (ArrayList<Contact>) objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            convertView = LayoutInflater.from(context).inflate(R.layout.cot_item,parent,false);
        TextView tw_color = (TextView) convertView.findViewById(R.id.tw_color);
        TextView tw_song = (TextView) convertView.findViewById(R.id.tw_song);
        TextView tw_name = (TextView) convertView.findViewById(R.id.tw_name);
        Contact contact = arrContact.get(position);
        tw_color.setBackgroundColor(contact.getmColor());
        tw_color.setText((position+1)+"");
        tw_song.setText(contact.getmSong());
        tw_name.setText(contact.getmName());
        return convertView;
    }
}
