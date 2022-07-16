package com.example.shoppinglist.domain

// 2) Создаем класс для получения списка покупок, который будет содержать метод получения списка покупок
class GetShopListUseCase(private val shopListRepository: ShopListRepository) { // 16) Добавляем репозиторий

    fun getShopList(): List<ShopItem> {
        // 17) Теперь у репозитория вызываем метод
        return shopListRepository.getShopList()
    }

}