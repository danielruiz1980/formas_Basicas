
package clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class circulo {
    
    public static void hacerCirculo(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        
        
        // color del lapiz
        int[] coordenadasXlapiz={122,250,242,250,122};
        int[] coordenadasYlapiz={263,263,283,303,303};
        g.setColor(new Color(237, 234, 10));// color amarrillo 
        g.fillPolygon(coordenadasXlapiz, coordenadasYlapiz, 5);
        
        //color de la punta
        g.setColor(new Color(252, 243, 207));// color amarrillo 
        int[] coordenadasXpunta={250,275,250,242};
        int[] coordenadasYpunta={263,283,303,283};
        g.fillPolygon(coordenadasXpunta, coordenadasYpunta, 4);
        
        // lapiz 
        BasicStroke grosor2 = new BasicStroke(4);
        g2d.setStroke(grosor2);
        g2d.setColor(Color.black);    
        g2d.drawLine(122, 263, 250, 263);// linea superior del lapiz
        g2d.drawLine(122, 303, 250, 303);// linea inferior del lapiz
        g2d.drawLine(122, 263, 122, 303);// linea izquierda del lapiz
        g2d.drawLine(250, 263, 242, 283);// linea derecha superior  del lapiz
        g2d.drawLine(250, 303, 242, 283);// linea derecha inferior  del lapiz
        
        
                
        // punta del lapiz
        g2d.drawLine( 250, 263, 275, 283);
        g2d.drawLine( 250, 303, 275, 283);
        
        
        
        
        
        g.fillOval(80, 130, 200, 140);// cuerpo de la abeja
        g.setColor(new Color(237, 234, 10));// color amarrillo
        g.fillArc(120, 142, 30, 166, 100, 96);// primer arco franja amariila
        g.fillArc(120, 136, 100, 51, 70, 71);//  arco franja amariila superior
        g.fillArc(113, 142, 100, 50, 90, 40);//  arco franja amariila superior1
        g.fillArc(113, 145, 100, 50, 90, 40);//  arco franja amariila superior2
        g.fillArc(118, 152, 100, 50, 90, 40);//  arco franja amariila superior3
        g.fillArc(113, 150, 100, 50, 90, 40);//  arco franja amariila superior4
        g.fillArc(113, 155, 100, 60, 90, 50);//  arco franja amariila superior5
        g.fillArc(113, 150, 100, 60, 90, 50);//  arco franja amariila superior6
        g.fillArc(113, 144, 100, 65, 90, 50);//  arco franja amariila superior6
        g.fillArc(125, 149, 30, 140, 100, 96);// primer arco franja amariila1
        g.fillArc(124, 142, 30, 140, 100, 96);// primer arco franja amariila2
        g.fillArc(105, 181, 130, 80, 220, 60);//  arco franja amariila inferior
        g.fillArc(105, 176, 130, 80, 220, 60);//  arco franja amariila inferior1
        g.fillArc(105, 170, 130, 80, 220, 60);//  arco franja amariila inferior2
        g.fillArc(105, 170, 130, 55, 220, 60);//  arco franja amariila inferior3
        g.fillArc(106, 180, 130, 55, 220, 60);//  arco franja amariila inferior4
        g.fillArc(106, 160, 130, 55, 220, 60);//  arco franja amariila inferior5
        g.fillArc(106, 150, 130, 55, 220, 60);//  arco franja amariila inferior6
        g.fillArc(106, 140, 130, 55, 220, 60);//  arco franja amariila inferior7
        g.fillArc(106, 134, 130, 55, 220, 60);//  arco franja amariila inferior6
        g.fillArc(109, 140, 70, 120, 115, 125);// primer arco franja amariila correcion
        
        g.setColor(Color.black);//tronco
        g.fillArc(140, 129, 90, 141, 115, 125);
        g.fillArc(142, 127, 90, 150, 115, 125);
        g.fillArc(143, 127, 100, 145, 115, 125);
        g.fillArc(146, 127, 100, 147, 115, 125);
        g.fillArc(150, 127, 100, 147, 115, 125);
        g.fillArc(154, 127, 100, 147, 115, 125);
        g.fillArc(157, 127, 100, 147, 115, 125);
        
        g.setColor(new Color(237, 234, 10));// color amarrillo parte delantera
        g.fillArc(179, 132, 100, 136, 115, 125);
        g.fillArc(140, 147, 125, 113, 270, 160);
        g.fillArc(148, 141, 125, 113, 270, 130);
        
        //alas
        g.setColor(Color.black);
        g.fillArc(125, 72, 50, 122, 0, 130);//ala izquierda        
        g.fillArc(128, 69, 60, 100, 120, 35);//ala izquierda
        g.fillArc(130, 54, 60, 120, 150, 30);//ala izquierda
        g.fillArc(131, 84, 30, 40, 180, 100);//ala izquierda
        
        
        g.fillArc(172, 70, 50, 120, 70, 115);//ala derecha
        g.fillArc(169, 70, 50, 70, 20, 60);//ala derecha
        g.fillArc(173, 83, 50, 70, 20, 60);//ala derecha
        
        g.setColor(new Color(209, 242, 235));// azul aguamarina
        g.fillArc(138, 78, 30, 100, 0, 130);//ala izquierda interior
        g.fillArc(138, 80, 40, 80, 120, 35);//ala izquierda interior
        g.fillArc(140, 64, 40, 100, 150, 30);//ala izquierda interior
        g.fillArc(140, 84, 30, 40, 180, 100);//ala izquierda interior
        
        g.fillArc(176, 82, 30, 88, 70, 115);//ala dercha interior
        g.fillArc(178, 81, 30, 50, 20, 60);//ala derecha interior
        g.fillArc(166, 85, 50, 70, 20, 60);//ala derecha interior
        
        // ojos
        g.setColor(Color.black);// ojo derecho
        g.fillOval(232, 99, 83, 98);
        g.setColor(Color.WHITE);
        g.fillOval(238, 105, 71, 86);
        
        g.setColor(Color.black); // ojo izquierdo
        g.fillOval(184, 97, 90, 105);
        g.setColor(Color.WHITE);
        g.fillOval(190, 103, 78, 93);
        
        g.setColor(Color.black);// pupilas
        g.fillOval(215, 130, 30, 35);
        g.fillOval(268, 130, 27, 32);
        
        
        
        

        // fondo del borrador
        g.setColor(new Color(245, 183, 177));// salmon
        g.fillArc(88, 263, 45, 40, 90, 180);
       
        
        //boca
        
        BasicStroke grosor1 = new BasicStroke(7);
        g2d.setStroke(grosor1);
        g2d.setColor(Color.black);    
        g2d.drawArc(210, 150, 55, 80, 240, 80);
        
       
        //arco de la punta del lapiz
        //275 283
        g2d.drawLine(273, 283, 276, 283);
        
        //borrador
       
        
        g2d.setStroke(grosor2);
        g2d.drawArc(88, 263, 45, 40, 90, 180);
        
        
        // arcos del lapiz entre el borrador 
        g2d.drawArc(109, 263, 10, 40, 90, 180);
        g2d.drawArc(105, 263, 10, 40, 90, 180);
        
        g2d.setColor(new Color(144, 148, 151));// dris
        g2d.drawArc(110, 263, 10, 40, 90, 180);
        g2d.drawArc(112, 263, 10, 40, 90, 180);
        g2d.drawArc(115, 263, 10, 40, 90, 180);
        g2d.drawArc(117, 263, 10, 40, 90, 180);
        g2d.setColor(Color.black);
        g2d.drawArc(119, 263, 10, 40, 90, 180);
        g2d.drawArc(121, 263, 10, 40, 90, 180);
        g2d.drawLine(122, 263, 114,263);//linea entre el lapiz y el borrador  superior
        g2d.drawLine(122, 303, 114, 303);//linea entre el lapiz y el borrador  superior
        
        //letrero
        Font fuente = new Font("Comic Sans MS", Font.BOLD,34);
        g2d.setFont(fuente);
        g2d.drawString("Daniel", 132, 296);
        
        
        
    }
}
