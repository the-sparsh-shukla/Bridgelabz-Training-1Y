package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class MealPlanner<T extends MealPlanner.MealPlan> {
    static class MealPlan {
        String day;
        MealPlan(String day) { this.day = day; }
        public String toString() { return day; }
    }

    static class VeganPlan extends MealPlan {
        VeganPlan(String day) { super(day); }
    }

    private final List<T> plans = new ArrayList<>();

    void addPlan(T plan) { plans.add(plan); }

    public static void main(String[] args) {
        MealPlanner<VeganPlan> planner = new MealPlanner<>();
        planner.addPlan(new VeganPlan("Monday"));
        planner.addPlan(new VeganPlan("Tuesday"));
        System.out.println("Meal plans: " + planner.plans);
    }
}

