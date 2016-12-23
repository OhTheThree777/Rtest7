package cn.edu.imnu.ciec.rtest7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //定义一个访问图片的数组
    int[] images={
            R.drawable.java,
            R.drawable.ajax,
            R.drawable.html,
            R.drawable.javaee,
            R.drawable.swift
    };
    int currentImg=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout= (LinearLayout) findViewById(R.id.activity_main);

        final ImageView image=new ImageView(this);
        layout.addView(image);

        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(images[++currentImg % images.length]);
            }
        });

    }
}
