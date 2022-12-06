package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class question4 extends AppCompatActivity implements View.OnClickListener {
    Button btn_suiv;
    RadioGroup rg;
    RadioButton rb;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        btn_suiv = (Button) findViewById(R.id.btn_suiv);
        rg = (RadioGroup) findViewById(R.id.radio);
        btn_suiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_suiv:
                int id = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(id);
                if (rb.getText().toString().equals("H2O"))
            {
                score = getIntent().getExtras().getInt("score");
                score = score +1;
            }
                else
            {
                score = getIntent().getExtras().getInt("score");
            }
            Intent i = new Intent(this,question5.class);
            i.putExtra("score",score);
            startActivity(i);

        }
    }
}