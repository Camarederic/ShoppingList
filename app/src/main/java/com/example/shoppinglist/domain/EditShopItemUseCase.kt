package com.example.shoppinglist.domain

// 6) Создаем класс, который юудет редактировать элементы с одним методом
class EditShopItemUseCase(private val shopListRepository: ShopListRepository) { // 12) Добавляем репозиторий

    fun editShopItem(shopItem: ShopItem) {
        // 13) Теперь у репозитория вызываем метод
        shopListRepository.editShopItem(shopItem)
    }
}