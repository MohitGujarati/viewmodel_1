package com.example.mvvm_p1

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_p1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var mainViewModel: MainViewModel
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        //added data binding
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        //object of view model
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(application)).get(MainViewModel::class.java)

        var txtnumobj=TxtNumberModel(1)
        binding.txtnumber=txtnumobj


       binding.btnincrease.setOnClickListener {
       mainViewModel.dialog(this)



        }

    }


}