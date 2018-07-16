package com.example.hoangtruc.recyclerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  RecyclerView mRecyclerView;
  CustomAdapter mcustomAdapter;
  List<Hero> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=findViewById(R.id.recycler_Image);
        mRecyclerView.setHasFixedSize(true);
        mData=new ArrayList<>();

        mData.add(new Hero(R.drawable.a,"Anti-Mage"));
        mData.add(new Hero(R.drawable.b,"Slark"));
        mData.add(new Hero(R.drawable.c,"Lich"));
        mData.add(new Hero(R.drawable.d,"Bloodseeker"));
        mcustomAdapter=new CustomAdapter(mData,this);
        LinearLayoutManager mManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(mManager);
        mRecyclerView.setAdapter(mcustomAdapter);
    }
}
