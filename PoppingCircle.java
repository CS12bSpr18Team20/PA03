package pa03;


/**
 * PoppingCircle are green circles which move at a constant velocity
 * on the board and bounce off the edges, but whose size grows until a
 certain size, then bursts.
*/
public class PoppingCircle extends CircleShape{

  private double vr=1.0;

	/**
	 * create a size changing circle and set the color to green
	 */
  public PoppingCircle(){
    super();
		this.color = new java.awt.Color(0,255,0,100); // transparent green
  }

	/**
	 * update the circle as usual, but also change the size. If it gets too big,
	 * then start it bursts.
	 */
  public void update(double dt){
    // change the properties of the CircleShape after dt seconds have elapsed.

		this.radius += dt*vr;


    if (this.radius > 100){
      this.vr = 0;
      this.radius = 0;
    }

		super.update(dt);
  }




}
