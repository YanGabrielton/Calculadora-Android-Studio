package com.example.calculator;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView resultado;
    Button calc;
    Button subt;
    Button multi;
    Button divis;

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
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        calc = findViewById(R.id.calc);
        subt=findViewById(R.id.subt);
        multi =findViewById(R.id.multi);
        divis=findViewById(R.id.divis);
        resultado=findViewById(R.id.resultado);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Campos não pode ser vazios",LENGTH_LONG).show();
                }else {
                    Double numero1 = Double.parseDouble(num1.getText().toString());
                    Double numero2 = Double.parseDouble(num2.getText().toString());
                    Double ValorS = numero1 + numero2;
                    resultado.setText("Resultado:" + String.valueOf(ValorS));
                    num1.setText(null);
                    num2.setText(null);
                }
            }


        });
       subt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {  if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
               Toast.makeText(getApplicationContext(),"Campos não pode ser vazios",LENGTH_LONG).show();
           }else {
               Double numero1 = Double.parseDouble(num1.getText().toString());
               Double numero2 = Double.parseDouble(num2.getText().toString());
               Double ValorS = numero1 - numero2;
               resultado.setText("Resultado:" + String.valueOf(ValorS));
               num1.setText(null);
               num2.setText(null);
           }
           }
       });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Campos não pode ser vazios",LENGTH_LONG).show();
                }else {
                    Double numero1 = Double.parseDouble(num1.getText().toString());
                    Double numero2 = Double.parseDouble(num2.getText().toString());
                    Double ValorS = numero1 * numero2;
                    resultado.setText("Resultado:" + String.valueOf(ValorS));
                    num1.setText(null);
                    num2.setText(null);
                }
            }
        });
       divis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Campos não pode ser vazios",LENGTH_LONG).show();
                }else {
                    Double numero1 = Double.parseDouble(num1.getText().toString());
                    Double numero2 = Double.parseDouble(num2.getText().toString());
                    Double ValorS = numero1 / numero2;
                    resultado.setText("Resultado:" + String.valueOf(ValorS));
                    num1.setText(null);
                    num2.setText(null);
                }
            }
        });
    }
}