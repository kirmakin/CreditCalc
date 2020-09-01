public class CreditPaymentService {

    public double calculate(double credit, double percent, int months) {

        double mp = percent / 12 / 100; // месячная ставка
        int payment = (int) ((mp * Math.pow(1 + mp, months)) / (Math.pow(1 + mp, months) - 1) * credit);
        return payment;

    }
}