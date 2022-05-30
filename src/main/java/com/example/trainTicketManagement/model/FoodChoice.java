package com.example.trainTicketManagement.model;

public enum FoodChoice {
    VEGAN(1),
    VEGETARIAN(2),
    HALAL(3),
    KOSHER(4),
    NO_GLUTEN(5),
    NORMAL(6);

    private Integer number;
    FoodChoice(Integer number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
