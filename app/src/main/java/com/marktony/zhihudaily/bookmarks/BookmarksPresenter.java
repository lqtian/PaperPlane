package com.marktony.zhihudaily.bookmarks;

import android.content.Context;

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
    public void loadPosts(long date, boolean clearing) {

    }

    @Override
    public void refresh() {

    }

    @Override
    public void loadMore(long date) {

    }

    @Override
    public void startReading(int position) {

    }

    @Override
    public void feelLucky() {

    }
}
