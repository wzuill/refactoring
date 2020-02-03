package com.woodyzuill.refactor;

import java.math.BigDecimal;

public class Stock {
    private String symbol;
    private BigDecimal price;

    public Stock(){

    }

    public Stock(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
