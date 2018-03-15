package com.xdroid.adapter.databinding.rv;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * 介绍：使用DataBinding ，告别ViewHolder
 */
public class BaseBindingVH<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    protected final T mBinding;

    public BaseBindingVH(T t) {
        super(t.getRoot());
        mBinding = t;
    }

    public T getBinding() {
        return mBinding;
    }
}
