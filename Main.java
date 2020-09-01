public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1000000;
        double percent = 9.99;
        int months = 36;
        int payment = (int) service.calculate(credit, percent, months);
        System.out.println(payment);
    }
}