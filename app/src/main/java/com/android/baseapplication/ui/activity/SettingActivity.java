package com.android.baseapplication.ui.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.android.baseapplication.R;
import com.android.baseapplication.base.BaseActivity;

public class SettingActivity extends BaseActivity  {





    @Override
    public int getResId() {
        return R.layout.setting_activity;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(SettingActivity.this,"This is Setting Activity",Toast.LENGTH_SHORT).show();
    }
}
