/*import javax.validation.constraints.NotBlank;*/
package org.launchcode.feelapp.models;

public class Profile {


    private String name;

    public Profile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;

    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private Integer weight;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private Integer dateOfBirth;

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    private String mood;

    public Integer getDailyWaterIntake() {
        return dailyWaterIntake;
    }

    public void setDailyWaterIntake(Integer dailyWaterIntake) {
        this.dailyWaterIntake = dailyWaterIntake;
    }

    private Integer dailyWaterIntake;

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    private String activityLevel;

    public String getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(String energyLevel) {
        this.energyLevel = energyLevel;
    }

    private String energyLevel;

    public String getEmotionalGoals() {
        return emotionalGoals;
    }

    public void setEmotionalGoals(String emotionalGoals) {
        this.emotionalGoals = emotionalGoals;
    }

    private String emotionalGoals;

    public String getLifeImprovement() {
        return lifeImprovement;
    }

    public void setLifeImprovement(String lifeImprovement) {
        this.lifeImprovement = lifeImprovement;
    }

    private String lifeImprovement;

    public String getSecretGoal() {
        return secretGoal;
    }

    public void setSecretGoal(String secretGoal) {
        this.secretGoal = secretGoal;
    }

    private String secretGoal;

}
