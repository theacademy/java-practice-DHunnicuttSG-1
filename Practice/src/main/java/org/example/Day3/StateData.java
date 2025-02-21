package org.example.Day3;

public class StateData {
    String stateName;
    String stateCapital;
    float population;
    float area;

    public StateData(String stateName, String stateCapital, float population, float area) {
        this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.population = population;
        this.area = area;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateCapital() {
        return stateCapital;
    }

    public void setStateCapital(String stateCapital) {
        this.stateCapital = stateCapital;
    }

    public float getPopulation() {
        return population;
    }

    public void setPopulation(float population) {
        this.population = population;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
