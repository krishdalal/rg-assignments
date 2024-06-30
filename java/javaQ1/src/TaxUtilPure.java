public class TaxUtilPure {
    private final double rate = 0.15;

    public double calculateTax(double amount) {
        return amount * rate;
    }
}
