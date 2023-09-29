public class BmiService {
    public double calculate(double metres, double kg) { // рост, вес
        double bmi = kg / (metres * metres); // Формула расчёта индекса массы тела
        return (int) bmi;
    }
}
