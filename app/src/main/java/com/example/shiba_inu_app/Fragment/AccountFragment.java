package com.example.shiba_inu_app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shiba_inu_app.R;
import com.example.shiba_inu_app.membersOnly;
import com.example.shiba_inu_app.termsAndDetails;


public class AccountFragment extends Fragment {
    CardView termsAndDetails,membersOnly;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.account_activity, container, false);

        //按下 條款細項 畫面轉換
        termsAndDetails=(CardView)view.findViewById(R.id.termsAndDetails);
        termsAndDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),termsAndDetails.class);
                startActivity(intent);
            }
        });

        //按下 會員專區 畫面轉換
        membersOnly=(CardView)view.findViewById(R.id.membersOnly);
        membersOnly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),membersOnly.class);
                startActivity(intent);
            }
        });


        return view;
    }
}