package com.example.myexpandlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.myexpandlayout.expand.ExpandableLayout;

public class MainActivity extends AppCompatActivity {

    private ExpandableLayout expandableLayout1;
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableLayout1 = findViewById(R.id.expandable_layout_1);
        iv = findViewById(R.id.iv);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableLayout1.isExpanded()) {
                    expandableLayout1.collapse();
                    iv.animate().rotation(180).start();//startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise));
                } else {
                    expandableLayout1.expand();
                    iv.animate().rotation(0).start();//startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anti_clockwise));
                }
            }
        });

    }
}
