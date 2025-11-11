package Assignment_lambdaexpression;

import java.util.*;

public class Patientidprinting {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList(
            "PAT1001",
            "PAT1002",
            "PAT1003",
            "PAT1004",
            "PAT1005"
        );

        System.out.println("All Patient IDs for Verification:");

        patientIDs.forEach(System.out::println);
    }
}


