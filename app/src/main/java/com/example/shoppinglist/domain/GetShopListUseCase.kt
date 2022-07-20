package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

// 2) Создаем класс для получения списка покупок, который будет содержать метод получения списка покупок
class GetShopListUseCase(private val shopListRepository: ShopListRepository) { // 16) Добавляем репозиторий

    fun getShopList(): LiveData<List<ShopItem>> { // 40) Добавляем LiveData
        // 17) Теперь у репозитория вызываем метод
        return shopListRepository.getShopList()
    }

}