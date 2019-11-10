package com.example.contacts_app;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Fragment_logs extends Fragment
{
    ImageButton button;
//    SendMessage SM;
    private RecyclerView recyclerView;
    private View v;
    public Fragment_logs()
    {

}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.contacts_log,container,false);
        recyclerView=v.findViewById(R.id.contactlogs_recycler);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        RecyclerView.LayoutManager layoutManager=linearLayoutManager;
        recyclerView.setLayoutManager(layoutManager);
        button=(ImageButton)v.findViewById(R.id.img_logs);
        LogsRvAdapter adapter=new LogsRvAdapter(getContext(),getCallLogs());
        recyclerView.setAdapter(adapter);
        return v;
    }
    private List<Models> getCallLogs()
    {
        List<Models> list=new ArrayList<>();
        if(ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.READ_CALL_LOG)!=
        PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.READ_CALL_LOG},1);
        }

        Cursor cr=getContext().getContentResolver().query(CallLog.Calls.CONTENT_URI,
                null,null,null,CallLog.Calls.DEFAULT_SORT_ORDER);
        int number=cr.getColumnIndex(CallLog.Calls.NUMBER);
        int nameIndex=cr.getColumnIndex(CallLog.Calls.CACHED_NAME);
        int duration=cr.getColumnIndex(CallLog.Calls.DURATION);
        cr.moveToFirst();
        while(cr.moveToNext())
        {
            list.add(new Models(cr.getString(nameIndex),cr.getString(number),cr.getString(duration)));
        }
        cr.close();
        return list;


}

}





