package com.android.baseapplication.ui.activity;


import android.widget.Toast;

import com.android.baseapplication.base.BaseActivity;
import com.android.baseapplication.R;

public class FarvorateActivity extends BaseActivity {

    @Override
    public int getResId() {
        return R.layout.about_activity;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(FarvorateActivity.this,"This is Farvorate  Activity",Toast.LENGTH_SHORT).show();
    }
}
