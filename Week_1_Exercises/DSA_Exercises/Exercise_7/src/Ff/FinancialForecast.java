package Ff;

public class FinancialForecast {

    public static void main(String[] args) {
        double currentValue = 1000.0; 
        double growthRate = 0.05; 
        int years = 10; 

        double futureValue = calculateFutureValue(currentValue, growthRate, years);
        System.out.println("Future Value: " + futureValue);
    }

    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}

