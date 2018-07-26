package com.hz.zhangos.androidgraphics.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class HistogramView extends View {

    public List<Float> histogramParameter = new ArrayList<>();

    Paint mPaint;
    Path mPath;

    public HistogramView(Context context) {
        super(context);
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mPaint == null)
            mPaint = new Paint();
        if (mPath == null)
            mPath = new Path();
        mPaint.setColor(Color.BLUE);
        for (int i = 1; i < 10; i++) {
            float topValue = (float) (Math.random() * 100);
            canvas.drawRect(40 * i - 30, topValue, i * 4 * 10, 500, mPaint);
        }
    }
}
