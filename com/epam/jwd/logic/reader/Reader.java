package com.epam.jwd.logic.reader;

import com.epam.jwd.entity.FamilyMobileTariff;
import com.epam.jwd.entity.HomeTariff;
import com.epam.jwd.entity.MobileTariff;
import com.epam.jwd.entity.Tariff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to simulate reading data from a file. Methods of the class must return ready-to-use data.
 */
public class Reader {

    public List<Tariff> getListOfTariffs() {
        List<Tariff> list = new ArrayList<>();
        list.add(new HomeTariff("Solo", BigDecimal.valueOf(7.90), 1145));
        list.add(new HomeTariff("Standard", BigDecimal.valueOf(17.90), 685));
        list.add(new HomeTariff("Super", BigDecimal.valueOf(29.90), 352));
        list.add(new MobileTariff("Unlimited", BigDecimal.valueOf(27.18), 1782));
        list.add(new MobileTariff("Comfort", BigDecimal.valueOf(14.52), 5934));
        list.add(new MobileTariff("Start", BigDecimal.valueOf(9.90), 10350));
        list.add(new FamilyMobileTariff("Family", BigDecimal.valueOf(22.81), 156));
        list.add(new FamilyMobileTariff("Big Family", BigDecimal.valueOf(30.46), 103));
        return list;
    }
}
