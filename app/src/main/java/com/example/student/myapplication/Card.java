package com.example.student.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import static android.widget.ListPopupWindow.WRAP_CONTENT;

/**
 * Created by student on 2017/10/12.
 */

public class Card extends FrameLayout {



    public Card(@NonNull Context context){
        super(context);
        FrameLayout.LayoutParams lp=new FrameLayout.LayoutParams(WRAP_CONTENT ,WRAP_CONTENT);
        lp.setMargins(10,10,0,0);

        View view=new View(context);
        addView(view,lp);

        tv = new TextView(context);
        tv.setText(Integer.toString(0));
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        addView(tv);
    }
    TextView tv;
    public void setNum(int num){
    tv.setText(Integer.toString(num));
    }

}

