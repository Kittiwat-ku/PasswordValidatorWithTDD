package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "1234";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed : Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED :Expected INVALID but got " + result1);
        }
        // Test Case 2 :รหัสผ่านว่างเปล่า INVALID
        pw = " ";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.INVALID) {
            System.out.println("Test Case 2 : "+pw+" : Passed : Empty password is INVALID.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED :Expected INVALID but got " + result2);
        }
        // Test case 3: รหัสผ่านทั้งหมดเป็นเล็กจะเป็นweak
        pw = "abcdefghij";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 : "+pw+" : Passed : All lowercase password is WEAK.");
        }else {
            System.out.println("Test Case 3 : "+pw+" : FAILED : Expected WEAK but got "+ result3);
        }
        // Test case 4 : รหัสผ่านเป็น null INVALID
        pw = null;
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 5 : "+pw+" : Passed : Short password is INVALID.");
        } else {
            System.out.println("Test Case 5 : "+pw+" : FAILED :Expected INVALID but got " + result5);
        }
        //Test case 5 : รหัสมีทั้งตัวเล็กและตัวใหญ่
        pw = "YoWattttsup";
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6 : "+pw+" : Passed : password in contain Upper and Lower is Medium.");
        } else {
            System.out.println("Test Case 6 : "+pw+" : FAILED :Expected Mediem but got " + result6);
        }
        //Test case 6 : มีตัวเล็กและใหญ่ และ อักษรพิเศษ
        pw = "YoWattttsup@@@";
        PasswordStrength result7 = PasswordValidator.validate(pw);
        if (result7 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 7 : "+pw+" : Passed : Password cotain Upper and Lower with spacial char.");
        } else {
            System.out.println("Test Case 7 : "+pw+" : FAILED :Expected Strong but got " + result7);
        }




        System.out.println("--------------------------------");
    }
}
