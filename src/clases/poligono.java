
package clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Arrays;

public class poligono {
    public static void hacerPoligo(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        BasicStroke grosor2 = new BasicStroke(4);
        g2d.setStroke(grosor2);
        g2d.setColor(Color.black); 
        
        
        
        
        // cara
        int[] osoX1={190, 110, 45, 90, 167, 190, 213, 290, 335, 270};
        int[] osoY1={60, 90, 210, 287, 317, 305, 317, 287, 210, 90};
        g2d.setColor(Color.WHITE);
        g2d.fillPolygon(osoX1, osoY1, 10);
        g2d.setColor(Color.black);
        g2d.drawPolygon(osoX1, osoY1, 10);
        
        // retangulo izquierdo
        int[] osoX2={110, 160, 90, 45};
        int[] osoY2={90, 163, 287, 210};
        g2d.drawPolygon(osoX2, osoY2, 4);
        
        // retangulo derecho
        int[] osoX3={270, 220, 290, 335};
        int[] osoY3={90, 163, 287, 210};
        g2d.drawPolygon(osoX3, osoY3, 4);
        
        
         // pomulo izquierdo
        int[] osoX4={135, 142, 90, 115};
        int[] osoY4={265, 307, 287, 242};
        g2d.drawPolygon(osoX4, osoY4, 4);
        
         // pomulo derecho
        int[] osoX5={245, 238, 290, 265};
        int[] osoY5={265, 307, 287, 242};
        g2d.drawPolygon(osoX5, osoY5, 4);
        
         // menton
        int[] osoX6={142, 159, 190, 221, 238, 213, 190, 167};
        int[] osoY6={307, 325, 340, 325, 307, 317, 305, 317};
        g2d.setColor(Color.WHITE);
        g2d.fillPolygon(osoX6, osoY6, 8);
        g2d.setColor(Color.black);
        g2d.drawPolygon(osoX6, osoY6, 8);
        
        
         // boca
        int[] osoX7={190, 175, 190, 205};
        int[] osoY7={305, 313, 316, 313};
        g2d.fillPolygon(osoX7, osoY7, 4);
        g2d.drawPolygon(osoX7, osoY7, 4);
        
        g2d.drawLine(190, 300, 190, 305);//guia
        
        //nariz
        int[] osoX8={190, 215, 224, 190, 156, 165};
        int[] osoY8={300, 290, 278, 284, 278, 290};
        g2d.fillPolygon(osoX8, osoY8, 6);
        g2d.drawPolygon(osoX8, osoY8, 6);
        
        
        //ojo izquierdo
        int[] osoX9={160, 152, 135, 115};
        int[] osoY9={163, 240, 265, 242};
        g2d.fillPolygon(osoX9, osoY9, 4);
        g2d.drawPolygon(osoX9, osoY9, 4);
        
        
        //ojo derecho
        int[] osoX10={220, 228, 245, 265};
        int[] osoY10={163, 240, 265, 242};
        g2d.fillPolygon(osoX10, osoY10, 4);
        g2d.drawPolygon(osoX10, osoY10, 4);
        
        
        //oreja izquierdo
        int[] osoX11={110, 65, 40, 62};
        int[] osoY11={90, 62, 107, 177};
        g2d.fillPolygon(osoX11, osoY11, 4);
        g2d.drawPolygon(osoX11, osoY11, 4);
        
        //oreja derecha
        int[] osoX12={270, 315, 340, 318};
        int[] osoY12={90, 62, 107, 177};
        g2d.fillPolygon(osoX12, osoY12, 4);
        g2d.drawPolygon(osoX12, osoY12, 4);
        
    }
}
