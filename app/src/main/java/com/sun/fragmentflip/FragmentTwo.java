package com.sun.fragmentflip;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentTwo extends Fragment implements View.OnClickListener {
    public FragmentTwo() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vTwo = inflater.inflate(R.layout.fragment_two, container, false);
        vTwo.findViewById(R.id.two).setOnClickListener(this);
        return vTwo;
    }

    @Override
    public void onClick(View v) {
        getFragmentManager().popBackStack();
    }
}
