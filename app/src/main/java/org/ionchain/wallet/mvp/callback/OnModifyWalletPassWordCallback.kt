package org.ionchain.wallet.mvp.callback

import org.ionchain.wallet.bean.WalletBean

/**
 * USER: binny
 * DATE: 2018/9/26
 * 描述: 修改钱包密码的回调
 */
interface OnModifyWalletPassWordCallback {
    /**修改成功
     *
     */
    fun onModifySuccess(walletBean: WalletBean)

    fun onModifyFailure(error: String)

}
