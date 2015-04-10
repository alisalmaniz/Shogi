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
public class G extends Man{
    
    
    public static String[] move( String p){
        
        change[0]="-1";
        change[1]="-1";
        change[2]="-1";
        
        
        if(board[i][j].charAt(1)=='1'){
            if( !change[3].contains("a") && i+1<9 && (board[i+1][j].equals("----") || board[i+1][j].charAt(1)=='2' || board[i+1][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+1)+j);
                change[1]=board[i+1][j];
                change[3]=change[3].concat("a");
            }
            else if( !change[3].contains("b") && (i+1<9 && j+1<9) && (board[i+1][j+1].equals("----") || board[i+1][j+1].charAt(1)=='2' || board[i+1][j+1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+1)+(j+1));
                change[1]=board[i+1][j+1];
                change[3]=change[3].concat("b");
            }
            else if( !change[3].contains("c") && (i+1<9 && j-1>=0) && (board[i+1][j-1].equals("----") || board[i+1][j-1].charAt(1)=='2' || board[i+1][j-1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+1)+(j-1));
                change[1]=board[i+1][j-1];
                change[3]=change[3].concat("c");
            }
            else if( !change[3].contains("d") &&  j-1>=0 && (board[i][j-1].equals("----") || board[i][j-1].charAt(1)=='2' || board[i][j-1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-1));
                change[1]=board[i][j-1];
                change[3]=change[3].concat("d");
            }
            else if( !change[3].contains("e") &&  j+1>=0 && (board[i][j+1].equals("----") || board[i][j+1].charAt(1)=='2' || board[i][j+1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+1));
                change[1]=board[i][j+1];
                change[3]=change[3].concat("e");
            }
            else if( !change[3].contains("f") && i-1>=0 && (board[i-1][j].equals("----") || board[i-1][j].charAt(1)=='2' || board[i-1][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-1)+j);
                change[1]=board[i-1][j];
                change[3]=change[3].concat("f");
            }
            else
                change[3]=change[3].concat("*");
        }
        else{
            if( !change[3].contains("a") && i-1>=0 && (board[i-1][j].equals("----") || board[i-1][j].charAt(1)=='1' || board[i-1][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-1)+j);
                change[1]=board[i-1][j];
                change[3]=change[3].concat("a");
            }
            else if( !change[3].contains("b") &&  j+1<9 && (board[i][j+1].equals("----") || board[i][j+1].charAt(1)=='1' || board[i][j+1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+1));
                change[1]=board[i][j+1];
                change[3]=change[3].concat("b");
            }
            else if( !change[3].contains("c") && j-1>=0 && (board[i][j-1].equals("----") || board[i][j-1].charAt(1)=='1' || board[i][j-1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-1));
                change[1]=board[i][j-1];
                change[3]=change[3].concat("c");
            }
            else if( !change[3].contains("d") && (i-1>=0 && j-1>=0) && (board[i-1][j-1].equals("----") || board[i-1][j-1].charAt(1)=='1' || board[i-1][j-1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-1)+(j-1));
                change[1]=board[i-1][j-1];
                change[3]=change[3].concat("d");
            }
            else if( !change[3].contains("e") && (i-1>=0 && j+1>=0) && (board[i-1][j+1].equals("----") || board[i-1][j+1].charAt(1)=='1' || board[i-1][j+1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-1)+(j+1));
                change[1]=board[i-1][j+1];
                change[3]=change[3].concat("e");
            }
            else if( !change[3].contains("f") && i+1<9 && (board[i+1][j].equals("----") || board[i+1][j].charAt(1)=='1' || board[i+1][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+1)+j);
                change[1]=board[i+1][j];
                change[3]=change[3].concat("f");
            }
            else
                change[3]=change[3].concat("*");
        }
                
        return change;
    }
    
}
