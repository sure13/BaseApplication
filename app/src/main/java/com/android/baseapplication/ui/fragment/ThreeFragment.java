package com.android.baseapplication.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.android.baseapplication.R;
import com.android.baseapplication.bean.News;
import com.android.baseapplication.ui.activity.MainActivity;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.android.baseapplication.util.OkHttpUtils.getNewsList;


public class ThreeFragment extends Fragment {

    public static ThreeFragment threeFragment;

    private TextView textView;

    public static final ThreeFragment getInstance(){
        if (threeFragment == null){
            threeFragment = new ThreeFragment();
        }
        return threeFragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.three_fragment,container,false);
        return view;
    }

}
