package com.hz.zhangos.androidgraphics.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CircleView extends View {
    Paint mPaint;
    Path mPath;

    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mPaint == null)
            mPaint = new Paint();
        if (mPath == null)
            mPath = new Path();

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        //实心圆
        canvas.drawCircle(250,400,200,mPaint);
        //空心圆
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(800,400,200,mPaint);

        //实心圆 颜色蓝
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(250,1000,200,mPaint);

        //path画圆
        mPaint.setColor(Color.BLACK);
        mPath.addCircle(800,1000,200, Path.Direction.CCW);
        mPath.addCircle(800,1000,100, Path.Direction.CW);
        mPath.setFillType(Path.FillType.WINDING);
        canvas.drawPath(mPath,mPaint);
    }
}
