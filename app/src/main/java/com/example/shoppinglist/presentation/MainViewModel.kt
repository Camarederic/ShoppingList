package com.example.shoppinglist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.ShopListRepositoryImpl
import com.example.shoppinglist.data.ShopListRepositoryImpl.getShopList
import com.example.shoppinglist.domain.DeleteShopItemUseCase
import com.example.shoppinglist.domain.EditShopItemUseCase
import com.example.shoppinglist.domain.GetShopListUseCase
import com.example.shoppinglist.domain.ShopItem


// 30) Создаем класс и наследуемся от ViewModel
class MainViewModel : ViewModel() {

    // 32) Создаем репозиторий
    private val repository = ShopListRepositoryImpl

    // 31) Добавляем три элемента бизнес логики, то есть три useCase
    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    // 34) Создаем объект LiveData
    val shopList = getShopListUseCase.getShopList() // 49) Меняем MutableLiveData<List<ShopItem>>() на

    // 50) Удаляем этот метод
//    // 33) Получаем список элементов
//    fun getShopList() {
//        val list = getShopListUseCase.getShopList()
//        shopList.value = list
//    }

    // 38) Удаляем из списка
    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
        //getShopList()            // 51) Удаляем метод getShopList()
    }

    // 39)
    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
        //getShopList()               // 52) Удаляем метод getShopList()
    }
}