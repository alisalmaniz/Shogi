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
public class N extends Man{
    
    public static String[] move( String p){
        
        change[0]="-1";
        change[1]="-1";
        change[2]="-1";
        
        
        if(board[i][j].charAt(1)=='1'){
            if( !change[3].contains("a") && (i+2<9 && j-1>=0) && (board[i+2][j-1].equals("----") || board[i+2][j-1].charAt(1)=='2' || board[i+2][j-1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+2)+(j-1));
                change[1]=board[i+2][j-1];
                change[3].concat("a");
            }
            else if( !change[3].contains("b") && (i+2<9 && j+1<9) && (board[i+2][j+1].equals("----") || board[i+2][j+1].charAt(1)=='2' || board[i+2][j+1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+2)+(j+1));
                change[1]=board[i+2][j+1];
                change[3].concat("b");
            }
            else
                change[3].concat("*");
        }
        else{
            if( !change[3].contains("a") && (i-2>=0 && j-1>=0) && (board[i-2][j-1].equals("----") || board[i-2][j-1].charAt(1)=='1' || board[i-2][j-1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+2)+(j-1));
                change[1]=board[i-2][j-1];
                change[3].concat("a");
            }
            else if( !change[3].contains("b") && (i-2>=0 && j+1<9) && (board[i-2][j+1].equals("----") || board[i-2][j+1].charAt(1)=='1' || board[i-2][j+1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-2)+(j+1));
                change[1]=board[i-2][j+1];
                change[3].concat("b");
            }
            else
                change[3].concat("*");
        }
                
        return change;
    }
    
}
