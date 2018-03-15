package com.xdroid.adapter.rv.mul;

import android.content.Context;
import android.view.ViewGroup;

import com.xdroid.adapter.rv.CommonAdapter;
import com.xdroid.adapter.rv.ViewHolder;

import java.util.List;

public class BaseMulTypeAdapter<T extends IMulTypeHelper> extends CommonAdapter<T> {


    public BaseMulTypeAdapter(Context context, List<T> datas) {
        super(context, datas, -1);
    }

    @Override
    public int getItemViewType(int position) {
        if (mDatas != null && !mDatas.isEmpty()) {
            return mDatas.get(position).getItemLayoutId();
        }
        return super.getItemViewType(position);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //点击事件为了兼容HeaderView FooterView 的Adapter
        if (null == mRv) {
            mRv = parent;
        }

        return ViewHolder.get(mContext, parent, viewType);
    }

    @Override
    public void convert(ViewHolder holder, T t) {
        t.onBind(holder);
    }
}
