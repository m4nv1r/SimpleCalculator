package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus,
    btnMulti, btnC, btnD, btnDivide, btnEq;

    TextView display;
    String equation = new String("");

    boolean decimalPresent = false;
    boolean operatorAdded = true;
    boolean overwriteText = false;
    ArrayList<String> lst = new ArrayList<String>();
    String tempString = new String(""); // this will store the strings that will be added to
    // the ArrayList
    DecimalFormat df = new DecimalFormat("###.##########"); // the outputs will have at most
    // 10 digits after the decimal

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMulti);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnDivide = findViewById(R.id.btnDivide);
        btnEq = findViewById(R.id.btnEq);
        display = findViewById(R.id.displayScreen);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("0");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"0";
                    tempString += "0";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("1");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"1";
                    tempString += "1";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("2");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"2";
                    tempString += "2";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("3");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"3";
                    tempString += "3";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("4");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"4";
                    tempString += "4";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("5");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"5";
                    tempString += "5";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("6");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"6";
                    tempString += "6";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("7");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"7";
                    tempString += "7";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("8");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"8";
                    tempString += "8";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (overwriteText){
                    tempString = new String("9");
                    display.setText(tempString);
                    overwriteText=false;
                } else {
                    equation = display.getText()+"9";
                    tempString += "9";
                    display.setText(equation);
                    operatorAdded=false;
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(new String(""));
                decimalPresent=false;
                operatorAdded=true;
                overwriteText=false;
                lst = new ArrayList<String>();
                tempString = new String("");
                equation = new String("");
            }
        });

        btnD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!decimalPresent) {
                    equation = display.getText()+".";
                    tempString += ".";
                    overwriteText=false;
                    display.setText(equation);
                    decimalPresent = true;
                    operatorAdded=true;
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!operatorAdded){
                    equation = display.getText()+"+";
                    lst.add(tempString);
                    lst.add(new String("+"));
                    tempString = new String("");
                    display.setText(equation);
                    operatorAdded=true;
                    overwriteText=false;
                    decimalPresent = false;
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!operatorAdded){
                    equation = display.getText()+"-";
                    lst.add(tempString);
                    lst.add(new String("-"));
                    tempString = new String("");
                    display.setText(equation);
                    operatorAdded=true;
                    overwriteText=false;
                    decimalPresent = false;
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!operatorAdded){
                    equation = display.getText()+"*";
                    lst.add(tempString);
                    lst.add(new String("*"));
                    tempString = new String("");
                    display.setText(equation);
                    operatorAdded=true;
                    overwriteText=false;
                    decimalPresent = false;
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!operatorAdded){
                    equation = display.getText()+"/";
                    lst.add(tempString);
                    lst.add(new String("/"));
                    tempString = new String("");
                    display.setText(equation);
                    operatorAdded=true;
                    overwriteText=false;
                    decimalPresent = false;
                }
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                equation = ""+display.getText();
                if ((!operatorAdded) && (equation.length()!=0)){
                    overwriteText = true;
                    lst.add(tempString);
                    tempString = new String("");
                    double result = textProcessing(lst); // this method is defined below
                    String resultString = new String("")+df.format(result);
                    int indexOfDecimal = resultString.indexOf('.');
                    if (indexOfDecimal!=-1){
                        boolean zerosAfterDecimal = true;
                        for (int i = indexOfDecimal+1; i < resultString.length(); i++){
                            if (resultString.charAt(i)!='0'){
                                zerosAfterDecimal = false;
                            }
                        }
                        if (zerosAfterDecimal){
                            decimalPresent = false;
                            String newResult = new String("");
                            for (int i = 0; i < indexOfDecimal; i++){
                                newResult += resultString.charAt(i);
                            }
                            resultString = newResult;
                        }
                    }
                    lst = new ArrayList<String>();
                    tempString+=resultString;
                    display.setText(resultString);
                } else{
                    display.setText(equation);
                }
            }
        });
    }

    protected double textProcessing(ArrayList<String> lst){
        double result = Double.parseDouble(lst.get(0));
        int i = 1;
        while (i < lst.size()){
            String op = lst.get(i++);
            String right = lst.get(i++);
            if (op.equals("+")){
                result = result + Double.parseDouble(right);
            } else if (op.equals("-")){
                result = result - Double.parseDouble(right);
            } else if (op.equals("*")){
                result = result * Double.parseDouble(right);
            } else if (op.equals("/")){
                result = result / Double.parseDouble(right);
            }
        }
        return result;
    }

}