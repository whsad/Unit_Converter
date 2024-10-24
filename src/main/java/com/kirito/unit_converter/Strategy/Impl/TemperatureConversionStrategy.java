package com.kirito.unit_converter.Strategy.Impl;


import com.kirito.unit_converter.Strategy.ConversionStrategy;
import com.kirito.unit_converter.unit.TemperatureUnit;
import com.kirito.unit_converter.unit.Unit;

public class TemperatureConversionStrategy implements ConversionStrategy {
    @Override
    public double convert(double value, Unit sourceUnit, Unit targetUnit) {
        TemperatureUnit source = (TemperatureUnit) sourceUnit;
        TemperatureUnit target = (TemperatureUnit) targetUnit;

        double valueInCelsius = (value - source.getBias()) / source.getFactor();
        return (valueInCelsius * target.getFactor()) + target.getBias();
    }
}
