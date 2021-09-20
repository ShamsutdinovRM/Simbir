package com.shams.simbir.service.item;

import com.shams.simbir.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

//Интерфейс сервиса для CRUD-методов
@Service
public interface ItemService {
    public Item findById(Long id);
    public List<Item> findAll();
    public Item saveItem(Item item);
    public void deleteById(Long id);
}
