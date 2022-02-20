package com.epam.jwd.logic.writer;

import com.epam.jwd.entity.Tariff;

import java.util.List;

/**
 * A class for the convenience of generating and displaying messages to the console.
 */
public class Writer {

    private final static String NUMBER_OF_CLIENTS = "Number of clients";
    private final static String LIST_OF_TARIFFS = "List of tariffs";
    private final static String TARIFFS_WITH_PRICE_RANGE = "Tariffs with a price from ";
    private final static String TO = " to ";
    private final static String COLON = ": ";

    public static void printNumberOfClients(int numberOfClients) {
        StringBuilder builder = new StringBuilder(NUMBER_OF_CLIENTS)
                .append(COLON)
                .append(numberOfClients);
        System.out.println(builder);
    }

    public static void printTariffsWithPriceRange(List<Tariff> list, double minPrice, double maxPrice) {
        StringBuilder builder = new StringBuilder(TARIFFS_WITH_PRICE_RANGE)
                .append(minPrice)
                .append(TO)
                .append(maxPrice)
                .append(COLON);
        System.out.println(builder);
        for (Tariff tariff : list) {
            System.out.println(tariff);
        }
    }

    public static void printListOfTariffs(List<Tariff> list) {
        StringBuilder builder = new StringBuilder(LIST_OF_TARIFFS).append(COLON);
        System.out.println(builder);
        for (Tariff tariff : list) {
            System.out.println(tariff);
        }
    }
}
