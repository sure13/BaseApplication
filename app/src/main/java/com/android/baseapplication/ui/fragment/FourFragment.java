package com.android.baseapplication.ui.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.baseapplication.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FourFragment extends Fragment {

    public static FourFragment fourFragment;

    public static final FourFragment getInstance(){
        if (fourFragment == null){
            fourFragment = new FourFragment();
        }
        return fourFragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.four_fragment,container,false);
        return view;
    }
}
