package com.hz.zhangos.androidgraphics.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class path extends View {
    Paint mPaint;
    Path mPath;

    public path(Context context) {
        super(context);
    }

    public path(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public path(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public path(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (mPath == null)
            mPath = new Path();
        if (mPaint == null)
            mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPath.addArc(200, 200, 400, 400, -225, 225);
        mPath.arcTo(400, 200, 600, 400, -180, 225, false);
        mPath.lineTo(400, 542);

        canvas.drawPath(mPath, mPaint);
    }
}
