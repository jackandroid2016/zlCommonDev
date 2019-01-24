package com.zl.common.http.download;

import io.reactivex.observers.DisposableObserver;

/**
 * @author ZL
 * @class describe
 * @time 2019/1/24 15:08
 */
public class DownLoadSubscriber<T> extends DisposableObserver<T> {
    private ProgressCallBack fileCallBack;

    public DownLoadSubscriber(ProgressCallBack fileCallBack) {
        this.fileCallBack = fileCallBack;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (fileCallBack != null) {
            fileCallBack.onStart();
        }
    }

    @Override
    public void onComplete() {
        if (fileCallBack != null) {
            fileCallBack.onCompleted();
        }
    }

    @Override
    public void onError(Throwable e) {
        if (fileCallBack != null) {
            fileCallBack.onError(e);
        }
    }

    @Override
    public void onNext(T t) {
        if (fileCallBack != null) {
            fileCallBack.onSuccess(t);
        }
    }
}
