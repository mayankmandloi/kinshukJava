
package inheri.pack2;

import inheri.pack1.NewClassPack1;

public class NewClassPack2 extends NewClassPack1{
    public static void main(String[] args) {
       NewClassPack2 ncp2 = new NewClassPack2();
       ncp2.showMe();
       ncp2.showMeAlso();
     }
    
    
    
    public void showMe()
    {
        System.out.println("inheri.pack2.NewClassPack2.showMe()");
    }
   
}
