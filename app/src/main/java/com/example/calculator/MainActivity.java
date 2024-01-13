package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstnum, secondnum;
    TextView ans;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnum = findViewById(R.id.firstnum);
        secondnum = findViewById(R.id.secondnum);

        ans = findViewById(R.id.ans);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fv, sv, answ;
                fv = Integer.parseInt(firstnum.getText().toString());
                sv = Integer.parseInt(secondnum.getText().toString());
                answ = fv + sv;
                ans.setText(String.valueOf(answ));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fv, sv, answ;
                fv = Integer.parseInt(firstnum.getText().toString());
                sv = Integer.parseInt(secondnum.getText().toString());
                answ = fv - sv;
                ans.setText(String.valueOf(answ));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fv, sv, answ;
                fv = Integer.parseInt(firstnum.getText().toString());
                sv = Integer.parseInt(secondnum.getText().toString());
                answ = fv * sv;
                ans.setText(String.valueOf(answ));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fv, sv, answ;
                fv = Integer.parseInt(firstnum.getText().toString());
                sv = Integer.parseInt(secondnum.getText().toString());
                answ = fv / sv;
                ans.setText(String.valueOf(answ));
            }
        });

    }
}