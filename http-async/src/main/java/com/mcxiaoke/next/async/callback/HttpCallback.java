package com.mcxiaoke.next.async.callback;

/**
 * User: mcxiaoke
 * Date: 16/1/11
 * Time: 12:16
 */
public interface HttpCallback<T> {

    void onSuccess(T response);

    void onError(Throwable error);
}