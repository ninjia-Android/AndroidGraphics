package com.hz.zhangos.androidgraphics.Models;

import android.support.annotation.LayoutRes;

public class FunctionSub {
    private String name;
    private @LayoutRes int layoutId;

    public FunctionSub(String name, int layoutId) {
        this.name = name;
        this.layoutId = layoutId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
    }
}
