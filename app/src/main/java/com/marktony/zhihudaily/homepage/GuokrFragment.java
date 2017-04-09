package com.marktony.zhihudaily.homepage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marktony.zhihudaily.R;

import java.util.ArrayList;


public class GuokrFragment extends Fragment implements GuokrContract.View{

    public GuokrFragment() {
        // Required empty public constructor
    }

    public static GuokrFragment newInstance(String param1, String param2) {
        GuokrFragment fragment = new GuokrFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guokr, container, false);
    }

    @Override
    public void setPresenter(GuokrContract.Presenter presenter) {

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
