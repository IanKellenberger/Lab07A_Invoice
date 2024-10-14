import java.util.ArrayList;

public class Invoice {
    private String customerAddress;
    private ArrayList<LineItem> lineItems;

    public Invoice(String customerAddress) {
        this.customerAddress = customerAddress;
        this.lineItems = new ArrayList<>();
    }

    public void addLineItem(LineItem item) {
        lineItems.add(item);
    }

    public double getTotalAmountDue() {
        double total = 0;
        for (LineItem item : lineItems) {
            total += item.getTotal();
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("----- Customer Invoice -----");
        System.out.println("Address: " + customerAddress);
        System.out.println("----------------------------");
        for (LineItem item : lineItems) {
            System.out.println(item);
        }
        System.out.println("----------------------------");
        System.out.println("Total Amount Due: $" + getTotalAmountDue());
    }
}
