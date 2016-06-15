package com.mj.scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private ScrollView scrollView;
    private Button     sure,cancle;
    private boolean    isScroll=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sure=(Button)findViewById(R.id.button1);
        cancle=(Button)findViewById(R.id.button2);

        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isScroll=true;
            }
        });
        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isScroll=false;
            }
        });


        scrollView = (ScrollView)this.findViewById(R.id.sc_freement);
        scrollView.setClickable(true);
        scrollView.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if(isScroll) {
                    return false;
                }else{
                    return  true;
                }
            }
        });
    }
}
