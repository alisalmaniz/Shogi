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
public class Man extends Board{
    
    protected int i;
    protected int j;
    protected int xK;
    protected int yK;
    protected int xMan;
    protected int yMan;
    protected int kish;
    
    public Man(){
        
        i=0;
        j=0;
        xK=0;
        yK=0;
        xMan=0;
        yMan=0;
        kish=0;
    }
    
    public void move1Right(){
        
        
        
    }
    
    public int search(String Man12 , char ij){
        
        searchfor:
            for( i=0; i<9; i++)
                for( j=0; j<9; j++)
                    if(Board[i][j].equals(Man12))
                        return ij=='i' ? i : j;
        return -1;
                        
    }
    
    public void kish(){
        
        if(player%2==1){
            
            xK = search(" K1 " , 'i');
            yK = search(" K1 " , 'j');
            
            xMan = search("P2.a" , 'i');
            yMan = search("P2.a" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=1;
            
            xMan = search("P2.b" , 'i');
            yMan = search("P2.b" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=2;
            
            xMan = search("P2.c" , 'i');
            yMan = search("P2.c" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=3;
            
            xMan = search("P2.d" , 'i');
            yMan = search("P2.d" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=4;
            
            xMan = search("P2.e" , 'i');
            yMan = search("P2.e" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=5;
            
            xMan = search("P2.f" , 'i');
            yMan = search("P2.f" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=6;
            
            xMan = search("P2.g" , 'i');
            yMan = search("P2.g" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=7;
            
            xMan = search("P2.h" , 'i');
            yMan = search("P2.h" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=8;
            
            xMan = search("P2.i" , 'i');
            yMan = search("P2.i" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=9;
            
            xMan = search("L2.a" , 'i');
            yMan = search("L2.a" , 'j');
            if(xK > xMan && yK==yMan){
                if(xK==xMan-1)
                    kish=10;
                if(xK==xMan-2 && Board[xMan+1][yMan].equals("----"))
                    kish=11;
                if(xK==xMan-3 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----"))
                    kish=12;
                if(xK==xMan-4 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----"))
                    kish=13;
                if(xK==xMan-5 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----"))
                    kish=14;
                if(xK==xMan-6 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----"))
                    kish=15;
                if(xK==xMan-7 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----"))
                    kish=16;
                if(xK==xMan-8 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----") && Board[xMan+7][yMan].equals("----"))
                    kish=17;
            }
            
            xMan = search("L2.b" , 'i');
            yMan = search("L2.b" , 'j');
            if(xK > xMan && yK==yMan){
                if(xK==xMan-1)
                    kish=18;
                if(xK==xMan-2 && Board[xMan+1][yMan].equals("----"))
                    kish=19;
                if(xK==xMan-3 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----"))
                    kish=20;
                if(xK==xMan-4 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----"))
                    kish=21;
                if(xK==xMan-5 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----"))
                    kish=22;
                if(xK==xMan-6 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----"))
                    kish=23;
                if(xK==xMan-7 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----"))
                    kish=24;
                if(xK==xMan-8 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----") && Board[xMan+7][yMan].equals("----"))
                    kish=25;
            }
            
            xMan = search("N2.a" , 'i');
            yMan = search("N2.a" , 'j');
            if(xK == xMan-2 && yK==yMan+1)
                kish=26;
            if(xK == xMan-2 && yK==yMan-1)
                kish=27;
            
            xMan = search("N2.b" , 'i');
            yMan = search("N2.b" , 'j');
            if(xK == xMan-2 && yK==yMan+1)
                kish=28;
            if(xK == xMan-2 && yK==yMan-1)
                kish=29;
            
            xMan = search("S2.a" , 'i');
            yMan = search("S2.a" , 'j');
            if(xK == xMan-1 && yK==yMan)
                kish=30;
            if(xK == xMan-1 && yK==yMan-1)
                kish=31;
            if(xK == xMan-1 && yK==yMan+1)
                kish=32;
            if(xK == xMan+1 && yK==yMan+1)
                kish=33;
            if(xK == xMan+1 && yK==yMan-1)
                kish=34;
            
            xMan = search("S2.b" , 'i');
            yMan = search("S2.b" , 'j');
            if(xK == xMan-1 && yK==yMan)
                kish=35;
            if(xK == xMan-1 && yK==yMan-1)
                kish=36;
            if(xK == xMan-1 && yK==yMan+1)
                kish=37;
            if(xK == xMan+1 && yK==yMan+1)
                kish=38;
            if(xK == xMan+1 && yK==yMan-1)
                kish=39;
            
            xMan = search("G2.a" , 'i');
            yMan = search("G2.a" , 'j');
            if(xK == xMan-1 && yK==yMan)
                kish=40;
            if(xK == xMan-1 && yK==yMan-1)
                kish=41;
            if(xK == xMan-1 && yK==yMan+1)
                kish=42;
            if(xK == xMan && yK==yMan-1)
                kish=43;
            if(xK == xMan && yK==yMan+1)
                kish=44;
            if(xK == xMan+1 && yK==yMan)
                kish=45;
            
            xMan = search("G2.b" , 'i');
            yMan = search("G2.b" , 'j');
            if(xK == xMan-1 && yK==yMan)
                kish=46;
            if(xK == xMan-1 && yK==yMan-1)
                kish=47;
            if(xK == xMan-1 && yK==yMan+1)
                kish=48;
            if(xK == xMan && yK==yMan-1)
                kish=49;
            if(xK == xMan && yK==yMan+1)
                kish=50;
            if(xK == xMan+1 && yK==yMan)
                kish=51;
            
            xMan = search(" B2 " , 'i');
            yMan = search(" B2 " , 'j');
            if( Math.abs(xK - xMan) == Math.abs(yK - yMan) ){
                if(xK==xMan-1 && yK==yMan-1)
                    kish=52;
                if(xK==xMan-2 && yK==yMan-2 && Board[xMan-1][yMan-1].equals("----"))
                    kish=53;
                if(xK==xMan-3 && yK==yMan-3 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----"))
                    kish=54;
                if(xK==xMan-4 && yK==yMan-4 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----"))
                    kish=55;
                if(xK==xMan-5 && yK==yMan-5 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----") && Board[xMan-4][yMan-4].equals("----"))
                    kish=56;
                if(xK==xMan-6 && yK==yMan-6 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----") && Board[xMan-4][yMan-4].equals("----") && Board[xMan-5][yMan-5].equals("----"))
                    kish=57;
                if(xK==xMan-7 && yK==yMan-7 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----") && Board[xMan-4][yMan-4].equals("----") && Board[xMan-5][yMan-5].equals("----") && Board[xMan-6][yMan-6].equals("----"))
                    kish=58;
                if(xK==xMan-8 && yK==yMan-8 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----") && Board[xMan-4][yMan-4].equals("----") && Board[xMan-5][yMan-5].equals("----") && Board[xMan-6][yMan-6].equals("----") && Board[xMan-7][yMan-7].equals("----"))
                    kish=59;
                
                if(xK==xMan-1 && yK==yMan+1)
                    kish=60;
                if(xK==xMan-2 && yK==yMan+2 && Board[xMan-1][yMan+1].equals("----"))
                    kish=61;
                if(xK==xMan-3 && yK==yMan+3 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----"))
                    kish=62;
                if(xK==xMan-4 && yK==yMan+4 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----"))
                    kish=63;
                if(xK==xMan-5 && yK==yMan+5 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----") && Board[xMan-4][yMan+4].equals("----"))
                    kish=64;
                if(xK==xMan-6 && yK==yMan+6 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----") && Board[xMan-4][yMan+4].equals("----") && Board[xMan-5][yMan+5].equals("----"))
                    kish=65;
                if(xK==xMan-7 && yK==yMan+7 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----") && Board[xMan-4][yMan+4].equals("----") && Board[xMan-5][yMan+5].equals("----") && Board[xMan-6][yMan+6].equals("----"))
                    kish=66;
                if(xK==xMan-8 && yK==yMan+8 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----") && Board[xMan-4][yMan+4].equals("----") && Board[xMan-5][yMan+5].equals("----") && Board[xMan-6][yMan+6].equals("----") && Board[xMan-7][yMan+7].equals("----"))
                    kish=67;
                
                if(xK==xMan+1 && yK==yMan-1)
                    kish=68;
                if(xK==xMan+2 && yK==yMan-2 && Board[xMan+1][yMan-1].equals("----"))
                    kish=69;
                if(xK==xMan+3 && yK==yMan-3 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----"))
                    kish=70;
                if(xK==xMan+4 && yK==yMan-4 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----"))
                    kish=71;
                if(xK==xMan+5 && yK==yMan-5 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----") && Board[xMan+4][yMan-4].equals("----"))
                    kish=72;
                if(xK==xMan+6 && yK==yMan-6 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----") && Board[xMan+4][yMan-4].equals("----") && Board[xMan+5][yMan-5].equals("----"))
                    kish=73;
                if(xK==xMan+7 && yK==yMan-7 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----") && Board[xMan+4][yMan-4].equals("----") && Board[xMan+5][yMan-5].equals("----") && Board[xMan+6][yMan-6].equals("----"))
                    kish=74;
                if(xK==xMan+8 && yK==yMan-8 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----") && Board[xMan+4][yMan-4].equals("----") && Board[xMan+5][yMan-5].equals("----") && Board[xMan+6][yMan-6].equals("----") && Board[xMan+7][yMan-7].equals("----"))
                    kish=75;
                
                if(xK==xMan+1 && yK==yMan+1)
                    kish=76;
                if(xK==xMan+2 && yK==yMan+2 && Board[xMan+1][yMan+1].equals("----"))
                    kish=77;
                if(xK==xMan+3 && yK==yMan+3 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----"))
                    kish=78;
                if(xK==xMan+4 && yK==yMan+4 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----"))
                    kish=79;
                if(xK==xMan+5 && yK==yMan+5 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----") && Board[xMan+4][yMan+4].equals("----"))
                    kish=80;
                if(xK==xMan+6 && yK==yMan+6 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----") && Board[xMan+4][yMan+4].equals("----") && Board[xMan+5][yMan+5].equals("----"))
                    kish=81;
                if(xK==xMan+7 && yK==yMan+7 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----") && Board[xMan+4][yMan+4].equals("----") && Board[xMan+5][yMan+5].equals("----") && Board[xMan+6][yMan+6].equals("----"))
                    kish=82;
                if(xK==xMan+8 && yK==yMan+8 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----") && Board[xMan+4][yMan+4].equals("----") && Board[xMan+5][yMan+5].equals("----") && Board[xMan+6][yMan+6].equals("----") && Board[xMan+7][yMan+7].equals("----"))
                    kish=83;
            }
            
            xMan = search(" R2 " , 'i');
            yMan = search(" R2 " , 'j');
            if( xK==xMan ){
                if(yK==yMan+1)
                    kish=84;
                if(yK==yMan+2 && Board[xMan][yMan+1].equals("----"))
                    kish=85;
                if(yK==yMan+3 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----"))
                    kish=86;
                if(yK==yMan+4 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----"))
                    kish=87;
                if(yK==yMan+5 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----") && Board[xMan][yMan+4].equals("----"))
                    kish=88;
                if(yK==yMan+6 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----") && Board[xMan][yMan+4].equals("----") && Board[xMan][yMan+5].equals("----"))
                    kish=89;
                if(yK==yMan+7 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----") && Board[xMan][yMan+4].equals("----") && Board[xMan][yMan+5].equals("----") && Board[xMan][yMan+6].equals("----"))
                    kish=90;
                if(yK==yMan+8 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----") && Board[xMan][yMan+4].equals("----") && Board[xMan][yMan+5].equals("----") && Board[xMan][yMan+6].equals("----") && Board[xMan][yMan+7].equals("----"))
                    kish=91;
                
                if(yK==yMan-1)
                    kish=92;
                if(yK==yMan-2 && Board[xMan][yMan-1].equals("----"))
                    kish=93;
                if(yK==yMan-3 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----"))
                    kish=94;
                if(yK==yMan-4 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----"))
                    kish=95;
                if(yK==yMan-5 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----") && Board[xMan][yMan-4].equals("----"))
                    kish=96;
                if(yK==yMan-6 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----") && Board[xMan][yMan-4].equals("----") && Board[xMan][yMan-5].equals("----"))
                    kish=97;
                if(yK==yMan-7 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----") && Board[xMan][yMan-4].equals("----") && Board[xMan][yMan-5].equals("----") && Board[xMan][yMan-6].equals("----"))
                    kish=98;
                if(yK==yMan-8 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----") && Board[xMan][yMan-4].equals("----") && Board[xMan][yMan-5].equals("----") && Board[xMan][yMan-6].equals("----") && Board[xMan][yMan-7].equals("----"))
                    kish=99;
            }
            
            if( yK==yMan ){
                if(xK==xMan+1)
                    kish=100;
                if(xK==xMan+2 && Board[xMan+1][yMan].equals("----"))
                    kish=101;
                if(xK==xMan+3 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----"))
                    kish=102;
                if(xK==xMan+4 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----"))
                    kish=103;
                if(xK==xMan+5 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----"))
                    kish=104;
                if(xK==xMan+6 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----"))
                    kish=105;
                if(xK==xMan+7 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----"))
                    kish=106;
                if(xK==xMan+8 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----") && Board[xMan+7][yMan].equals("----"))
                    kish=107;
                
                if(xK==xMan-1)
                    kish=108;
                if(xK==xMan-2 && Board[xMan-1][yMan].equals("----"))
                    kish=109;
                if(xK==xMan-3 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----"))
                    kish=110;
                if(xK==xMan-4 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----"))
                    kish=111;
                if(xK==xMan-5 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----") && Board[xMan-4][yMan].equals("----"))
                    kish=112;
                if(xK==xMan-6 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----") && Board[xMan-4][yMan].equals("----") && Board[xMan-5][yMan].equals("----"))
                    kish=113;
                if(xK==xMan-7 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----") && Board[xMan-4][yMan].equals("----") && Board[xMan-5][yMan].equals("----") && Board[xMan-6][yMan].equals("----"))
                    kish=114;
                if(xK==xMan-8 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----") && Board[xMan-4][yMan].equals("----") && Board[xMan-5][yMan].equals("----") && Board[xMan-6][yMan].equals("----") && Board[xMan-7][yMan].equals("----"))
                    kish=115;
            }
            
        }
        else{
            
            xK = search(" K2 " , 'i');
            yK = search(" K2 " , 'j');
            
            xMan = search("P1.a" , 'i');
            yMan = search("P1.a" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=1;
            
            xMan = search("P1.b" , 'i');
            yMan = search("P1.b" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=2;
            
            xMan = search("P1.c" , 'i');
            yMan = search("P1.c" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=3;
            
            xMan = search("P1.d" , 'i');
            yMan = search("P1.d" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=4;
            
            xMan = search("P1.e" , 'i');
            yMan = search("P1.e" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=5;
            
            xMan = search("P1.f" , 'i');
            yMan = search("P1.f" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=6;
            
            xMan = search("P1.g" , 'i');
            yMan = search("P1.g" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=7;
            
            xMan = search("P1.h" , 'i');
            yMan = search("P1.h" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=8;
            
            xMan = search("P1.i" , 'i');
            yMan = search("P1.i" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish=9;
            
            xMan = search("L1.a" , 'i');
            yMan = search("L1.a" , 'j');
            if(xK > xMan && yK==yMan){
                if(xK==xMan-1)
                    kish=10;
                if(xK==xMan-2 && Board[xMan+1][yMan].equals("----"))
                    kish=11;
                if(xK==xMan-3 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----"))
                    kish=12;
                if(xK==xMan-4 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----"))
                    kish=13;
                if(xK==xMan-5 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----"))
                    kish=14;
                if(xK==xMan-6 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----"))
                    kish=15;
                if(xK==xMan-7 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----"))
                    kish=16;
                if(xK==xMan-8 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----") && Board[xMan+7][yMan].equals("----"))
                    kish=17;
            }
            
            xMan = search("L1.b" , 'i');
            yMan = search("L1.b" , 'j');
            if(xK > xMan && yK==yMan){
                if(xK==xMan-1)
                    kish=18;
                if(xK==xMan-2 && Board[xMan+1][yMan].equals("----"))
                    kish=19;
                if(xK==xMan-3 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----"))
                    kish=20;
                if(xK==xMan-4 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----"))
                    kish=21;
                if(xK==xMan-5 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----"))
                    kish=22;
                if(xK==xMan-6 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----"))
                    kish=23;
                if(xK==xMan-7 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----"))
                    kish=24;
                if(xK==xMan-8 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----") && Board[xMan+7][yMan].equals("----"))
                    kish=25;
            }
            
            xMan = search("N1.a" , 'i');
            yMan = search("N1.a" , 'j');
            if(xK == xMan-2 && yK==yMan+1)
                kish=26;
            if(xK == xMan-2 && yK==yMan-1)
                kish=27;
            
            xMan = search("N1.b" , 'i');
            yMan = search("N1.b" , 'j');
            if(xK == xMan-2 && yK==yMan+1)
                kish=28;
            if(xK == xMan-2 && yK==yMan-1)
                kish=29;
            
            xMan = search("S1.a" , 'i');
            yMan = search("S1.a" , 'j');
            if(xK == xMan-1 && yK==yMan)
                kish=30;
            if(xK == xMan-1 && yK==yMan-1)
                kish=31;
            if(xK == xMan-1 && yK==yMan+1)
                kish=32;
            if(xK == xMan+1 && yK==yMan+1)
                kish=33;
            if(xK == xMan+1 && yK==yMan-1)
                kish=34;
            
            xMan = search("S1.b" , 'i');
            yMan = search("S1.b" , 'j');
            if(xK == xMan-1 && yK==yMan)
                kish=35;
            if(xK == xMan-1 && yK==yMan-1)
                kish=36;
            if(xK == xMan-1 && yK==yMan+1)
                kish=37;
            if(xK == xMan+1 && yK==yMan+1)
                kish=38;
            if(xK == xMan+1 && yK==yMan-1)
                kish=39;
            
            xMan = search("G1.a" , 'i');
            yMan = search("G1.a" , 'j');
            if(xK == xMan-1 && yK==yMan)
                kish=40;
            if(xK == xMan-1 && yK==yMan-1)
                kish=41;
            if(xK == xMan-1 && yK==yMan+1)
                kish=42;
            if(xK == xMan && yK==yMan-1)
                kish=43;
            if(xK == xMan && yK==yMan+1)
                kish=44;
            if(xK == xMan+1 && yK==yMan)
                kish=45;
            
            xMan = search("G1.b" , 'i');
            yMan = search("G1.b" , 'j');
            if(xK == xMan-1 && yK==yMan)
                kish=46;
            if(xK == xMan-1 && yK==yMan-1)
                kish=47;
            if(xK == xMan-1 && yK==yMan+1)
                kish=48;
            if(xK == xMan && yK==yMan-1)
                kish=49;
            if(xK == xMan && yK==yMan+1)
                kish=50;
            if(xK == xMan+1 && yK==yMan)
                kish=51;
            
            xMan = search(" B1 " , 'i');
            yMan = search(" B1 " , 'j');
            if( Math.abs(xK - xMan) == Math.abs(yK - yMan) ){
                if(xK==xMan-1 && yK==yMan-1)
                    kish=52;
                if(xK==xMan-2 && yK==yMan-2 && Board[xMan-1][yMan-1].equals("----"))
                    kish=53;
                if(xK==xMan-3 && yK==yMan-3 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----"))
                    kish=54;
                if(xK==xMan-4 && yK==yMan-4 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----"))
                    kish=55;
                if(xK==xMan-5 && yK==yMan-5 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----") && Board[xMan-4][yMan-4].equals("----"))
                    kish=56;
                if(xK==xMan-6 && yK==yMan-6 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----") && Board[xMan-4][yMan-4].equals("----") && Board[xMan-5][yMan-5].equals("----"))
                    kish=57;
                if(xK==xMan-7 && yK==yMan-7 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----") && Board[xMan-4][yMan-4].equals("----") && Board[xMan-5][yMan-5].equals("----") && Board[xMan-6][yMan-6].equals("----"))
                    kish=58;
                if(xK==xMan-8 && yK==yMan-8 && Board[xMan-1][yMan-1].equals("----") && Board[xMan-2][yMan-2].equals("----") && Board[xMan-3][yMan-3].equals("----") && Board[xMan-4][yMan-4].equals("----") && Board[xMan-5][yMan-5].equals("----") && Board[xMan-6][yMan-6].equals("----") && Board[xMan-7][yMan-7].equals("----"))
                    kish=59;
                
                if(xK==xMan-1 && yK==yMan+1)
                    kish=60;
                if(xK==xMan-2 && yK==yMan+2 && Board[xMan-1][yMan+1].equals("----"))
                    kish=61;
                if(xK==xMan-3 && yK==yMan+3 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----"))
                    kish=62;
                if(xK==xMan-4 && yK==yMan+4 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----"))
                    kish=63;
                if(xK==xMan-5 && yK==yMan+5 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----") && Board[xMan-4][yMan+4].equals("----"))
                    kish=64;
                if(xK==xMan-6 && yK==yMan+6 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----") && Board[xMan-4][yMan+4].equals("----") && Board[xMan-5][yMan+5].equals("----"))
                    kish=65;
                if(xK==xMan-7 && yK==yMan+7 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----") && Board[xMan-4][yMan+4].equals("----") && Board[xMan-5][yMan+5].equals("----") && Board[xMan-6][yMan+6].equals("----"))
                    kish=66;
                if(xK==xMan-8 && yK==yMan+8 && Board[xMan-1][yMan+1].equals("----") && Board[xMan-2][yMan+2].equals("----") && Board[xMan-3][yMan+3].equals("----") && Board[xMan-4][yMan+4].equals("----") && Board[xMan-5][yMan+5].equals("----") && Board[xMan-6][yMan+6].equals("----") && Board[xMan-7][yMan+7].equals("----"))
                    kish=67;
                
                if(xK==xMan+1 && yK==yMan-1)
                    kish=68;
                if(xK==xMan+2 && yK==yMan-2 && Board[xMan+1][yMan-1].equals("----"))
                    kish=69;
                if(xK==xMan+3 && yK==yMan-3 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----"))
                    kish=70;
                if(xK==xMan+4 && yK==yMan-4 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----"))
                    kish=71;
                if(xK==xMan+5 && yK==yMan-5 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----") && Board[xMan+4][yMan-4].equals("----"))
                    kish=72;
                if(xK==xMan+6 && yK==yMan-6 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----") && Board[xMan+4][yMan-4].equals("----") && Board[xMan+5][yMan-5].equals("----"))
                    kish=73;
                if(xK==xMan+7 && yK==yMan-7 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----") && Board[xMan+4][yMan-4].equals("----") && Board[xMan+5][yMan-5].equals("----") && Board[xMan+6][yMan-6].equals("----"))
                    kish=74;
                if(xK==xMan+8 && yK==yMan-8 && Board[xMan+1][yMan-1].equals("----") && Board[xMan+2][yMan-2].equals("----") && Board[xMan+3][yMan-3].equals("----") && Board[xMan+4][yMan-4].equals("----") && Board[xMan+5][yMan-5].equals("----") && Board[xMan+6][yMan-6].equals("----") && Board[xMan+7][yMan-7].equals("----"))
                    kish=75;
                
                if(xK==xMan+1 && yK==yMan+1)
                    kish=76;
                if(xK==xMan+2 && yK==yMan+2 && Board[xMan+1][yMan+1].equals("----"))
                    kish=77;
                if(xK==xMan+3 && yK==yMan+3 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----"))
                    kish=78;
                if(xK==xMan+4 && yK==yMan+4 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----"))
                    kish=79;
                if(xK==xMan+5 && yK==yMan+5 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----") && Board[xMan+4][yMan+4].equals("----"))
                    kish=80;
                if(xK==xMan+6 && yK==yMan+6 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----") && Board[xMan+4][yMan+4].equals("----") && Board[xMan+5][yMan+5].equals("----"))
                    kish=81;
                if(xK==xMan+7 && yK==yMan+7 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----") && Board[xMan+4][yMan+4].equals("----") && Board[xMan+5][yMan+5].equals("----") && Board[xMan+6][yMan+6].equals("----"))
                    kish=82;
                if(xK==xMan+8 && yK==yMan+8 && Board[xMan+1][yMan+1].equals("----") && Board[xMan+2][yMan+2].equals("----") && Board[xMan+3][yMan+3].equals("----") && Board[xMan+4][yMan+4].equals("----") && Board[xMan+5][yMan+5].equals("----") && Board[xMan+6][yMan+6].equals("----") && Board[xMan+7][yMan+7].equals("----"))
                    kish=83;
            }
            
            xMan = search(" R1 " , 'i');
            yMan = search(" R1 " , 'j');
            if( xK==xMan ){
                if(yK==yMan+1)
                    kish=84;
                if(yK==yMan+2 && Board[xMan][yMan+1].equals("----"))
                    kish=85;
                if(yK==yMan+3 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----"))
                    kish=86;
                if(yK==yMan+4 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----"))
                    kish=87;
                if(yK==yMan+5 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----") && Board[xMan][yMan+4].equals("----"))
                    kish=88;
                if(yK==yMan+6 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----") && Board[xMan][yMan+4].equals("----") && Board[xMan][yMan+5].equals("----"))
                    kish=89;
                if(yK==yMan+7 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----") && Board[xMan][yMan+4].equals("----") && Board[xMan][yMan+5].equals("----") && Board[xMan][yMan+6].equals("----"))
                    kish=90;
                if(yK==yMan+8 && Board[xMan][yMan+1].equals("----") && Board[xMan][yMan+2].equals("----") && Board[xMan][yMan+3].equals("----") && Board[xMan][yMan+4].equals("----") && Board[xMan][yMan+5].equals("----") && Board[xMan][yMan+6].equals("----") && Board[xMan][yMan+7].equals("----"))
                    kish=91;
                
                if(yK==yMan-1)
                    kish=92;
                if(yK==yMan-2 && Board[xMan][yMan-1].equals("----"))
                    kish=93;
                if(yK==yMan-3 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----"))
                    kish=94;
                if(yK==yMan-4 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----"))
                    kish=95;
                if(yK==yMan-5 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----") && Board[xMan][yMan-4].equals("----"))
                    kish=96;
                if(yK==yMan-6 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----") && Board[xMan][yMan-4].equals("----") && Board[xMan][yMan-5].equals("----"))
                    kish=97;
                if(yK==yMan-7 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----") && Board[xMan][yMan-4].equals("----") && Board[xMan][yMan-5].equals("----") && Board[xMan][yMan-6].equals("----"))
                    kish=98;
                if(yK==yMan-8 && Board[xMan][yMan-1].equals("----") && Board[xMan][yMan-2].equals("----") && Board[xMan][yMan-3].equals("----") && Board[xMan][yMan-4].equals("----") && Board[xMan][yMan-5].equals("----") && Board[xMan][yMan-6].equals("----") && Board[xMan][yMan-7].equals("----"))
                    kish=99;
            }
            
            if( yK==yMan ){
                if(xK==xMan+1)
                    kish=100;
                if(xK==xMan+2 && Board[xMan+1][yMan].equals("----"))
                    kish=101;
                if(xK==xMan+3 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----"))
                    kish=102;
                if(xK==xMan+4 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----"))
                    kish=103;
                if(xK==xMan+5 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----"))
                    kish=104;
                if(xK==xMan+6 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----"))
                    kish=105;
                if(xK==xMan+7 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----"))
                    kish=106;
                if(xK==xMan+8 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----") && Board[xMan+7][yMan].equals("----"))
                    kish=107;
                
                if(xK==xMan-1)
                    kish=108;
                if(xK==xMan-2 && Board[xMan-1][yMan].equals("----"))
                    kish=109;
                if(xK==xMan-3 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----"))
                    kish=110;
                if(xK==xMan-4 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----"))
                    kish=111;
                if(xK==xMan-5 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----") && Board[xMan-4][yMan].equals("----"))
                    kish=112;
                if(xK==xMan-6 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----") && Board[xMan-4][yMan].equals("----") && Board[xMan-5][yMan].equals("----"))
                    kish=113;
                if(xK==xMan-7 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----") && Board[xMan-4][yMan].equals("----") && Board[xMan-5][yMan].equals("----") && Board[xMan-6][yMan].equals("----"))
                    kish=114;
                if(xK==xMan-8 && Board[xMan-1][yMan].equals("----") && Board[xMan-2][yMan].equals("----") && Board[xMan-3][yMan].equals("----") && Board[xMan-4][yMan].equals("----") && Board[xMan-5][yMan].equals("----") && Board[xMan-6][yMan].equals("----") && Board[xMan-7][yMan].equals("----"))
                    kish=115;
            }
            
            
        }              
            
        
         
    
    
    
    }
    
    
    
}
