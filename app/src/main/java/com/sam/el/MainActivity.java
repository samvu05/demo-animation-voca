package com.sam.el;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPin;
    private Button btnCon;
    private Button btnEn;
    private Button btnEx;
    private Button btnEye;
    private TextView tvPin;
    private TextView tvCon;
    private TextView tvEn;
    private TextView tvEx;
    private TextView tvEye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temp);
        initView();
    }

    private void initView() {
        btnPin = (Button)findViewById(R.id.btn_pinPoint);
        btnCon = (Button)findViewById(R.id.btn_convience);
        btnEn = (Button)findViewById(R.id.btn_enter);
        btnEx = (Button)findViewById(R.id.btn_exp);
        btnEye = (Button)findViewById(R.id.btn_eye);
        tvPin = (TextView)findViewById(R.id.tv_pin);
        tvCon = (TextView)findViewById(R.id.tv_con);
        tvEn = (TextView)findViewById(R.id.tv_en);
        tvEx = (TextView)findViewById(R.id.tv_ex);
        tvEye = (TextView)findViewById(R.id.tv_eye);
        btnPin.setOnClickListener(this);
        btnCon.setOnClickListener(this);
        btnEn.setOnClickListener(this);
        btnEx.setOnClickListener(this);
        btnEye.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pinPoint:
                makeAnimation(tvPin,R.anim.anim);
                break;
            case R.id.btn_convience:
                makeAnimation(tvCon,R.anim.anim);
                break;
            case R.id.btn_enter:
                makeAnimation(tvEn,R.anim.anim);
                break;
            case R.id.btn_exp:
                makeAnimation(tvEx,R.anim.anim);
                break;
            case R.id.btn_eye:
                makeAnimation(tvEye,R.anim.anim);
                break;
                default:
                    break;
        }
    }

    private void makeAnimation(View view,int animId) {
        Animation animation = AnimationUtils.loadAnimation(this,animId);
        view.startAnimation(animation);
    }
}
