package com.example.calculator_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{


    private Button button1; //usually a good idea to first  declare all your variables
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private TextView Result;
    private TextView Input;
    private final char Addition = '+';
    private final char Subtraction = '-';
    private final char Multiplication = '*';
    private final char Division ='/';
    private final char EQU = '0';
    private double val1= Double.NaN;
    private double val2;
    private char Action;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetupUiView();
        Toast.makeText(MainActivity.this, "By LuCiFeR", Toast.LENGTH_SHORT).show();
        final Vibrator vibe = (Vibrator) MainActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(80);
        Input.setText(null);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + "0");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                Input.setText(Input.getText().toString() + ".");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (Input.getText().length() >0)
              {
                  CharSequence name =Input.getText().toString();
                  Input.setText(name.subSequence(0,name.length()-1));
              }
              else
              {
                  val1=Double.NaN;
                  val2=Double.NaN;
                  Input.setText(null);
                  Result.setText(null);
              }
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
              compute();
              Action=Addition;
              Input.setText(Input.getText().toString() + "+");
              Result.setText(String.valueOf(val1) + "+");
                Input.setText(null);

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                compute();
                Action=Division;
                Input.setText(Input.getText().toString() + "/");
                Result.setText(String.valueOf(val1) + "/");
                Input.setText(null);

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                compute();
                Action=Subtraction;
                Input.setText(Input.getText().toString() + "-");
                Result.setText(String.valueOf(val1) + "-");
                Input.setText(null);

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                compute();
                Action=Multiplication;
                Input.setText(Input.getText().toString() + "*");
                Result.setText(String.valueOf(val1) + "*");
                Input.setText(null);

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                compute();
                Action=EQU;

              Result.setText(Result.getText().toString() + String.valueOf(val2) +"="+String.valueOf(val1));
Input.setText(null);
            }
        });




    }

    private void SetupUiView()
    {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        Input = findViewById(R.id.Input);
        Result = findViewById(R.id.Result);
    }


      private void compute()
        {
if (!Double.isNaN(val1)){
    val2 = Double.parseDouble(Input.getText().toString());
    switch (Action)
    {
        case Addition:
            val1=val1+val2;
            break;
        case Subtraction:
            val1=val1-val2;
            break;
        case Multiplication:
            val1=val1*val2;
            break;
        case Division :
            val1=val1/val2;
            break;
        case EQU:
           break;
    }
}
else {
    val1=Double.parseDouble(Input.getText().toString());
}
        }
    }
