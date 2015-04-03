/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi;

import java.util.LinkedList;
import java.util.Scanner;




/**
 *
 * @author Ali salmani
 */
public class Board {
    
    static String[][] board;
    static int player;
    static int selection;
    static Scanner scan;
    static LinkedList list;
    private LinkedList save1;
    private LinkedList save2;
    
    
    public Board(){
        
        board = new String[9][9];
        player = 0;
        selection=0;
        scan = new Scanner(System.in);
        list =new LinkedList();
        list.add(0);
        save1=new LinkedList();
        save2=new LinkedList();
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
        System.out.println("Saved mans:");
        System.out.print("  Player 1:");
        for (Object save11 : save1) {
            System.out.print(save11 + "  ,");
        }
        System.out.println("");
        System.out.print("  Player 2:");
        for (Object save22 : save2) {
            System.out.print(save22 + "  ,");
        }
        System.out.println("");
    }
    
    
    
    public void showMenu(){
        
        for(int i=0 ; i<list.size(); i++)
            list.remove();
        

        int i;
        int j;
        String[] changed=new String[3];
       // int kish;
        int fix;
        int can=0;
        int ch;
    
        player++;
        System.out.println(   "Player" + player +" :\n\n");
        if(player%2==1){

            for( i=0; i<9; i++)
                for( j=0; j<9; j++){
                    if(board[i][j].charAt(1)=='1' || board[i][j].charAt(2)=='1'){
                        
               //         kish=Man.isKish();
                        changed=Man.moveMan(board[i][j]);
                        fix=Man.fixKish(changed);
                        
                        if(fix==1){
                            ch=Integer.parseInt(changed[0]);
                            System.out.println(board[i][j]+" :");
                            System.out.println(i + j + ch/10 + ch%10 +". move to (" +(ch/10+1) +","+ (ch%10+1)+") position");
                            list.add(i*1000 + j*100 + ch);
                        }
                        
                        
                    }


                }
        }
        else{
            
            
        }
        
        selection = scan.nextInt();
    }
    
    public void operator(){
        int i;
        int j=0;

        for( i=0; i<list.size(); i++)
            if(selection==(int)list.get(i)){
                if(player==1)
                    save1.add(board[(int)list.get(i)/10%10][(int)list.get(i)%10]);
                else
                    save2.add(board[(int)list.get(i)/10%10][(int)list.get(i)%10]);
                board[(int)list.get(i)/10%10][(int)list.get(i)%10]=board[(int)list.get(i)/1000][(int)list.get(i)/100%10];
                board[(int)list.get(i)/1000][(int)list.get(i)/100%10]="----";
                upgrade((int)list.get(i)%100);
                break;
        }
                
    }
    
    public int upgrade(int ch){

        if(board[ch/10][ch%10].charAt(1)=='K' || board[ch/10][ch%10].charAt(0)=='G')
                return 0;
        else{
            
            if(board[ch/10][ch%10].charAt(0)=='P' && player==1 && ch/10==8){
                board[ch/10][ch%10].replace('1', '7');
                return 1;
            }
            else if(board[ch/10][ch%10].charAt(0)=='P' && player==2 && ch/10==0){
                board[ch/10][ch%10].replace('2', '8');
                return 1;
            }

            if(board[ch/10][ch%10].charAt(0)=='N' && player==1 && ch/10==7){
                board[ch/10][ch%10].replace('1', '7');
                return 1;
            }
            else if(board[ch/10][ch%10].charAt(0)=='N' && player==2 && ch/10==1){
                board[ch/10][ch%10].replace('2', '8');
                return 1;
            }

            if((player==1 && ch/10>5) || (player==2 && ch/10<3)){
                System.out.println(   "Enter the number of Operation you want:\n"
                                    + "1.Upgrade\n"
                                    + "2.No action");
                selection = scan.nextInt();
                if(selection==1)
                    if(player==1){
                        board[ch/10][ch%10].replace('1', '7');
                        return 1;
                    }
                    else{
                        board[ch/10][ch%10].replace('2', '/');
                        return 1;
                    }
                
            }
            else
                return 0;
            
        }
                
        return 0;
    }

    public static void setBoard(String[][] board) {
        Board.board = board;
    }

    public static String[][] getBoard() {
        return board;
    }
    
    
}
