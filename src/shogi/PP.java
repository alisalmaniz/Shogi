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
public class PP extends Man{
    
    
    public static String[] move( String p){
        
        int change3=0;
        change[0]="-1";
        change[1]="-1";
        change[2]="-1";
        change[3]="0";
        
        if(board[i][j].charAt(1)=='1')
            if(i+1<9 && (board[i+1][j].equals("----") || board[i+1][j].charAt(1)=='2' || board[i+1][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+1)+j);
                change[1]=board[i+1][j];
                change3++;
            }
        else
            if(i-1>=0 && (board[i-1][j].equals("----") || board[i-1][j].charAt(1)=='1' || board[i-1][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-1)+j);
                change[1]=board[i-1][j];
                change3++;
            }
                
        change[3]=String.valueOf(change3);
        return change;
    }
    
}
