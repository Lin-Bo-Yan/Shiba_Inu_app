package com.example.shiba_inu_app.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shiba_inu_app.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    //儲存要顯示的資料
    private List<String> mlistString;



    //RecyclerView會呼叫這個方法，我們必須建立好項目的ViewHolder物件，然後傳回給RecyclerView
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.latest_demand,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    //RecyclerView會呼叫這個方法，我們必須把項目資料填入ViewHolder物件。
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        //產生資料
        holder.area.setText(mlistString.get(position));
    }

    //Recyclerview會呼叫這個方法，我們要傳回總共幾個項目
    @Override
    public int getItemCount() {
        return mlistString.size();
    }



//--------------------------------------------


    //ViewHolder 是把項目中所有的View物件包起來
    //它在 onCreateViewHolder() 中使用。
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView area,time,budget,privateChat;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            area=(TextView)itemView.findViewById(R.id.area);
            time=(TextView)itemView.findViewById(R.id.time);
            budget=(TextView)itemView.findViewById(R.id.budget);
            privateChat=(TextView)itemView.findViewById(R.id.privateChat);

            //itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(),mlistString.get(getAdapterPosition()),Toast.LENGTH_LONG).show();
        }

    }

    //建構式，用來接收外部程式傳入的項目資料
    public RecyclerViewAdapter(List<String>listString){
        mlistString=listString;

    }
}
