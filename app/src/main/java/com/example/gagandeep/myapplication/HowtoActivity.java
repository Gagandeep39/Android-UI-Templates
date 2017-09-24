package com.example.gagandeep.myapplication;

import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class HowtoActivity extends AppCompatActivity {
    Button toggle, editButton, clear, submit, popupButton, longClick;
    ToggleButton toggleButton1, toggleButton2;
    Spinner spinner;
    EditText editText;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    Toolbar toolbar;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howto);
        setSupportActionBar(toolbar);
        declaration();
        toggleFunction();
        spinnerFunction();
        editFunction();
        radioFunction();
        popupFunction();
        longClickFunction();
    }

    private void longClickFunction() {
        longClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.setBackgroundColor(getResources().getColor(R.color.design_4));
            }
        });
        longClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                scrollView.setBackgroundColor(getResources().getColor(R.color.design_5));
                return true;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()){
            case R.id.favourite:
                scrollView.setBackgroundColor(getResources().getColor(R.color.design_1));
                break;
            case R.id.setting:
                scrollView.setBackgroundColor(getResources().getColor(R.color.design_2));
                break;
            case R.id.llist:
                scrollView.setBackgroundColor(getResources().getColor(R.color.design_3));
                break;
        }
        return true;
    }
    private void popupFunction() {
        popupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(HowtoActivity.this, popupButton);
                popupMenu.getMenuInflater().inflate(R.menu.bottom_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.favourite:
                                scrollView.setBackgroundColor(getResources().getColor(R.color.design_1));
                                break;
                            case R.id.setting:
                                scrollView.setBackgroundColor(getResources().getColor(R.color.design_2));
                                break;
                            case R.id.llist:
                                scrollView.setBackgroundColor(getResources().getColor(R.color.design_3));
                                break;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }

        });
    }
    private void radioFunction() {
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioGroup.clearCheck();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton radioButton = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                if(radioButton != null)
                Toast.makeText(HowtoActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(HowtoActivity.this, "Nothing Selected", Toast.LENGTH_SHORT).show();

            }
        });


    }
    private void editFunction() {
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText.getText().toString();
                Toast.makeText(HowtoActivity.this, s, Toast.LENGTH_SHORT).show();

            }
        });
    }
    private void spinnerFunction() {
        final String string[] = {"Madness", "Baddreams", "DayDream", "Game Of Survival"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(HowtoActivity.this, android.R.layout.simple_dropdown_item_1line, string);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int s = spinner.getSelectedItemPosition();
                //Toast.makeText(HowtoActivity.this, string[s], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    private void toggleFunction() {
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Toggle 1 : ").append(toggleButton1.getText());
                stringBuffer.append("\nToggle 2 : ").append(toggleButton2.getText());
                Toast.makeText(HowtoActivity.this, stringBuffer.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
    private void declaration() {
        toggle = findViewById(R.id.button1);
        toggleButton1 = findViewById(R.id.togglebutton1);
        toggleButton2 = findViewById(R.id.togglebutton2);
        spinner = findViewById(R.id.spinner);
        editText = findViewById(R.id.editText);
        editButton = findViewById(R.id.editButton);
        radioGroup = findViewById(R.id.radioButton);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        clear = findViewById(R.id.clear);
        submit = findViewById(R.id.submit);
        toolbar = findViewById(R.id.toolbar);
        popupButton = findViewById(R.id.popupButton);
        scrollView = findViewById(R.id.scroll);
        longClick = findViewById(R.id.longPress);
    }
}
