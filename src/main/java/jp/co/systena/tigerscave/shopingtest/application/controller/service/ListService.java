package jp.co.systena.tigerscave.shopingtest.application.controller.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import jp.co.systena.tigerscave.shopingtest.application.model.Item;

@Service
public class ListService {
  //private final int ITEMS_COUNT = 3;

  public Map<Integer, Item> getItemList() {
    //Item[] items = new Item[ITEMS_COUNT]; //アイテムをまとめれる…かも
    Item item1 = new Item(1, "鮍", 1000);
    Item item2 = new Item(2, "鰯", 200);
    Item item3 = new Item(3, "鮭", 400);

    Map<Integer, Item> itemListMap = new LinkedHashMap<Integer, Item>();
    itemListMap.put(item1.getItemId(), item1);
    itemListMap.put(item2.getItemId(), item2);
    itemListMap.put(item3.getItemId(), item3);

    return itemListMap;
  }
}
