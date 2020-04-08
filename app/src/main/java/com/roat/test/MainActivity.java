package com.roat.test;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private FragmentManager mFragmentManager;
    private FragmentTransaction mTransaction;
    private Fragment1 mFragment1;
    private Fragment2 mFragment2;
    private Fragment3 mFragment3;
    private Fragment4 mFragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragment1 = new Fragment1();
        mFragment2 = new Fragment2();
        mFragment3 = new Fragment3();
        mFragment4 = new Fragment4();
        mFragmentManager = getSupportFragmentManager();
        mTransaction = mFragmentManager.beginTransaction();
        mTransaction.add(R.id.framelayout, mFragment1);
        mTransaction.commit();

        findViewById(R.id.btn_video).setOnClickListener(this);
        findViewById(R.id.btn_shop).setOnClickListener(this);
        findViewById(R.id.btn_news).setOnClickListener(this);
        findViewById(R.id.btn_me).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_video:
                SPUtils.saveMainCurrentPosition(this,  SPUtils.getMainClickPosition(this));
                SPUtils.saveMainClickPosition(this, 0);
                mTransaction = mFragmentManager.beginTransaction();
                mTransaction.replace(R.id.framelayout, mFragment1);
                mTransaction.commit();
                break;
            case R.id.btn_shop:
                SPUtils.saveMainCurrentPosition(this,  SPUtils.getMainClickPosition(this));
                SPUtils.saveMainClickPosition(this, 1);
                mTransaction = mFragmentManager.beginTransaction();
                mTransaction.replace(R.id.framelayout, mFragment2);
                mTransaction.commit();
                break;
            case R.id.btn_news:
                SPUtils.saveMainCurrentPosition(this,  SPUtils.getMainClickPosition(this));
                SPUtils.saveMainClickPosition(this, 2);
                mTransaction = mFragmentManager.beginTransaction();
                mTransaction.replace(R.id.framelayout, mFragment3);
                mTransaction.commit();
                break;
            case R.id.btn_me:
                SPUtils.saveMainCurrentPosition(this,  SPUtils.getMainClickPosition(this));
                SPUtils.saveMainClickPosition(this, 3);
                mTransaction = mFragmentManager.beginTransaction();
                mTransaction.replace(R.id.framelayout, mFragment4);
                mTransaction.commit();
                break;
        }
    }
}
