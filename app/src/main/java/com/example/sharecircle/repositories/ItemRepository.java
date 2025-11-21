package com.example.sharecircle.repositories;

import com.example.sharecircle.models.Item;

import java.util.List;

public interface ItemRepository {
    void addItem(Item item, OnItemResultListener listener);
    void updateItem(Item item, OnItemResultListener listener);
    void deleteItem(String itemId, OnItemResultListener listener);
    void getItemById(String itemId, OnItemResultListener listener);
    void getAllItems(OnItemsListListener listener);


    interface OnItemResultListener {
        void onSuccess(Item item);
        void onError(Exception e);
    }


    interface OnItemsListListener {
        void onSuccess(List<Item> items);
        void onError(Exception e);
    }
}
