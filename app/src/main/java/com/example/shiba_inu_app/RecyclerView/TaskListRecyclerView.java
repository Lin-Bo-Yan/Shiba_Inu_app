package com.example.shiba_inu_app.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shiba_inu_app.R;

import java.util.List;

public class TaskListRecyclerView extends RecyclerView.Adapter<TaskListRecyclerView.ViewHolder>{

    //儲存要顯示的資料
    private List<String> mlistString;


    //RecyclerView會呼叫這個方法，我們必須建立好項目的ViewHolder物件，然後傳回給RecyclerView
    @NonNull
    @Override
    public TaskListRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.task_list_card,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    //RecyclerView會呼叫這個方法，我們必須把項目資料填入ViewHolder物件。
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //產生資料
        holder.content.setText(mlistString.get(position));
    }

    //Recyclerview會呼叫這個方法，我們要傳回總共幾個項目
    @Override
    public int getItemCount() {
        return mlistString.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView content;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            content=(TextView)itemView.findViewById(R.id.content);
            //itemView.setOnClickListener(this);
        }
    }

    public TaskListRecyclerView(List<String>listString){mlistString=listString;}

}