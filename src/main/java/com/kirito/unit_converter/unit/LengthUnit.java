package com.kirito.unit_converter.unit;

public enum LengthUnit implements Unit{
    MM("Millimeter", 1.0),
    CM("Centimeter", 10.0),
    M("Meter", 1000.0),
    KM("Kilometer", 1000000.0),
    INCH("Inch", 25.4),
    FOOT("Foot", 304.8),
    YARD("Yard", 914.4),
    MILE("Mile", 1609344.0);

    private final String name;
    private final Double factor;

    LengthUnit(String name, Double factor) {
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
