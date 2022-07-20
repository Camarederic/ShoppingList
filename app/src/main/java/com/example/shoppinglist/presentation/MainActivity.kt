package com.example.shoppinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.shoppinglist.R

class MainActivity : AppCompatActivity() {

    // 35) Создаем viewModel
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 36)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // 37) Подписываемся на объект shopList
        viewModel.shopList.observe(this){
            Log.d("MainActivityTest", it.toString())
        }
        //viewModel.getShopList()  // 54) Удаляем viewModel.getShopList()
    }
}