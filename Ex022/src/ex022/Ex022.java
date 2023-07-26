
package ex022;


public class Ex022 {


    public static void main(String[] args) {
        
        Invoice inv = new Invoice(1, "mouseped", 10, 50.0f);
        
        System.out.println("valor total = " + inv.getInvoiceAmount());
        
    }
    
}
