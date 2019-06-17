package com.example.flicky

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.custom_toolbar.view.*

class CustomToolbar : ConstraintLayout{
    interface CustomToolbarListener{
        fun doBack()
    }
    lateinit var listener : CustomToolbarListener

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        LayoutInflater.from(context).inflate(R.layout.custom_toolbar, this)

        image_btn_back.setOnClickListener({
            listener.doBack()
        })
    }
    fun setCustomListener(listener : CustomToolbarListener){
        this.listener = listener
    }
}