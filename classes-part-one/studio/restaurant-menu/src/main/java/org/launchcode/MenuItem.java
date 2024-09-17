//package org.launchcode;
//import java.util.Arrays;
//import java.util.List;
//public class MenuItem {
//    private double price;
//    private String description;
//    private String category;
//    private boolean isNew;
//    public MenuItem(String category, double price, String description) {
//        this.category = category;
//        this.price = price;
//        this.description = description;
//        this.isNew = true;
//    }
//    public double getPrice() { return price; }
//    public String getDescription() {
//        return description;
//    }
//    public String getCategory() {
//        return category;
//    }
//    public boolean isNew() {
//        return isNew;
//    }
//    public void setPrice(double price) {
//        this.price = price;
//    }
//    public void setCategory(String category) {
//        this.category = category;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//    public void setNew(boolean aNew) {
//        isNew = aNew;
//    }
//    public void categoryValidation(MenuItem item) {
//        List<String> categories = Arrays.asList("appetizer", "main course", "dessert");
//        if (categories.contains(item.getCategory())) {
//            setCategory(item.category);
//        } else {
//            System.out.println("Please enter a valid category type");
//        }
//    }
//    public void priceValidation(MenuItem item) {
//        if (item.price >= 0) {
//            setPrice(item.price);
//        } else {
//            System.out.println("Please enter a valid price");
//        }
//    }
//}
//
//


package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    @Override
    public String toString(){
        String result = category + ":" + description + " | Price: "+ price;
        if(isNew){
            result += " |NEW DISH| ";
        }
        return result;
    }
}






