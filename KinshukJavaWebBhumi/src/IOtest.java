
//import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class IOtest {
    public static void main(String[] args) throws Exception{
               File fi = new File("input.txt");
               FileWriter fw = new FileWriter(fi, true);
               BufferedWriter bw = new BufferedWriter(fw);
               String inp="append";
while(inp.equals("append")) {

               Scanner f = new Scanner(System.in);
               String s = f.nextLine();
               s="\n"+s;
               bw.append(s);
               bw.flush();
               
               System.out.println("Enter append to continue anything else to exit");
               inp = f.nextLine();
} 
                bw.close();
               fw.close();
    }

} 
