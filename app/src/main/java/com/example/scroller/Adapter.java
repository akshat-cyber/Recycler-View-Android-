package com.example.scroller;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<dataSet> dta;
    public Adapter(ArrayList<dataSet> data) {
        this.dta = data;
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bar, parent, false);
        return new Holder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
         dataSet set =  dta.get(position);
         String user_name = set.getUserName();
         String status = set.getState();
         holder.setData(user_name, status);
    }
    @Override
    public int getItemCount() {
        return dta.size();
    }

    class Holder extends RecyclerView.ViewHolder{
       public TextView user;
       public TextView status;
        public Holder(@NonNull View itemView) {
            super(itemView);
            user = itemView.findViewById(R.id.user_name);
            status = itemView.findViewById(R.id.status);
        }
        public void setData(String user, String status) {
            this.status.setText(status);
            this.user.setText(user);
        }
    }
}
