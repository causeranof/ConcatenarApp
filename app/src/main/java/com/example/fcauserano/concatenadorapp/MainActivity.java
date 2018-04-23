package com.example.fcauserano.concatenadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.texto_uno);
        editText2 = findViewById(R.id.texto_dos);
    }

    public void clickConcatenar(View view) {
        Toast.makeText(this, editText1.getText().toString() + editText2.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
