package com.shams.simbir.controller;

import com.shams.simbir.entity.Item;
import com.shams.simbir.service.item.ItemService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/item", produces = MediaType.APPLICATION_JSON_VALUE)
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping()
    public List<Item> findAllItems(){
        return itemService.findAll();
    }

    @GetMapping("/{id}")
    public Item findByIdItems(@PathVariable(name = "id") Long id){
        return itemService.findById(id);
    }

    @PostMapping("/saveItem")
    public Item saveItem(Item item){
        return itemService.saveItem(item);
    }

    @DeleteMapping("/item-delete")
    public void deleteByIdItems(Long id){
        itemService.deleteById(id);
    }

}
