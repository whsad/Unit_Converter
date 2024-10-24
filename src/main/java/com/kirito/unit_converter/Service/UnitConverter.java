package com.kirito.unit_converter.Service;

import com.kirito.unit_converter.Strategy.ConversionStrategy;
import com.kirito.unit_converter.Strategy.Impl.LengthConversionStrategy;
import com.kirito.unit_converter.Strategy.Impl.TemperatureConversionStrategy;
import com.kirito.unit_converter.Strategy.Impl.WeightConversionStrategy;
import com.kirito.unit_converter.unit.LengthUnit;
import com.kirito.unit_converter.unit.TemperatureUnit;
import com.kirito.unit_converter.unit.Unit;
import com.kirito.unit_converter.unit.WeightUnit;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UnitConverter {

    private static final String LENGTH = "length";
    private static final String WEIGHT = "weight";
    private static final String TEMPERATURE = "temperature";
    private ConversionStrategy strategy;

    public void setStrategy(String type) {
        switch (type.toLowerCase()) {
            case LENGTH:
                this.strategy = new LengthConversionStrategy();
                break;
            case WEIGHT:
                this.strategy = new WeightConversionStrategy();
                break;
            case TEMPERATURE:
                this.strategy = new TemperatureConversionStrategy();
                break;
            default:
                throw new IllegalArgumentException("Invalid conversion type: " + type);
        }
    }

    public Double convert(Double value, Unit sourceUnit, Unit targetUnit){
        return strategy.convert(value, sourceUnit, targetUnit);
    }

    public static List<Unit> getUnitValues(String type) {
        switch (type.toLowerCase()) {
            case LENGTH:
                return Arrays.asList(LengthUnit.values());
            case WEIGHT:
                return Arrays.asList(WeightUnit.values());
            case TEMPERATURE:
                return Arrays.asList(TemperatureUnit.values());
            default:
                throw new IllegalArgumentException("Invalid unit type: " + type);
        }
    }
}
