package com.lj.qmui.ui.main

import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import com.qmuiteam.qmui.arch.QMUIFragment
import com.qmuiteam.qmui.kotlin.wrapContent

/**
 * @author Li Jun
 * @date 2020/1/1 10:26
 * @filename  HomeFragment
 * @description  TODO
 */
class HomeFragment : QMUIFragment() {
    override fun onCreateView(): View {
        return  FrameLayout(context!!).apply {
            val tv=TextView(context).apply {
                text="第一个fragment"
            }
            addView(tv,FrameLayout.LayoutParams(wrapContent, wrapContent).apply {
                gravity=Gravity.CENTER
            })
        }
    }
}