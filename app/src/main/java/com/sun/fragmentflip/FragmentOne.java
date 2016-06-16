package com.sun.fragmentflip;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class FragmentOne extends Fragment implements View.OnClickListener {
    private View vOne;

    public FragmentOne() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vOne = inflater.inflate(R.layout.fragment_one, container, false);
        vOne.findViewById(R.id.one).setOnClickListener(this);
        return vOne;
    }

    /**
     * 设置动画，注意导入的是android.app.Fragment;
     *
     */
    @Override
    public void onClick(View v) {
       getFragmentManager().beginTransaction()
               .setCustomAnimations(R.animator.enter,R.animator.exit )
               .replace(R.id.ly_content,new FragmentTwo())
               .commit();
    }
}
