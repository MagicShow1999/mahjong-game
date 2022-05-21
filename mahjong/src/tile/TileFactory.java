package tile;

import java.util.ArrayList;
import java.util.*;

public class TileFactory {
    List<Tile> tiles = new ArrayList<>();
    public TileFactory(String lang) {
        String[] ordinalType = new String[]{"万","筒","条"};
        String[] windType = new String[]{"东风","西风","南风","北风"};
        String[] arrowType = new String[]{"中","发","白"};
        // maps to 1-9
        String[] num = new String[]{"一","二","三","四","五","六","七","八","九"};

        // each single tile has 4 occurrences
        for (int j = 0; j < 4; j++) {
            // create ordinal tiles
            for (String ord : ordinalType) {
                for (int i = 0; i < 9; i++) {
                    tiles.add(new Tile(num[i] + ord, ord));
                }
            }
            // create wind tiles
            for (String wind : windType) {
                tiles.add(new Tile(wind, wind.substring(1)));
            }
            // create arrow tiles
            for (String arrow : arrowType) {
                tiles.add(new Tile(arrow, "箭"));
            }
        }

    }
    public List<Tile> getTiles() {
        return tiles;
    }
}
