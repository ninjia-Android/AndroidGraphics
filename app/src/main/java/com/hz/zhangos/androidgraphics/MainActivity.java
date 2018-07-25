package com.hz.zhangos.androidgraphics;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hz.zhangos.androidgraphics.Models.FunctionSub;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTableLayout;
    private ViewPager mViewPager;

    private List<FunctionSub> mFunctionSubs = new ArrayList<>();

    {
        mFunctionSubs.add(new FunctionSub("circle",R.layout.circle));
        mFunctionSubs.add(new FunctionSub("circle",R.layout.circle));
        mFunctionSubs.add(new FunctionSub("circle",R.layout.circle));
        mFunctionSubs.add(new FunctionSub("circle",R.layout.circle));
        mFunctionSubs.add(new FunctionSub("circle",R.layout.circle));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setData();
    }

    private void initView() {
        mTableLayout = findViewById(R.id.tabLayout);
        mViewPager = findViewById(R.id.vp);
    }

    private void setData() {

        mViewPager.setAdapter(CreateFragmentStatePagerAdapter());
        mTableLayout.setupWithViewPager(mViewPager);
    }


    private FragmentStatePagerAdapter CreateFragmentStatePagerAdapter() {
        return new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                return mFunctionSubs.size();
            }

            @Override
            public Fragment getItem(int position) {
                FunctionSub functionSub = mFunctionSubs.get(position);
                return  BaseFragment.newInstance(functionSub.getLayoutId());
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return mFunctionSubs.get(position).getName();
            }
        };
    }

}
