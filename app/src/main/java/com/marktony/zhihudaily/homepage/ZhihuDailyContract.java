package com.marktony.zhihudaily.homepage;

import com.marktony.zhihudaily.BasePresenter;
import com.marktony.zhihudaily.BaseView;

import java.util.ArrayList;

/**
 * Created by meanhan on 2017/4/6.
 */

public interface ZhihuDailyContract {

    interface View extends BaseView<Presenter>{

        // 显示加载或其他类型的错误
        void showError();
        // 显示正在加载
        void showLoading();
        // 停止显示正在加载
        void stopLoading();
        // 成功获取到数据后，在界面中显示
        void showResult(ArrayList list);

    }

    interface Presenter extends BasePresenter{

        // 请求数据
        void loadPosts(long date ,boolean clearing);
        // 刷新数据
        void refresh();
        // 加载更多文章
        void loadMore(long date);
        // 显示详情
        void startReading(int position);
        // 随便看看
        void feelLucky();
    }
}
