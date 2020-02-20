package com.example.expandablelistviewdemo;

public class LayerListData {

    private String layer;
    private int image;

    public LayerListData(String layer, int image) {
        this.layer = layer;
        this.image = image;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
