package Assignment_lambdaexpression;

import java.util.*;
import java.util.stream.*;

class Invoice {
    private String transactionId;

    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice generated for Transaction ID: " + transactionId;
    }
}

public class Invoiceobjectcreation {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList(
            "TXN1001",
            "TXN1002",
            "TXN1003",
            "TXN1004"
        );

        System.out.println("Generated Invoices:\n");

        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)  
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}


