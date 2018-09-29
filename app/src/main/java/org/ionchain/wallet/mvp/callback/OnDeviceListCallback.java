package org.ionchain.wallet.mvp.callback;

import org.ionchain.wallet.bean.DeviceBean;

import java.util.List;

/**
 * USER: binny
 * DATE: 2018/9/14
 * 描述: 获取设备列表
 */
public interface OnDeviceListCallback extends ILoadingView {
    /**
     * 获取设备列表成功
     *
     * @param list 设备列表
     */
    void onDeviceListSuccess(List<DeviceBean.DataBean> list);

    /**
     * 获取设备列表失败
     *
     * @param errorMessage 失败信息
     */
    void onDeviceListFailure(String errorMessage);
}