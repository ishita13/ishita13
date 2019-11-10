package com.example.contacts_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    Context context;
    List<Contacts> data;

    public RecyclerAdapter(Context c,List<Contacts> d)
    {
        context =c;
        data=d;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v;
       v= LayoutInflater.from(context).inflate(R.layout.items,parent,false);
       MyViewHolder vh=new MyViewHolder(v);
       return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.name.setText(data.get(position).getNames());
        holder.phone.setText(data.get(position).getNumber());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        private TextView name;
        private TextView phone;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name=(TextView)itemView.findViewById(R.id.names);
            phone=(TextView)itemView.findViewById(R.id.number);


        }
    }





}
