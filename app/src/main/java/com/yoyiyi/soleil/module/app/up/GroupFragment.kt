package com.yoyiyi.soleil.module.app.up

import android.os.Bundle

import com.yoyiyi.soleil.R
import com.yoyiyi.soleil.base.BaseFragment
import com.yoyiyi.soleil.constant.Constants

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * *
 * @date 创建时间：2017/6/16 15:09
 * * 描述:兴趣圈
 */

class GroupFragment : BaseFragment() {

    private var mSetting: Int = 0

    override fun getLayoutId(): Int = R.layout.fragment_up_group


    override fun initVariables() {
        arguments?.let {
            mSetting = it.getInt(Constants.EXTRA_SETTING)

        }
    }

    companion object {
        fun newInstance(setting: Int): GroupFragment {
            val fragment = GroupFragment()
            val bundle = Bundle()
            bundle.putInt(Constants.EXTRA_SETTING, setting)
            fragment.arguments = bundle
            return fragment
        }
    }
}
