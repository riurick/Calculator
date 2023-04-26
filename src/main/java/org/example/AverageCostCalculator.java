package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AverageCostCalculator {

    public static Map<String, BigDecimal> calculate(List<InventoryCost> inventoryCosts){
        Map<String, List<InventoryCost>>  map = new HashMap<>();
        Map<String, BigDecimal> response = new HashMap<>();
        for(InventoryCost inventoryCost: inventoryCosts) {
            if(!Optional.ofNullable(map.get(inventoryCost.getItem())).isPresent()) {
                map.put(inventoryCost.getItem(), inventoryCosts.stream()
                        .filter(inv -> inventoryCost.getItem().equals(inv.getItem())).collect(Collectors.toList()));
            }
        }
        for(String key: map.keySet()) {
            BigDecimal value = BigDecimal.ZERO;
            BigDecimal divider = BigDecimal.ZERO;
            for(InventoryCost inventoryCost: map.get(key)) {
                 value = value.add(inventoryCost.getCost().multiply(BigDecimal.valueOf(inventoryCost.getQuantity())));
                 divider = divider.add(BigDecimal.valueOf(inventoryCost.getQuantity()));
            }
            response.put(key, value.divide(divider, 2, BigDecimal.ROUND_UP));
        }
        return response;
    }
}
