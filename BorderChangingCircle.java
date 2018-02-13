package pa03;

import java.awt.Color;
import java.awt.Graphics;

/**
BorderChangingCircle are yellow circles which move up and down at a constant
velocity on the board and bounce off the edges, but whose border changes color
when it touches the edges.
 Cirlces moving up - blue circles
 Circles moving down - red circles

*/
public class BorderChangingCircle extends CircleShape{
  private Color borderColor;

  public BorderChangingCircle(){
    super();
    this.color = new Color(255,255,0,100); //transparent yellow
    this.borderColor = new Color(255,0,0);
    this.vx = 0;
    this.vy = (int)(30*Math.random()+10);
  }

  public void draw(Graphics g){
    super.draw(g);
    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;
    g.setColor(this.borderColor);
    g.drawOval(u,v,w,h );
  }

  public void keepOnBoard(){

    if (this.y < this.radius){
      // it went above the top edge! Switch border coloe to red
      this.borderColor = Color.RED;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge! Switch border color to blue
      this.borderColor = Color.BLUE;
    }

    super.keepOnBoard();

  }



}
