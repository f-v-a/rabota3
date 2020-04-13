package types;

import java.io.Serializable;

public class Tovar implements Serializable{
    private String name;
    private int kol;
    private int price;
    private String ingredient;
    private String recept;
    private String srok;

    public Tovar() {
        this.name = "";
        this.kol = 0;
        this.price = 0;
        this.ingredient = "";
        this.recept = "";
        this.srok = "";
    }

    public Tovar(String name, int kol, int price, String ingredient, String recept, String srok) {
        this.name = name;
        this.kol = kol;
        this.price = price;
        this.ingredient = ingredient;
        this.recept = recept;
        this.srok = srok;
    }

    public int getKol() {
        return kol;
    }
    public void setKol(int kol) {
        this.kol = kol;
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
        public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getRecept() {
        return recept;
    }

    public void setRecept(String recept) {
        this.recept = recept;
    }
    
    public String getSrok() {
        return srok;
    }

    public void setSrok(String srok) {
        this.srok = srok;
    }
}

