/**
 * Created by 3pikphail345 on 6/25/17.
 */
public abstract class tile {
    int tileCoordinate;

    tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends tile {

        EmptyTile(int coordinate) {
            super(coordinate);
        }

        @Override
        public boolean isTileOccupied() {
            return false;
        }

        @Override
        public Piece getPiece() {
            return null;
        }

    }

    public static final class OccupiedTile extends tile {

        Piece pieceOnTile;

        OccupiedTile(int tileCoordinate, Piece pieceOnTile) {
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTile;
        }


        @Override
        public boolean isTileOccupied() {
            return true;
        }


        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }
    }


}
