public class Main {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();
        double height = 173;
        double weight = 82;
        double bmi = bmiService.calculate(height, weight);

        System.out.printf("Индекс массы тела: %.2f", bmi);

    }
}
