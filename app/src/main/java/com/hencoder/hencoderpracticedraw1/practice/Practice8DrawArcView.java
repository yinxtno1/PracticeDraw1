package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    private int mWidth, mHeight;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        RectF r = new RectF(mWidth / 2 - 240, mHeight / 2 - 240, mWidth / 2 + 240, mHeight / 2 + 240);
        drawArcLine(canvas, r);
        drawSector(canvas, r);
        drawSector2(canvas, r);

    }

    /**
     * 弧线
     */
    private void drawArcLine(Canvas canvas, RectF r) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        canvas.drawArc(r, 0, 135, false, paint);
    }

    /**
     * 扇形
     */
    private void drawSector(Canvas canvas, RectF r) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);

        canvas.drawArc(r, 135, 135, true, paint);
    }

    private void drawSector2(Canvas canvas, RectF r) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);

        canvas.drawArc(r, 270, 90, false, paint);
    }
}
