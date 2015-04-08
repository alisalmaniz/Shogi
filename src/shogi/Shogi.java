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
        
        Board board1 = new Board();
        board1.firstData();
        board1.print();
        Man man = new Man();
        man.setBoardList();


        for(int cun=0; ;cun++){
            
            man.win();
            man.equal();
            man.isBoardListEqual(cun);
            board1.showMenu();
            board1.operator();
            board1.print();
            
            
        }
        
        
        
        //board1.operator(  board1.showMenu()  );
        
        
    }
    
}
