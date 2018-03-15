package com.xdroid.adapter.viewgroup.adapter.cache;

/**
 * 介绍：V1.5.0 引入 ViewCache概念
 */
public interface IViewCache {
    void put(ViewHolder view);

    ViewHolder get(int itemType);

    void setCacheSize(int itemType, int size);

    int getCacheSize(int itemType);
}
