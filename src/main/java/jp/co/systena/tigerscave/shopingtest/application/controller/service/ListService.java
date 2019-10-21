package jp.co.systena.tigerscave.shopingtest.application.controller.service;

import java.util.HashMap;
import java.util.Map;
import jp.co.systena.tigerscave.shopingtest.application.controller.service.Item.Item;

public class ListService {
  private final int ITEMS_COUNT = 3;

  public Map<String, Item> getItemList() {
    Item[] items = new Item[ITEMS_COUNT];
    items[0] = new Item(1, "鮍", 1000);
    items[1] = new Item(2, "鰯", 200);
    items[2] = new Item(3, "鮭", 300);

    Map<String, Item> itemMap = new HashMap<String, Item>();
    for (int i = 0; i < items.length; i++) {
      itemMap.put(Integer.toString(items[i].getItemId()), items[i]);
    }

    return itemMap;
  }
}
