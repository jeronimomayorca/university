

public class Patient {

    int patientId;
    String name;
    int age;
    int weight;
    int height;
    String preexistingConditions;

    }


public class Dietitian {

    int dietitianId;
    String name;
    String speciality;

}


public class DietPlan {

    int planId;
    int DailyCalories;
    int macronutrientDistribution;
    String specificRecommendations;
    
}

public class Meal{

    String name;
    int macronutrients;
    int calories;
    int timeOfDay;
    
}

