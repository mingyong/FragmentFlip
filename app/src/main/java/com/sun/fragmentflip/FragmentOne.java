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
     * 动画速率调整用Interpolator class	Resource ID
     * AccelerateDecelerateInterpolator	@android:anim/accelerate_decelerate_interpolator
     * AccelerateInterpolator	@android:anim/accelerate_interpolator
     * AnticipateInterpolator	@android:anim/anticipate_interpolator
     *  AnticipateOvershootInterpolator	@android:anim/anticipate_overshoot_interpolator
     * BounceInterpolator	@android:anim/bounce_interpolator
     * CycleInterpolator	@android:anim/cycle_interpolator
     * DecelerateInterpolator	@android:anim/decelerate_interpolator
     * LinearInterpolator	@android:anim/linear_interpolator
     * OvershootInterpolator	@android:anim/overshoot_interpolator
     *
     */
    @Override
    public void onClick(View v) {
       getFragmentManager().beginTransaction()
               .setCustomAnimations(R.animator.enter,R.animator.exit,R.animator.enter_re, R.animator.exit_re )
               .replace(R.id.ly_content,new FragmentTwo())
               .addToBackStack(null)
               .commit();
    }
}
