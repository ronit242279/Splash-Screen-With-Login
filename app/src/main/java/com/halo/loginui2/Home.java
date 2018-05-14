package com.halo.loginui2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
CardView mycard,mycard1,mycard2,mycard3,mycard4,mycard5 ;
    Intent i,i2,i3 ;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.ManangecardId);
        mycard1 = (CardView) findViewById(R.id.healthcardId);
        mycard2 = (CardView) findViewById(R.id.businesscardId);
        mycard3 = (CardView) findViewById(R.id.faqcardId);
        mycard4 = (CardView) findViewById(R.id.employeecardId);
        mycard5 = (CardView) findViewById(R.id.tbdcardId);
        i = new Intent(this,ae.class);
        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
        mycard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i2 = new Intent(Home.this,FaqActivity.class);
                startActivity(i2);
            }
        });
        mycard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3 = new Intent(Home.this,EmployeeEngagementActivity.class);
                startActivity(i3);
            }
        });
    }
}
