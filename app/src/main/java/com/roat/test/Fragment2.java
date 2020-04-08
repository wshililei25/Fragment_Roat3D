package com.roat.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by XiLei on 2020/4/8
 */
public class Fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two,null);
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        if (SPUtils.getMainCurrentPosition(getActivity()) > SPUtils.getMainClickPosition(getActivity())) {
            transit = CubeAnimation.RIGHT;
        } else {
            transit = CubeAnimation.LEFT;
        }
        return CubeAnimation.create(transit, enter, Constant.MAIN_FRAGMENT_ANIMATION_DURATION);
    }


}
