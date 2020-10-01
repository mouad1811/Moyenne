package com.example.moyenne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1 ;
    private EditText n2 ;
    private Button b ;
    private TextView r ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.num1) ;
        n2 = (EditText) findViewById(R.id.num2) ;
        b = (Button) findViewById(R.id.btn) ;
        r = (TextView) findViewById(R.id.result) ;

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(n1.getText().toString()) ;
                int number2 = Integer.parseInt(n2.getText().toString()) ;
                int res = (number1+number2)/2 ;

                r.setText("Result: "+ res);
            }
        });
    }
}