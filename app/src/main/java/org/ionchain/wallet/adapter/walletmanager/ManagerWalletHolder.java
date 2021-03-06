package org.ionchain.wallet.adapter.walletmanager;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.ionchain.wallet.adapter.iinterface.IViewHolder;


public class ManagerWalletHolder implements IViewHolder {
    /**
     * item
     */
    public RelativeLayout mManagerWalletRl;
    /**
     * 钱包图标
     */
    public ImageView mWalletImg;
    /**
     * 钱包名字
     */
    public TextView mWalletName;
}
