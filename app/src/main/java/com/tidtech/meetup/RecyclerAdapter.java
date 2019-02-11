package com.tidtech.meetup;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private final Context mContext;
    private final LayoutInflater inflater;
    private final List<noteItem> mNotes;

    public RecyclerAdapter(Context mContext, List<noteItem> mNotes) {
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);
        this.mNotes = mNotes;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView title;
        public final TextView sub;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.txt_title);
            sub = (TextView)itemView.findViewById(R.id.txt_sub);
        }
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView=inflater.inflate(R.layout.recycler,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder viewHolder, int i) {
        noteItem note=mNotes.get(i);
        viewHolder.title.setText(note.getItemName());
        viewHolder.sub.setText(note.getItemTitle());
    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }


}
