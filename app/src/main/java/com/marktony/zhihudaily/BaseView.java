package com.marktony.zhihudaily;

import android.view.View;

/**
 * Created by meanhan on 2017/4/5.
 */

public interface BaseView<T> {

    // 为View设置Presenter
    void setPresenter(T presenter);

    // 初始化界面控件
    void initViews(View view);
}
