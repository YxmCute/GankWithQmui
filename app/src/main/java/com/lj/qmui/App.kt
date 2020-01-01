package com.lj.qmui

import android.app.Application
import com.qmuiteam.qmui.arch.QMUISwipeBackActivityManager

/**
 * @author Li Jun
 * @date 2020/1/1 0:49
 * @filename  App
 * @description
 */
class App :Application(){
    override fun onCreate() {
        super.onCreate()
        QMUISwipeBackActivityManager.init(this)
    }
}