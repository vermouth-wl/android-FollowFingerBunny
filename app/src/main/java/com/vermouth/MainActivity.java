package com.vermouth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取帧布局管理器
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mylayout);

        // 创建并实例化RabbitView类
        final RabbitView rabbitView = new RabbitView(this);

        // 为小兔子添加触摸监听事件
        rabbitView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                // 设置小兔子的(x, y)坐标
                rabbitView.bitmapX = event.getX();
                rabbitView.bitmapY = event.getY();

                // 重绘rabbitView组件
                rabbitView.invalidate();
                return true;
            }
        });

        // 将rabbitView添加到布局管理器中
        frameLayout.addView(rabbitView);
    }
}
