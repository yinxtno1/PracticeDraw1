package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private int mWidth, mHeight;

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        mWidth = getMeasuredWidth();
        mHeight = getMeasuredHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        drawBlackSolidCircle(canvas);
        drawBlackHollowCircle(canvas);
        drawBlueSolidCircle(canvas);
        drawBlackHollow20PxCircle(canvas);
    }

    /**
     * 画黑色实心圆
     */
    private void drawBlackSolidCircle(Canvas canvas){

        Paint p = new Paint();
        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.FILL);

        int cx = mWidth / 2 / 2;
        int cy = mHeight / 2 / 2;
        canvas.drawCircle(cx, cy, Math.min(cx, cy) - 10, p);

    }

    /**
     * 画黑色空心圆
     */
    private void drawBlackHollowCircle(Canvas canvas){
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(5);

        int centerX = mWidth / 2;
        int centerY = mHeight / 2;

        int cx = centerX / 2 + centerX;
        int cy = centerY / 2;
        canvas.drawCircle(cx, cy, Math.min(centerX / 2, centerY / 2) - 10, p);
    }
    /**
     * 画蓝色实心圆
     */
    private void drawBlueSolidCircle(Canvas canvas){
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        p.setStyle(Paint.Style.FILL);

        int centerX = mWidth / 2;
        int centerY = mHeight / 2;

        int cx = centerX / 2;
        int cy = centerY / 2 + centerY;
        canvas.drawCircle(cx, cy, Math.min(centerX / 2, centerY / 2) - 10, p);
    }

    /**
     * 画线宽为 20px 的空心圆
     */
    private void drawBlackHollow20PxCircle(Canvas canvas){
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(20);

        int centerX = mWidth / 2;
        int centerY = mHeight / 2;

        int cx = centerX / 2 + centerX;
        int cy = centerY / 2 + centerY;
        canvas.drawCircle(cx, cy, Math.min(centerX / 2, centerY / 2) - 10, p);
    }


}
