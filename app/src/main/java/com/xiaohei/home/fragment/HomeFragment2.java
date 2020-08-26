package com.xiaohei.home.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.xiaohei.home.R;
import com.xiaohei.home.utils.FragmentUtils;


/**
 * @author XIAOHEI
 * @description:
 * @date :2020/6/23 11:28
 */
public class HomeFragment2 extends Fragment {
    private View view;
    private final int FIRST = 0;
    private final int SECOND = 1;

    private Fragment[] mFragments = new Fragment[2];
    private Context mContext;
    private int curIndex;

    public static HomeFragment2 newInstance() {
        HomeFragment2 fragment = new HomeFragment2();
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_2, container, false);

        mFragments[FIRST] = HomeFragment2_1.newInstance();
        mFragments[SECOND] = HomeFragment2_2.newInstance();

        FragmentManager supportFragmentManager = getChildFragmentManager();

        FragmentUtils.add(supportFragmentManager, mFragments, R.id.fragment_contain, FIRST);
        RadioGroup group = view.findViewById(R.id.radio_group);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.btn_main_home:
                        showCurrentFragment(FIRST);
                        break;

                    case R.id.btn_main_recommend:
                        showCurrentFragment(SECOND);
                        break;
                }
            }
        });
        return view;
    }

    private void showCurrentFragment(int index) {
        FragmentUtils.showHide(curIndex = index, mFragments);
    }
}
