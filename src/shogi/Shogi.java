/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi;

import static shogi.Board.board;


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
        Man man = new Man();
        Board board1 = new Board();
        board1.firstData();
        board1.print();
        
        man.setBoardList();


        for(int cunt=0; ;cunt++){
            
            man.win();
            man.equal();
            man.isBoardListEqual(cunt);
            board1.showMenu();
            board1.operator();
            System.out.println("");
            board1.print();
            
            
        }
        
        
        
        //board1.operator(  board1.showMenu()  );
        
        
    }
    
}
