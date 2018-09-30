package com.example.korio.cuandocobro.ui.config.view

import android.os.Bundle
import com.example.korio.cuandocobro.R
import com.example.korio.cuandocobro.ui.base.view.BaseActivity

class ConfigActivity : BaseActivity(), IConfigActivity
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)
    }
}
