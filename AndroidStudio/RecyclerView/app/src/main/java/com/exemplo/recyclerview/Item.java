package com.exemplo.recyclerview;

public class Item {

    private String textNumeroItem;
    private String textDescricaoItem;
    private String textData;

    public Item(String textNumeroItem, String textDescricaoItem, String textData) {
        this.textNumeroItem = textNumeroItem;
        this.textDescricaoItem = textDescricaoItem;
        this.textData = textData;
    }

    public String getTextNumeroItem() {
        return textNumeroItem;
    }

    public void setTextNumeroItem(String textNumeroItem) {
        this.textNumeroItem = textNumeroItem;
    }

    public String getTextDescricaoItem() {
        return textDescricaoItem;
    }

    public void setTextDescricaoItem(String textDescricaoItem) {
        this.textDescricaoItem = textDescricaoItem;
    }

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }
}
