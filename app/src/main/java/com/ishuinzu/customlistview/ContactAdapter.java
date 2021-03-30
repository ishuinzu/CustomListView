package com.ishuinzu.customlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private Context context;
    private List<Contact> contactList;
    private LayoutInflater layoutInflater;

    public ContactAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contactList == null ? 0 : contactList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.item_list, parent, false);
        Contact contact = contactList.get(position);

        //Custom Layout View
        LinearLayout layoutContact = convertView.findViewById(R.id.layoutContact);
        TextView txtName = convertView.findViewById(R.id.txtName);
        TextView txtPhone = convertView.findViewById(R.id.txtPhone);

        //Adding Data Into Views
        txtName.setText(contact.getTxtName());
        txtPhone.setText(contact.getTxtPhone());

        //Adding Click Listener
        layoutContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Name : " + contact.getTxtName() + " Phone : " + contact.getTxtPhone(), Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}