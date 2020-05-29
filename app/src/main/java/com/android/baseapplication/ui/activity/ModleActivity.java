package com.android.baseapplication.ui.activity;

import android.widget.Toast;

import com.android.baseapplication.R;
import com.android.baseapplication.base.BaseActivity;

import androidx.appcompat.app.AppCompatActivity;

public class ModleActivity extends BaseActivity {

    @Override
    public int getResId() {
        return R.layout.about_activity;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(ModleActivity.this,"This is Modle Activity",Toast.LENGTH_SHORT).show();
    }
}
