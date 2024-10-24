package com.kirito.unit_converter.Strategy.Impl;

import com.kirito.unit_converter.Strategy.ConversionStrategy;
import com.kirito.unit_converter.unit.LengthUnit;
import com.kirito.unit_converter.unit.Unit;


public class LengthConversionStrategy implements ConversionStrategy {

    @Override
    public double convert(double value, Unit sourceUnit, Unit targetUnit) {
        double sourceFactor = sourceUnit.getFactor();
        double targetFactor = targetUnit.getFactor();
        return (value * sourceFactor) / targetFactor;
    }

}
