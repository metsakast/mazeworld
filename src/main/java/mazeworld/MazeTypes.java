package mazeworld;

import mazeworld.types.BinaryTreeMazeType;
import mazeworld.types.WangTilesMazeType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MazeTypes {

    public static Map<String, MazeType> byId = new HashMap<>();
    public static List<MazeType> types = new ArrayList<>();

    public static MazeType register(MazeType type) {
        byId.put(type.id, type);
        types.add(type);
        return type;
    }

    public static final MazeType BINARY_TREE = register(new BinaryTreeMazeType());
    public static final MazeType WANG_TILES_MAZE_TYPES = register(new WangTilesMazeType());
}
