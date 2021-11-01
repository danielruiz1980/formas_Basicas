
package clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class acoplada {
     public static void hacerAcoplada(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        BasicStroke grosor2 = new BasicStroke(4);
        g2d.setStroke(grosor2);
        g2d.setColor(Color.black); 
        
        int[] trenX0={0, 380, 380, 0 };
        int[] trenY0={0, 0, 250, 250};
        g2d.setColor(new Color(133, 193, 233));// azul claro 
        g2d.fillPolygon(trenX0, trenY0, 4);
        
        int[] trenX01={0, 380, 380, 0 };
        int[] trenY01={250, 250, 400, 400};
        g2d.setColor(new Color(130, 224, 170));// verde
        g2d.fillPolygon(trenX01, trenY01, 4);
        
        //cuerpo
        int[] trenX1={170, 330, 330, 170 };
        int[] trenY1={270, 270, 350, 350};
        g2d.setColor(Color.YELLOW);
        g2d.fillPolygon(trenX1, trenY1, 4);
        g2d.setColor(Color.black);
        g2d.drawPolygon(trenX1, trenY1, 4);
        
        int[] trenX2={255, 325, 325, 255 };// cabina
        int[] trenY2={170, 170, 270, 270};
        g2d.setColor(new Color(30, 132, 73));// verde 
        g2d.fillPolygon(trenX2, trenY2, 4);
        g2d.setColor(Color.black);
        g2d.drawPolygon(trenX2, trenY2, 4);
        
        // chimenea 
        int[] trenX3={180, 217, 217, 180 };
        int[] trenY3={220, 220, 270, 270};
        g2d.setColor(new Color(91, 44, 111));//violeta oscuro
        g2d.fillPolygon(trenX3, trenY3, 4);
        g2d.setColor(Color.black);
        g2d.drawPolygon(trenX3, trenY3, 4);
        
        
        int[] trenX4={170, 227, 217, 180 };
        int[] trenY4={200, 200, 220, 220};
        g2d.setColor(new Color(125, 60, 152));// violeta mas oscuro
        g2d.fillPolygon(trenX4, trenY4, 4);
        g2d.setColor(Color.black);
        g2d.drawPolygon(trenX4, trenY4, 4);
        
        //techo 
        
        int[] trenX5={240, 310, 325, 255 };
        int[] trenY5={150, 150, 170, 170};
        g2d.setColor(Color.YELLOW);// verde 
        g2d.fillPolygon(trenX5, trenY5, 4);
        g2d.setColor(Color.black);
        g2d.drawPolygon(trenX5, trenY5, 4);
        
        //palo semaforo
        int[] trenX6={80, 90, 90, 80 };// cabina
        int[] trenY6={260, 260, 386, 386};
        g2d.setColor(new Color(222, 184, 135));// madera
        g2d.fillPolygon(trenX6, trenY6, 4);
        g2d.setColor(Color.black);
        g2d.drawPolygon(trenX6, trenY6, 4);
        
         //semaforo
        int[] trenX7={55, 115, 100, 70 };// 
        int[] trenY7={200, 200, 260, 260};
        g2d.setColor(new Color(222, 184, 135));// madera
        g2d.fillPolygon(trenX7, trenY7, 4);
        g2d.setColor(Color.black);
        g2d.drawPolygon(trenX7, trenY7, 4);
        
        
         //techo semaforo
        int[] trenX8={85,  55, 115 };// 
        int[] trenY8={160, 200, 200};
        g2d.setColor(new Color(44, 62, 80));// madera
        g2d.fillPolygon(trenX8, trenY8, 3);
        g2d.setColor(Color.black);
        g2d.drawPolygon(trenX8, trenY8, 3);
        
        
        int[] trenX9={270, 310, 310, 270 };
        int[] trenY9={190, 190, 230, 230};
        g2d.setColor(new Color(130, 224, 170));// verde
        g2d.fillPolygon(trenX9, trenY9, 4);
        g2d.setColor(Color.black);
        g2d.drawPolygon(trenX9, trenY9, 4);
        
        
        //Rueda grande
        g2d.setColor(new Color(166, 172, 175));// gris claro
        g2d.fillOval(250, 290, 95, 98);
        g2d.setColor(Color.black); 
        g2d.drawOval(250, 290, 95, 98);
        
        // circulo interior rueda grande 
        g2d.setColor(Color.black); 
        g2d.drawOval(279, 320, 37, 40);
        
        
        //Rueda pequeña
        g2d.setColor(new Color(166, 172, 175));// gris claro
        g2d.fillOval(175, 322, 60, 63);
        g2d.setColor(Color.black); // 
        g2d.drawOval(175, 322, 60, 63);
        
        // circulo interior rueda pequeña 
        g2d.setColor(Color.black); // 
        g2d.drawOval(195, 342, 20, 23);
        
        
        //manija
        g2d.setColor(Color.ORANGE);
        g2d.fillOval(265, 241, 8, 10);
        g2d.setColor(Color.black); 
        g2d.drawOval(265, 241, 8, 10);
        
        //luz verde del semaforo
        g2d.setColor(Color.GREEN);
        g2d.fillOval(80, 241, 12, 14);
        g2d.setColor(Color.black); 
        g2d.drawOval(80, 241, 12, 14);
        
        //luz amarilla del semaforo
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(80, 222, 12, 14);
        g2d.setColor(Color.black); 
        g2d.drawOval(80, 222, 12, 14);
        
        //luz roja del semaforo
        g2d.setColor(Color.RED);
        g2d.fillOval(80, 204, 12, 14);
        g2d.setColor(Color.black); 
        g2d.drawOval(80, 204, 12, 14);
        
        
        
        //sol 
        g2d.setColor(new Color(250, 239, 4));// amarillo palido
        g2d.fillOval(50, 50, 58, 61);
        g2d.setColor(Color.black); // 
        g2d.drawOval(50, 50, 58, 61);
        
        // rayos del sol 
        g2d.setColor(new Color(255, 198, 3));// amarillo palido
        g2d.drawLine(14, 80, 44, 80);
        g2d.drawLine(114, 80, 144, 80);
        g2d.drawLine(80, 44, 80, 14);
        g2d.drawLine(80, 117, 80, 147);
        
               
        
        
        
        
        
        
        
     }
        
}
