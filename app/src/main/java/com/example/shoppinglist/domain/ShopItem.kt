package com.example.shoppinglist.domain

// 1) Создаем дата класс и прописываем в нем элементы
data class ShopItem(

    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean,
)
