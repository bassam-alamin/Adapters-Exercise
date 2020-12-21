package com.example.spinner_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        List<String> units = new ArrayList<>();
        units.add(0,"BSc. Computer Science");
        units.add(1,"BSc. Applied Computer Science");
        units.add(2,"BSc. IT");
        units.add(3,"Diploma in Computer Science");
        units.add(4,"MSc. Computer Science");

        ArrayAdapter<String> arrayAdapter;

        arrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,units);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("choose Units")){

                    // Do nothing
                }

                else{

                    String item = parent.getItemAtPosition(position).toString();


                    Toast.makeText(parent.getContext(),"You selected "+item, Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}