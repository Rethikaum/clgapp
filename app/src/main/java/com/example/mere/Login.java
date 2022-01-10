package com.example.mere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    public EditText userid;
    public EditText password;
    public Button submit;
    String name="TpgitCse";
    String pass ="Facultylogin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText userid =(EditText)findViewById(R.id.edtx1);
        EditText password =(EditText)findViewById(R.id.edtx2);
        Button  submit =(Button) findViewById(R.id.but1);
        submit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                String nm=userid.getText().toString();
                String ps=password.getText().toString();

                if((nm.equals(name)) &&(ps.equals(pass) ))
                {
                    Intent i3=new Intent(Login.this,detailspage.class);
                    startActivity(i3);

                }

                else
                {
                    Toast.makeText(getApplicationContext(),"Incorrect userid or Password",Toast.LENGTH_SHORT).show();

                }


            }
        });





    }
}