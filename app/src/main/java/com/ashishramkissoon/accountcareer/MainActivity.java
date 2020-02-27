package com.ashishramkissoon.accountcareer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    RatingBar ratingBar;
    String[] fruitname = {"Ashish Ramkissoon","Akshay Harbilass","Sadveer Dyal","Ruwaydah Hassam","Tavish Padayachy","Abdallah Mungrooh"};
    String[]  desc = {"Sd Worx","Huawei","Ceridian","Fsc","Ernst & Young","MATCO Limited"};
    String[]  view = {"Viewers: 210","Viewers: 200","Viewers: 150","Viewers: 101","Viewers: 39","Viewers: 10"};

    Integer[] imgid ={R.drawable.ashishstar5, R.drawable.akshaystar4,R.drawable.dyalstar3,R.drawable.ruwaydahstar3,R.drawable.mevinstar1,R.drawable.abdallah
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst=(ListView) findViewById(R.id.listview);



        CustomListview customListview=new CustomListview(this, fruitname,desc,view,imgid);
        lst.setAdapter(customListview);

        Utils.darkenStatusBar(this, R.color.blue);



    }
}

