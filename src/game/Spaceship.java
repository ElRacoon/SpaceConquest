package game;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import utils.MathUtils;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class  Spaceship {

    private int speed;



    protected int damage;
    protected Point2D pos;
    protected double length;
    protected int necessary_production;
    protected int angle = 0;
    protected final Color color;

    protected LinkedList<Point2D> steps; //list of coordinates to get to the target

    protected Point2D direction = Point2D.ZERO;

    public Spaceship(Color color) {
        this.color = color;
    }


    public abstract Spaceship getInstance();

    public abstract void draw(Group root);

    public  void rotate(double theta){ // theta in  radians
        this.angle = Math.floorMod((int) Math.toDegrees(theta), 360); // angle in degrees this mod is better than %
    }


    public void moveForward(){
        //System.out.println(this.getPos()+" + " + MathUtils.getRotatedVector(this.direction, this.angle) +" : "
        //  + this.getPos().add(MathUtils.getRotatedVector(this.direction, this.angle).normalize() ));
        //System.out.println(this.direction + " "+ this.angle);
        //System.out.println(MathUtils.getRotatedVector(this.direction, this.angle));


        this.setPos(this.getPos().add(MathUtils.getRotatedVector(this.direction, this.angle).normalize())); // NOT GOOD AT ALL
    }

    public String toString(){
        return "X : " + pos.getX() + ", Y : " + pos.getY();
    }

    //----------------GETTERS/SETTERS--------------//

    public Point2D getDirection() {
        return direction;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) { this.pos = pos;  }

    public LinkedList<Point2D> getSteps() {
        return steps;
    }

    public void setSteps(LinkedList<Point2D> steps) {
        this.steps = steps;
    }

    public Color getColor() {
        return color;
    }
    public int getDamage() {
        return damage;
    }
}
