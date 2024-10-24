package com.kirito.unit_converter.converter;

import com.kirito.unit_converter.unit.LengthUnit;
import com.kirito.unit_converter.unit.TemperatureUnit;
import com.kirito.unit_converter.unit.Unit;
import com.kirito.unit_converter.unit.WeightUnit;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Stream;

@Component
public class StringToUnitConverter implements Converter<String, Unit> {

    @Override
    public Unit convert(String source) {
        String unitName = source.toUpperCase();

        return Stream.of(LengthUnit.values(), WeightUnit.values(), TemperatureUnit.values())
                .flatMap(Arrays::stream)
                .filter(unit -> unit.name().equalsIgnoreCase(unitName))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Invalid unit: " + source));
    }
}
