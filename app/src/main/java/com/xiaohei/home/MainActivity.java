package com.xiaohei.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private final int FIRST = 0;
    private final int SECOND = 1;
    private final int THIRD = 2;
    private final int FOURTH = 3;

    private Fragment[] mFragments = new Fragment[4];
    private Context mContext;
    private int curIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = MainActivity.this;

        mFragments[FIRST] = HomeFragment.newInstance();
        mFragments[SECOND] = HomeFragment1.newInstance();
        mFragments[THIRD] = HomeFragment2.newInstance();
        mFragments[FOURTH] = HomeFragment3.newInstance();
        FragmentManager supportFragmentManager = getSupportFragmentManager();

        FragmentUtils.add(supportFragmentManager, mFragments, R.id.fragment_contain, FIRST);


        RadioGroup group = findViewById(R.id.radio_group);
        RadioButton home = findViewById(R.id.btn_main_home);
        RadioButton recommend = findViewById(R.id.btn_main_recommend);
        RadioButton indent = findViewById(R.id.btn_main_indent);
        RadioButton my = findViewById(R.id.btn_main_my);

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

                    case R.id.btn_main_indent:
                        showCurrentFragment(THIRD);
                        break;

                    case R.id.btn_main_my:
                        showCurrentFragment(FOURTH);
                        break;
                }
            }
        });

    }



    private void showCurrentFragment(int index) {
        FragmentUtils.showHide(curIndex = index, mFragments);
    }
}
