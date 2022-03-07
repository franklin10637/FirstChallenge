package com.example.firstchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBtnClick (View view){
        TextView txtName = findViewById(R.id.textViewName);
        TextView txtFName = findViewById(R.id.textViewFName);
        TextView txtEmail = findViewById(R.id.textViewEmail);

        EditText edtTxtName  = findViewById(R.id.edtTxtName);
        EditText edtTxtFName = findViewById(R.id.edtTextFName);
        EditText edtTxtEmail = findViewById(R.id.editTxtEmail);

        txtName.setText("Last Name: " + edtTxtName.getText().toString());
        txtFName.setText("First Name: " + edtTxtFName.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());



    }
}