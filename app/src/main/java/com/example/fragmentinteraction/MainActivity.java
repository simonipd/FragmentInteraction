package com.example.fragmentinteraction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentinteraction.fragment.ejemploFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonFramento;
    private Button buttonActiviy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView(){
        buttonFramento = findViewById(R.id.buttonFragment);
        buttonActiviy = findViewById(R.id.buttonActivity);
        buttonFramento.setOnClickListener(this);
        buttonActiviy.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonFragment:
                Fragment fragment = new ejemploFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content,fragment).addToBackStack(null).commit();
                break;
            case R.id.buttonActivity:
                startActivity(new Intent(this,ejemploActivity.class));
                break;
        }
    }
}