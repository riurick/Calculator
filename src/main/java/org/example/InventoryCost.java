package org.example;

import java.math.BigDecimal;

public class InventoryCost {
    public String item;
    public Integer quantity;
    public BigDecimal cost;

    public InventoryCost() {
    }

    public InventoryCost(String item, Integer quantity, BigDecimal cost) {
        this.item = item;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
