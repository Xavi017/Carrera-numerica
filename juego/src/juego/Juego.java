/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;

public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int jugadores=0;
        int tablero=0;
        int indicador=0;
        boolean play=true;
        while(1==1){
        System.out.println("CANTIDAD DE JUGADORES DE 2 A 4 JUGADORES");
        jugadores = sc.nextInt();
        if(jugadores>=2 && jugadores <=4){
            System.out.println("========================");
        break;
        }else{
            System.out.println("========================");
            System.out.println("JUGADORES FUERA DE RANGO");
            System.out.println("========================");
        }
        }
        while(1==1){
            System.out.println("SELECCIONE TABLERO"); 
            System.out.println("1 NIVEL BASICO(TABLERO DE 20 POSICIONES)");  
            System.out.println("2 NIVEL INTERMEDIO(TABLERO DE 30 POSICIONES)");  
            System.out.println("3 NIVEL AVANZADO(TABLERO DE 50 POSICIONES)"); 
            tablero=sc.nextInt();
            if(tablero>=1 && tablero<=3){
            System.out.println("========================");
            break;
            }else{
            System.out.println("========================");
            System.out.println("NO EXISTE TABLERO");
            System.out.println("========================");
        }
        }
        
        
        
        //inicio del juego
        
         int[][] juego = new int[jugadores][1];
         for (int i = 0; i < jugadores; i++) {
            if(tablero==1){
                juego[i][0]=20;
                indicador=20;
            }
            if(tablero==2){
                juego[i][0]=30;
                indicador=30;
            }
            if(tablero==3){
                juego[i][0]=50;
                indicador=50;
            }
        }
         
       
         
         while(play){
             for (int i = 0; i < juego.length; i++) {
                 System.out.println("==================");
                 System.out.println("TURNO JUGADOR "+(i+1));
                 //System.out.println("POSICIÓN ACTUAL "+((juego[i][0]-indicador))*-1);
                 
                 System.out.println("POSICIÓN "+((juego[i][0]-indicador))*-1);
                 if(juego[i][0]<=6){
                     System.out.println("UN DADO");
                     int d3 = (int) (Math.random() * 6) + 1;
                     System.out.println("Dado 1 : "+d3);
                      juego[i][0]=juego[i][0]-d3;
                      
                      if(juego[i][0]==0){
                     System.out.println("GANADOR JUGADOR "+(i+1));
                     System.out.println("POSICIÓN ACTUAL "+((juego[i][0]-indicador))*-1);
                     play=false;
                     break;
                      }if(juego[i][0]<0){
                          System.out.println("DEBE CAER EN LA POSICION EXACTA");
                      juego[i][0]=juego[i][0]+d3;
                      }
                      System.out.println("POSICIÓN ACTUAL "+((juego[i][0]-indicador))*-1);
                 }else{
                    System.out.println("Lanzando dados");
                   int d1 = (int) (Math.random() * 6) + 1;
                   int d2 = (int) (Math.random() * 6) + 1;
                   int totaldado=d1+d2;
                   //pares
                   System.out.println("Dado 1 : "+d1+" Dado 2 : "+d2+" Total : "+totaldado);
                   if(d1==d2){
                   int d11 = (int) (Math.random() * 6) + 1;
                   int d12 = (int) (Math.random() * 6) + 1;
                   int tt=d11+d12;
                   System.out.println("Dado 1 : "+d11+" Dado 2 : "+d12+" Total : "+tt);
                   totaldado=totaldado+tt;
                   if(d11==d12){  
                   int d21 = (int) (Math.random() * 6) + 1;
                   int d22 = (int) (Math.random() * 6) + 1;
                   int ttt=d21+d22;
                   System.out.println("Dado 1 : "+d21+" Dado 2 : "+d22+" Total : "+ttt);
                   totaldado=totaldado+ttt;
                        if(d21==d22){
                        System.out.println("GANADOR JUGADOR "+(i+1));
                          System.out.println("3 PARES SEGUIDOS :) ");
                          play=false;
                          break;
                        }
                   }
                   
                   
                   }
                   
                   
                   juego[i][0]=juego[i][0]-totaldado;
                  // System.out.println("POSICIÓN ACTUAL "+((juego[i][0]-indicador))*-1);
                    System.out.println("POSICIÓN ACTUAL "+((juego[i][0]-indicador))*-1);
                   if(juego[i][0]==0){
                       System.out.println("GANADOR JUGADOR "+(i+1));
                       play=false;
                       break;
                   }
                   if(juego[i][0]<0){
                   juego[i][0]=juego[i][0]+totaldado;
                       System.out.println("DEBE CAER EN LA POSICION EXACTA");
                   }
                 }
                
             }
            
              
         }
        
       
        
        
    }
    
}
