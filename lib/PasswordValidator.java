package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบความยากง่ายของรหัสที่userตั้ง
     * @param password ที่userใส่เข้ามา
     * @return ความยากง่ายของpasswordที่userตั้ง (INVALID=ไม่ถูกต้อง,WEAK=ง่าย,MEDIUM=ปานกลาง, STRONG=ยาก)
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 

        if (password==null || password.length()<8) 
          return PasswordStrength.INVALID;
        
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean haspacial = password.matches("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?`~]+");
        for(char c : password.toCharArray()){
          if (Character.isLowerCase(c)) {
            hasLower = true;
          }else if (Character.isUpperCase(c)) {
            hasUpper = true;
          }         
        }
        if (hasLower && !hasUpper) { return PasswordStrength.WEAK;}
        if (hasLower && hasUpper) { return PasswordStrength.MEDIUM;}
        if ((hasLower && hasUpper)&haspacial) {return PasswordStrength.STRONG;}
        return PasswordStrength.INVALID;
    }
}