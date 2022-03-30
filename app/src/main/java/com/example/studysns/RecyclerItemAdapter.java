package com.example.studysns;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerItemAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<RecyclerItem> list;

    RecyclerItemAdapter(ArrayList<RecyclerItem> list){
        this.list = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.fragment_recycleitem, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerItem recyclerItem = list.get(position);
        holder.title.setText(recyclerItem.getTitle());
        holder.rep.setText(recyclerItem.getRep());
        holder.category.setText(recyclerItem.getCategory());
        holder.term.setText(recyclerItem.getTerm());
        holder.Tdata.setText(recyclerItem.getTdata());
        holder.StudySize.setText(recyclerItem.getStudySize());
        holder.Sdata0.setText(recyclerItem.getSdata0());
        holder.slash.setText(recyclerItem.getSlash());
        holder.Sdata1.setText(recyclerItem.getSdata1());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
   class ViewHolder extends  RecyclerView.ViewHolder{
    TextView title;
    TextView rep;
    TextView category;
    TextView term;
    TextView Tdata;
    TextView StudySize;
    TextView Sdata0;
    TextView slash;
    TextView Sdata1;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           title = itemView.findViewById(R.id.title);
           rep = itemView.findViewById(R.id.rep);
           category = itemView.findViewById(R.id.category);
           term = itemView.findViewById(R.id.term);
           Tdata = itemView.findViewById(R.id.Tdata);
           StudySize = itemView.findViewById(R.id.studySize);
           Sdata0 = itemView.findViewById(R.id.Sdata0);
           slash = itemView.findViewById(R.id.Slash);
           Sdata1 = itemView.findViewById(R.id.Sdata1);
       }
   }
