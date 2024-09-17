//package org.launchcode;
//import java.util.ArrayList;
//import java.util.Date;
//public class Menu {
//    private ArrayList<MenuItem> menuItemList;
//    private Date lastUpdated;
//    public Menu(ArrayList<MenuItem> menuItemList, Date lastUpdated) {
//        this.menuItemList = menuItemList;
//        this.lastUpdated = lastUpdated;
//    }
//    public ArrayList<MenuItem> getMenuItemList() { return menuItemList;
//    }
//    public void setMenuItemList(ArrayList<MenuItem> menuItemList) {
//        this.menuItemList = menuItemList;
//    }
//    public Date getLastUpdated() { return lastUpdated;
//    }
//    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated;}
//    public void updateMenu(MenuItem item, Date date) {
//        if (item.isNew()){
//            item.setNew(false);
//            this.menuItemList.add(item);
//            this.lastUpdated = date;
//        }
//    }
//}
//



package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem newItem){
        if(!items.contains(newItem)) {
            items.add(newItem);
            setLastUpdated(new Date());
        }else {
            System.out.println("DUPLICATE FOOD " + newItem.getDescription());
        }
    }

    public void removeItem(MenuItem oldItem){
        items.remove(oldItem);
    }
    public String printSingleFood(MenuItem item){
        return item.toString();
    }
    public String printFullMenu(){
        String result ="";
        for( MenuItem item : items){
            result += "\n" + item.toString();
        }
        return result;
    }
}