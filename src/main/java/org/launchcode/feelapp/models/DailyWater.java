package org.launchcode.feelapp.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class DailyWater extends AbstractEntity{

    @NotNull(message = "Make sure to put how much water you drank!")
    private double waterAmount;

    public DailyWater(double waterAmount){
        this.waterAmount = waterAmount;
    }

    public DailyWater() {}

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }
}
