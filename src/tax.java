public class tax {
    public static void main (String[] args) {
       double pricePurchase = 28;
       double SALES_TAX = .05;
       double finalPrice= (SALES_TAX*pricePurchase) + pricePurchase;
        System.out.println("The item price is: $" + pricePurchase);
        System.out.println("The sales tax is: $" + SALES_TAX*pricePurchase);
        System.out.println("The final price is: $" + finalPrice);

    }
}
