package com.android.baseapplication.ui.activity;


import android.widget.Toast;

import com.android.baseapplication.base.BaseActivity;
import com.android.baseapplication.R;

public class AboutActivity extends BaseActivity {


    @Override
    public int getResId() {
        return R.layout.about_activity;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(AboutActivity.this,"This is About Activity",Toast.LENGTH_SHORT).show();
    }
}
