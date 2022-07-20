package com.example.shoppinglist.domain

// 1) Создаем дата класс и прописываем в нем элементы
data class ShopItem(


    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = UNDEFINED_ID
) {
// 27) Создаем константу для жестко закодированного числа
    companion object{

        const val UNDEFINED_ID = -1
    }
}

