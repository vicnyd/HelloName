package com.example.victornyden.helloname;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.String;
/**
 * Created by victornyden on 15-04-01.
 */
public class Main_activity extends Activity {

    Button helloButton = (Button) findViewById(R.id.helloButton);
    EditText inputName = (EditText) findViewById(R.id.textInput);
    TextView outputName = (TextView) findViewById(R.id.textEdit);

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        OnClickListener hello = new OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        };

        helloButton.setOnClickListener(hello);

        String name = inputName.getText().toString();
        outputName.setText("Hello, " + name + "!");

    }








}
