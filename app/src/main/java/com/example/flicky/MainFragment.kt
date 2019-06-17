package com.example.flicky

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.common.base.BaseFragment
import kotlinx.android.synthetic.main.main_screen.*

class MainFragment : BaseFragment() {
    override fun inflate(inflater: LayoutInflater, container: ViewGroup?): View {
        return inflater.inflate(R.layout.main_screen, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        sing_up.setOnClickListener {
            getRoot().pushFragment(SingInFragment(), true)
        }
        sing_in.setOnClickListener(View.OnClickListener {
            getRoot().pushFragment(NameFragment(), true)
        })
    }

    override fun inject() {
    }
}