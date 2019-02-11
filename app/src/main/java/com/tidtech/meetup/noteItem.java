package com.tidtech.meetup;

public class noteItem {


   private String ItemName;
    private String ItemTitle;

    public noteItem(String itemName,String Title) {
        this.ItemName = itemName;
        this.ItemTitle=Title;
    }

    public String getItemName() {
        return ItemName;
    }
    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemName(String itemName) {
        this.ItemName = itemName;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }
}



