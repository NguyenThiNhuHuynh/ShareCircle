package com.example.sharecircle.services;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.sharecircle.models.Item;
import com.example.sharecircle.repositories.ItemRepository;
import com.example.sharecircle.repositories.ItemRepositoryImpl;

import java.util.List;

public class ItemService {
    private final ItemRepository repo = new ItemRepositoryImpl();


    private final MutableLiveData<List<Item>> itemsLive = new MutableLiveData<>();
    private final MutableLiveData<Item> itemLive = new MutableLiveData<>();


    public LiveData<List<Item>> getItemsLive() { return itemsLive; }
    public LiveData<Item> getItemLive() { return itemLive; }


    public void loadAllItems() {
        repo.getAllItems(new ItemRepository.OnItemsListListener() {
            @Override
            public void onSuccess(List<Item> items) { itemsLive.setValue(items); }
            @Override
            public void onError(Exception e) { itemsLive.setValue(null); }
        });
    }


    public void loadItem(String id) {
        repo.getItemById(id, new ItemRepository.OnItemResultListener() {
            @Override
            public void onSuccess(Item item) { itemLive.setValue(item); }
            @Override
            public void onError(Exception e) { itemLive.setValue(null); }
        });
    }


    public void addItem(Item item) {
        repo.addItem(item, new ItemRepository.OnItemResultListener() {
            @Override
            public void onSuccess(Item i) {}
            @Override
            public void onError(Exception e) {}
        });
    }
}
