package com.marktony.zhihudaily.homepage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marktony.zhihudaily.R;

import java.util.ArrayList;


public class DoubanMomentFragment extends Fragment implements DoubanMomentContract.View{


    public DoubanMomentFragment() {
        // Required empty public constructor
    }


    public static DoubanMomentFragment newInstance(String param1, String param2) {
        DoubanMomentFragment fragment = new DoubanMomentFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_douban_moment, container, false);
    }

    @Override
    public void setPresenter(DoubanMomentContract.Presenter presenter) {

    }

    @Override
    public void initViews(View view) {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showResult(ArrayList list) {

    }
}
