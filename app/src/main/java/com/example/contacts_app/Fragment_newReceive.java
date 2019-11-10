package com.example.contacts_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Fragment_newReceive extends Fragment {
    TextView txtData;

    public Fragment_newReceive(FragmentManager supportFragmentManager) {
    }

//    public Fragment_newReceive(FragmentManager supportFragmentManager) {
//    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_newargument, container, false);
        return view;
    }


   public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
   {
       super.onViewCreated(view,savedInstanceState);
       txtData = (TextView)view.findViewById(R.id.TxtView);
   }

    protected void displayReceivedData(String message)
    {

        txtData.setText("Data received: "+message);
    }
}
