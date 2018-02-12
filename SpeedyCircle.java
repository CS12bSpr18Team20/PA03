public class SpeedyCircle extends CircleShape{
  private int timesToEdge;
  public SpeedyCircle(){
    super();
    this.color = new java.awt.Color(0,0,255);
    this.timesToEdge = 0;
  }
  public void keepOnBoard(){
    if (this.x < this.radius) {
      // it went off the left edge! do something!
      this.timesToEdge++;
      this.vx = -this.vx*1.1*this.timesToEdge;
      this.x = this.radius;

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.timesToEdge++;
      this.vx = -this.vx*1.1*this.timesToEdge;
      this.x = CircleShape.boardWidth-this.radius;
    }

    if (this.y < this.radius){
      // it went above the top edge!
      this.timesToEdge++;
      this.vy = -this.vy*1.1*this.timesToEdge;
      this.y = this.radius;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.timesToEdge++;
      this.vy = -this.vy*1.1*this.timesToEdge;
      this.y = CircleShape.boardHeight-this.radius;
    }
  }
}
