package com.example.flicky

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.common.base.BaseFragment
import com.example.flicky.R
import kotlinx.android.synthetic.main.sing_in.*

class SingInFragment : BaseFragment(), CustomToolbar.CustomToolbarListener {
    override fun doBack() {
        getRoot().onBackPressed()
    }

    override fun inflate(inflater: LayoutInflater, container: ViewGroup?): View {
        return inflater.inflate(R.layout.sing_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        customToolbar.setCustomListener(this)
    }

    override fun inject() {
    }
}