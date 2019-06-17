package com.example.flicky

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.common.base.BaseFragment
import kotlinx.android.synthetic.main.name_layout.*

class NameFragment :BaseFragment(), CustomToolbar.CustomToolbarListener {
    override fun doBack() {
        getRoot().onBackPressed()
    }

    override fun inflate(inflater: LayoutInflater, container: ViewGroup?): View {
        return inflater.inflate(R.layout.name_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        customToolbar.setCustomListener(this)

        btn_next.setOnClickListener({
            getRoot().pushFragment(AgeFragment(), true)
        })
    }

    override fun inject() {
    }
}