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
public class L extends Man{
    
    
        public static String[] move( String p){
        
        int change3=0;
        change[0]="-1";
        change[1]="-1";
        change[2]="-1";
        change[3]="0";

        if(board[i][j].charAt(1)=='1'){
            if(i+1<9 && (board[i+1][j].equals("----") || board[i+1][j].charAt(1)=='2' || board[i+1][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+1)+j);
                change[1]=board[i+1][j];
                change3++;
            }
            if((i+2<9 && board[i+1][j].equals("----")) && (board[i+2][j].equals("----") || board[i+2][j].charAt(1)=='2' || board[i+2][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+2)+j);
                change[1]=board[i+2][j];
                change3++;
            }
            if((i+3<9 && board[i+1][j].equals("----") &&  board[i+2][j].equals("----")) && (board[i+3][j].equals("----") || board[i+3][j].charAt(1)=='2' || board[i+3][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+3)+j);
                change[1]=board[i+3][j];
                change3++;
            }
            if((i+4<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----")) && (board[i+4][j].equals("----") || board[i+4][j].charAt(1)=='2' || board[i+4][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+4)+j);
                change[1]=board[i+4][j];
                change3++;
            }
            if((i+5<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----")) && (board[i+5][j].equals("----") || board[i+5][j].charAt(1)=='2' || board[i+5][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+5)+j);
                change[1]=board[i+5][j];
                change3++;
            }
            if((i+6<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") ) && (board[i+6][j].equals("----") || board[i+6][j].charAt(1)=='2' || board[i+6][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+6)+j);
                change[1]=board[i+6][j];
                change3++;
            }
            if((i+7<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") ) && (board[i+7][j].equals("----") || board[i+7][j].charAt(1)=='2' || board[i+7][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+7)+j);
                change[1]=board[i+7][j];
                change3++;
            }
            if((i+8<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") && board[i+7][j].equals("----") ) && (board[i+8][j].equals("----") || board[i+8][j].charAt(1)=='2' || board[i+8][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+8)+j);
                change[1]=board[i+8][j];
                change3++;
            }
            
        }
        else{
            if(i-1>=0 && (board[i-1][j].equals("----") || board[i-1][j].charAt(1)=='1' || board[i-1][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-1)+j);
                change[1]=board[i-1][j];
                change3++;
            }
            if((i-2>=0 && board[i-1][j].equals("----")) && (board[i-2][j].equals("----") || board[i-2][j].charAt(1)=='1' || board[i-2][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-2)+j);
                change[1]=board[i-2][j];
                change3++;
            }
            if((i-3>=0 && board[i-1][j].equals("----") &&  board[i-2][j].equals("----")) && (board[i-3][j].equals("----") || board[i-3][j].charAt(1)=='1' || board[i-3][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-3)+j);
                change[1]=board[i-3][j];
                change3++;
            }
            if((i-4>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----")) && (board[i-4][j].equals("----") || board[i-4][j].charAt(1)=='1' || board[i-4][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-4)+j);
                change[1]=board[i-4][j];
                change3++;
            }
            if((i-5>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----")) && (board[i-5][j].equals("----") || board[i-5][j].charAt(1)=='1' || board[i-5][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-5)+j);
                change[1]=board[i-5][j];
                change3++;
            }
            if((i-6>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") ) && (board[i-6][j].equals("----") || board[i-6][j].charAt(1)=='1' || board[i-6][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-6)+j);
                change[1]=board[i-6][j];
                change3++;
            }
            if((i-7>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") ) && (board[i-7][j].equals("----") || board[i-7][j].charAt(1)=='1' || board[i-7][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-7)+j);
                change[1]=board[i-7][j];
                change3++;
            }
            if((i-8>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") && board[i-7][j].equals("----") ) && (board[i-8][j].equals("----") || board[i-8][j].charAt(1)=='1' || board[i-8][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-8)+j);
                change[1]=board[i-8][j];
                change3++;
            }
        }
        
        change[3]=String.valueOf(change3);
        return change;
    }
    
}
