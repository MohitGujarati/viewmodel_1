package com.example.mvvm_p1

import android.app.Dialog
import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel(context: Context) : ViewModel() {
    val txtNumberModel = MutableLiveData<TxtNumberModel>(TxtNumberModel(1))

    fun incrementNumber() {
        val currentValue = txtNumberModel.value?.num ?: 0
        val newValue = currentValue + 1
        txtNumberModel.value = TxtNumberModel(newValue)
    }

    fun dialog(context: Context){
        var d= Dialog(context)
        d.setContentView(R.layout.dialogbox)
        d.setCancelable(true)



        d.show()

    }


}



