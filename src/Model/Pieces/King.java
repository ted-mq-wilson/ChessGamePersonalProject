package Model.Pieces;

import Model.Direction;

public class King extends AbstractPiece {

  private boolean hasMoved;

  public King(int xCoord, int yCoord, boolean isWhite) {
    super (xCoord, yCoord, isWhite);
    this.hasMoved = false;
  }

  public void move(int x, int y) {
    super.move(x, y);
    hasMoved = true;
  }

  public String toString() {
    return "King";
  }

  @Override
  protected void legalMovePosition(int x, int y) {
    if (outOfBounds(x, y)) {
      throw new IllegalArgumentException("Out of bounds");
    }

    for (Direction d : Direction.values()) {
      if (this.currentXCoordinate + d.getX_axis() != x &&
          this.currentYCoordinate + d.getY_axis() != y) {
        throw new IllegalArgumentException("King cannot move to this location");
      }
    }
  }

  // TODO add way to castle
}
