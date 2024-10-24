package com.kirito.unit_converter.Strategy;

import com.kirito.unit_converter.unit.Unit;

public interface ConversionStrategy {
    double convert(double value, Unit sourceUnit, Unit targetUnit);
}
