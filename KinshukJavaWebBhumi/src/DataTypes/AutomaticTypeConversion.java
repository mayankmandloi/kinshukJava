/*
 The following promations will be performed automaticly

byte->short
char->int
short->int
int->long
long->float
float->double

 */
package DataTypes;

/**
 *
 * @author web-bhumi
 */
public class AutomaticTypeConversion {
  
    public static void main(String[] args) {
        byte b1=127;
        char c1='A';
        short s1=b1;
        int i1=s1;
        int i2=c1;
        System.out.println(i2);
        long L1=9223372036854775807L;
        float f1=L1;
        double d1=f1;
        System.out.println(d1);
    }
}
