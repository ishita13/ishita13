package com.example.contacts_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LogsRvAdapter extends RecyclerView.Adapter<LogsRvAdapter.Viewholder> {
    private LayoutInflater layoutInflater;
    private Context context;
    private List<Models> listName;
    public LogsRvAdapter(Context c,List<Models> l)
    {
        context=c;
        listName=l;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater=LayoutInflater.from(context);
        View v=layoutInflater.inflate(R.layout.item_logs,parent,false);
        Viewholder viewHolder=new Viewholder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position)
    {
        TextView number,name,dura;
        name=holder.name;
        number=holder.number;
        dura=holder.dura;
        //dt=holder.dt;
        name.setText(listName.get(position).getName());
        number.setText(listName.get(position).getNumber());
        dura.setText(listName.get(position).getDuration());
        //dt.setText(ListName.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return listName.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder
    {
        TextView number,name,dura;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            name=(TextView)itemView.findViewById(R.id.names);
            number=(TextView)itemView.findViewById(R.id.numberlog);
            dura=(TextView)itemView.findViewById(R.id.logTime);
            //name=(TextView)itemView.findViewById(R.id.logdate);

        }
    }
}