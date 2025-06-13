package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAdd, buttonSub, buttonMul;
    EditText editTextN1, editTextN2;
    TextView textView;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_minus);
        buttonMul = findViewById(R.id.btn_multiply);
        editTextN1 = findViewById(R.id.number1);
        editTextN2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (editTextN1.getText().toString().equals("")){
            Toast.makeText(this,"Enter number",Toast.LENGTH_SHORT).show();
        }
        num1 = Integer.parseInt(editTextN1.getText().toString());

        if (editTextN2.getText().toString().equals("")){
            Toast.makeText(this,"Enter number",Toast.LENGTH_SHORT).show();
        }
        num1 = Integer.parseInt(editTextN2.getText().toString());

        if ( v.getId() == R.id.btn_add ) {
            textView.setText("Answer = " + (num1 + num2));
        }

        if ( v.getId() == R.id.btn_minus ) {
            textView.setText("Answer = " + (num1 - num2));
        }

        if ( v.getId() == R.id.btn_multiply ) {
            textView.setText("Answer = " + (num1 * num2));
        }
    }
}