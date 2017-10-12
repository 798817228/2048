package com.example.student.myapplication;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.widget.ListPopupWindow.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout li=new LinearLayout(getApplicationContext());
        ViewGroup.LayoutParams params=new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT);
        li.setOrientation(LinearLayout.VERTICAL);
        addContentView(li,params);

        int n=4;
        for(int j=0;j<n;j++){

            LinearLayout row=new LinearLayout(getApplicationContext());
            row.setOrientation(LinearLayout.HORIZONTAL);

            for(int i=0;i<n;i++) {
                Card fl = new Card(getApplicationContext());
                card[i][j]=fl;
                fl.setNum(j*n+i);
                row.addView(fl);
            }
            li.addView(row);
        }
       // Card obj =new Card(getApplicationContext());
    }
    int nrows=4;
    Card card[][]=new Card[nrows][nrows];
    ArrayList<Point> emptyList=new ArrayList<Point>();
    void initGame() {
        for (int j = 0; j < nrows; j++) {
            for (int i = 0; i < nrows; i++) {

                emptyList.add(new Point(i, j));

            }
        }
    }
    void addNum()
    {

        if (emptyList.size()>0)
        {
            int r=(int) (Math.random()*emptyList.size());
            Point p=emptyList.remove(r);
            card[p.x][p.y].setNum(2);
        }
    }
}
