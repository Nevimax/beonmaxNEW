package com.nevimax.beonmax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);
    }

    public void onClick(View view) {
        int position = spinner.getSelectedItemPosition();
        String desc = getDescription(position);
        textView.setText(desc);
    }

    private String getDescription(int position) {
        String[] desc = getResources().getStringArray(R.array.spinner_info_of_color);
        return desc[position];
    }
}