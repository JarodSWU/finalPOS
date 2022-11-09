package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        Button loginbutton = (Button) findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("cashier1") && password.getText().toString().equals("burikat")) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "LOGIN SUCCESFULLY", Toast.LENGTH_SHORT).show();

                } else if (username.getText().toString().equals("cashier2") && password.getText().toString().equals("marviye")) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "LOGIN SUCCESFULLY", Toast.LENGTH_SHORT).show();

                } else if (username.getText().toString().equals("cashier3") && password.getText().toString().equals("undang")) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity2.this, "LOGIN SUCCESFULLY", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity2.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}