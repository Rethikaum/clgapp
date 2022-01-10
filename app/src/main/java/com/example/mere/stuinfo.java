package com.example.mere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class stuinfo extends AppCompatActivity {
    public EditText name;
    public EditText regnum;
    public EditText dob;
    public EditText department;
    public EditText batch;
    public EditText fathername;
    public EditText mothername;
    public EditText address;
    public EditText city;
    public EditText state;
    public EditText  pincode;
    public EditText phonenum;
    public EditText email;
    public Button submit;

    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuinfo);
        myDb = new DatabaseHelper(this);

        name = (EditText)findViewById(R.id.edit1);
        regnum = (EditText)findViewById(R.id.edit2);
        dob = (EditText)findViewById(R.id.edit3);
        department = (EditText)findViewById(R.id.edit4);
        batch = (EditText)findViewById(R.id.edit5);
        fathername = (EditText)findViewById(R.id.edit6);
        mothername = (EditText)findViewById(R.id.edit7);
        address = (EditText)findViewById(R.id.edit8);
        city = (EditText)findViewById(R.id.edit9);
        state = (EditText)findViewById(R.id.edit10);
        pincode = (EditText)findViewById(R.id.edit11);
        phonenum = (EditText)findViewById(R.id.edit12);
        email = (EditText)findViewById(R.id.edit13);
        submit = (Button)findViewById(R.id.button1);
        AddData();
    }


    public void AddData() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(name.getText().toString(),
                        regnum.getText().toString(),
                        dob.getText().toString(),
                        department.getText().toString(),
                        batch.getText().toString(),
                        fathername.getText().toString(),
                        mothername.getText().toString(),
                        address.getText().toString(),
                        city.getText().toString(),
                        state.getText().toString(),
                        pincode.getText().toString(),
                        phonenum.getText().toString(),
                        email.getText().toString());

                if (isInserted =true) {
                    Toast.makeText(stuinfo.this, "Data Inserted", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(stuinfo.this, cgpadetails.class);
                }
                else
                    Toast.makeText(stuinfo.this,"Data not Inserted",Toast.LENGTH_LONG).show();
            }
        });
    }

}
