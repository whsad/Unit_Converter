package com.kirito.unit_converter.Strategy.Impl;

import com.kirito.unit_converter.Strategy.ConversionStrategy;
import com.kirito.unit_converter.unit.Unit;
import com.kirito.unit_converter.unit.WeightUnit;


public class WeightConversionStrategy implements ConversionStrategy {

    @Override
    public double convert(double value, Unit sourceUnit, Unit targetUnit) {
        double sourceFactor = sourceUnit.getFactor();
        double targetFactor = targetUnit.getFactor();
        return (value * sourceFactor) / targetFactor;
    }
}
