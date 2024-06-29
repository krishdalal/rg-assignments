
public class Main {
    public static class TaxUtil {
        double rate = 0.15;

        public double calculateTax(double amount) {
            return amount * rate;
        }
    }

    public static class TaxUtilPure {
        private final double rate = 0.15;

        public double calculateTax(double amount) {
            return amount * rate;
        }
    }

    public static void main(String[] args) {
        TaxUtil o = new TaxUtil();
        double amount = 13;
        System.out.println("Using impure TaxUtil...");
        System.out.println("Tax for Amount "+ amount + " is : " + o.calculateTax(amount));
        o.rate = 0.30;
        System.out.println("Changed rate externally to 0.30");
        System.out.println("Tax for Amount "+ amount + " is : " + o.calculateTax(amount));

        System.out.println("   ");

        TaxUtilPure m = new TaxUtilPure();
        System.out.println("Using TaxUtilPure...");
        System.out.println("Tax for Amount "+ amount + " is : " + m.calculateTax(amount));

        System.out.println("Cannot change rate now, as it is private and final");
        System.out.println("Tax for Amount "+ amount + " is : " + m.calculateTax(amount));

    }
}