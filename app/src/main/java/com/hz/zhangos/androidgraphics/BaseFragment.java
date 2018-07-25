package com.hz.zhangos.androidgraphics;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;

public class BaseFragment extends Fragment {
   private  @LayoutRes int layoutId;

   public static BaseFragment newInstance(@LayoutRes int layoutId) {
        BaseFragment baseFragment = new BaseFragment();
        Bundle args = new Bundle();
        args.putInt("layoutId",layoutId);
        baseFragment.setArguments(args);
        return baseFragment;
   }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if(args != null){
            layoutId = args.getInt("layoutId");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_view,container,false);
        ViewStub viewStub = view.findViewById(R.id.viewStub);
        viewStub.setLayoutResource(layoutId);
        viewStub.inflate();
        return view;
    }
}
