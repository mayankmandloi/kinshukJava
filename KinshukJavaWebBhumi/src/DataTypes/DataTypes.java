/*
There are eight primitive datatypes supported by Java.
Primitive datatypes are predefined by the language and named by a keyword

Primitive Data Types
1)Numeric Data Type
2)Character Data Type
3)Boolean Data Type

1)Numeric Data Type can be further classified into Integral Datatype and Floating point Datatype

    i)Integral type uses to represent whole numbers
        	a)byte		1byte
                b)short		2bytes
        	c)int		4bytes
        	d)long		8bytes

    ii)Floating point type used to represent point values
        	a)float		4bytes
        	b)double	8bytes 

2) Character Data type 
                a) char         2bytes

3)Boolean Data type
                a) boolean      N/A
*/
package DataTypes;

/**
 *
 * @author web-bhumi
 */
public class DataTypes {
        public static void main(String[] args) {
        byte by=127; //range -128 to + 127 
        System.out.println(by);
        short sh = 32767; // range -(2^15) to +(2^15) -1
        System.out.println(sh);
        int in=214748364;// range -(2^31) to +(2^31) -1
        System.out.println(in);
        long lo = 9223372036854775807L;// range -(2^63) to +(2^63) -1
        System.out.println(lo);
        
        
        float f=3.4028235E38F;//max value
        System.out.println(f);
        double d=1.7976931348623157E308;//max value
        System.out.println(d);
        float f1=1.4E-45F; //max precision
        System.out.println(f1);
        double d1=4.9E-324;//max precision
        System.out.println(d1);
        
        
        
        char c = 'c';
        System.out.println(c);
        
        
        
        boolean bt = true;
        boolean bf=false;
        System.out.println(bt);
        }
}
