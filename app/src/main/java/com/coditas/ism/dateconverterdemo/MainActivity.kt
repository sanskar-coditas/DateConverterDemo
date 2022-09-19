package com.coditas.ism.dateconverterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coditas.ism.dateconverterdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val mBinding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)
        initView()
    }
    private fun initView(){
        mBinding.run {
            val mInputDate = etDate.text.toString()
            btnConvertDate.setOnClickListener{

            }
        }


    }
}