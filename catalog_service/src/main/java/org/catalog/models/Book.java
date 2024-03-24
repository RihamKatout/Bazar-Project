package org.catalog.models;
public class Book {
    private String id;
    private String title;
    private Integer quantity;
    private Integer price;

    public Book(String id, String title, Integer quantity, Integer price) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}