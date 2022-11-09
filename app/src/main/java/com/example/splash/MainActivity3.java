package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioColored, blackWhite, otherPapers;
    EditText numCopies, numPages;
    TextView total;
    Button proceed;

    int price,copies, pages,ttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        radioGroup = findViewById(R.id.radioGroup);
        radioColored = findViewById(R.id.radioColored);
        blackWhite = findViewById(R.id.blackWhite);
        otherPapers = findViewById(R.id.otherPapers);
        numCopies = findViewById(R.id.numCopies);
        numPages = findViewById(R.id.numPages);
        total = findViewById(R.id.total);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                try {
                    if(radioGroup.getCheckedRadioButtonId()==R.id.radioColored)
                    {
                        price = 6;
                        copies = Integer.parseInt(numCopies.getText().toString());
                        pages = Integer.parseInt(numPages.getText().toString());

                        ttotal = copies * pages * price;

                        total.setText(""+ttotal);
                    }
                    else if(radioGroup.getCheckedRadioButtonId()==R.id.blackWhite)
                    {
                        price = 4;
                        copies = Integer.parseInt(numCopies.getText().toString());
                        pages = Integer.parseInt(numPages.getText().toString());

                        ttotal = copies * pages * price;

                        total.setText(""+ttotal);
                    }
                    else if(radioGroup.getCheckedRadioButtonId()==R.id.otherPapers)
                    {
                        price = 20;
                        copies = Integer.parseInt(numCopies.getText().toString());
                        pages = Integer.parseInt(numPages.getText().toString());

                        ttotal = copies * pages * price;

                        total.setText(""+ttotal);
                    }
                } catch (Exception ex) {
                    Toast.makeText(MainActivity3.this, "Please Enter Number Copies and or Pages.", Toast.LENGTH_SHORT).show();
                }


                proceed = findViewById(R.id.proceed);
            }
        });
    }
}