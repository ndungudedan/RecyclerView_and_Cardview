package com.tidtech.meetup;

import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainAdapter extends ListAdapter<noteItem,MainAdapter.ViewHolder> {
    public MainAdapter() {
        super(new Differ());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bind(getItem(i));

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mItemTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           // mItemTextView=itemView.findViewById(R.id.textView);
        }
        public void bind(noteItem item){
         mItemTextView.setText(item.getItemName());
        }
    }



}
