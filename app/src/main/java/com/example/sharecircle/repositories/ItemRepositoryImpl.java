package com.example.sharecircle.repositories;

import com.example.sharecircle.models.Item;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.*;

public class ItemRepositoryImpl implements ItemRepository{
    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private final CollectionReference itemsRef = db.collection("items");

    @Override
    public void addItem(Item item, OnItemResultListener listener){
        String id = itemsRef.document().getId();
        item.setId(id);
        itemsRef.document(id).set(item)
                .addOnSuccessListener(a-> listener.onSuccess(item))
                .addOnFailureListener(listener::onError);
    }

    @Override
    public void updateItem(Item item, OnItemResultListener listener){
        itemsRef.document(item.getId()).set(item)
                .addOnSuccessListener(a -> listener.onSuccess(item))
                .addOnFailureListener(listener::onError);
    }

    @Override
    public void deleteItem(String itemId, OnItemResultListener listener) {
        itemsRef.document(itemId).delete()
                .addOnSuccessListener(a -> listener.onSuccess(null))
                .addOnFailureListener(listener::onError);
    }

    @Override
    public void getItemById(String itemId, OnItemResultListener listener){
        itemsRef.document(itemId).get()
                .addOnSuccessListener(doc -> {
                    if (doc.exists()) listener.onSuccess(doc.toObject(Item.class));
                    else listener.onError(new Exception("Item not found"));
                })
                .addOnFailureListener(listener::onError);
    }

    @Override
    public void getAllItems(OnItemsListListener listener) {
        itemsRef.get()
                .addOnSuccessListener(query -> {
                    List<Item> list = new ArrayList<>();
                    for (DocumentSnapshot d : query.getDocuments()) list.add(d.toObject(Item.class));
                    listener.onSuccess(list);
                })
                .addOnFailureListener(listener::onError);
    }
}
