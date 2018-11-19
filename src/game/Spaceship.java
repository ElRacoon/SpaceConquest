package game;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import utils.MathUtils;

public abstract class  Spaceship {

    private int speed;
    private int damage;
    protected Point2D pos;
    protected double length;
    protected int necessary_production;
    protected int angle = 0;

    public Point2D getDirection() {
        return direction;
    }

    protected Point2D direction = Point2D.ZERO;

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) { this.pos = pos;  }

    public String toString(){
        return "X : " + pos.getX() + ", Y : " + pos.getY();
    }

    public abstract Spaceship getInstance();

    public abstract void draw(Group root);

    public  void rotate(double teta){ // teta in  radians
        this.angle = Math.floorMod((int) ((teta* 180/Math.PI)), 360); // angle in degrees ( _*180/pi : radians --> degrees)
    }

    public void moveForward(){
//        System.out.println(this.getPos()+" + " + MathUtils.getRotatedVector(this.direction, this.angle) +" : "
  //              + this.getPos().add(MathUtils.getRotatedVector(this.direction, this.angle).normalize() ));
        this.setPos(this.getPos().add(MathUtils.getRotatedVector(this.direction, this.angle).normalize())); // NOT GOOD AT ALL

    }
}
