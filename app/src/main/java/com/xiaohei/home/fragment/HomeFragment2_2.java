package com.xiaohei.home.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.xiaohei.home.R;


/**
 * @author XIAOHEI
 * @description:
 * @date :2020/6/23 11:28
 */
public class HomeFragment2_2 extends Fragment {
    private View view;

    public static HomeFragment2_2 newInstance() {
        HomeFragment2_2 fragment = new HomeFragment2_2();
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_1, container, false);
        TextView tv = view.findViewById(R.id.fragment_tv);
        tv.setText("我是第2_2个界面");
        return view;
    }
}
