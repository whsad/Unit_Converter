package com.kirito.unit_converter.controller;

import com.kirito.unit_converter.Service.UnitConverter;
import com.kirito.unit_converter.unit.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UnitConverterController {

    private static final String INDEX_VIEW = "index";
    private final UnitConverter unitConverter;

    @Autowired
    public UnitConverterController(UnitConverter unitConverter) {
        this.unitConverter = unitConverter;
    }

    @GetMapping("/home")
    public String homePage(@RequestParam(defaultValue = "length") String type,
                           Model model) {
        List<Unit> unitValues = UnitConverter.getUnitValues(type);

        model.addAttribute("view", "tab");
        model.addAttribute("type", type);
        model.addAttribute("units", unitValues);

        return INDEX_VIEW;
    }

    @PostMapping("/convert")
    public String convert(@RequestParam String type,
                          @RequestParam Double value,
                          @RequestParam Unit sourceUnit,
                          @RequestParam Unit destinationUnit,
                          Model model) {
        model.addAttribute("type", type);

        unitConverter.setStrategy(type);
        Double converted = unitConverter.convert(value, sourceUnit, destinationUnit);

        model.addAttribute("previous", value);
        model.addAttribute("converted", converted);
        model.addAttribute("sourceUnit", sourceUnit);
        model.addAttribute("destinationUnit", destinationUnit);
        model.addAttribute("view", "converted");

        return INDEX_VIEW;
    }

}
