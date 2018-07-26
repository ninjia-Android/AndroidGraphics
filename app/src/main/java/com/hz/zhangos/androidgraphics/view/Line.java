package com.hz.zhangos.androidgraphics.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Line extends View {
    Paint mPaint;
    public Line(Context context) {
        super(context);
    }

    public Line(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Line(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Line(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if(mPaint == null)
            mPaint = new Paint();
        mPaint.setStrokeWidth(10);
        canvas.drawLine(0,0,100,200,mPaint);
    }
}
