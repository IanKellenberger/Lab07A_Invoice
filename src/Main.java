public class Main {
    public static void main(String[] args) {
        // Create products
        Product toaster = new Product("Toaster", 29.95);
        Product hairDryer = new Product("Hair Dryer", 24.95);
        Product carVacuum = new Product("Car Vacuum", 19.99);

        // Create line items
        LineItem lineItem1 = new LineItem(toaster, 3);
        LineItem lineItem2 = new LineItem(hairDryer, 1);
        LineItem lineItem3 = new LineItem(carVacuum, 2);

        // Create invoice and add line items
        Invoice invoice = new Invoice("123 Main St, Anytown, USA");
        invoice.addLineItem(lineItem1);
        invoice.addLineItem(lineItem2);
        invoice.addLineItem(lineItem3);

        // Print the invoice
        invoice.printInvoice();
    }
}
