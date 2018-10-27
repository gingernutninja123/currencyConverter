package com.example.peterarchbold.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        TextView textView=(TextView)findViewById(R.id.textView);
        double pounds=Double.parseDouble(textView.getText().toString());
        double dollars=pounds*1.31;
        String finalResult=String.format("%.2f",dollars);
       Toast.makeText(MainActivity.this,"£"+pounds+"="+"$"+finalResult, Toast.LENGTH_SHORT).show();
       ((TextView) findViewById(R.id.textView2)).setText("£"+pounds+"=$"+finalResult);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
