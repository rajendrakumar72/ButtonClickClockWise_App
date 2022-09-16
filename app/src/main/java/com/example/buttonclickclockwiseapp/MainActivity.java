package com.example.buttonclickclockwiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnNextActivity;

    ArrayList<String> nameList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnNextActivity=findViewById(R.id.btnNextActivity);

        nameList.add("one");
        nameList.add("Two");
        nameList.add("Three");
        nameList.add("Four");
        nameList.add("Five");


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             clickAction();
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAction();
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAction();
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAction();
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAction();
            }
        });

        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, IncrementalActivity.class);
                startActivity(i);
            }
        });
    }

    private void clickAction(){
        String name=nameList.get(nameList.size()-1);
        nameList.remove(nameList.size()-1);
        nameList.add(0,name);
        btnOne.setText(nameList.get(0));
        btnTwo.setText(nameList.get(1));
        btnThree.setText(nameList.get(2));
        btnFour.setText(nameList.get(3));
        btnFive.setText(nameList.get(4));
    }
}