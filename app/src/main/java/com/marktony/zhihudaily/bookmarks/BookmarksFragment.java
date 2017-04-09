package com.marktony.zhihudaily.bookmarks;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marktony.zhihudaily.R;

import java.util.ArrayList;


public class BookmarksFragment extends Fragment implements BookmarksContract.View{

    public BookmarksFragment() {
        // Required empty public constructor
    }


    public static BookmarksFragment newInstance() {
        BookmarksFragment fragment = new BookmarksFragment();
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
        return inflater.inflate(R.layout.fragment_bookmarks, container, false);
    }

    @Override
    public void setPresenter(BookmarksContract.Presenter presenter) {

    }

    @Override
    public void initViews(View view) {

    }

    @Override
    public void notifyDataChanged() {

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
