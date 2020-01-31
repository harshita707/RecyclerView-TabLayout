package com.harshita.abc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ContactsFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstcontact;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstcontact = new ArrayList<>();
        lstcontact.add(new Contact("Name 1", "Phone 1", R.drawable.one));
        lstcontact.add(new Contact("Name 2", "Phone 2", R.drawable.two));
        lstcontact.add(new Contact("Name 3", "Phone 3", R.drawable.three));
        lstcontact.add(new Contact("Name 4", "Phone 4", R.drawable.four));
        lstcontact.add(new Contact("Name 5", "Phone 5", R.drawable.one));
        lstcontact.add(new Contact("Name 6", "Phone 6", R.drawable.two));
        lstcontact.add(new Contact("Name 7", "Phone 7", R.drawable.three));
        lstcontact.add(new Contact("Name 8", "Phone 8", R.drawable.four));
        lstcontact.add(new Contact("Name 9", "Phone 9", R.drawable.one));
        lstcontact.add(new Contact("Name 10", "Phone 10", R.drawable.two));
        lstcontact.add(new Contact("Name 11", "Phone 11", R.drawable.three));
        lstcontact.add(new Contact("Name 12", "Phone 12", R.drawable.four));


    }

    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_contacts, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recycler);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstcontact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }
}
