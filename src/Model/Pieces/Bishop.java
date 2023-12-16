package Model.Pieces;

public class Bishop extends AbstractPiece {

  public Bishop(int xCoord, int yCoord, boolean isWhite) {
    super (xCoord, yCoord, isWhite);
  }
  @Override
  protected void legalMovePosition(int x, int y) {
    if (outOfBounds(x, y)) {
      throw new IllegalArgumentException("Out of bounds");
    }

    if (!inDiagonalDirection(x, y)) {
      throw new IllegalArgumentException("Bishop cannot move to this location");
    }
  }

  @Override
  public String toString() {
    return "Bishop";
  }
}
