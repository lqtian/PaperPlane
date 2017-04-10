package com.marktony.zhihudaily.bookmarks;

import android.content.Context;

import com.marktony.zhihudaily.bean.BeanType;

/**
 * Created by meanhan on 2017/4/7.
 */

public class BookmarksPresenter implements BookmarksContract.Presenter {

    private Context context;
    private BookmarksContract.View view;

    public BookmarksPresenter(Context context, BookmarksContract.View view) {
        this.context = context;
        this.view = view;
    }

    @Override
    public void start() {

    }

    @Override
    public void loadResults(boolean refresh) {

    }

    @Override
    public void checkForFreshData() {

    }

    @Override
    public void startReading(BeanType type, int position) {

    }

    @Override
    public void feelLucky() {

    }
}
