package com.example.braintrainapp.ui.general

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GeneralViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is general Fragment"
    }
    val text: LiveData<String> = _text
}