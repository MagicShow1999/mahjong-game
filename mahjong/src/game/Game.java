package game;
import tile.*;
import java.util.*;

public class Game {
    /*
    * initialize the game:
    * 1. create 144 tiles
    * 2. create 4 players
    * 3. roll a die (determine the position of where to draw mahjong)
    * 4. shuffle tiles and assign each player 13 tiles except dealer (dealer has 14 tiles)
    * */
    public static List<Tile> tiles;
    public static void initialize() {
        // default Chinese characters
        TileFactory tf = new TileFactory(Setting.LANG);
        tiles = tf.getTiles();
    }
    public static void main(String[] args) {
        initialize();
        System.out.println(tiles);
    }
}
