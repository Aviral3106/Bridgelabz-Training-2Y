package Assignment_6.lvl3;
import java.util.HashSet;

public class OTPgenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Math.random() returns value between 0.0 and 1.0
        // multiply by 900000 and add 100000 → ensures 6-digit OTP (100000 - 999999)
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check uniqueness of OTPs
    public static boolean areUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) {
                // Duplicate found
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Validate uniqueness
        if (areUnique(otps)) {
            System.out.println("✅ All OTPs are unique.");
        } else {
            System.out.println("❌ Duplicate OTPs found.");
        }
    }
}

