package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private int mWidth, mHeight;
    private Paint mPaint;
    private Path mPath;

    public Practice9DrawPathView(Context context) {
        super(context);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = getMeasuredWidth();
        mHeight = getMeasuredHeight();
    }

    private void init(){
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5);
        mPaint.setAntiAlias(true);

        mPath = new Path();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        RectF leftCircle = new RectF(mWidth/2 - 100, mHeight / 2 - 100, mWidth / 2, mHeight/ 2);

        RectF RightCircle = new RectF(mWidth/2, mHeight / 2 - 100, mWidth / 2 + 100, mHeight/ 2);
        mPath.addArc(RightCircle, 40, -220);

        mPath.arcTo(leftCircle, 0, -220);
        mPath.lineTo(mWidth/2, mHeight / 2 + 100);

        mPath.close();


        canvas.drawPath(mPath, mPaint);
    }
}
