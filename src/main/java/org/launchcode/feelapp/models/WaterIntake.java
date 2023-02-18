package org.launchcode.feelapp.models;

public class WaterIntake {

    private double weight;
    private double dailyActivityTime;

    public WaterIntake(double weight, double dailyActivityTime) {
        this.weight = weight;
        this.dailyActivityTime = dailyActivityTime;
    }

    public WaterIntake() {

    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDailyActivityTime() {
        return dailyActivityTime;
    }

    public void setDailyActivityTime(double dailyActivityTime) {
        this.dailyActivityTime = dailyActivityTime;
    }

    ```
    public String getWaterNeeds(){
        double waterNeeds = this.weight * .5;
        double waterNeedsWithExercise = ((this.dailyActivityTime/30)*12) + waterNeeds;
        return "Your recommended daily water intake is " + waterNeedsWithExercise + "oz";

    }
}
```

