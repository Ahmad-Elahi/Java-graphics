import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
   A drawing of two buildings connected by a bridge which uses the entire frame
*/
public class City{

   /**
      Draws the city.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2){
   
      Ellipse2D.Double sun = new Ellipse2D.Double(0, 0, 100, 100); //Sun
      Rectangle ground = new Rectangle(0, 700, 800, 100); //Ground
      Rectangle buildingR = new Rectangle(600, 400, 200, 300); //Building (right)
      Rectangle buildingL = new Rectangle(0, 400, 200, 300); //Building (left)
      Line2D.Double R1 = new Line2D.Double(775, 400, 775, 700);//*************************
      Line2D.Double R2 = new Line2D.Double(750, 400, 750, 700);
      Line2D.Double R3 = new Line2D.Double(725, 400, 725, 700);
      Line2D.Double R4 = new Line2D.Double(700, 400, 700, 700);// Lines In Right Building
      Line2D.Double R5 = new Line2D.Double(675, 400, 675, 700);
      Line2D.Double R6 = new Line2D.Double(650, 400, 650, 700);
      Line2D.Double R7 = new Line2D.Double(625, 400, 625, 700);//*************************
      Line2D.Double L1 = new Line2D.Double(25, 400, 25, 700);  //*************************
      Line2D.Double L2 = new Line2D.Double(50, 400, 50, 700);
      Line2D.Double L3 = new Line2D.Double(75, 400, 75, 700);
      Line2D.Double L4 = new Line2D.Double(100, 400, 100, 700);// Lines In Left Building
      Line2D.Double L5 = new Line2D.Double(125, 400, 125, 700);
      Line2D.Double L6 = new Line2D.Double(150, 400, 150, 700);
      Line2D.Double L7 = new Line2D.Double(175, 400, 175, 700);//*************************
      Rectangle bridge = new Rectangle(200, 515, 400, 110);    //        Bridge
      Line2D.Double stR = new Line2D.Double(565, 625, 600, 640);//  Right Bridge Strut
      Line2D.Double stL = new Line2D.Double(235, 625, 200, 640);//  Left Bridge Strut

      g2.setColor(Color.ORANGE);
      g2.draw(sun);
      g2.setColor(Color.YELLOW);
      g2.fill(sun);
      g2.setColor(Color.GREEN);
      g2.fill(ground);
      g2.setColor(Color.BLACK);
      g2.draw(buildingR);
      g2.draw(buildingL);      
      g2.setColor(Color.LIGHT_GRAY);
      g2.fill(buildingR);
      g2.fill(buildingL);
      g2.setColor(Color.BLACK);
      g2.draw(R1);      
      g2.draw(R2);
      g2.draw(R3);
      g2.draw(R4);
      g2.draw(R5);
      g2.draw(R6);
      g2.draw(R7);
      g2.draw(L1);
      g2.draw(L2);
      g2.draw(L3);
      g2.draw(L4);
      g2.draw(L5);
      g2.draw(L6);
      g2.draw(L7);
      g2.draw(bridge);
      g2.draw(stR);
      g2.draw(stL);
      g2.drawString("This is a Bridge Connecting Two Buildings", 350, 530);
           
   }
}