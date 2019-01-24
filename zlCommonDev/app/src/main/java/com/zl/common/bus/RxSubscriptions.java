package com.zl.common.bus;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * @author ZL
 * @class 管理 CompositeSubscription
 * @time 2019/1/24 15:17
 */
public class RxSubscriptions {
    private static CompositeDisposable mSubscriptions = new CompositeDisposable ();

    public static boolean isDisposed() {
        return mSubscriptions.isDisposed();
    }

    public static void add(Disposable s) {
        if (s != null) {
            mSubscriptions.add(s);
        }
    }

    public static void remove(Disposable s) {
        if (s != null) {
            mSubscriptions.remove(s);
        }
    }

    public static void clear() {
        mSubscriptions.clear();
    }

    public static void dispose() {
        mSubscriptions.dispose();
    }
}
