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
                kish++;
            
            xMan = search("P2.b" , 'i');
            yMan = search("P2.b" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish++;
            
            xMan = search("P2.c" , 'i');
            yMan = search("P2.c" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish++;
            
            xMan = search("P2.d" , 'i');
            yMan = search("P2.d" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish++;
            
            xMan = search("P2.e" , 'i');
            yMan = search("P2.e" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish++;
            
            xMan = search("P2.f" , 'i');
            yMan = search("P2.f" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish++;
            
            xMan = search("P2.g" , 'i');
            yMan = search("P2.g" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish++;
            
            xMan = search("P2.h" , 'i');
            yMan = search("P2.h" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish++;
            
            xMan = search("P2.i" , 'i');
            yMan = search("P2.i" , 'j');
            if(yK==yMan && xK == xMan-1)
                kish++;
            
            xMan = search("L2.a" , 'i');
            yMan = search("L2.a" , 'j');
            if(xK > xMan && yK==yMan){
                if(xK==xMan-1)
                    kish++;
                if(xK==xMan-2 && Board[xMan+1][yMan].equals("----"))
                    kish++;
                if(xK==xMan-3 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----"))
                    kish++;
                if(xK==xMan-4 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----"))
                    kish++;
                if(xK==xMan-5 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----"))
                    kish++;
                if(xK==xMan-6 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----"))
                    kish++;
                if(xK==xMan-7 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----"))
                    kish++;
                if(xK==xMan-8 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----") && Board[xMan+7][yMan].equals("----"))
                    kish++;
            }
            
            xMan = search("L2.b" , 'i');
            yMan = search("L2.b" , 'j');
            if(xK > xMan && yK==yMan){
                if(xK==xMan-1)
                    kish++;
                if(xK==xMan-2 && Board[xMan+1][yMan].equals("----"))
                    kish++;
                if(xK==xMan-3 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----"))
                    kish++;
                if(xK==xMan-4 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----"))
                    kish++;
                if(xK==xMan-5 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----"))
                    kish++;
                if(xK==xMan-6 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----"))
                    kish++;
                if(xK==xMan-7 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----"))
                    kish++;
                if(xK==xMan-8 && Board[xMan+1][yMan].equals("----") && Board[xMan+2][yMan].equals("----") && Board[xMan+3][yMan].equals("----") && Board[xMan+4][yMan].equals("----") && Board[xMan+5][yMan].equals("----") && Board[xMan+6][yMan].equals("----") && Board[xMan+7][yMan].equals("----"))
                    kish++;
            }
            
            xMan = search("L2.b" , 'i');
            yMan = search("L2.b" , 'j');
            if(xK > xMan && yK==yMan)
            
            
        }
        else{
            
            
            
        }              
            
        
         
    
    
    
    }
    
    
    
}
