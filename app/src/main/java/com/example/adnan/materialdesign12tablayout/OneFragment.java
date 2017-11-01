package com.example.adnan.materialdesign12tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Adnan on 03/10/2017.
 */

public class OneFragment extends android.support.v4.app.Fragment {

    View view;

    public OneFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.item_one, container, false);
        return view;
    }
}
