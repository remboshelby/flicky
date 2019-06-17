package com.example.flicky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.common.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pushFragment(MainFragment(), false)
    }

    override fun containerResId(): Int {
        return R.id.activity_container
    }
}
