package jp.co.systena.tigerscave.shopingtest.application.model;

public class Item {
    private int itemId; //商品ID
    private String name;//商品名
    private int price;  //価格

    public Item(int i, String n, int p) {
        this.itemId = i;
        this.name = n;
        this.price = p;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
