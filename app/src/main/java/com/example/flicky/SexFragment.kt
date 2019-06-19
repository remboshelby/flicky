package com.example.flicky

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.common.base.BaseFragment
import com.example.myinstagram.R
import kotlinx.android.synthetic.main.sex_layout.*

class SexFragment: BaseFragment(), CustomToolbar.CustomToolbarListener {
    override fun doBack() {
        getRoot().onBackPressed()
    }

    override fun inflate(inflater: LayoutInflater, container: ViewGroup?): View {
        return inflater.inflate(R.layout.sex_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        customToolbar.setCustomListener(this)
        val ttt ="fdsfsfd111"
        btn_next.setOnClickListener({
            getRoot().pushFragment(EmailFragment(), true)
        })
        btn_w.setOnClickListener({
            btn_w.setBackgroundResource(R.drawable.btn_checked)
            btn_m.setBackgroundResource(R.drawable.btn_not_checked)
        })
        btn_m.setOnClickListener({
            btn_w.setBackgroundResource(R.drawable.btn_checked)
            btn_m.setBackgroundResource(R.drawable.btn_not_checked)
        })

    }

    override fun inject() {
    }
}