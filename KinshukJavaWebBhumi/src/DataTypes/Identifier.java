    /*
A name in java is called identifier for example name of a class or a method(function) or of a variable
rules to define an identifier are:-
1) It can contain alphabets small(a to z) or capital (A to Z) numbers(0 to 9) and only two special 
symbol $ (doller) and _(underscore)

2) Reserved(keywords) words can not be used as identifier

3) An identifier can not start with numbers
*/
package DataTypes;

/**
 *
 * @author web-bhumi
 */
public class Identifier {
 
    


    public static void main(String[] args) {
//----------------Rules--------------
// Below are all valid indentifiers 
        
        int $$$=2;
        System.out.println($$$);
        int __________ = 5;
        System.out.println(__________);
        int GhYhg10=10;
        System.out.println(GhYhg10);
        int $23 = 3;
        System.out.println($23);

// Below are all invalid indentifiers 
//      int while;          a keyword
//      int hello world;    space is not allowed
//      int 34abc;          starts with a number 
//      int java@id;        contains a invalid symbol
//----------------------------------              
        int String =10;
        System.out.print(String); // it a valid identifies
        System.out.println("  String is predefind class name it can be used as a identifier but it is not recommend ");
        
//
    }
    
}
