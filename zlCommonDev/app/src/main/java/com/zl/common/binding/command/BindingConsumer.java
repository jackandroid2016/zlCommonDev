package com.zl.common.binding.command;

/**
 * @author ZL
 * @class describe
 * @time 2019/1/24 15:29
 */
public interface BindingConsumer<T> {
    void call(T t);
}
