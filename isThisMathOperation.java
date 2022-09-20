/* Write a function that takes three Integer numbers Number1, Number2, and Number3, and
determines if there is a mathematical operation that will make Number1 (operation) Number2
equal to Number3. If one or more of the 4 common mathematical operations (+,-,*,/) can
complete the function, return the String representation of the mathematical function. If none of
the 4 mathematical operations can make the statement true, return the String "None". */

import java.util.*;
import java.util.stream.*;
public class isThisMathOperation{
    public static String mathFunction(String numbers){
        String[] arrOfNum = numbers.split(",");
        int[] arrOfNumS = Stream.of(arrOfNum).mapToInt(Integer::parseInt).toArray();
        int ele1 = arrOfNumS[0];
        int ele2 = arrOfNumS[1];
        int ele3 = arrOfNumS[2];
        String operations = "";
        String[] common4 = {"+", "-", "*", "/"};
        for(int i = 0; i < common4.length; i++){
            if (common4[i] == "+"){
                if (ele1 + ele2 == ele3){
                    operations += "+";
                }
            }else if (common4[i] == "-"){
                if (ele1 - ele2 == ele3){
                    operations += "-";
                }
            }else if (common4[i] == "*"){
                if (ele1 * ele2 == ele3){
                    operations += "*";
                }
            }else if (common4[i] == "/"){
                if (ele1 / ele2 == ele3 && ele2 != 0){
                    operations += "/";
                }
            }
        }

        if(operations != ""){
            return operations;
        }else{
            return "None";
        }
    }

    public static void main(String[] args) {
        String number = "2,2,4";
        /*String number = "1,2,3";*/
        /*String number = "2,2,4";*/
        /*String number = "3,-3,-9";*/
        /*String number = "7,1,11";*/
        String result = mathFunction(number);
        System.out.println(result);
    }

}
