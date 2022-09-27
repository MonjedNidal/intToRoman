import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(intToRoman(100));
    }

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        if (num >= 1000) {
            if (num == 1000){
                result.append("M");
            }else{
                int thousandsDigit = num / 1000;
                for (int i = 1; i <= thousandsDigit; i++) {
                    result.append("M");
                }
            }
        }
        if (num >= 100) {
            if(num == 100){
                result.append("C");
            }else if (num == 500){
                result.append("D");
            }else{
            int hundredsDigit = (num / 100) % 10;
            if (hundredsDigit >= 5){
                if (hundredsDigit == 9){
                    result.append("CM");
                }else {
                    result.append("D");
                    hundredsDigit = hundredsDigit - 5;
                    if (hundredsDigit > 0){
                        for (int i = 1; i <= hundredsDigit; i++) {
                            result.append("C");
                        }
                    }
                }
            }else{
                if (hundredsDigit == 4){
                    result.append("CD");
                }else{
                    for (int i = 1; i <= hundredsDigit; i++) {
                        result.append("C");
                    }
                }
            }
            }
        }if (num >= 10){
            if (num == 10){
                result.append("X");
            }else{
            int tensDigit = (num%100)/10;
            if (tensDigit >= 5){
                if (tensDigit == 9){
                    result.append("XC");
                }else {
                    result.append("L");
                    tensDigit -= 5;
                    if (tensDigit > 0){
                        for (int i = 1; i <= tensDigit; i++) {
                            result.append("X");
                        }
                    }
                }
            }else{
                if (tensDigit == 4){
                    result.append("XL");
                }else {
                    for (int i = 1; i <= tensDigit; i++) {
                        result.append("X");
                    }
                }
            }
        }}if(num > 0){
            int onesDigit = (num%100)%10;
            if (onesDigit >= 5){
                if (onesDigit == 9){
                    result.append("IX");
                }else{
                    result.append("V");
                    onesDigit -= 5;
                    if (onesDigit > 0){
                        for (int i = 1; i <= onesDigit; i++) {
                            result.append("I");
                        }
                    }
                }
            }else{
                if (onesDigit == 4){
                    result.append("IV");
                }else {
                    for (int i = 1; i <= onesDigit; i++) {
                        result.append("I");
                    }
                }

            }
        }
        return result.toString();
    }
}



