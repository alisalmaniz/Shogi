/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi;

import java.util.LinkedList;
import java.util.Scanner;
import static shogi.Man.change;
import static shogi.Man.i;
import static shogi.Man.j;




/**
 *
 * @author Ali salmani
 */
public class Board {
    
    static String[][] board = new String[9][9];
    static int player = 0;
    static int selection = 0;
    static Scanner scan = new Scanner(System.in);
    static LinkedList list = new LinkedList();
    private LinkedList<String> save1;
    private LinkedList<String> save2;
    
    
    public Board(){
        
        save1=new LinkedList();
        save2=new LinkedList();
    }
    
    public void firstData(){
        
        list.add(0);
        
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
       
        board[2][0]="P1.a";
        board[2][1]="P1.b";
        board[2][2]="P1.c";
        board[2][3]="P1.d";
        board[2][4]="P1.e";
        board[2][5]="P1.f";
        board[2][6]="P1.g";
        board[2][7]="P1.h";
        board[2][8]="P1.i";
        
        board[6][0]="P2.a";
        board[6][1]="P2.b";
        board[6][2]="P2.c";
        board[6][3]="P2.d";
        board[6][4]="P2.e";
        board[6][5]="P2.f";
        board[6][6]="P2.g";
        board[6][7]="P2.h";
        board[6][8]="P2.i";

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
            if(!save11.equals("----"))
                System.out.print(save11 + "  ,");
        }
        System.out.println("");
        System.out.print("  Player 2:");
        for (Object save22 : save2) {
            if(!save22.equals("----"))
                System.out.print(save22 + "  ,");
        }
        System.out.println("\n");
    }
    
    
    
    public void showMenu(){
        
        for(int h=0 ; h<list.size(); h++)
            list.remove();
        
        
        String[] changed=new String[4];
       // int kish;
        int pr=0;
        int fix;
        int can=0;
        int ch;
    
        player++;
        System.out.println(   "Player" + (player%2==1?1:2) +" , it is your turn , please select:");
        if(player%2==1){

            for( i=0; i<9; i++)
                for( j=0; j<9; j++){
                    if(board[i][j].charAt(1)=='1' || board[i][j].charAt(2)=='1' || board[i][j].charAt(1)=='5' || board[i][j].charAt(2)=='5' ){

                        changed[3]="";
                        change[3]="";
                        pr=0;
                        for(int cun=0; !(changed[3].endsWith("*")) ; cun++){
                            changed=Man.moveMan(board[i][j]);
                            //System.out.println(i);
                            fix=Man.fixKish(changed);
                            //System.out.println(i);
                            if(fix==1 && cun==0)
                                System.out.println(board[i][j]+" :");
                            if(fix==1){
                                ch=Integer.parseInt(changed[0]);
                                System.out.print( i +""+ j +""+ ch/10 +""+ ch%10 +". move to (" +(ch/10+1) +","+ (ch%10+1)+") position  ");
                                list.add(i*1000 + j*100 + ch);
                                pr++;
                            }
                        }
                        if(pr>0)
                            System.out.println("");
                    }
                }
            int l;
            for( l=0; l<save1.size()-1; l++)
                    if(!(save1.get(l).equals("----"))){
                        
                        for(int x=3; x<6; x++ )
                            for(int y=0; y<9; y++ )
                                if(board[x][y].equals("----")){
                                    System.out.println(toInt(save1.get(l)) +". add " + save1.get(l) +" to ("+ x+1 +","+ y+1+") position" );
                                    list.add(toInt(save1.get(l)+ x*10 + y));
                                }
                    }
                        
            
        }
        else{
            
            for( i=0; i<9; i++)
                for( j=0; j<9; j++){
                    if(board[i][j].charAt(1)=='2' || board[i][j].charAt(2)=='2' || board[i][j].charAt(1)=='6' || board[i][j].charAt(2)=='6'){

                        changed[3]="";
                        change[3]="";
                        pr=0;
                        for(int cun=0; !(changed[3].endsWith("*")) ; cun++){
                            changed=Man.moveMan(board[i][j]);
                            //System.out.println(i);
                            fix=Man.fixKish(changed);
                            //System.out.println(i);
                            if(fix==1 && cun==0)
                                System.out.println(board[i][j]+" :");
                            if(fix==1){
                                ch=Integer.parseInt(changed[0]);
                                System.out.print( i +""+ j +""+ ch/10 +""+ ch%10 +". move to (" +(ch/10+1) +","+ (ch%10+1)+") position  ");
                                list.add(i*1000 + j*100 + ch);
                                pr++;
                            }
                        }
                        if(pr>0)
                            System.out.println("");
                    }
                }
            int l;
            for( l=0; l<save2.size()-1; l++)
                    if(!(save2.get(l).equals("----"))){
                        
                        for(int x=3; x<6; x++ )
                            for(int y=0; y<9; y++ )
                                if(board[x][y].equals("----")){
                                    System.out.println(toInt(save2.get(l)) +". add " + save2.get(l) +" to ("+ x+1 +","+ y+1+") position" );
                                    list.add(toInt(save2.get(l)+ x*10 + y));
                                }
                    }
        }
        
        selection = scan.nextInt();
    }
    
    
    public int toInt(String ss12){
        
        int first=0;
        
            if(ss12.equals("P2.a")){
                first=160;
            }
            else if(ss12.equals("P2.b")){
                first=161;
            }
            else if(ss12.equals("P2.c")){
                first=162;
            }
            else if(ss12.equals("P2.d")){
            first=163;
            }
            else if(ss12.equals("P2.e")){
            first=164;
            }
            else if(ss12.equals("P2.f")){
            first=165;
            }
            else if(ss12.equals("P2.g")){
            first=166;
            }
            else if(ss12.equals("P2.h")){
            first=167;
            }
            else if(ss12.equals("P2.i")){
            first=168;
            }
            else if(ss12.equals(" R2 ")){
            first=170;
            }
            else if(ss12.equals(" B2 ")){
            first=178;
            }
            else if(ss12.equals("L2.a")){
            first=180;
            }
            else if(ss12.equals("N2.a")){
            first=181;
            }
            else if(ss12.equals("S2.a")){
            first=182;
            }
            else if(ss12.equals("G2.a")){
            first=183;
            }
            else if(ss12.equals("G2.b")){
            first=185;
            }
            else if(ss12.equals("S2.b")){
            first=186;
            }
            else if(ss12.equals("N2.b")){
            first=187;
            }
            else if(ss12.equals("L2.b")){
            first=188;
            }
            
            
            if(ss12.equals("P1.a")){
                first=120;
            }
            else if(ss12.equals("P1.b")){
            first=121;
            }
            else if(ss12.equals("P1.c")){
            first=122;
            }
            else if(ss12.equals("P1.d")){
            first=123;
            }
            else if(ss12.equals("P1.e")){
            first=124;
            }
            else if(ss12.equals("P1.f")){
            first=125;
            }
            else if(ss12.equals("P1.g")){
            first=126;
            }
            else if(ss12.equals("P1.h")){
            first=127;
            }
            else if(ss12.equals("P1.i")){
            first=128;
            }
            else if(ss12.equals(" R1 ")){
            first=110;
            }
            else if(ss12.equals(" B1 ")){
            first=118;
            }
            else if(ss12.equals("L1.a")){
            first=100;
            }
            else if(ss12.equals("N1.a")){
            first=101;
            }
            else if(ss12.equals("S1.a")){
            first=102;
            }
            else if(ss12.equals("G1.a")){
            first=103;
            }
            else if(ss12.equals("G1.b")){
            first=105;
            }
            else if(ss12.equals("S1.b")){
            first=106;
            }
            else if(ss12.equals("N1.b")){
            first=107;
            }
            else if(ss12.equals("L1.b")){
            first=108;
            }
            
            return first;
    }
    
    public String toString(int selec){
        String m="";
        
        if(selec==160){
            m="P5.a";
        }
        else if(selec==161){
            m="P5.b";
        }
         else if(selec==162){
            m="P5.c";
        }
         else if(selec==163){
            m="P5.d";
        }
         else if(selec==164){
            m="P5.e";
        }
         else if(selec==165){
            m="P5.f";
        }
         else if(selec==166){
            m="P5.g";
        }
         else if(selec==167){
            m="P5.h";
        }
         else if(selec==168){
            m="P5.i";
        }
         else if(selec==170){
            m=" R5 ";
        }
         else if(selec==178){
            m=" B5 ";
        }
         else if(selec==180){
            m="L5.a";
        }
         else if(selec==181){
            m="N5.a";
        }
         else if(selec==182){
            m="S5.a";
        }
         else if(selec==183){
            m="G5.a";
        }
         else if(selec==185){
            m="G5.b";
        }
         else if(selec==186){
            m="S5.b";
        }
         else if(selec==187){
            m="N5.b";
        }
         else if(selec==188){
            m="L5.b";
        }
        else if(selec==120){
            m="P6.a";
        }
        else if(selec==121){
            m="P6.b";
        }
         else if(selec==122){
            m="P6.c";
        }
         else if(selec==123){
            m="P6.d";
        }
         else if(selec==124){
            m="P6.e";
        }
         else if(selec==125){
            m="P6.f";
        }
         else if(selec==126){
            m="P6.g";
        }
         else if(selec==127){
            m="P6.h";
        }
         else if(selec==128){
            m="P6.i";
        }
         else if(selec==110){
            m=" R6 ";
        }
         else if(selec==118){
            m=" B6 ";
        }
         else if(selec==100){
            m="L6.a";
        }
         else if(selec==101){
            m="N6.a";
        }
         else if(selec==102){
            m="S6.a";
        }
         else if(selec==103){
            m="G6.a";
        }
         else if(selec==105){
            m="G6.b";
        }
         else if(selec==106){
            m="S6.b";
        }
         else if(selec==107){
            m="N6.b";
        }
         else if(selec==108){
            m="L6.b";
        }
        
        
        
        return m;
    }
    
    public void operator(){
        int i;
        int j=0;

        for( i=0; i<list.size(); i++)
            
            if(selection==(int)list.get(i)){
                if(selection>9999){
                    board[(int)list.get(i)/10%10][(int)list.get(i)%10]=toString(selection/100);
                    
                    if(player%2==1)
                        for (int c=0; c<save1.size()-1; c++ ) {
                            if(save1.get(c).equals(board[(int)list.get(i)/10%10][(int)list.get(i)%10]))
                                save1.set(c, "----");
                        }
                    else
                        for (int c=0; c<save1.size()-1; c++ ) {
                            if(save1.get(c).equals(board[(int)list.get(i)/10%10][(int)list.get(i)%10]))
                                save1.set(c, "----");
                        }
                    
                }
                else{
                    
                    if(player%2==1)
                        save1.add(board[(int)list.get(i)/10%10][(int)list.get(i)%10]);
                    else
                        save2.add(board[(int)list.get(i)/10%10][(int)list.get(i)%10]);
                    
                    board[(int)list.get(i)/10%10][(int)list.get(i)%10]=board[(int)list.get(i)/1000][(int)list.get(i)/100%10];
                    board[(int)list.get(i)/1000][(int)list.get(i)/100%10]="----";
                    upgrade((int)list.get(i)%100);
                    break;
                }
                
                
                
                
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
                    if(player%2==1){
                        board[ch/10][ch%10].replace('1', '7');
                        return 1;
                    }
                    else{
                        board[ch/10][ch%10].replace('2', '8');
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
