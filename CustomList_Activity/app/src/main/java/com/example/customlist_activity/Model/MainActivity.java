package com.example.customlist_activity.Model;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.customlist_activity.R;
import com.example.customlist_activity.adapter.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView lvContact;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv_contact);
        ArrayList<Contact> arrayList = new ArrayList<>();
            Contact contact1 = new Contact(Color.BLACK, "Side to Side", "Ariana Grande");
            Contact contact2 = new Contact(Color.RED, "PSY", "Redvelvet");
            Contact contact3 = new Contact(Color.CYAN, "Secrect Song", "Juston Derulo");
            Contact contact4 = new Contact(Color.RED, "Baby", "Justin Bieber");
            Contact contact5 = new Contact(Color.BLACK, "Send My Love", "Adele");
            arrayList.add(contact1);
            arrayList.add(contact2);
            arrayList.add(contact3);
            arrayList.add(contact4);
            arrayList.add(contact5);
        CustomAdapter customAdapterv= new CustomAdapter(this,R.layout.cot_item,arrayList);
        lvContact.setAdapter(customAdapterv);
    }
}
