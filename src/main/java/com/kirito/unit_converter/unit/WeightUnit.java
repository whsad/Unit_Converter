package com.kirito.unit_converter.unit;

public enum WeightUnit implements Unit{
    MG("Milligram", 1.0),
    G("Gram", 1000.0),
    KG("Kilogram", 1000000.0),
    TON("Ton", 1000000000.0),
    OUNCE("Ounce", 28349.5),
    POUND("Pound", 453592.37);

    private final String name;
    private final Double factor;

    WeightUnit(String name, Double factor) {
        this.name = name;
        this.factor = factor;
    }

    public String getName() {
        return name;
    }

    public Double getFactor() {
        return factor;
    }

    @Override
    public Double getBias() {
        return null;
    }

}
