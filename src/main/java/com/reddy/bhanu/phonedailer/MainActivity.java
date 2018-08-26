package com.reddy.bhanu.phonedailer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  implements  AdapterView.OnItemSelectedListener {

    Spinner spinnerstate, spinnercity,spinnerarea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerstate = (Spinner) findViewById(R.id.spinnerState);
        spinnercity = (Spinner) findViewById(R.id.spinnerCity);
        spinnerarea = (Spinner) findViewById(R.id.spinnerArea);

        spinnerstate.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        parent.getItemAtPosition(position);

        if (position == 0) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.city_karnataka,

                            android.R.layout.simple_spinner_item);

            spinnercity.setAdapter(adapter);

        }else if (position  == 1) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.city_andra,

                            android.R.layout.simple_spinner_item);

            spinnercity.setAdapter(adapter);

        }else if (position  == 2) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter

                    .createFromResource(this, R.array.city_telangana,

                            android.R.layout.simple_spinner_item);

            spinnercity.setAdapter(adapter);

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
