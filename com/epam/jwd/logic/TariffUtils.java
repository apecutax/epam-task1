package com.epam.jwd.logic;

import com.epam.jwd.entity.Tariff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that provides methods that allow you to get additional information from the list of tariffs.
 */
public class TariffUtils {

    private final List<Tariff> listOfTariffs;

    /**
     * Initializes the class using a list of tariffs.
     * @param list - the list of tariffs that will be used by the methods of the class
     */
    public TariffUtils(List<Tariff> list) {
        this.listOfTariffs = new ArrayList<>(list);
    }

    /**
     * Returns the total number of clients on all tariffs.
     * @return the total number of clients on all tariffs
     */
    public int getNumberOfClients() {
        return listOfTariffs.stream().mapToInt(Tariff::getNumberOfClients).sum();
    }

    /**
     * Returns a list of tariffs whose price is not lower than min Price and not higher than maxPrice.
     * @param minPrice - the value of the minimum price
     * @param maxPrice - the value of the maximum price
     * @return a list of tariffs whose price is not lower than min Price and not higher than maxPrice
     */
    public List<Tariff> getTariffsByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        List<Tariff> list = new ArrayList<>();
        for (Tariff tariff : listOfTariffs) {
            if (tariff.getPrice().compareTo(minPrice) > 0
                    && tariff.getPrice().compareTo(maxPrice) < 0) {
                list.add(tariff);
            }
        }
        return list;
    }
}
