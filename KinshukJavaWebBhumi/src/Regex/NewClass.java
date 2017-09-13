/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author web-bhumi
 */
public class NewClass {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z0-9]+[@][a-z]+[.](com|in|org|net|gov)");
        Pattern wb = Pattern.compile("^[a-z][a-z0-9]*[@][webbhumi.com]+");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your email id");
        String inp = s.nextLine();
        Matcher m = wb.matcher(inp);
        if(m.matches())
        {
            System.out.println("Thank you");
        }
        else
        {
            System.out.println("Sorry wrong email id");
        }
    }
}
/*
kinshuk 98989898989 28/11/1992
*/