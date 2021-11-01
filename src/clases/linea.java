
package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;



public class linea {
    
   
    
    public static void hacerLInea(Graphics g){
       
        
        //colores
        // Sombrero
        int[] coordenadasX={150, 100, 180, 165, 180};
        int[] coordenadasY={20, 100, 100, 50, 50};
        g.setColor(new Color(108, 52, 131));// color violeta
        g.fillPolygon(coordenadasX, coordenadasY, 5);
        
        
        
        // ala del sombrero
        int[] coordenadasX1={50, 230, 230, 50};
        int[] coordenadasY1={100, 100, 110, 110};
        g.fillPolygon(coordenadasX1, coordenadasY1, 4);
        
        //dorso
        int[] coordenadasX2={105, 168, 192, 192, 81, 81 };
        int[] coordenadasY2={188, 188, 262, 269, 269,262};
        g.fillPolygon(coordenadasX2, coordenadasY2, 6);
        
        //brazo derecho
        int[] coordenadasX3={168, 225, 231, 176};
        int[] coordenadasY3={188, 178, 186, 215};
        g.fillPolygon(coordenadasX3, coordenadasY3, 4);
        
        
        //brazo izquierdo
        int[] coordenadasX4={62, 105, 96, 69};
        int[] coordenadasY4={247, 188, 215, 255};
        g.fillPolygon(coordenadasX4, coordenadasY4, 4);
        
        
        //cara 
        int[] coordenadasX5={105, 172, 185, 185, 168, 105, 88, 88};
        int[] coordenadasY5={110, 110, 148, 160, 188, 188, 168, 148};
        g.setColor(new Color(155, 219, 88));// color verde cara 
        g.fillPolygon(coordenadasX5, coordenadasY5, 8);
        
        
        //mano derecha
        int[] coordenadasX6={225, 225, 229, 229, 238, 242, 231};
        int[] coordenadasY6={178, 170, 170, 173, 170, 180, 186};
        g.fillPolygon(coordenadasX6, coordenadasY6, 7);
        
         //mano izquierda
        int[] coordenadasX7={55, 55, 62, 69, 69};
        int[] coordenadasY7={262, 255, 247, 255, 262};
        g.fillPolygon(coordenadasX7, coordenadasY7, 5);
        
        //pierna izquierda
        int[] coordenadasX8={102, 118, 144, 144, 133, 122};
        int[] coordenadasY8={269, 310, 310, 302, 302, 269};
        g.fillPolygon(coordenadasX8, coordenadasY8, 6);
        
         //pierna izquierda
        int[] coordenadasX9={142, 160, 186, 186, 170, 162};
        int[] coordenadasY9={269, 302, 302, 294, 294, 269};
        g.fillPolygon(coordenadasX9, coordenadasY9, 6);
        
        //medias 
        int[] coordenadasX10={186, 186, 192, 192};// derecha
        int[] coordenadasY10={294, 302, 294, 302};
        g.setColor(new Color(255, 255, 0));// color amarrillo
        g.fillPolygon(coordenadasX10, coordenadasY10, 4);
        
        int[] coordenadasX11={144, 144, 150, 150};// izquierda
        int[] coordenadasY11={302, 310, 310, 302};
        g.fillPolygon(coordenadasX11, coordenadasY11, 4);
        
        // bota derecha
        int[] coordenadasX12={192, 192, 202, 212, 212};
        int[] coordenadasY12={294, 302, 302, 319, 294};
        g.setColor(Color.black); ;// color negro 
        g.fillPolygon(coordenadasX12, coordenadasY12, 5);
        
         // bota izquierda
        int[] coordenadasX13={150, 150, 160, 170, 170};
        int[] coordenadasY13={302, 310, 310, 327, 302};
        g.fillPolygon(coordenadasX13, coordenadasY13, 5);
        
        
        // cinta del sombrero
        int[] coordenadasX18={114, 175, 170, 116};
        int[] coordenadasY18={80, 80,72, 72};
        g.fillPolygon(coordenadasX18, coordenadasY18, 4);
       
        // palo de la escoba izquierdo
        int[] coordenadasX14={45, 81, 81, 45};
        int[] coordenadasY14={262, 262, 269, 269};
        g.setColor(new Color(222, 184, 135));// color madera
        g.fillPolygon(coordenadasX14, coordenadasY14, 4);
        
        // palo de la escoba derecho
        int[] coordenadasX15={192, 228, 228, 192};
        int[] coordenadasY15={262, 262, 269, 269};
        g.fillPolygon(coordenadasX15, coordenadasY15, 4);
        
        // ojo derecho
        int[] coordenadasX16={172, 172, 148, 148};
        int[] coordenadasY16={118, 140, 140, 118};
        g.setColor(Color.WHITE);// color blanco
        g.fillPolygon(coordenadasX16, coordenadasY16, 4);
       
        // ojo izquierdo
        int[] coordenadasX17={130, 130, 106, 106};
        int[] coordenadasY17={118, 140, 140, 118};
        g.fillPolygon(coordenadasX17, coordenadasY17, 4);
        
        // pla escoba
        int[] coordenadasX21={228,240,240,228};
        int[] coordenadasY21={262,231,300,269};
        g.setColor(new Color(255, 69, 0));// color orange red
        g.fillPolygon(coordenadasX21, coordenadasY21, 4);
        
        
        
        g.setColor(Color.black);
        g.drawLine(150, 20, 100, 100);// primer linea del sombrero izquierda
        g.drawLine( 150, 20, 180, 50);
        g.drawLine(180, 50, 165, 50);
        g.drawLine( 165, 50, 180, 100);
        g.drawLine(180,100, 100, 100);
        g.drawLine( 175,80, 114, 80);//linea de la cinta
        g.drawLine( 170,72, 116, 72);
        g.drawLine(155,66, 140, 66);// inicia linea del cuadrado de la cinta el grande
        g.drawLine( 155,87, 140, 87);
        //cuadrado amarrillo de la cinta del sobrero
        
        g.drawLine(155,87, 155, 66);
        g.drawLine(140,66, 140, 87);// termina linea del cuadrado de la cinata el grande
        
        
        g.drawLine(155,72, 140, 72);// inicia linea del cuadrado de la cinta el pequeño
        g.drawLine( 155,80, 140, 80);
        g.drawLine( 151,80, 151, 72);
        g.drawLine( 143,72, 143, 80);// termina linea del cuadrado de la cinta el pequeño
        int[] coordenadasX19={140, 155, 155, 140};// derecha
        int[] coordenadasY19={66, 66, 87, 87};
        g.setColor(new Color(255, 255, 0));// color amarrillo
        g.fillPolygon(coordenadasX19, coordenadasY19, 4);
        
        int[] coordenadasX20={143, 151, 151, 143};// derecha
        int[] coordenadasY20={72, 72, 80, 80};
        g.setColor(Color.black);// color amarrillo
        g.fillPolygon(coordenadasX20, coordenadasY20, 4);
        
        g.setColor(Color.black);// color negro
        g.drawLine( 230,100, 50, 100);// inicia linea del ala del sombrero
        g.drawLine(230,100, 230, 110);
        g.drawLine( 50,100, 50, 110);
        g.drawLine(230,110, 50, 110);// finaliza linea del ala del sombrero
        g.drawLine(172,110, 192, 165);// linea cabello-cara derecha
        g.drawLine(105,110, 80, 165);// linea cabello-cara izquierda
        int p = 105;
        int p1= 80;
        int p2 =165; 
        
        for(int i = 1; i <= 8; i = i + 1){
        g.drawLine( p,110, p1, p2);// linea cabello-cara izquierda continua
        p = p-1;
        p1= p1-1;
        p2 =p2-1;
        }
        
        p = 102;
        p1= 64;
        p2 =157; 
        
        for(int i = 1; i <= 8; i = i + 1){
        g.drawLine( p,110, p1, p2);// linea cabello-cara izquierda media
        p = p-1;
        p1= p1-1;
        p2 =p2-1;
        }
        
        p = 97;
        p1= 48;
        p2 =149; 
        
        for(int i = 1; i <= 8; i = i + 1){
        g.drawLine( p,110, p1, p2);// linea cabello-cara izquierda final
        p = p-1;
        p1= p1-1;
        p2 =p2-1;
        }
        
        
        p = 172;
        p1= 192;
        p2 =165; 
        
        for(int i = 1; i <= 8; i = i + 1){
        g.drawLine( p,110, p1, p2);// linea cabello-cara izquierda continua
        p = p+1;
        p1= p1+1;
        p2 =p2-1;
        }
        
        p = 175;
        p1= 208;
        p2 =157; 
        
        for(int i = 1; i <= 8; i = i + 1){
        g.drawLine( p,110, p1, p2);// linea cabello-cara izquierda media
        p = p+1;
        p1= p1+1;
        p2 =p2-1;
        }
        
        
        p = 180;
        p1= 224;
        p2 =149; 
        
        for(int i = 1; i <= 8; i = i + 1){
        g.drawLine( p,110, p1, p2);// linea cabello-cara izquierda final
        p = p+1;
        p1= p1+1;
        p2 =p2-1;
        }
        
        
        
        g.drawLine(185,148, 185, 160);// linea mejilla derecha
        g.drawLine( 185,160, 168, 188);// linea mejilla derecha-cuello
        g.drawLine( 88,148, 88, 160);// linea mejilla izquierda
        g.drawLine( 88,160, 105, 188);// linea mejilla izquierda-cuello
        g.drawLine( 105,188, 168, 188);// linea del cuello
        g.drawLine( 118,171, 155, 171);// linea recta de sonrisa
        g.drawLine( 118,171, 114, 166);// linea recta de sonrisa pequeña izquierda
        g.drawLine( 155,171, 159, 166);// linea recta de sonrisa pequeña derecha
        g.drawLine( 114,166, 114, 161);// linea curva sonrisa izquierda
        g.drawLine( 159,166, 159, 161);// linea curva sonrisa derecha
        g.drawLine( 95,151, 140, 151);// linea de la nariz inferior
        g.drawLine( 95,151, 95, 140);
        g.drawLine( 95,140, 172, 140);// linea de la nariz superior
        g.drawLine( 172,140, 172, 118);// linea del ojo derecho derecha
        g.drawLine( 172,118, 148, 118);// linea del ojo derecho arriba
        g.drawLine( 148,118, 148, 140);// linea del ojo derecho izquierda
        g.drawLine( 130,140, 130, 118);// linea del ojo izquierdo derecha
        g.drawLine( 130,118, 106, 118);// linea del ojo izquierdo arriba
        g.drawLine( 106,118, 106, 140);// linea del ojo izquierdo izquierda
        g.drawLine( 164,140, 164, 124);// linea de la pupila derecho derecha
        g.drawLine( 164,124, 148, 124);// linea del la pupila derecho arriba
        g.drawLine( 114,140, 114, 124);// linea de la pupila izquierdo izquierda
        g.drawLine( 114,124, 130, 124);// linea del la pupila izquierdo arriba
        int n = 164;
        int m = 114;
        
        for(int i = 1; i <= 16; i = i + 1)
        {
         g.drawLine( n,140, n, 124);// linea de la pupila derecho relleno
         n=n-1;
         g.drawLine( m,140, m, 124);// linea de la pupila izquierdo relleno
         m=m+1;
        }
        
        g.drawLine( 105,188, 81, 262);// linea del vestido izquierda
        g.drawLine( 168,188, 192, 262);// linea del vestido derecha
        
        g.drawLine(  81, 262, 81,269);// linea del vestido izquierda pequeña
        g.drawLine(  192, 262, 192, 269);// linea del vestido derecha pequeña
        g.drawLine(  81, 269, 192, 269);// linea del vestido final
        
        g.drawLine(  81, 262, 45,262);// linea del palo escoba izquierda superior
        g.drawLine(  192, 262, 228,262);// linea del palo escoba derecha superior
        
        g.drawLine(  81, 269, 45,269);// linea del palo la escoba izquierda inferior
        g.drawLine(  192, 269, 228,269);// linea del palo la escoba derecha inferior
        
        g.drawLine(  45,269, 45,262);// linea de la escoba que cierra el palo a la izquierda
        g.drawLine(  228,269, 228,262);// linea de la escoba que cierra el palo a la derecha
        
        g.drawLine(  228,269, 240,300);// linea de la escoba que baja
        g.drawLine(  240,231, 240,300);// linea uion puntas de escoba
        
        g.drawLine(  228,262,240,231);// linea de la escoba sube
        
      
        g.setColor(new Color(255, 140, 0));// dark orange
        
        int e1 = 231;
        
        
        
        for(int i = 1; i <= 24; i = i + 1)
        {
         g.drawLine( 240,e1, 330,e1);// mechas escoba
         e1=e1+3;
        }
        
        g.setColor(Color.black);// dark orange
        g.drawLine(  55, 262, 55,255);// linea izquierda dela mano izquierda que sube por x
        g.drawLine( 69, 262, 69,255);// linea derecha dela mano izquierda que sube por x
        g.drawLine(  55, 255, 62, 247);// linea izquierda dela mano izquierda que une
        g.drawLine(  69, 255, 62, 247);// linea derecha dela mano izquierda que une
        
        g.drawLine(  62, 247,105,188 );// linea del brazo izquierdo al cuello
        g.drawLine(  69, 255,96, 215 );// linea del brazo izquierdo a la axila
        
        g.drawLine( 168, 188, 225, 178);// linea superior del brazo derecho
        g.drawLine( 176, 215, 231, 186);// linea inferior del brazo derecho
        g.drawLine( 225, 178, 231, 186);// linea de la muñeca del brazo derecho
        g.drawLine( 225, 178, 225, 170);// linea del dedo gordo que sube
        g.drawLine( 225, 170, 229, 170);// linea del dedo gordo que se despaza por x
        g.drawLine( 229, 170, 229, 173);// linea del dedo gordo que baja
        g.drawLine( 229, 173, 238, 170);// linea de la mano derecha que sube
        g.drawLine( 238, 170, 242, 180);// linea de la mano derecha que baja
        g.drawLine( 231, 186, 242, 180);// linea de la muñeca del brazo derecho
        
        g.drawLine(  102, 269, 118, 310);// linea izquierda de la pierna izquierda
        g.drawLine(  122, 269, 133, 302);// linea derecha de la pierna izquierda
        g.drawLine(  133, 302, 202, 302);// linea pantorrilla de la pierna izquierda superior.
        g.drawLine(  142, 269, 160, 302);// linea izquierda de la pierna derecha
        g.drawLine(  118, 310, 160, 310);// linea pantorrilla de la pierna izquierda inferior
        g.drawLine(  170, 302, 170, 327);// linea zapato izquierdo que baja por y 
        g.drawLine(  160, 310, 170, 327);// linea zapato izquierdo que sierra
        g.drawLine(  150, 302, 150, 310);// linea bota sierrra izquierda
        g.drawLine(  144, 302, 144, 310);// linea de la media  izquierda
        g.drawLine(  170, 294, 212, 294);// linea de la pantorrilla pierna derecha superior 
        g.drawLine(  212, 294, 212, 319);// linea zapato derecho que baja por y
        g.drawLine(  202, 302, 212, 319);// linea zapato derecho que sierra
        g.drawLine(  192, 302, 192, 294);// linea bota sierrra derecha
        g.drawLine(  186, 302, 186, 294);// linea de la media derecha
        g.drawLine(  170, 294, 162, 269);// linea de izquierda de la pierna derecha
        
        //luna
        int[] coordenadasX30={260, 290, 305, 314, 314, 305, 290, 260, 275, 286, 286, 275};// derecha
        int[] coordenadasY30={20, 20, 32, 50, 75, 87, 95, 95, 85, 75, 40, 30};
        g.setColor(Color.YELLOW);// color amarrillo
        g.fillPolygon(coordenadasX30, coordenadasY30, 12);
        
        g.setColor(Color.black);// color amarrillo
        
        g.drawLine(  260, 20, 290, 20);// linea superior
        g.drawLine(  290, 20, 305, 32);// linea 1 derecha
        g.drawLine(  305, 32,314,50);// linea 2 derecha
        g.drawLine(  314,50,314,75);// linea 3 derecha
        g.drawLine(  314, 75, 305,87);// linea 4 derecha
        g.drawLine(  305,87,290,95);// linea 5 derecha
        
        g.drawLine(  260, 20, 275, 30);// linea 1 izquierda
        g.drawLine(  275, 30, 286, 40);// linea 2 izquierda
        g.drawLine(  286, 40,286,75);// linea 3 izquierda
        g.drawLine(  286, 75, 275, 85);// linea 4 izquierda
        g.drawLine(  275, 85,260,95);// linea 5 izquierda
        
        g.drawLine(  260, 95, 290, 95);// linea inferior
        
        
       
       
       
        
        
        
    }
    
}
