package com.shresh.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//TextView t1;
Spinner sp;
String[] clr ={"RED","PINK","BLACK","BLUE","WHITE","YELOOW","ORANGE","PURPLE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);
        //ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,clr);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.array1,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(arrayAdapter);

        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i==0)
        {
            Toast.makeText(MainActivity.this,"RED",Toast.LENGTH_SHORT).show();
        }
        else if(i==1)
        {
            Toast.makeText(MainActivity.this,"Pink",Toast.LENGTH_SHORT).show();
        }
        else if(i==2)
        {
            Toast.makeText(MainActivity.this,"BLACK",Toast.LENGTH_SHORT).show();
        }
        else if(i==3)
        {
            Toast.makeText(MainActivity.this,"BLUE",Toast.LENGTH_SHORT).show();
        }
        else if(i==4)
        {
            Toast.makeText(MainActivity.this,"WHITE",Toast.LENGTH_SHORT).show();
        }
        else if(i==5)
        {
            Toast.makeText(MainActivity.this,"YELLOW",Toast.LENGTH_SHORT).show();
        }
        else if(i==6)
        {
            Toast.makeText(MainActivity.this,"ORANGE",Toast.LENGTH_SHORT).show();
        }
        else if(i==7)
        {
            Toast.makeText(MainActivity.this,"PURPLE",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
