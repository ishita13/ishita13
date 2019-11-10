package com.example.contacts_app;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Fragment_Contacts extends Fragment {
    View v;
    //ImageButton bt;
    private RecyclerView myrecycler;

    private List<Contacts> firstContact;
    @Nullable
    private Bundle savedInstanceState;

    public Fragment_Contacts() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.contacts_fragment, container, false);
        myrecycler = (RecyclerView) v.findViewById(R.id.contact_recycler);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getContext(), firstContact);
        myrecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecycler.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firstContact = new ArrayList<>();
        firstContact.add(new Contacts("Ishita", "6395329938"));
        firstContact.add(new Contacts("Agarwal", "7060623664"));
        firstContact.add(new Contacts("Ishita1", "6395329938"));
        firstContact.add(new Contacts("Agarwal1", "7060623664"));
        firstContact.add(new Contacts("Ishita2", "6395329938"));
        firstContact.add(new Contacts("Agarwal2", "7060623664"));
        firstContact.add(new Contacts("Ishita3", "6395329938"));
        firstContact.add(new Contacts("Agarwal3", "7060623664"));
        firstContact.add(new Contacts("Ishita4", "6395329938"));
        firstContact.add(new Contacts("Agarwal4", "7060623664"));
        firstContact.add(new Contacts("Ishita5", "6395329938"));
        firstContact.add(new Contacts("Agarwal5", "7060623664"));
        firstContact.add(new Contacts("Ishita6", "6395329938"));
        firstContact.add(new Contacts("Agarwal6", "7060623664"));
        firstContact.add(new Contacts("Ishita7", "6395329938"));
        firstContact.add(new Contacts("Agarwal7", "7060623664"));
        firstContact.add(new Contacts("Ishita8", "6395329938"));
        firstContact.add(new Contacts("Agarwal8", "7060623664"));
        firstContact.add(new Contacts("Ishita9", "6395329938"));
        firstContact.add(new Contacts("Agarwal9", "7060623664"));
        firstContact.add(new Contacts("Ishita10", "6395329938"));
        firstContact.add(new Contacts("Agarwal10", "7060623664"));
        firstContact.add(new Contacts("Ishita11", "6395329938"));
        firstContact.add(new Contacts("Agarwal11", "7060623664"));
        firstContact.add(new Contacts("Ishita12", "6395329938"));
        firstContact.add(new Contacts("Agarwal13", "7060623664"));
    }
}



