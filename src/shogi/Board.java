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
public class Board {
    
    static String[][] board;
    static int player;
    
    
    public Board(){
        
        board = new String[9][9];
        player = 0;
    }
    
    public void firstData(){
        
        for(int i=1; i<8; i++)
            for(int j=0; j<9; j++)
                board[i][j]="----";
        
        board[0][0]="L1.a";
        board[0][1]="N1.a";
        board[0][2]="S1.a";
        board[0][3]="G1.a";
        board[0][4]=" K1 ";
        board[0][5]="G1.b";
        board[0][6]="S1.b";
        board[0][7]="N1.b";
        board[0][8]="L1.b";
        board[1][1]=" R1 ";
        board[1][7]=" B1 ";
       
        board[2][0]="R1.a";
        board[2][1]="R1.b";
        board[2][2]="R1.c";
        board[2][3]="R1.d";
        board[2][4]="R1.e";
        board[2][5]="R1.f";
        board[2][6]="R1.g";
        board[2][7]="R1.h";
        board[2][8]="R1.i";
        
        board[6][0]="R2.a";
        board[6][1]="R2.b";
        board[6][2]="R2.c";
        board[6][3]="R2.d";
        board[6][4]="R2.e";
        board[6][5]="R2.f";
        board[6][6]="R2.g";
        board[6][7]="R2.h";
        board[6][8]="R2.i";

        board[8][0]="L2.a";
        board[8][1]="N2.a";
        board[8][2]="S2.a";
        board[8][3]="G2.a";
        board[8][4]=" K2 ";
        board[8][5]="G2.b";
        board[8][6]="S2.b";
        board[8][7]="N2.b";
        board[8][8]="L2.b";
        board[7][1]=" B2 ";
        board[7][7]=" R2 ";
        
        
    }
/*    
    public void test(){
        System.out.print("hello");
        this.moveCursor(0, 0);
        System.out.print("ali");
    }
*/    
    public void print(){
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++)
                System.out.print("    "+ board[i][j]+ "    ");
               
            System.out.println("\n\n");
        }
        
    }
    
    
    
    public void showMenu(){
        
        Man.status();
        
        int i;
        int j;
        String[] changed=new String[3];
        int kish;
        int fix;
        int can=0;
        
        
        player++;
        if(player%2==1){
            System.out.println("Player " + player +" :\n");

            for( i=0; i<9; i++)
                for( j=0; j<9; j++){
                    if(board[i][j].charAt(1)=='1' || board[i][j].charAt(2)=='1'){
                        
                        kish=Man.isKish();
                        changed=Man.moveMan(board[i][j]);
                        fix=Man.fixKish(changed);
                        
                        
                        System.out.println(board[i][j]+" :");
                    }


                }
        }
        else{
            
            
        }
        
    }
    
}
