import javax.swing.JFrame;

public class CityViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(800, 800);
      frame.setTitle("The City");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      CityComponent component = new CityComponent();
      frame.add(component);
      frame.setVisible(true);
   }
}
