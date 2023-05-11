package com.example.myapplicationsimplecal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1,num2,result;
    char OPE;

    //TextView
    private TextView Show;

    //Number Buttons
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bDot;

    //Operation Button
    private Button bMul,bDiv,bSum,bSub,bPre,bPow;

    //Other Button
    private Button bClear,bNeg,bEqu;

    private Button bSin,bCos,bTan,bCosec,bSec,bCot;
    private Button bSqr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView
        Show = findViewById(R.id.Display);

        //Number Button
        b0 = findViewById(R.id.btn0);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        bDot = findViewById(R.id.btnDot);

        //Operation Button
        bMul = findViewById(R.id.btnMul);
        //bMul.setBackgroundColor(Color.parseColor("#FFA500"));
        bDiv = findViewById(R.id.btnDiv);
        //bDiv.setBackgroundColor(Color.parseColor("#FFA500"));
        bSum = findViewById(R.id.btnSum);
        //bSum.setBackgroundColor(Color.parseColor("#FFA500"));
        bSub = findViewById(R.id.btnSub);
        //bSub.setBackgroundColor(Color.parseColor("#FFA500"));
        bPre = findViewById(R.id.btnPre);
        //bClear.setBackgroundColor(Color.parseColor("#FFFF00"));
        bPow = findViewById(R.id.btnPow);
        //bPow.setBackgroundColor(Color.parseColor("#90EE90"));


        //Other Button
        bClear = findViewById(R.id.btnC);
        //bClear.setBackgroundColor(Color.parseColor("#FFFF00"));
        bNeg = findViewById(R.id.btnNeg);
        //bNeg.setBackgroundColor(Color.parseColor("#FFFF00"));
        bEqu = findViewById(R.id.btnEqu);
        //bEqu.setBackgroundColor(Color.parseColor("#FFFF00"));

        bSin = findViewById(R.id.btnSin);
        //bSin.setBackgroundColor(Color.parseColor("#90EE90"));
        bCos = findViewById(R.id.btnCos);
        //bCos.setBackgroundColor(Color.parseColor("#90EE90"));
        bTan = findViewById(R.id.btnTan);
        //bTan.setBackgroundColor(Color.parseColor("#90EE90"));

        bCosec = findViewById(R.id.btnCosec);
        //bCosec.setBackgroundColor(Color.parseColor("#90EE90"));
        bSec = findViewById(R.id.btnSec);
        //bSec.setBackgroundColor(Color.parseColor("#90EE90"));
        bCot = findViewById(R.id.btnCot);
        //bCot.setBackgroundColor(Color.parseColor("#90EE90"));

        bSqr = findViewById(R.id.btnSqu);
        //bSqr.setBackgroundColor(Color.parseColor("#90EE90"));





        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM("9");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM(".");
            }
        });

        //Mathematical Operation
        bSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('+');
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('-');
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('*');
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('/');
            }
        });
        bPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('%');
            }
        });

        bPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operate('^');
            }
        });

        //Other operation
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Show.setText("");
            }
        });

        bNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(Show.getText().toString());
                num *=(-1);
                Show.setText(String.valueOf(num));
            }
        });

        bEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num2 = Double.parseDouble(Show.getText().toString());

                switch (OPE){
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '/': result = num1 / num2; break;
                    case '*': result = num1 * num2; break;
                    case '%': result = (num1 / num2)*100; break;
                    case '^':
                        for(int i=0;i<num2;i++){
                            num1 *=num1;
                        }
                        result = num1;break;
                }

                Show.setText(String.valueOf(result));
            }
        });

        bSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double degree = Double.parseDouble(Show.getText().toString());
                double radius = Math.toRadians(degree);
                Show.setText(String.valueOf(Math.sin(radius)));


            }
        });

        bCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degree = Double.parseDouble(Show.getText().toString());
                double radius = Math.toRadians(degree);
                Show.setText(String.valueOf(Math.cos(radius)));
            }
        });

        bTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degree = Double.parseDouble(Show.getText().toString());
                double radius = Math.toRadians(degree);
                Show.setText(String.valueOf(Math.tan(radius)));
            }
        });

        bCosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degree = Double.parseDouble(Show.getText().toString());
                double radius = Math.toRadians(degree);
                Show.setText(String.valueOf(1/Math.sin(radius)));
            }
        });

        bSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degree = Double.parseDouble(Show.getText().toString());
                double radius = Math.toRadians(degree);
                Show.setText(String.valueOf(1/Math.cos(radius)));
            }
        });

        bCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degree = Double.parseDouble(Show.getText().toString());
                double radius = Math.toRadians(degree);
                Show.setText(String.valueOf(1/Math.tan(radius)));
            }
        });

        bSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Show.setText(String.valueOf(Math.sqrt(Double.parseDouble(Show.getText().toString()))));
            }
        });






    }

    private void NUM(String ss){
        String s = Show.getText().toString()+ss;
        Show.setText(s);
    }

    private void Operate(char Operation){
        num1 = Double.parseDouble(Show.getText().toString());
        Show.setText("");
        OPE = Operation;
    }
}