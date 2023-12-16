package Model.Pieces;

public class Rook extends AbstractPiece {

  public Rook(int xCoord, int yCoord, boolean isWhite) {
    super (xCoord, yCoord, isWhite);
  }

  @Override
  protected void legalMovePosition(int x, int y) {
    if (outOfBounds(x, y)) {
      throw new IllegalArgumentException("Out of bounds");
    }

    if (!inStraightDirection(x, y)) {
      throw new IllegalArgumentException("Rook cannot move to this location");
    }
  }

  @Override
  public String toString() {
    return "Rook";
  }
}
