package com.xdroid.adapter.databinding.viewgroup;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.view.View;
import android.view.ViewGroup;

import com.xdroid.adapter.BR;
import com.xdroid.adapter.R;
import com.xdroid.adapter.viewgroup.adapter.cache.ViewHolder;
import com.xdroid.adapter.viewgroup.adapter.mul.IMulTypeHelper;

import java.util.List;

/**
 * 介绍：用DataBinding实现的MulTypeAdapter
 */
public class MulTypeBindngAdapter<T extends IMulTypeHelper> extends SingleBindingAdapter<T, ViewDataBinding> {

    public MulTypeBindngAdapter(Context context, List<T> datas) {
        super(context, datas, -1);
    }

    //重写利用DataBinding做
    @Override
    public View getView(ViewGroup parent, int pos, T data) {
        ViewHolder holder = getViewHolderByType(parent, data.getItemLayoutId());
        ViewDataBinding binding = (ViewDataBinding) holder.itemView.getTag(R.id.zxt_tag_vdb);
        onBindViewHolder(parent, holder, data, pos);
        binding.setVariable(BR.data, data);
        binding.setVariable(BR.itemP, ItemPresenter);
        return holder.itemView;
    }
}
