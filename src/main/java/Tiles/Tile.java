package Tiles;

public abstract class Tile implements ITile{

    private final TileType _tileType;
    private final int _scoreValue;

    protected Tile(TileType tileType, int scoreValue) {
        _tileType = tileType;
        _scoreValue = scoreValue;
    }

    @Override
    public TileType getTileType() {
        return _tileType;
    }

    @Override
    public int getScoreValue() {
        return _scoreValue;
    }
}
