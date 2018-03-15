package com.xdroid.adapter.rv.mul;

import com.xdroid.adapter.rv.ViewHolder;

/**
 * 介绍：受DataBinding启发，将数据填充方法挪出来
 */
public interface IMulTypeHelper {

    int getItemLayoutId();

    void onBind(ViewHolder holder);
}
