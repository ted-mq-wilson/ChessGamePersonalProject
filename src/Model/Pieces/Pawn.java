package Model.Pieces;

public class Pawn extends AbstractPiece {

  private boolean hasMoved;

  public Pawn(int xCoord, int yCoord, boolean isWhite) {
    super (xCoord, yCoord, isWhite);
    this.hasMoved = false;
  }

  @Override
  public void move(int x, int y) {
    super.move(x, y);
    hasMoved = true;
  }

  @Override
  protected void legalMovePosition(int x, int y) {
    if (outOfBounds(x, y)) {
      throw new IllegalArgumentException("Out of bounds");
    }

    if (!(pawnLegalMove(x, y))) {
      throw new IllegalArgumentException("Pawn cannot move to this location");
    }
  }

  @Override
  public String toString() {
    return null;
  }

  private boolean pawnLegalMove(int x, int y) {
    if (hasMoved) {
      return (currentXCoordinate == x && currentYCoordinate + 1 == y);
    } else {
      return currentXCoordinate == x &&
              (currentYCoordinate + 2 == y || currentYCoordinate + 1 == y);
    }
  }
}
