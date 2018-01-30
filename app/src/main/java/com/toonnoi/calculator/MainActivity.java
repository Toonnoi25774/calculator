package com.toonnoi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNumberOne;
    private EditText etNumberTwe;
    private Button Toonnoi1;
    private Button Toonnoi2;
    private Button Toonnoi3;
    private Button Toonnoi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumberOne = findViewById(R.id.etNumberOne);
        etNumberTwe = findViewById(R.id.etNumberTwo);
        Toonnoi1 = findViewById(R.id.Toonnoi1);
        Toonnoi2 = findViewById(R.id.Toonnoi2);
        Toonnoi3 = findViewById(R.id.Toonnoi3);
        Toonnoi4 = findViewById(R.id.Toonnoi4);

        Toonnoi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v){
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwe.getText().toString());
                Toonnoi1(numberOne, numberTwo);

            }
        });
        Toonnoi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v){
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwe.getText().toString());
                Toonnoi2(numberOne, numberTwo);

            }
        });
        Toonnoi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v){
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwe.getText().toString());
                Toonnoi3(numberOne, numberTwo);

            }
        });
        Toonnoi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v){
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwe.getText().toString());
                Toonnoi4(numberOne, numberTwo);

            }
        });


    }

    private int Toonnoi1(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private int Toonnoi2(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private int Toonnoi3(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private int Toonnoi4(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
}
