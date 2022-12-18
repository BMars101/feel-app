/*import javax.validation.constraints.NotBlank;*/
package org.launchcode.feelapp.models;

import javax.persistence.Entity;

@Entity
public class Profile extends AbstractEntity{


    private String name;
    private Integer weight;
    private Integer age;
    private Integer dateOfBirth;
    private String activityLevel;
    private String energyLevel;
    private String emotionalGoals;
    private String lifeImprovement;
    private String secretGoal;



    public Profile(String name) {
        this.name = name;
    }
    public Profile() {}
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



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }



    public String getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(String energyLevel) {
        this.energyLevel = energyLevel;
    }



    public String getEmotionalGoals() {
        return emotionalGoals;
    }

    public void setEmotionalGoals(String emotionalGoals) {
        this.emotionalGoals = emotionalGoals;
    }



    public String getLifeImprovement() {
        return lifeImprovement;
    }

    public void setLifeImprovement(String lifeImprovement) {
        this.lifeImprovement = lifeImprovement;
    }



    public String getSecretGoal() {
        return secretGoal;
    }

    public void setSecretGoal(String secretGoal) {
        this.secretGoal = secretGoal;
    }



}
