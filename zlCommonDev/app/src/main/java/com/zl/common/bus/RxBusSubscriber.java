package com.zl.common.bus;

import io.reactivex.observers.DisposableObserver;

/**
 * @author ZL
 * @class 为RxBus使用的Subscriber, 主要提供next事件的try,catch
 * @time 2019/1/24 15:17
 */
public abstract class RxBusSubscriber<T> extends DisposableObserver<T> {
    @Override
    public void onNext(T t) {
        try {
            onEvent(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onComplete() {
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
    }

    protected abstract void onEvent(T t);
}
