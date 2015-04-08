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
        
        int change3=0;
        change[0]="-1";
        change[1]="-1";
        change[2]="-1";
        change[3]="0";
        
        if(board[i][j].charAt(2)=='1'){
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
            
            if(i-1>=0 && (board[i-1][j].equals("----") || board[i-1][j].charAt(1)=='2' || board[i-1][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-1)+j);
                change[1]=board[i-1][j];
                change3++;
            }
            if((i-2>=0 && board[i-1][j].equals("----")) && (board[i-2][j].equals("----") || board[i-2][j].charAt(1)=='2' || board[i-2][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-2)+j);
                change[1]=board[i-2][j];
                change3++;
            }
            if((i-3>=0 && board[i-1][j].equals("----") &&  board[i-2][j].equals("----")) && (board[i-3][j].equals("----") || board[i-3][j].charAt(1)=='2' || board[i-3][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-3)+j);
                change[1]=board[i-3][j];
                change3++;
            }
            if((i-4>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----")) && (board[i-4][j].equals("----") || board[i-4][j].charAt(1)=='2' || board[i-4][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-4)+j);
                change[1]=board[i-4][j];
                change3++;
            }
            if((i-5>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----")) && (board[i-5][j].equals("----") || board[i-5][j].charAt(1)=='2' || board[i-5][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-5)+j);
                change[1]=board[i-5][j];
                change3++;
            }
            if((i-6>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") ) && (board[i-6][j].equals("----") || board[i-6][j].charAt(1)=='2' || board[i-6][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-6)+j);
                change[1]=board[i-6][j];
                change3++;
            }
            if((i-7>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") ) && (board[i-7][j].equals("----") || board[i-7][j].charAt(1)=='2' || board[i-7][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-7)+j);
                change[1]=board[i-7][j];
                change3++;
            }
            if((i-8>=0 && board[i-1][j].equals("----") && board[i-2][j].equals("----") && board[i-3][j].equals("----") && board[i-4][j].equals("----") && board[i-5][j].equals("----") && board[i-6][j].equals("----") && board[i-7][j].equals("----") ) && (board[i-8][j].equals("----") || board[i-8][j].charAt(1)=='2' || board[i-8][j].charAt(2)=='2') ){
                change[0]=String.valueOf(10*(i-8)+j);
                change[1]=board[i-8][j];
                change3++;
            }
            
            if(j+1<9 && (board[i][j+1].equals("----") || board[i][j+1].charAt(1)=='2' || board[i][j+1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+1));
                change[1]=board[i][j+1];
                change3++;
            }
            if((j+2<9 && board[i][j+1].equals("----")) && (board[i][j+2].equals("----") || board[i][j+2].charAt(1)=='2' || board[i][j+2].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+2));
                change[1]=board[i][j+2];
                change3++;
            }
            if((j+3<9 && board[i][j+1].equals("----") &&  board[i][j+2].equals("----")) && (board[i][j+3].equals("----") || board[i][j+3].charAt(1)=='2' || board[i][j+3].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+3));
                change[1]=board[i][j+3];
                change3++;
            }
            if((j+4<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----")) && (board[i][j+4].equals("----") || board[i][j+4].charAt(1)=='2' || board[i][j+4].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+4));
                change[1]=board[i][j+4];
                change3++;
            }
            if((j+5<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----")) && (board[i][j+5].equals("----") || board[i][j+5].charAt(1)=='2' || board[i][j+5].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+5));
                change[1]=board[i][j+5];
                change3++;
            }
            if((j+6<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") ) && (board[i][j+6].equals("----") || board[i][j+6].charAt(1)=='2' || board[i][j+6].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+6));
                change[1]=board[i][j+6];
                change3++;
            }
            if((j+7<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") && board[i][j+6].equals("----") ) && (board[i][j+7].equals("----") || board[i][j+7].charAt(1)=='2' || board[i][j+7].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+7));
                change[1]=board[i][j+7];
                change3++;
            }
            if((j+8<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") && board[i][j+6].equals("----") && board[i][j+7].equals("----") ) && (board[i][j+7].equals("----") || board[i][j+8].charAt(1)=='2' || board[i][j+8].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j+8));
                change[1]=board[i][j+8];
                change3++;
            }
            
            if(j-1>=0 && (board[i][j-1].equals("----") || board[i][j-1].charAt(1)=='2' || board[i][j-1].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-1));
                change[1]=board[i][j-1];
                change3++;
            }
            if((j-2>=0 && board[i][j-1].equals("----")) && (board[i][j-2].equals("----") || board[i][j-2].charAt(1)=='2' || board[i][j-2].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-2));
                change[1]=board[i][j-2];
                change3++;
            }
            if((j-3>=0 && board[i][j-1].equals("----") &&  board[i][j-2].equals("----")) && (board[i][j-3].equals("----") || board[i][j-3].charAt(1)=='2' || board[i][j-3].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-3));
                change[1]=board[i][j-3];
                change3++;
            }
            if((j-4>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-2].equals("----")) && (board[i][j-4].equals("----") || board[i][j-4].charAt(1)=='2' || board[i][j-4].charAt(2)=='2') ){
                change[0]=String.valueOf(10*4+(j-4));
                change[1]=board[i][j-4];
                change3++;
            }
            if((j-5>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----")) && (board[i][j-5].equals("----") || board[i][j-5].charAt(1)=='2' || board[i][j-5].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-5));
                change[1]=board[i][j-5];
                change3++;
            }
            if((j-6>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") ) && (board[i][j-6].equals("----") || board[i][j-6].charAt(1)=='2' || board[i][j-6].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-6));
                change[1]=board[i][j-6];
                change3++;
            }
            if((j-7>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") && board[i][j-6].equals("----") ) && (board[i][j-7].equals("----") || board[i][j-8].charAt(1)=='2' || board[i][j-7].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-7));
                change[1]=board[i][j-7];
                change3++;
            }
            if((j-8>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") && board[i][j-6].equals("----") && board[i][j-7].equals("----") ) && (board[i][j-8].equals("----") || board[i][j-8].charAt(1)=='2' || board[i][j-8].charAt(2)=='2') ){
                change[0]=String.valueOf(10*i+(j-8));
                change[1]=board[i][j-8];
                change3++;
            }
            
        }
        else{
             if(i+1<9 && (board[i+1][j].equals("----") || board[i+1][j].charAt(1)=='1' || board[i+1][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+1)+j);
                change[1]=board[i+1][j];
                change3++;
            }
            if((i+2<9 && board[i+1][j].equals("----")) && (board[i+2][j].equals("----") || board[i+2][j].charAt(1)=='1' || board[i+2][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+2)+j);
                change[1]=board[i+2][j];
                change3++;
            }
            if((i+3<9 && board[i+1][j].equals("----") &&  board[i+2][j].equals("----")) && (board[i+3][j].equals("----") || board[i+3][j].charAt(1)=='1' || board[i+3][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+3)+j);
                change[1]=board[i+3][j];
                change3++;
            }
            if((i+4<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----")) && (board[i+4][j].equals("----") || board[i+4][j].charAt(1)=='1' || board[i+4][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+4)+j);
                change[1]=board[i+4][j];
                change3++;
            }
            if((i+5<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----")) && (board[i+5][j].equals("----") || board[i+5][j].charAt(1)=='1' || board[i+5][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+5)+j);
                change[1]=board[i+5][j];
                change3++;
            }
            if((i+6<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") ) && (board[i+6][j].equals("----") || board[i+6][j].charAt(1)=='1' || board[i+6][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+6)+j);
                change[1]=board[i+6][j];
                change3++;
            }
            if((i+7<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") ) && (board[i+7][j].equals("----") || board[i+7][j].charAt(1)=='1' || board[i+7][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+7)+j);
                change[1]=board[i+7][j];
                change3++;
            }
            if((i+8<9 && board[i+1][j].equals("----") && board[i+2][j].equals("----") && board[i+3][j].equals("----") && board[i+4][j].equals("----") && board[i+5][j].equals("----") && board[i+6][j].equals("----") && board[i+7][j].equals("----") ) && (board[i+8][j].equals("----") || board[i+8][j].charAt(1)=='1' || board[i+8][j].charAt(2)=='1') ){
                change[0]=String.valueOf(10*(i+8)+j);
                change[1]=board[i+8][j];
                change3++;
            }
            
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
            
            if(j+1<9 && (board[i][j+1].equals("----") || board[i][j+1].charAt(1)=='1' || board[i][j+1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+1));
                change[1]=board[i][j+1];
                change3++;
            }
            if((j+2<9 && board[i][j+1].equals("----")) && (board[i][j+2].equals("----") || board[i][j+2].charAt(1)=='1' || board[i][j+2].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+2));
                change[1]=board[i][j+2];
                change3++;
            }
            if((j+3<9 && board[i][j+1].equals("----") &&  board[i][j+2].equals("----")) && (board[i][j+3].equals("----") || board[i][j+3].charAt(1)=='1' || board[i][j+3].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+3));
                change[1]=board[i][j+3];
                change3++;
            }
            if((j+4<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----")) && (board[i][j+4].equals("----") || board[i][j+4].charAt(1)=='1' || board[i][j+4].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+4));
                change[1]=board[i][j+4];
                change3++;
            }
            if((j+5<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----")) && (board[i][j+5].equals("----") || board[i][j+5].charAt(1)=='1' || board[i][j+5].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+5));
                change[1]=board[i][j+5];
                change3++;
            }
            if((j+6<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") ) && (board[i][j+6].equals("----") || board[i][j+6].charAt(1)=='1' || board[i][j+6].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+6));
                change[1]=board[i][j+6];
                change3++;
            }
            if((j+7<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") && board[i][j+6].equals("----") ) && (board[i][j+7].equals("----") || board[i][j+7].charAt(1)=='1' || board[i][j+7].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+7));
                change[1]=board[i][j+7];
                change3++;
            }
            if((j+8<9 && board[i][j+1].equals("----") && board[i][j+2].equals("----") && board[i][j+3].equals("----") && board[i][j+4].equals("----") && board[i][j+5].equals("----") && board[i][j+6].equals("----") && board[i][j+7].equals("----") ) && (board[i][j+7].equals("----") || board[i][j+8].charAt(1)=='1' || board[i][j+8].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j+8));
                change[1]=board[i][j+8];
                change3++;
            }
            
            if(j-1>=0 && (board[i][j-1].equals("----") || board[i][j-1].charAt(1)=='1' || board[i][j-1].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-1));
                change[1]=board[i][j-1];
                change3++;
            }
            if((j-2>=0 && board[i][j-1].equals("----")) && (board[i][j-2].equals("----") || board[i][j-2].charAt(1)=='1' || board[i][j-2].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-2));
                change[1]=board[i][j-2];
                change3++;
            }
            if((j-3>=0 && board[i][j-1].equals("----") &&  board[i][j-2].equals("----")) && (board[i][j-3].equals("----") || board[i][j-3].charAt(1)=='1' || board[i][j-3].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-3));
                change[1]=board[i][j-3];
                change3++;
            }
            if((j-4>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-2].equals("----")) && (board[i][j-4].equals("----") || board[i][j-4].charAt(1)=='1' || board[i][j-4].charAt(2)=='1') ){
                change[0]=String.valueOf(10*4+(j-4));
                change[1]=board[i][j-4];
                change3++;
            }
            if((j-5>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----")) && (board[i][j-5].equals("----") || board[i][j-5].charAt(1)=='1' || board[i][j-5].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-5));
                change[1]=board[i][j-5];
                change3++;
            }
            if((j-6>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") ) && (board[i][j-6].equals("----") || board[i][j-6].charAt(1)=='1' || board[i][j-6].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-6));
                change[1]=board[i][j-6];
                change3++;
            }
            if((j-7>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") && board[i][j-6].equals("----") ) && (board[i][j-7].equals("----") || board[i][j-8].charAt(1)=='1' || board[i][j-7].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-7));
                change[1]=board[i][j-7];
                change3++;
            }
            if((j-8>=0 && board[i][j-1].equals("----") && board[i][j-2].equals("----") && board[i][j-3].equals("----") && board[i][j-4].equals("----") && board[i][j-5].equals("----") && board[i][j-6].equals("----") && board[i][j-7].equals("----") ) && (board[i][j-8].equals("----") || board[i][j-8].charAt(1)=='1' || board[i][j-8].charAt(2)=='1') ){
                change[0]=String.valueOf(10*i+(j-8));
                change[1]=board[i][j-8];
                change3++;
            }
            
        }
        
                
        change[3]=String.valueOf(change3);
        return change;
    }
    
}
