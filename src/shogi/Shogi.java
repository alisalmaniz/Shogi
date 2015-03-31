/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi;

/**
 *
 * @author Ali salmani
 */
public class Shogi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Board board = new Board();
        board.firstData();
        board.test();
        
        Man man = new Man();
        B b =new B();
        b.move1Right();
        
        
        
        
    }
    
}
