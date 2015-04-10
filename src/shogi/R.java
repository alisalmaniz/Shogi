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
public class R extends Man{
    
    
    public static String[] move( String p){
        
        change[0]="-1";
        change[1]="-1";
        change[2]="-1";
        
        
        if(board[i][j].charAt(2)=='1'){
            if( !change[3].contains("a") && i+1<9 && (board[i+1][j].equals("----") || board[i+1][j].charAt(1)=='2' || board[i+1][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+1)+j);
                change[1]=board[i+1][j];
                change[3]=change[3].concat("a");
            }
            else if( !change[3].contains("b") && (i+2<9 && board[i+1][j].equals("----")) && (board[i+2][j].equals("----") || board[i+2][j].charAt(1)=='2' || board[i+2][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+2)+j);
                change[1]=board[i+2][j];
                change[3]=change[3].concat("b");
            }
            else if( !change[3].contains("c") && (i+3<9 && board[i+1][j].equals("----") &&  board[i+2][j].equals("----")) && (board[i+3][j].equals("----") || board[i+3][j].charAt(1)=='2' || board[i+3][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+3)+j);
                change[1]=board[i+3][j];
                change[3]=change[3].concat("c");
            }
            else if( !change[3].contains("d") && (i+4<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----")) && (board[i+4][j].equals("----") || board[i+4][j].charAt(1)=='2' || board[i+4][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+4)+j);
                change[1]=board[i+4][j];
                change[3]=change[3].concat("d");
            }
            else if( !change[3].contains("e") && (i+5<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----")) && (board[i+5][j].equals("----") || board[i+5][j].charAt(1)=='2' || board[i+5][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+5)+j);
                change[1]=board[i+5][j];
                change[3]=change[3].concat("e");
            }
            else if( !change[3].contains("f") && (i+6<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") ) && (board[i+6][j].equals("----") || board[i+6][j].charAt(1)=='2' || board[i+6][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+6)+j);
                change[1]=board[i+6][j];
                change[3]=change[3].concat("f");
            }
            else if( !change[3].contains("g") && (i+7<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") ) && (board[i+7][j].equals("----") || board[i+7][j].charAt(1)=='2' || board[i+7][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+7)+j);
                change[1]=board[i+7][j];
                change[3]=change[3].concat("g");
            }
            else if( !change[3].contains("h") && (i+8<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") && board[i+7][j].equals("----") ) && (board[i+8][j].equals("----") || board[i+8][j].charAt(1)=='2' || board[i+8][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i+8)+j);
                change[1]=board[i+8][j];
                change[3]=change[3].concat("h");
            }
            
            else if( !change[3].contains("i") && i-1>=0 && (board[i-1][j].equals("----") || board[i-1][j].charAt(1)=='2' || board[i-1][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-1)+j);
                change[1]=board[i-1][j];
                change[3]=change[3].concat("i");
            }
            else if( !change[3].contains("j") && (i-2>=0 && board[i-1][j].equals("----")) && (board[i-2][j].equals("----") || board[i-2][j].charAt(1)=='2' || board[i-2][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-2)+j);
                change[1]=board[i-2][j];
                change[3]=change[3].concat("j");
            }
            else if( !change[3].contains("k") && (i-3>=0 && board[i-1][j].equals("----") &&  board[i-2][j].equals("----")) && (board[i-3][j].equals("----") || board[i-3][j].charAt(1)=='2' || board[i-3][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-3)+j);
                change[1]=board[i-3][j];
                change[3]=change[3].concat("k");
            }
            else if( !change[3].contains("l") && (i-4>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----")) && (board[i-4][j].equals("----") || board[i-4][j].charAt(1)=='2' || board[i-4][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-4)+j);
                change[1]=board[i-4][j];
                change[3]=change[3].concat("l");
            }
            else if( !change[3].contains("m") && (i-5>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----")) && (board[i-5][j].equals("----") || board[i-5][j].charAt(1)=='2' || board[i-5][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-5)+j);
                change[1]=board[i-5][j];
                change[3]=change[3].concat("m");
            }
            else if( !change[3].contains("n") && (i-6>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") ) && (board[i-6][j].equals("----") || board[i-6][j].charAt(1)=='2' || board[i-6][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-6)+j);
                change[1]=board[i-6][j];
                change[3]=change[3].concat("n");
            }
            else if( !change[3].contains("o") && (i-7>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") ) && (board[i-7][j].equals("----") || board[i-7][j].charAt(1)=='2' || board[i-7][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-7)+j);
                change[1]=board[i-7][j];
                change[3]=change[3].concat("o");
            }
            else if( !change[3].contains("p") && (i-8>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") && board[i-7][j].equals("----") ) && (board[i-8][j].equals("----") || board[i-8][j].charAt(1)=='2' || board[i-8][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-8)+j);
                change[1]=board[i-8][j];
                change[3]=change[3].concat("p");
            }
            
            else if( !change[3].contains("q") && j+1<9 && (board[i][j+1].equals("----") || board[i][j+1].charAt(1)=='2' || board[i][j+1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+1));
                change[1]=board[i][j+1];
                change[3]=change[3].concat("q");
            }
            else if( !change[3].contains("r") && (j+2<9 && board[i][j+1].equals("----")) && (board[i][j+2].equals("----") || board[i][j+2].charAt(1)=='2' || board[i][j+2].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+2));
                change[1]=board[i][j+2];
                change[3]=change[3].concat("r");
            }
            else if( !change[3].contains("s") && (j+3<9 && board[i][j+1].equals("----") &&  board[i][j+2].equals("----")) && (board[i][j+3].equals("----") || board[i][j+3].charAt(1)=='2' || board[i][j+3].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+3));
                change[1]=board[i][j+3];
                change[3]=change[3].concat("s");
            }
            else if( !change[3].contains("t") && (j+4<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----")) && (board[i][j+4].equals("----") || board[i][j+4].charAt(1)=='2' || board[i][j+4].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+4));
                change[1]=board[i][j+4];
                change[3]=change[3].concat("t");
            }
            else if( !change[3].contains("u") && (j+5<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----")) && (board[i][j+5].equals("----") || board[i][j+5].charAt(1)=='2' || board[i][j+5].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+5));
                change[1]=board[i][j+5];
                change[3]=change[3].concat("u");
            }
            else if( !change[3].contains("v") && (j+6<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") ) && (board[i][j+6].equals("----") || board[i][j+6].charAt(1)=='2' || board[i][j+6].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+6));
                change[1]=board[i][j+6];
                change[3]=change[3].concat("v");
            }
            else if( !change[3].contains("w") && (j+7<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") && board[i][j+6].equals("----") ) && (board[i][j+7].equals("----") || board[i][j+7].charAt(1)=='2' || board[i][j+7].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+7));
                change[1]=board[i][j+7];
                change[3]=change[3].concat("w");
            }
            else if( !change[3].contains("x") && (j+8<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") && board[i][j+6].equals("----") && board[i][j+7].equals("----") ) && (board[i][j+8].equals("----") || board[i][j+8].charAt(1)=='2' || board[i][j+8].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+8));
                change[1]=board[i][j+8];
                change[3]=change[3].concat("x");
            }
            
            else if( !change[3].contains("y") && j-1>=0 && (board[i][j-1].equals("----") || board[i][j-1].charAt(1)=='2' || board[i][j-1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-1));
                change[1]=board[i][j-1];
                change[3]=change[3].concat("y");
            }
            else if( !change[3].contains("z") && (j-2>=0 && board[i][j-1].equals("----")) && (board[i][j-2].equals("----") || board[i][j-2].charAt(1)=='2' || board[i][j-2].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-2));
                change[1]=board[i][j-2];
                change[3]=change[3].concat("z");
            }
            else if( !change[3].contains("1") && (j-3>=0 && board[i][j-1].equals("----") &&  board[i][j-2].equals("----")) && (board[i][j-3].equals("----") || board[i][j-3].charAt(1)=='2' || board[i][j-3].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-3));
                change[1]=board[i][j-3];
                change[3]=change[3].concat("1");
            }
            else if( !change[3].contains("2") && (j-4>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----")) && (board[i][j-4].equals("----") || board[i][j-4].charAt(1)=='2' || board[i][j-4].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-4));
                change[1]=board[i][j-4];
                change[3]=change[3].concat("2");
            }
            else if( !change[3].contains("3") && (j-5>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----")) && (board[i][j-5].equals("----") || board[i][j-5].charAt(1)=='2' || board[i][j-5].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-5));
                change[1]=board[i][j-5];
                change[3]=change[3].concat("3");
            }
            else if( !change[3].contains("4") && (j-6>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") ) && (board[i][j-6].equals("----") || board[i][j-6].charAt(1)=='2' || board[i][j-6].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-6));
                change[1]=board[i][j-6];
                change[3]=change[3].concat("4");
            }
            else if( !change[3].contains("5") && (j-7>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") && board[i][j-6].equals("----") ) && (board[i][j-7].equals("----") || board[i][j-8].charAt(1)=='2' || board[i][j-7].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-7));
                change[1]=board[i][j-7];
                change[3]=change[3].concat("5");
            }
            else if( !change[3].contains("6") && (j-8>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") && board[i][j-6].equals("----") && board[i][j-7].equals("----") ) && (board[i][j-8].equals("----") || board[i][j-8].charAt(1)=='2' || board[i][j-8].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-8));
                change[1]=board[i][j-8];
                change[3]=change[3].concat("6");
            }
            else
                change[3]=change[3].concat("*");
            
        }
        else{
             if( !change[3].contains("a") && i+1<9 && (board[i+1][j].equals("----") || board[i+1][j].charAt(1)=='1' || board[i+1][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+1)+j);
                change[1]=board[i+1][j];
                change[3]=change[3].concat("a");
            }
            else if( !change[3].contains("b") && (i+2<9 && board[i+1][j].equals("----")) && (board[i+2][j].equals("----") || board[i+2][j].charAt(1)=='1' || board[i+2][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+2)+j);
                change[1]=board[i+2][j];
                change[3]=change[3].concat("b");
            }
            else if( !change[3].contains("c") && (i+3<9 && board[i+1][j].equals("----") &&  board[i+2][j].equals("----")) && (board[i+3][j].equals("----") || board[i+3][j].charAt(1)=='1' || board[i+3][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+3)+j);
                change[1]=board[i+3][j];
                change[3]=change[3].concat("c");
            }
            else if( !change[3].contains("d") && (i+4<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----")) && (board[i+4][j].equals("----") || board[i+4][j].charAt(1)=='1' || board[i+4][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+4)+j);
                change[1]=board[i+4][j];
                change[3]=change[3].concat("d");
            }
            else if( !change[3].contains("e") && (i+5<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----")) && (board[i+5][j].equals("----") || board[i+5][j].charAt(1)=='1' || board[i+5][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+5)+j);
                change[1]=board[i+5][j];
                change[3]=change[3].concat("e");
            }
            else if( !change[3].contains("f") && (i+6<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") ) && (board[i+6][j].equals("----") || board[i+6][j].charAt(1)=='1' || board[i+6][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+6)+j);
                change[1]=board[i+6][j];
                change[3]=change[3].concat("f");
            }
            else if( !change[3].contains("g") && (i+7<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") ) && (board[i+7][j].equals("----") || board[i+7][j].charAt(1)=='1' || board[i+7][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+7)+j);
                change[1]=board[i+7][j];
                change[3]=change[3].concat("g");
            }
            else if( !change[3].contains("h") && (i+8<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") && board[i+7][j].equals("----") ) && (board[i+8][j].equals("----") || board[i+8][j].charAt(1)=='1' || board[i+8][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+8)+j);
                change[1]=board[i+8][j];
                change[3]=change[3].concat("h");
            }
            
            else if( !change[3].contains("i") && i-1>=0 && (board[i-1][j].equals("----") || board[i-1][j].charAt(1)=='1' || board[i-1][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-1)+j);
                change[1]=board[i-1][j];
                change[3]=change[3].concat("i");
            }
            else if( !change[3].contains("j") && (i-2>=0 && board[i-1][j].equals("----")) && (board[i-2][j].equals("----") || board[i-2][j].charAt(1)=='1' || board[i-2][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-2)+j);
                change[1]=board[i-2][j];
                change[3]=change[3].concat("j");
            }
            else if( !change[3].contains("k") && (i-3>=0 && board[i-1][j].equals("----") &&  board[i-2][j].equals("----")) && (board[i-3][j].equals("----") || board[i-3][j].charAt(1)=='1' || board[i-3][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-3)+j);
                change[1]=board[i-3][j];
                change[3]=change[3].concat("k");
            }
            else if( !change[3].contains("l") && (i-4>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----")) && (board[i-4][j].equals("----") || board[i-4][j].charAt(1)=='1' || board[i-4][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-4)+j);
                change[1]=board[i-4][j];
                change[3]=change[3].concat("l");
            }
            else if( !change[3].contains("m") && (i-5>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----")) && (board[i-5][j].equals("----") || board[i-5][j].charAt(1)=='1' || board[i-5][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-5)+j);
                change[1]=board[i-5][j];
                change[3]=change[3].concat("m");
            }
            else if( !change[3].contains("n") && (i-6>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") ) && (board[i-6][j].equals("----") || board[i-6][j].charAt(1)=='1' || board[i-6][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-6)+j);
                change[1]=board[i-6][j];
                change[3]=change[3].concat("n");
            }
            else if( !change[3].contains("o") && (i-7>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") ) && (board[i-7][j].equals("----") || board[i-7][j].charAt(1)=='1' || board[i-7][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-7)+j);
                change[1]=board[i-7][j];
                change[3]=change[3].concat("o");
            }
            else if( !change[3].contains("p") && (i-8>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") && board[i-7][j].equals("----") ) && (board[i-8][j].equals("----") || board[i-8][j].charAt(1)=='1' || board[i-8][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i-8)+j);
                change[1]=board[i-8][j];
                change[3]=change[3].concat("p");
            }
            
            else if( !change[3].contains("q") && j+1<9 && (board[i][j+1].equals("----") || board[i][j+1].charAt(1)=='1' || board[i][j+1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+1));
                change[1]=board[i][j+1];
                change[3]=change[3].concat("q");
            }
            else if( !change[3].contains("r") && (j+2<9 && board[i][j+1].equals("----")) && (board[i][j+2].equals("----") || board[i][j+2].charAt(1)=='1' || board[i][j+2].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+2));
                change[1]=board[i][j+2];
                change[3]=change[3].concat("r");
            }
            else if( !change[3].contains("s") && (j+3<9 && board[i][j+1].equals("----") &&  board[i][j+2].equals("----")) && (board[i][j+3].equals("----") || board[i][j+3].charAt(1)=='1' || board[i][j+3].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+3));
                change[1]=board[i][j+3];
                change[3]=change[3].concat("s");
            }
            else if( !change[3].contains("t") && (j+4<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----")) && (board[i][j+4].equals("----") || board[i][j+4].charAt(1)=='1' || board[i][j+4].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+4));
                change[1]=board[i][j+4];
                change[3]=change[3].concat("t");
            }
            else if( !change[3].contains("u") && (j+5<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----")) && (board[i][j+5].equals("----") || board[i][j+5].charAt(1)=='1' || board[i][j+5].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+5));
                change[1]=board[i][j+5];
                change[3]=change[3].concat("u");
            }
            else if( !change[3].contains("v") && (j+6<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") ) && (board[i][j+6].equals("----") || board[i][j+6].charAt(1)=='1' || board[i][j+6].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+6));
                change[1]=board[i][j+6];
                change[3]=change[3].concat("v");
            }
            else if( !change[3].contains("w") && (j+7<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") && board[i][j+6].equals("----") ) && (board[i][j+7].equals("----") || board[i][j+7].charAt(1)=='1' || board[i][j+7].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+7));
                change[1]=board[i][j+7];
                change[3]=change[3].concat("w");
            }
            else if( !change[3].contains("x") && (j+8<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") && board[i][j+6].equals("----") && board[i][j+7].equals("----") ) && (board[i][j+7].equals("----") || board[i][j+8].charAt(1)=='1' || board[i][j+8].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+8));
                change[1]=board[i][j+8];
                change[3]=change[3].concat("x");
            }
            
            else if( !change[3].contains("y") && j-1>=0 && (board[i][j-1].equals("----") || board[i][j-1].charAt(1)=='1' || board[i][j-1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-1));
                change[1]=board[i][j-1];
                change[3]=change[3].concat("y");
            }
            else if( !change[3].contains("z") && (j-2>=0 && board[i][j-1].equals("----")) && (board[i][j-2].equals("----") || board[i][j-2].charAt(1)=='1' || board[i][j-2].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-2));
                change[1]=board[i][j-2];
                change[3]=change[3].concat("z");
            }
            else if( !change[3].contains("1") && (j-3>=0 && board[i][j-1].equals("----") &&  board[i][j-2].equals("----")) && (board[i][j-3].equals("----") || board[i][j-3].charAt(1)=='1' || board[i][j-3].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-3));
                change[1]=board[i][j-3];
                change[3]=change[3].concat("1");
            }
            else if( !change[3].contains("2") && (j-4>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-2].equals("----")) && (board[i][j-4].equals("----") || board[i][j-4].charAt(1)=='1' || board[i][j-4].charAt(2)=='1') ){
                change[0]=String.valueOf(10*4+(j-4));
                change[1]=board[i][j-4];
                change[3]=change[3].concat("2");
            }
            else if( !change[3].contains("3") && (j-5>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----")) && (board[i][j-5].equals("----") || board[i][j-5].charAt(1)=='1' || board[i][j-5].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-5));
                change[1]=board[i][j-5];
                change[3]=change[3].concat("3");
            }
            else if( !change[3].contains("4") && (j-6>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") ) && (board[i][j-6].equals("----") || board[i][j-6].charAt(1)=='1' || board[i][j-6].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-6));
                change[1]=board[i][j-6];
                change[3]=change[3].concat("4");
            }
            else if( !change[3].contains("5") && (j-7>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") && board[i][j-6].equals("----") ) && (board[i][j-7].equals("----") || board[i][j-8].charAt(1)=='1' || board[i][j-7].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-7));
                change[1]=board[i][j-7];
                change[3]=change[3].concat("5");
            }
            else if( !change[3].contains("6") && (j-8>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") && board[i][j-6].equals("----") && board[i][j-7].equals("----") ) && (board[i][j-8].equals("----") || board[i][j-8].charAt(1)=='1' || board[i][j-8].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-8));
                change[1]=board[i][j-8];
                change[3]=change[3].concat("6");
            }
            else
                change[3]=change[3].concat("*");
            
        }
        

        return change;
    }
    
}
