package com.example.buttonclickclockwiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class IncrementalActivity extends AppCompatActivity {

    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnNextActivity;

    ArrayList<String> nameList=new ArrayList<>();
    ArrayList<Button>btnList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incremantal);

        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);



        nameList.add("one");
        nameList.add("Two");
        nameList.add("Three");
        nameList.add("Four");
        nameList.add("Five");


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAction(btnOne.getTag().toString());
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAction(btnTwo.getTag().toString());
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAction(btnThree.getTag().toString());
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAction(btnFour.getTag().toString());
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAction(btnFive.getTag().toString());
            }
        });
    }

    private void clickAction(String tag){
        switch (tag){

            case "1":
                btnOne.setText(nameList.get(0));
                btnTwo.setText(nameList.get(1));
                btnThree.setText(nameList.get(2));
                btnFour.setText(nameList.get(3));
                btnFive.setText(nameList.get(4));
                break;

            case "2":
                btnOne.setText(nameList.get(4));
                btnTwo.setText(nameList.get(0));
                btnThree.setText(nameList.get(1));
                btnFour.setText(nameList.get(2));
                btnFive.setText(nameList.get(3));
                break;

            case "3":
                btnOne.setText(nameList.get(3));
                btnTwo.setText(nameList.get(4));
                btnThree.setText(nameList.get(0));
                btnFour.setText(nameList.get(1));
                btnFive.setText(nameList.get(2));
                break;

            case "4":
                btnOne.setText(nameList.get(2));
                btnTwo.setText(nameList.get(3));
                btnThree.setText(nameList.get(4));
                btnFour.setText(nameList.get(0));
                btnFive.setText(nameList.get(1));
                break;

            case "5":
                btnOne.setText(nameList.get(1));
                btnTwo.setText(nameList.get(2));
                btnThree.setText(nameList.get(3));
                btnFour.setText(nameList.get(4));
                btnFive.setText(nameList.get(0));
                break;

            default:
                btnOne.setText(nameList.get(4));
                btnTwo.setText(nameList.get(1));
                btnThree.setText(nameList.get(2));
                btnFour.setText(nameList.get(3));
                btnFive.setText(nameList.get(4));
                break;
                
        }
    }
}