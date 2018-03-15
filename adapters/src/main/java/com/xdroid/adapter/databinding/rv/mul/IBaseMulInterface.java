package com.xdroid.adapter.databinding.rv.mul;

/**
 * 介绍：多种类型viewType的ViewModel需要实现的接口
 * 根据不同的itemType返回不同的ItemLayoutId
 */

public interface IBaseMulInterface {
    public int getItemLayoutId();
}
