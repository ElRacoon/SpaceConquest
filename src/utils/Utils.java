package utils;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import java.util.Arrays;
import java.util.List;

public class Utils {


    //------------GAME-------------//

    /**
     * Height of the window.
     */
    public static int WINDOW_HEIGHT = 1080;

    /**
     * Width of the window.
     */
    public static int WINDOW_WIDTH = 1920;

	/**
     * If true the game will run optimized code on some functions.
     */
    public static final boolean OPTIMIZED = true;


    //------------SPACESHIPS-------------//

    /**
     * Spaceship default direction vector
     */
    public static final Point2D SPACESHIP_DIRECTION = new Point2D(0, 1);

    /**
     * Necessary production to create a Spaceship.
     */
    public static final int LITTLE_SPACESHIP_NEC_PROD = 10;

    /**
     *  Length of a little spaceship in px.
     */
    public static final int LITTLE_SPACESHIP_LENGTH = 25;

    /**
     * Damage made by the little spaceship when they land on an enemy planet.
     */
    public static final int LITTLE_SPACESHIP_DAMAGE = 1;

    /**
     *  Speed of a little spaceship in px/frame.
     */
    public static final double LITTLE_SPACESHIP_SPEED = 2.; // Not more than 3

    /******************************/


    /**
     * Production added by frame (=/= number of ship).
     */
    public static final float PLAYER_PRODUCTION_RATE = 1; // Double ?

    /**
     * Number of player.
     */
    public static final int NB_PLAYER = 2;

    /**
     * Number of neutral planets.
     */
    public static final int NB_NEUTRAL_PLANET = 20;

    /**
     * Radius' size for neutral planets.
     */
    public static final int NEUTRAL_PLANET_RADIUS = 2*LITTLE_SPACESHIP_LENGTH;

    /**
     * Base HP before variation calculation for neutral planets.
     */
    public static final int NEUTRAL_HP_RANGE = 100; //600 ?

    /**
     * Maximum percentage of HP that can be withdrawn or added to neutral planets when they are generated.
     */
    public static final int HP_VARIATION = 20;

    /**
     * Radius' size for player planets.
     */
    public static int PLAYER_PLANET_RADIUS = 3*LITTLE_SPACESHIP_LENGTH;

    /**
     * Minimal distance between two player's planet at initialization.
     */
    public static int DISTANCE_BETWEEN_PLAYERS = 3*PLAYER_PLANET_RADIUS;

    /**
     * Minimal distance between a neutral planet and every other planet at initialization.
     */
    public static int DISTANCE_BETWEEN_NEUTRAL = 2*PLAYER_PLANET_RADIUS;

    /**
     * Distance between the ship and the planet at ship's spawn.
     */
    public static int DISTANCE_PLANET_SHIPS = 15;

    /**
     * Distance around a planet where ships cannot go.
     */
    public static int ADDITIONAL_HITBOX_RANGE = 6;     //must be < DISTANCE_PLANET_SHIP -> bug < 6 ??

    /**
     * Color for neutral planets.
     */
    public static Color NEUTRAL_PLANET_COLOR = Color.GREY;

    /**
     * List of colors for players.
     */
    public static List<Color> PLANET_COLOR =  Arrays.asList(Color.RED,Color.BLUEVIOLET, Color.GOLDENROD, Color.LIGHTSKYBLUE, Color.YELLOWGREEN);

    /**
     * Color of the halo when a planet is selected.
     */
    public static Paint HALO_COLOR = PLANET_COLOR.get(0).darker();

    /**
     * Distance between points used for the path finding algorithm. Smaller number increase time needed for calculation but increase precision.
     */
    public static int COLUMN_SIZE = 5;

    /**
     * Size added to the radius of a planet when selected.
     */
    public static int SELECTED_HALO_SIZE = 5;

    /**
     * Max size for a wave.
     */
    public static int WAVE_SIZE_MAX = 50;


    public static int WAVE_SIZE = 25;

    public static int ALLOWED_RANGE_TAKE_OFF = 25;
    
    public static int AI_ACTION_TIME = 60;

}
