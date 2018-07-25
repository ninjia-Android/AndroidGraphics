package com.hz.zhangos.androidgraphics.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class DemoView extends View {
    Paint mPaint;
    Path mPath;

    public DemoView(Context context) {
        super(context);
    }

    public DemoView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DemoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DemoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mPaint == null)
            mPaint = new Paint();
        if (mPath == null)
            mPath = new Path();

//        mPath.addCircle(300, 300, 200, Path.Direction.CW);
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.drawPath(mPath, mPaint);
//
//        mPath.addCircle(400, 300, 200, Path.Direction.CCW);
//        mPaint.setStyle(Paint.Style.STROKE);


        mPaint.setStyle(Paint.Style.FILL);
        mPath.addCircle(300, 300, 200, Path.Direction.CW);
        mPath.addCircle(300, 300, 100, Path.Direction.CW);

        //交叉填充
       // mPath.setFillType(Path.FillType.EVEN_ODD);
        //全填充
        mPath.setFillType(Path.FillType.EVEN_ODD);

        canvas.drawPath(mPath, mPaint);
    }
}
