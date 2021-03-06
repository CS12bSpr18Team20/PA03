package pa03;

import java.awt.Color;
import java.awt.Graphics;

/**
 * MovingCircle is a bunch of crimson circles which move on the board and bounce off the edges. 
 Each circle is given a different random transparency, and the velocity will differ as time flies. 

*/

public class MovingCircle extends CircleShape {

    private int Trans = 0;
    private double vz = 1.5;

    public MovingCircle(){
        super();
        this.Trans = (int)(100*Math.random());
        this.color = new java.awt.Color(220, 20, 60, Trans); // Crimson colored circle with random transparency

    }


    public void update(double dt){
      // change the properties of the CircleShape after dt seconds have elapsed.
        this.vx += dt*vz;
        
        if (this.vx > 500){
          this.vz = 1.0;
          this.x = 250;
          this.y = 250;
          this.radius = Trans/5;
         } // made the circles bulk up to a certain size and restart on the middle of the board with different transparent colors.

      super.update(dt);
    }
}
