package com.example.menu;

import java.util.Objects;

public class MenuItem {

    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isRecentMenuAddition;
    private String dateAddedToMenu;

    public MenuItem(String name, Double price, String description, String category, Boolean isRecentMenuAddition, String dateAddedToMenu) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isRecentMenuAddition = isRecentMenuAddition;
        this.dateAddedToMenu = dateAddedToMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getRecentMenuAddition() {
        return isRecentMenuAddition;
    }

    public void setRecentMenuAddition(Boolean recentMenuAddition) {
        isRecentMenuAddition = recentMenuAddition;
    }

    public String getDateAddedToMenu() {
        return dateAddedToMenu;
    }

    public void setDateAddedToMenu(String dateAddedToMenu) {
        this.dateAddedToMenu = dateAddedToMenu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return  Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, category, isRecentMenuAddition, dateAddedToMenu);
    }

    @Override
    public String toString() {
        return  "Name: " + name + "\n" +
                "Price: $" + price + "\n" +
                "Description: " + description + "\n" +
                "Category: " + category + "\n" +
                "isRecentMenuAddition: " + isRecentMenuAddition + "\n" +
                "Date Added to Menu: " + dateAddedToMenu + "\n";
    }
}
