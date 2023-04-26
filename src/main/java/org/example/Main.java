package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<InventoryCost> list = new ArrayList<>();
        list.add(new InventoryCost("Memory 64Gb", 10, BigDecimal.valueOf(10.00d)));
        list.add(new InventoryCost("Chipset RX2321", 20, new BigDecimal(20.00d)));
        list.add(new InventoryCost("Memory 64Gb", 50, new BigDecimal(15.00d)));
        list.add(new InventoryCost("Display DS21344", 100, new BigDecimal(12.00d)));
        list.add(new InventoryCost("Chipset RX2321", 80, new BigDecimal(25.00d)));

        Map<String, BigDecimal> result = AverageCostCalculator.calculate(list);

        System.out.println(result.toString());

    }
}