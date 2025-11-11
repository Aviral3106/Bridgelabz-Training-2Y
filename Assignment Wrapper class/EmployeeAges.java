import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {25, 32, 45, 29, 38};

        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age); // Auto-boxing
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest Employee Age: " + youngest);
        System.out.println("Oldest Employee Age: " + oldest);
    }
}
