package Model.Pieces;

public class Queen extends AbstractPiece {

  public Queen(int xCoord, int yCoord, boolean isWhite) {
    super (xCoord, yCoord, isWhite);
  }
  @Override
  protected void legalMovePosition(int x, int y) {
    if (outOfBounds(x, y)) {
      throw new IllegalArgumentException("Out of bounds");
    }

    if (!(inDiagonalDirection(x, y) || inStraightDirection(x, y))) {
      throw new IllegalArgumentException("Queen cannot move to this location");
    }
  }

  @Override
  public String toString() {
    return "Queen";
  }
}
