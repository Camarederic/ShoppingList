package com.example.shoppinglist.domain

// 3) Создаем класс для получения элементов покупок, который будет содержать один метод
class GetShopItemUseCase(private val shopListRepository: ShopListRepository) { // 14) Добавляем репозиторий

    fun getShopItem(shopItemId: Int): ShopItem {
        // 15) Теперь у репозитория вызываем метод
        return shopListRepository.getShopItem(shopItemId)
    }
}