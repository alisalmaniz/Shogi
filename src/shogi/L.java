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
        
        change[0]="-1";
        change[1]="-1";
        change[2]="-1";
        
//System.out.println("ibyilyblyly");
       // System.out.println(board[i][j]);
        if(board[i][j].charAt(1)=='1'){
            if( !change[3].contains("a") && i+1<9 && (board[i+1][j].equals("----") || board[i+1][j].charAt(1)=='2' || board[i+1][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+1)+j);
                change[1]=board[i+1][j];
                change[3]=change[3]=change[3].concat("a");
            }
            else if( !change[3].contains("b") && (i+2<9 && board[i+1][j].equals("----")) && (board[i+2][j].equals("----") || board[i+2][j].charAt(1)=='2' || board[i+2][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+2)+j);
                change[1]=board[i+2][j];
                change[3]=change[3]=change[3].concat("b");
            }
            else if( !change[3].contains("c") && (i+3<9 && board[i+1][j].equals("----") &&  board[i+2][j].equals("----")) && (board[i+3][j].equals("----") || board[i+3][j].charAt(1)=='2' || board[i+3][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+3)+j);
                change[1]=board[i+3][j];
                change[3]=change[3]=change[3].concat("c");
            }
            else if( !change[3].contains("d") && (i+4<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----")) && (board[i+4][j].equals("----") || board[i+4][j].charAt(1)=='2' || board[i+4][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+4)+j);
                change[1]=board[i+4][j];
                change[3]=change[3]=change[3].concat("d");
            }
            else if( !change[3].contains("e") && (i+5<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----")) && (board[i+5][j].equals("----") || board[i+5][j].charAt(1)=='2' || board[i+5][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+5)+j);
                change[1]=board[i+5][j];
                change[3]=change[3]=change[3].concat("e");
            }
            else if( !change[3].contains("f") && (i+6<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") ) && (board[i+6][j].equals("----") || board[i+6][j].charAt(1)=='2' || board[i+6][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+6)+j);
                change[1]=board[i+6][j];
                change[3]=change[3]=change[3].concat("f");
            }
            else if( !change[3].contains("g") && (i+7<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") ) && (board[i+7][j].equals("----") || board[i+7][j].charAt(1)=='2' || board[i+7][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+7)+j);
                change[1]=board[i+7][j];
                change[3]=change[3]=change[3].concat("g");
            }
            else if( !change[3].contains("h") && (i+8<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") && board[i+7][j].equals("----") ) && (board[i+8][j].equals("----") || board[i+8][j].charAt(1)=='2' || board[i+8][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+8)+j);
                change[1]=board[i+8][j];
                change[3]=change[3]=change[3].concat("h");
            }
            else
                change[3]=change[3]=change[3].concat("*");
            
        }
        else{
            if( !change[3].contains("a") && i-1>=0 && (board[i-1][j].equals("----") || board[i-1][j].charAt(1)=='1' || board[i-1][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-1)+j);
                change[1]=board[i-1][j];
                change[3]=change[3]=change[3].concat("a");
            }
            else if( !change[3].contains("b") && (i-2>=0 && board[i-1][j].equals("----")) && (board[i-2][j].equals("----") || board[i-2][j].charAt(1)=='1' || board[i-2][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-2)+j);
                change[1]=board[i-2][j];
                change[3]=change[3]=change[3].concat("b");
            }
            else if( !change[3].contains("c") && (i-3>=0 && board[i-1][j].equals("----") &&  board[i-2][j].equals("----")) && (board[i-3][j].equals("----") || board[i-3][j].charAt(1)=='1' || board[i-3][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-3)+j);
                change[1]=board[i-3][j];
                change[3]=change[3]=change[3].concat("c");
            }
            else if( !change[3].contains("d") && (i-4>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----")) && (board[i-4][j].equals("----") || board[i-4][j].charAt(1)=='1' || board[i-4][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-4)+j);
                change[1]=board[i-4][j];
                change[3]=change[3]=change[3].concat("d");
            }
            else if( !change[3].contains("e") && (i-5>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----")) && (board[i-5][j].equals("----") || board[i-5][j].charAt(1)=='1' || board[i-5][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-5)+j);
                change[1]=board[i-5][j];
                change[3]=change[3]=change[3].concat("e");
            }
            else if( !change[3].contains("f") && (i-6>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") ) && (board[i-6][j].equals("----") || board[i-6][j].charAt(1)=='1' || board[i-6][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-6)+j);
                change[1]=board[i-6][j];
                change[3]=change[3]=change[3].concat("f");
            }
            else if( !change[3].contains("g") && (i-7>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") ) && (board[i-7][j].equals("----") || board[i-7][j].charAt(1)=='1' || board[i-7][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-7)+j);
                change[1]=board[i-7][j];
                change[3]=change[3]=change[3].concat("g");
            }
            else if( !change[3].contains("h") && (i-8>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") && board[i-7][j].equals("----") ) && (board[i-8][j].equals("----") || board[i-8][j].charAt(1)=='1' || board[i-8][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-8)+j);
                change[1]=board[i-8][j];
                change[3]=change[3]=change[3].concat("h");
            }
            else
                change[3]=change[3]=change[3].concat("*");
        }

        return change;
    }
    
}
