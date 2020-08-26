package com.xiaohei.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.xiaohei.home.view.CircleImageView;


/**
 * @author XIAOHEI
 * @description:
 * @date :2020/6/23 11:28
 */
public class HomeFragment extends Fragment {
    private View view;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_1, container, false);
        TextView tv = view.findViewById(R.id.fragment_tv);
        CircleImageView circleImageView = view.findViewById(R.id.civ);
        Glide.with(this)
                .load("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=251035182,2528090221&fm=26&gp=0.jpg")
                .into(circleImageView);
        tv.setText("我是第一个界面");
        return view;
    }
}
