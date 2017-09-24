package com.example.gagandeep.myapplication.Calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.gagandeep.myapplication.R;

import org.w3c.dom.Text;

public class CalculatorActivity extends AppCompatActivity {
    Button buttonInrement, buttonDecrement, buttonOrder;
    int quantity, price;
    TextView textQuantity, textOrder, invisible;
    CheckBox checkBoxCaramel, checkBoxChocolate, checkBoxVanilla;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_cal);
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        click();
    }

    private void click() {

        buttonDecrement = findViewById(R.id.buttonDecrement);
        buttonInrement = findViewById(R.id.buttonIncrement);
        buttonOrder = findViewById(R.id.buttonOrder);
        textQuantity = findViewById(R.id.textViewQuantity);
        checkBoxCaramel = findViewById(R.id.checkBoxCaramel);
        checkBoxChocolate = findViewById(R.id.checkBoxChocolate);
        checkBoxVanilla = findViewById(R.id.checkBoxVanilla);
        textOrder = findViewById(R.id.textViewDisplay);
        invisible = findViewById(R.id.textView3);

        buttonInrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment();
            }
        });

        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrement();
            }
        });

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order();
            }
        });

    }

    private void order() {
        price = 0;

        if(checkBoxCaramel.isChecked())
            price = price + quantity*3;
        if(checkBoxVanilla.isChecked())
            price = price + quantity*2;
        if (checkBoxChocolate.isChecked())
            price = price + quantity*5;

        price = price + quantity*5;
        displayPrice(price);

     }

    private void displayPrice(int price) {
        String lol;
        lol = "";
        if(checkBoxChocolate.isChecked())
            lol += "Extras : Chocolates\n";
        if (checkBoxVanilla.isChecked())
            lol += "Extras : Vanilla\n";
        if (checkBoxCaramel.isChecked())
            lol += "Extras : Caramel\n";

        lol = lol + "Amount to be Payed : " + price + "\n";
        textOrder.setText("" + lol);
        invisible.setVisibility(View.VISIBLE);
        price = 0;

    }

    private int decrement() {
        if(quantity<=0) {
            Toast.makeText(this, "You need to order atleast one", Toast.LENGTH_SHORT).show();
        }
        else {

            quantity = quantity - 1;

            displayQuantity(quantity);
        }

        return quantity;
    }

    private void displayQuantity(int quantity) {
        textQuantity.setText("" + quantity);
    }

    private int increment() {
        if (quantity>=100){
            Toast.makeText(this, "Cannot order more coffees", Toast.LENGTH_SHORT).show();

        }
        else {
            quantity += 1;
            displayQuantity(quantity);
        }

        return quantity;
    }
}
