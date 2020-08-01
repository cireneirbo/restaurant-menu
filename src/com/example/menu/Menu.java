package com.example.menu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date menuLastUpdated;
    private ArrayList<Object> menuList;

    public Menu(Date menuLastUpdated, ArrayList<Object> menuList) {
        this.menuLastUpdated = menuLastUpdated;
        this.menuList = menuList;
    }

    //ArrayList<Object> menuList = new ArrayList<>();

    public Date getMenuLastUpdated() {
        return menuLastUpdated;
    }

    public void setMenuLastUpdated(Date menuLastUpdated) {
        this.menuLastUpdated = menuLastUpdated;
    }

    public ArrayList<Object> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Object> menuList) {
        this.menuList = menuList;
    }

    public void addMenuItem(Object menuItem) {
        menuList.add(menuItem);
    }

    public String menuPrint() {
        String output = "";
        for(Object obj : menuList) {
            output += obj + "\n";
        }
        return output;
    }

}
