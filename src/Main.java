
public class Main {
    public static void main(String[] args) {
        double metres = 1.87;// рост
        double kg = 98; // вес

        BmiService service = new BmiService();
        double bmi = service.calculate(metres, kg); // Индекс массы тела
        System.out.println((int) bmi);
    }
}