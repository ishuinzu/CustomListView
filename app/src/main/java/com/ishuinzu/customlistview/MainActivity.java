package com.ishuinzu.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listCustom;
    private ContactAdapter contactAdapter;
    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCustom = findViewById(R.id.listCustom);

        loadData();
    }

    private void loadData() {
        contactList = new ArrayList<>();

        //Adding Data Into Contact List
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));
        contactList.add(new Contact("Inzi Programmer", "030303030303"));

        contactAdapter = new ContactAdapter(MainActivity.this, contactList);
        //Setting Adapter
        listCustom.setAdapter(contactAdapter);
    }
}