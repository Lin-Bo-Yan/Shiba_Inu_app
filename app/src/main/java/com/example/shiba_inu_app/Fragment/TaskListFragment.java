package com.example.shiba_inu_app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shiba_inu_app.R;
import com.example.shiba_inu_app.RecyclerView.RecyclerViewAdapter;
import com.example.shiba_inu_app.RecyclerView.TaskListRecyclerView;
import com.example.shiba_inu_app.TaskDescription;
import com.example.shiba_inu_app.membersOnly;

import java.util.ArrayList;
import java.util.List;


public class TaskListFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View view =inflater.inflate(R.layout.task_list_fragment, container, false);




        //把項目清單項目準備好，放在一個List物件裡
        List<String> liststring=new ArrayList<>();
        for (int i=0 ; i<10 ; i++ ){liststring.add("第"+(i+1)+"項");}

        //取得介面布局檔中的Recycler元件
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);

        //設定RecyclerView使用的LayoutManager，編排方式
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //TaskListRecyclerView 的Adapter物件，傳入包含項目清單的List物件
        TaskListRecyclerView adapter=new TaskListRecyclerView(liststring);

        //把Adapter物件傳給RecyclerView
        recyclerView.setAdapter(adapter);

        return view;







    }
}