package com.example.roberto.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnReturn, btnEdit, btnSave;
    private EditText txtName, txtEmail, txtTlf, txtAddress;
    private DatePicker datePicker;

    private MainActivityEvent event;


    String name, email, adress;
    int tlf, day, month, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void isComponentEditable(boolean b) {
    }
}
