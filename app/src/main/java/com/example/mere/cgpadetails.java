package com.example.mere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cgpadetails extends AppCompatActivity {

    EditText sem1;
    EditText sem2;
    EditText sem3;
    EditText sem4;
    EditText sem5;
    EditText sem6;
    EditText sem7;
    EditText sem8;
    Button  sub;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpadetails);

        myDb = new DatabaseHelper(this);
        sem1 = (EditText)findViewById(R.id.e1);
        sem2 = (EditText)findViewById(R.id.e2);
        sem3 = (EditText)findViewById(R.id.e3);
        sem4 = (EditText)findViewById(R.id.e4);
        sem5 = (EditText)findViewById(R.id.e5);
        sem6 = (EditText)findViewById(R.id.e6);
        sem7 = (EditText)findViewById(R.id.e7);
        sem8 = (EditText)findViewById(R.id.e8);
        sub = (Button)findViewById(R.id.butt1);
    }

    public void AddtheData(){
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(sem1.getText().toString(),
                        sem2.getText().toString(),
                        sem3.getText().toString(),
                        sem4.getText().toString(),
                        sem5.getText().toString(),
                        sem6.getText().toString(),
                        sem7.getText().toString(),
                        sem8.getText().toString() );

                if (isInserted =true) {
                    Toast.makeText(cgpadetails.this, "Data Inserted", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(cgpadetails.this, MainActivity.class);
                }
                else
                    Toast.makeText(cgpadetails.this,"Data not Inserted",Toast.LENGTH_LONG).show();

            }
        });
    }
}