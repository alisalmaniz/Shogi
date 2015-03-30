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
    
    private String[][] Board;
    
    
    public Board(){
        
        Board = new String[9][9];
        
    }
    
    public void firstData(){
        
        for(int i=1; i<8; i++)
            for(int j=0; j<9; j++)
                Board[i][j]="----";
        
        Board[0][0]="L1.a";
        Board[0][1]="N1.a";
        Board[0][2]="S1.a";
        Board[0][3]="G1.a";
        Board[0][4]=" K1 ";
        Board[0][5]="G1.b";
        Board[0][6]="S1.b";
        Board[0][7]="N1.b";
        Board[0][8]="L1.b";
        Board[1][1]=" R1 ";
        Board[1][7]=" B1 ";
        
        Board[2][0]="R1.a";
        Board[2][1]="R1.b";
        Board[2][2]="R1.c";
        Board[2][3]="R1.d";
        Board[2][4]="R1.e";
        Board[2][5]="R1.f";
        Board[2][6]="R1.g";
        Board[2][7]="R1.h";
        Board[2][8]="R1.i";
        
        Board[6][0]="R2.a";
        Board[6][1]="R2.b";
        Board[6][2]="R2.c";
        Board[6][3]="R2.d";
        Board[6][4]="R2.e";
        Board[6][5]="R2.f";
        Board[6][6]="R2.g";
        Board[6][7]="R2.h";
        Board[6][8]="R2.i";
            
        Board[8][0]="L2.a";
        Board[8][1]="N2.a";
        Board[8][2]="S2.a";
        Board[8][3]="G2.a";
        Board[8][4]=" K2 ";
        Board[8][5]="G2.b";
        Board[8][6]="S2.b";
        Board[8][7]="N2.b";
        Board[8][8]="L2.b";
        Board[7][1]=" B2 ";
        Board[7][7]=" R2 ";
        
        
    }
    
    public void print(){
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++)
                System.out.print("    "+ Board[i][j]+ "    ");
              
            System.out.println("\n\n");
        }
        
    }
    
    public void showMenu(){
        
        int Player=1;
        System.out.println("Player "+ Player +" :");
        
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++){
                if(Board[i][j]=="P1.a"){
                    
                    if(Board[i+1][j]=="----"){
                        
                        System.out.println("1.");
                        
                    }
                }
                
                
            }
    
        
    }
    
}
