package com.mercuriete.mrz.reader.result;

/*
 *  ****************************************************************************
 *  * Created by : Md. Azizul Islam on 6/7/2018 at 4:24 PM.
 *  * Email : azizul@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md. Azizul Islam on 6/7/2018.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mercuriete.mrz.reader.R;

public class ResultActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView = findViewById(R.id.tv_result);
        getVlaueFromIntent();
    }

    private void getVlaueFromIntent(){
        Intent intent = getIntent();

        if(intent.hasExtra("result")){
            String value = intent.getStringExtra("result");
            textView.setText(value);
        }
    }
}
