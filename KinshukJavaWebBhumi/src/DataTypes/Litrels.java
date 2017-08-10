    /*
A literal is any number, text, or other information that directly represents a value.


*/
package DataTypes;

/**
 *
 * @author web-bhumi
 */
public class Litrels {

public static void main(String[] args)  {

        
        System.out.println("Int type:"+12);
        System.out.println("Octal:"+014);
        System.out.println("HexaDecimal:"+0xA);
        System.out.println("Long type"+1256474464433434343L);



//All floating-point literals are considered of the double variable type 
//instead of float. To specify a literal of float, add the letter F (F or f)
//to the literal


        System.out.println("Double type:"+12.00);
        System.out.println("double type:"+12.0000);
        System.out.println("Float type:"+12.00000f);
        


//We can use exponents in floating-point literals by using the letter e or E
//followed by the exponent, which can be a negative number.
        System.out.println("with exponent "+12e22f);
        System.out.println("with exponent\t"+12e-22);
        System.out.println("with Exponent "+12E22);
        System.out.println("with Exponent\t"+12E-22);
        
        
        
        
//The Boolean values true and false also are literals.
//These are the only two values you can use when assigning a value to
//a boolean variable typeor using a Boolean in a statement in other ways.
        System.out.println(true);
        System.out.println(false);

        
        
//Character literals are expressed by a single character surrounded by single
//quotation marks, such as 'a', '#', and '3'.We familiar with the
//ASCII character Java supports thousands of additional characters through
//the 16-bit Unicode standard.
        System.out.print('a');
        System.out.print('b');
        System.out.print('#');
        System.out.print('3');
//char character can also be print by using 16bit Unicode standard by writing _ 
//backslah u than 4 digit Unicode.
        System.out.println('\b');
       

/*
        \t 	Inserts a tab in the text at this point.
        \b 	Inserts a backspace in the text at this point.
        \n 	Inserts a newline in the text at this point.
        \r 	Inserts a carriage return in the text at this point.
        \f 	Inserts a form feed in the text at this point.
        \' 	Inserts a single quote character in the text at this point.
        \" 	Inserts a double quote character in the text at this point.
        \\ 	Inserts a backslash character in the text at this point.
*/
 

    }
    
}

