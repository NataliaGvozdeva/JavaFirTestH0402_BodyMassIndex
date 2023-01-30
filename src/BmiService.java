public class BmiService {

    public double calculate(double height, double weight) {

        double bmi = weight * 10000 / (height * height);
        return bmi;

    }
}
