package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button6, button7, buttonMul, buttonEqual;
    EditText calculatorEditText;

    float mValueOne, mValueTwo;

    boolean calculatorAddition, mSubtract, calculatorMultiplication, calculatorDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        calculatorEditText = (EditText) findViewById(R.id.edt1);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEditText.setText(calculatorEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorEditText.setText(calculatorEditText.getText() + "7");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(calculatorEditText.getText() + "");
                calculatorMultiplication = true;
                calculatorEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(calculatorEditText.getText() + "");

                if (calculatorAddition == true) {
                    calculatorEditText.setText(mValueOne + mValueTwo + "");
                    calculatorAddition = false;
                }

                if (mSubtract == true) {
                    calculatorEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (calculatorMultiplication == true) {
                    calculatorEditText.setText(mValueOne * mValueTwo + "");
                    calculatorMultiplication = false;
                }

                if (calculatorDivision == true) {
                    calculatorEditText.setText(mValueOne / mValueTwo + "");
                    calculatorDivision = false;
                }
            }
        });
    }
}
