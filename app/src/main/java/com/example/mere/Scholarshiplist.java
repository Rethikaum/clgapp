package com.example.mere;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Scholarshiplist extends AppCompatActivity {

    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    CheckBox c4;
    CheckBox c5;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarshiplist);

        c1 = (CheckBox)findViewById(R.id.check1);
        c2 = (CheckBox)findViewById(R.id.check2);
        c3 = (CheckBox)findViewById(R.id.check3);
        c4 = (CheckBox)findViewById(R.id.check4);
        c5 = (CheckBox)findViewById(R.id.check5);
        btn = (Button)findViewById(R.id.btn1);
    }
}