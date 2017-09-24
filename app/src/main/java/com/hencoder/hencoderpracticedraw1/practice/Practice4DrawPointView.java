package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {

    private int mWidth, mHeight;
    private Paint mPaint;

    public Practice4DrawPointView(Context context) {
        super(context);
        init();
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(40);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        int halfWidth = mWidth / 2;
        int halfHeight = mHeight / 2;

        canvas.drawPoint(halfWidth / 2, halfHeight, mPaint);

        mPaint.setStrokeCap(Paint.Cap.SQUARE);

        canvas.drawPoint(halfWidth / 2 + halfWidth, halfHeight, mPaint);
    }
}
