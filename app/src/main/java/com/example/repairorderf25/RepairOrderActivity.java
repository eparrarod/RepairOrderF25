package com.example.repairorderf25;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class RepairOrderActivity extends AppCompatActivity {

    double numbers = 0.0;
    TextView totalTV;
    TextView subtotalTV;

    EditText orderET;
    Button submitB; // 1 Create button
    // 2 create listener
    View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) { // 4 Write the code to do things
            Random gen = new Random();

            double number = gen.nextDouble();
            String v1 =  "$ " + number;
            subtotalTV.setText(v1);

            String orderTypeValue = orderET.getText().toString();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_repair_order);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        totalTV = findViewById(R.id.textView12);
        subtotalTV = findViewById(R.id.textView9);
        submitB = findViewById(R.id.submitButton);
        submitB.setOnClickListener(buttonListener); // 3 registering the listener to the button
        orderET = findViewById(R.id.editTextText);
    }

}