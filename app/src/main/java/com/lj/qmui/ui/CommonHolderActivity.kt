package com.lj.qmui.ui

import com.lj.qmui.R
import com.lj.qmui.ui.main.HomeFragment
import com.qmuiteam.qmui.arch.QMUIFragmentActivity
import com.qmuiteam.qmui.arch.annotation.DefaultFirstFragment
import com.qmuiteam.qmui.arch.annotation.FirstFragments

@FirstFragments(
    value = [
        HomeFragment::class
    ]
)
@DefaultFirstFragment(HomeFragment::class)
class CommonHolderActivity : QMUIFragmentActivity() {
    override fun getContextViewId(): Int = R.id.app_common_holder_fragment_container


}
