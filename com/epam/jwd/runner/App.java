package com.epam.jwd.runner;

import com.epam.jwd.entity.Tariff;
import com.epam.jwd.logic.TariffUtils;
import com.epam.jwd.logic.writer.Writer;
import com.epam.jwd.logic.reader.Reader;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

public class App {

    private final static double MIN_PRICE_FOR_TEST = 15.0;
    private final static double MAX_PRICE_FOR_TEST = 20.0;

    public static void main(String[] args) {
        List<Tariff> listOfTariffs = new Reader().getListOfTariffs();
        TariffUtils tariffUtils = new TariffUtils(listOfTariffs);
        int numberOfClients = tariffUtils.getNumberOfClients();
        Writer.printNumberOfClients(numberOfClients);
        listOfTariffs.sort(Comparator.comparing(Tariff::getPrice));
        Writer.printListOfTariffs(listOfTariffs);
        List<Tariff> selectedTariffs = tariffUtils.getTariffsByPriceRange(BigDecimal.valueOf(MIN_PRICE_FOR_TEST),
                BigDecimal.valueOf(MAX_PRICE_FOR_TEST));
        Writer.printTariffsWithPriceRange(selectedTariffs, MIN_PRICE_FOR_TEST, MAX_PRICE_FOR_TEST);
    }
}
