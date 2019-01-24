package com.zl.common.base;

/**
 * @author ZL
 * @class describe
 * @time 2019/1/24 15:35
 */
public interface IBaseActivity {
    /**
     * 初始化界面传递参数
     */
    void initParam();
    /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化界面观察者的监听
     */
    void initViewObservable();
}
