package com.seechat.commutils.model;

/**
 * Created by hjw on 2018/3/28.
 */

public class Books extends DataModel {

   private int id;
   private String bookName;
   private int price;
   private String type;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBookName(String bookname) {
        this.bookName = bookname;
    }

    public String getBookName() {
        return bookName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
