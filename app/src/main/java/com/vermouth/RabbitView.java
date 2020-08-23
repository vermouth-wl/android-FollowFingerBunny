package com.vermouth;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;


public class RabbitView extends View {

    // 兔子显示位置的x坐标
    public float bitmapX;

    // 兔子显示位置的y坐标
    public float bitmapY;

    // 重写构造方法
    public RabbitView(Context context) {
        super(context);

        // 设置兔子显示位置的x坐标与y坐标
        bitmapX = 210;
        bitmapY = 130;
    }

    // 重写onDraw()方法
    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        // 创建并实例化paint对象
        Paint paint = new Paint();

        // 根据图片生成位图对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.mipmap.rabbit);

        // 绘制小兔子
        canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);

        // 判断图片是否回收, 如果为否，强制回收
        if (!bitmap.isRecycled()) {
            bitmap.isRecycled();
        }
    }

}
