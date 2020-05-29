package com.android.baseapplication.ui.activity;


import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.baseapplication.base.BaseActivity;
import com.android.baseapplication.util.SharedPreferencesUtil;
import com.blankj.utilcode.util.SPUtils;
import com.android.baseapplication.R;
import com.yzq.zxinglibrary.common.Constant;

public class TheamActivity extends BaseActivity  {

    @Override
    public int getResId() {
        return R.layout.theam_activity;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(TheamActivity.this,"This is Theam Activity",Toast.LENGTH_SHORT).show();
    }
}
