package com.example.shiba_inu_app.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shiba_inu_app.R;
import com.example.shiba_inu_app.RecyclerView.RecyclerViewAdapter;
import com.example.shiba_inu_app.SliderAdapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


public class HomePageFragment extends Fragment {

    SliderView sliderView;
    int[]images={
            R.drawable._4123123,
            R.drawable._42230284,
            R.drawable._42254670
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //載入介面布局檔，得到一個 view 物件
        View view=inflater.inflate(R.layout.home_activity, container, false);

        //從 view 物件取得介面文件並完成設定  -> view.findViewById()
        sliderView=view.findViewById(R.id.image_slider);


        SliderAdapter sliderAdapter=new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);//圖片倫波下面黑色點點
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION); //切換動畫
        sliderView.startAutoCycle();


        //把項目清單項目準備好，放在一個List物件裡
        List<String> liststring=new ArrayList<>();
        for (int i=0 ; i<8 ; i++ ){liststring.add(new String(String.valueOf(i+1)));}

        //取得介面布局檔中的Recycler元件
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);

        //設定RecyclerView使用的LayoutManager，編排方式
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        //建立RecyclerView 的Adapter物件，傳入包含項目清單的List物件
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(liststring);

        //把Adapter物件傳給RecyclerView
        recyclerView.setAdapter(adapter);





        return view;
    }
}