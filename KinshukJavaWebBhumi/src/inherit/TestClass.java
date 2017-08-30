/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author web-bhumi
 */
public class TestClass {
    public static void main(String[] args) {
    PlayerPiece pp = new PlayerPiece();
    TilePiece tp = new TilePiece();
        doShapes(tp);
        doShapes(pp);
    }
    
    static void doShapes(GameShape gs)
    {
        gs.displayShape();
    }
}
