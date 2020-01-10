package com.example.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    Model model;
    String operand;
    TextView result;
    boolean first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = new Model();
        result = (TextView)findViewById(R.id.textView_result);
        operand = "";
        result.setText("0.0");
        first = true;

        Button button = (Button)findViewById(R.id.button_0);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_1);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_2);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_3);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_4);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_5);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_6);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_7);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_8);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_9);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_dot);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_add);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_subtract);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_multiply);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_divide);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_C);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_equal);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_sign);
        button.setOnClickListener(this);

        button = (Button)findViewById(R.id.button_percent);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        int id = view.getId();
        Double res = 0.0;
        switch(id){
            case R.id.button_0: {

                operand += "0";
                result.setText(operand);
            }
                break;
            case R.id.button_1: {
                operand += "1";
                result.setText(operand);
            }
                break;
            case R.id.button_2: {
                operand += "2";
                result.setText(operand);
            }
                break;
            case R.id.button_3: {
                operand += "3";
                result.setText(operand);
            }
                break;
            case R.id.button_4: {
                operand += "4";
                result.setText(operand);
            }
                break;
            case R.id.button_5: {
                operand += "5";
                result.setText(operand);
            }
                break;
            case R.id.button_6: {
                operand += "6";
                result.setText(operand);
            }
                break;
            case R.id.button_7: {
                operand += "7";
                result.setText(operand);
            }
                break;
            case R.id.button_8: {
                operand += "8";
                result.setText(operand);
            }
                break;
            case R.id.button_9: {
                operand += "9";
                result.setText(operand);
            }
                break;
            case R.id.button_dot: {
                operand += ".";
                result.setText(operand);
            }
            break;
            case R.id.button_add:{
                if (operand!="") {
                    if (first) {
                        model.setOperand1(Double.parseDouble(operand));
                        result.setText(operand);
                        model.setOperation("add");
                        first = false;
                        operand = "";
                    } else {
                        model.setOperand2(Double.parseDouble(operand));
                        res = model.doOperation();
                        result.setText(Double.toString(res));
                        model.setOperation("add");
                        operand = "";
                        first = false;
                    }
                }
            }
            break;
            case R.id.button_divide:{
                if (operand!="") {
                    if (first) {
                        model.setOperand1(Double.parseDouble(operand));
                        result.setText(operand);
                        model.setOperation("divide");
                        first = false;
                        operand = "";
                    } else {
                        model.setOperand2(Double.parseDouble(operand));
                        res = model.doOperation();
                        result.setText(Double.toString(res));
                        model.setOperation("divide");
                        operand = "";
                        first = false;
                    }
                }
            }
            break;
            case R.id.button_multiply: {
                if (operand!="") {
                    if (first) {
                        model.setOperand1(Double.parseDouble(operand));
                        result.setText(operand);
                        model.setOperation("multiply");
                        first = false;
                        operand = "";
                    } else {
                        model.setOperand2(Double.parseDouble(operand));
                        res = model.doOperation();
                        result.setText(Double.toString(res));
                        model.setOperation("multiply");
                        operand = "";
                        first = false;
                    }
                }
            }
            break;
            case R.id.button_subtract: {
                if (operand!="") {
                    if (first) {
                        model.setOperand1(Double.parseDouble(operand));
                        result.setText(operand);
                        model.setOperation("subtract");
                        first = false;
                        operand = "";
                    } else {
                        model.setOperand2(Double.parseDouble(operand));
                        res = model.doOperation();
                        result.setText(Double.toString(res));
                        model.setOperation("subtract");
                        operand = "";
                        first = false;
                    }
                }
            }
            break;
            case R.id.button_sign: {
                if (operand!="") {
                    if (first) {
                        model.setOperand1(Double.parseDouble(operand));
                        result.setText(operand);
                        model.setOperation("subtract");
                        first = false;
                        operand = "";
                    } else {
                        model.setOperand2(Double.parseDouble(operand));
                        String operation = model.getOperation();
                        model.setOperation("sign2");
                        res = model.doOperation();
                        result.setText(Double.toString(res));
                        model.setOperation(operation);
                        operand = "";
                        first = false;
                    }
                } else {
                    String operation = model.getOperation();
                    model.setOperation("sign");
                    res = model.doOperation();
                    result.setText(Double.toString(res));
                    model.setOperation(operation);
                }
            }
            break;
            case R.id.button_percent: {
                if (operand!="") {
                    if (first) {
                        model.setOperand1(Double.parseDouble(operand));
                        result.setText(operand);
                        model.setOperation("percent");
                        first = false;
                        operand = "";
                    } else {
                        model.setOperand2(Double.parseDouble(operand));
                        String operation = model.getOperation();
                        model.setOperation("percent2");
                        res = model.doOperation();
                        result.setText(Double.toString(res));
                        model.setOperation(operation);
                        operand = "";
                        first = false;
                    }
                } else {
                    String operation = model.getOperation();
                    model.setOperation("percent");
                    res = model.doOperation();
                    result.setText(Double.toString(res));
                    model.setOperation(operation);
                }
            }
            break;
            case R.id.button_equal:{
                if(operand!="") {
                    model.setOperand2(Double.parseDouble(operand));
                    res = model.doOperation();
                    result.setText(Double.toString(res));
                    operand = "";
                } else {
                    res = model.doOperation();
                    result.setText(Double.toString(res));
                }
            }
            break;
            case R.id.button_C: {
                model.setOperation("C");
                res = model.doOperation();
                result.setText(Double.toString(res));
                first = true;
                operand = "";
            }
            break;
        }
    }

}
