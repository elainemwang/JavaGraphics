package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);


		//add more code here
      window.setColor(Color.BLACK);

      window.fillOval(400, 140, 10, 10);
      window.fillOval(440, 140, 10, 10);
				
   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.BLUE);
       
       window.fillRect(350,225,100,100);
		//add more code here
                
       window.setColor(Color.BLACK);
       window.drawArc(250, 225, 200, 50, 270, -90);
       window.drawArc(450, 225, 200, 50, 90, 90);
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.GREEN);
       
       window.fillRect(350,350,100,100);
		//add more code here
       window.setColor(Color.BLACK);
       window.drawLine(360, 450, 260, 500);
       window.drawLine(420, 450, 440, 460);
       window.drawLine(440, 460, 410, 500);
   }
}