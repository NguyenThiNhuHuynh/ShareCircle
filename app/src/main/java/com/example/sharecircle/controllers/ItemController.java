package com.example.sharecircle.controllers;

import androidx.lifecycle.Observer;

import com.example.sharecircle.models.Item;
import com.example.sharecircle.services.ItemService;

import java.util.List;

public class ItemController {
    private final ItemService itemService = new ItemService();


    public ItemController() {
        itemService.getItemsLive().observeForever(new Observer<List<Item>>() {
            @Override
            public void onChanged(List<Item> items) {
            }
        });
    }


    public void loadItems() {
        itemService.loadAllItems();
    }


    public void loadItem(String id) {
        itemService.loadItem(id);
    }
}
