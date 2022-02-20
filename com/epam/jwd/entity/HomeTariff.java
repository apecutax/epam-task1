package com.epam.jwd.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class HomeTariff extends Tariff {

    private int wiredDataLimit;
    private int maxSpeedLimit;
    private boolean internetTelevision;

    public HomeTariff(String name, BigDecimal price, int numberOfClients) {
        super(name, price, numberOfClients);
    }

    public int getWiredDataLimit() {
        return wiredDataLimit;
    }

    public void setWiredDataLimit(int wiredDataLimit) {
        this.wiredDataLimit = wiredDataLimit;
    }

    public int getMaxSpeedLimit() {
        return maxSpeedLimit;
    }

    public void setMaxSpeedLimit(int maxSpeedLimit) {
        this.maxSpeedLimit = maxSpeedLimit;
    }

    public boolean isInternetTelevision() {
        return internetTelevision;
    }

    public void setInternetTelevision(boolean internetTelevision) {
        this.internetTelevision = internetTelevision;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HomeTariff that = (HomeTariff) obj;
        return wiredDataLimit == that.wiredDataLimit
                && maxSpeedLimit == that.maxSpeedLimit
                && internetTelevision == that.internetTelevision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wiredDataLimit, maxSpeedLimit, internetTelevision);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tariff {");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", price=").append(getPrice());
        sb.append(", numberOfClients=").append(getNumberOfClients());
        sb.append('}');
        return sb.toString();
    }
}
