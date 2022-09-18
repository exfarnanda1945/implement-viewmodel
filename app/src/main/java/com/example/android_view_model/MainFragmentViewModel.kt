package com.example.android_view_model

import androidx.lifecycle.ViewModel

class MainFragmentViewModel:ViewModel() {
    var numberCounter = 0

    fun addNumber(){
        numberCounter++
    }
}