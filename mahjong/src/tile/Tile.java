package tile;
import game.Setting;

public class Tile {
    // its Chinese/English name based on setting
    String name;
    // its type: "万", "筒", "条", "风", "箭"
    String type;
    public Tile(String name, String type) {
        this.name = name;
        this.type = type;
    }
    @Override
    public String toString() {
        return name;
    }
}
