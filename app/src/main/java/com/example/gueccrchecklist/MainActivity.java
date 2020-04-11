package com.example.gueccrchecklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonNew;
    Button buttonPrior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNew = (Button) findViewById(R.id.newChecklist);
        buttonNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewChecklist();
            }
        });
        buttonPrior = (Button) findViewById(R.id.newChecklist);
        buttonPrior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPriorChecklists();
            }
        });

    }
    public void openNewChecklist(){
        Intent intent = new Intent(this, newChecklistTabs.class);
        startActivity(intent);
    }
    public void viewPriorChecklists(){
        Intent intent = new Intent(this, priorChecklists.class);
        startActivity(intent);
    }

}
