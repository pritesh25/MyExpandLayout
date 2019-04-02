package com.example.myexpandlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myexpandlayout.expand.ExpandableLayout;

public class MainActivity extends AppCompatActivity {

    private ExpandableLayout expandableLayout1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableLayout1 = findViewById(R.id.expandable_layout_1);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableLayout1.isExpanded()) {
                    expandableLayout1.collapse();
                } else {
                    expandableLayout1.expand();
                }
            }
        });

    }
}
