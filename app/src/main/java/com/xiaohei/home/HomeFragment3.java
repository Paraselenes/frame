package com.xiaohei.home;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * @author XIAOHEI
 * @description:
 * @date :2020/6/23 11:28
 */
public class HomeFragment3 extends Fragment {
    private View view;

    public static HomeFragment3 newInstance() {
        HomeFragment3 fragment = new HomeFragment3();
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_1, container, false);
        TextView tv = view.findViewById(R.id.fragment_tv);
        tv.setText("我是第四个界面");
        return view;
    }
}