package com.coditas.ism.dateconverterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.coditas.ism.dateconverterdemo.databinding.ActivityMainBinding
import com.coditas.ism.dateshowdemo.DateConverter

class MainActivity : AppCompatActivity() {
    private val mBinding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)
        initView()
    }
    private fun initView(){
        mBinding.run {
            btnConvertDate.setOnClickListener{
                val mInputDate = etDate.text.toString()
                Log.d("edit text date","$mInputDate")
                val outputDate = DateConverter.getDate(mInputDate.toInt())
                tvConvertedDate.text =outputDate
            }
        }


    }
}