/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheri;

/**
 *
 * @author web-bhumi
 */
class Kinshuk
{
    void showMe()
    {
        System.out.println("inheri.Kinshuk.showMe()");
    }
    private void showMeIfYouCan()
    {
        System.out.println("inheri.Kinshuk.showMeIfYouCan()");
    }
}



public class NewClass extends Kinshuk {
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.showMe();
        Kinshuk k = new Kinshuk();
        k.showMe();
    }
}
