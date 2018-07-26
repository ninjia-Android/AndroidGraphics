package com.hz.zhangos.androidgraphics.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class oval extends View {
    Paint mPaint;

    public oval(Context context) {
        super(context);
    }

    public oval(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public oval(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public oval(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(mPaint == null)
            mPaint = new Paint();

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawOval(50, 50, 350, 200, mPaint);
    }
}
