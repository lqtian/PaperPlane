package com.marktony.zhihudaily.bookmarks;

import com.marktony.zhihudaily.BasePresenter;
import com.marktony.zhihudaily.BaseView;
import com.marktony.zhihudaily.bean.BeanType;
import com.marktony.zhihudaily.bean.DoubanMomentNews;
import com.marktony.zhihudaily.bean.GuokrHandpickNews;
import com.marktony.zhihudaily.bean.ZhihuDailyNews;

import java.util.ArrayList;

/**
 * Created by meanhan on 2017/4/6.
 */

public interface BookmarksContract {

    interface View extends BaseView<Presenter>{

        void notifyDataChanged();
        // 显示正在加载
        void showLoading();
        // 停止显示正在加载
        void stopLoading();
        // 成功获取到数据后，在界面中显示
        void showResult(ArrayList<ZhihuDailyNews.Question> zhihuList,
                        ArrayList<GuokrHandpickNews.result> guokrList,
                        ArrayList<DoubanMomentNews.posts> doubanList,
                        ArrayList<Integer> types);

    }

    interface Presenter extends BasePresenter{

        void loadResults(boolean refresh);

        void checkForFreshData();

        // 显示详情
        void startReading(BeanType type ,int position);
        // 随便看看
        void feelLucky();
    }
}
