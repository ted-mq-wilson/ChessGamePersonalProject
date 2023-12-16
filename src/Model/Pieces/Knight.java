package Model.Pieces;

import Model.Direction;

public class Knight extends AbstractPiece {

  public Knight(int xCoord, int yCoord, boolean isWhite) {
    super (xCoord, yCoord, isWhite);
  }
  @Override
  protected void legalMovePosition(int x, int y) {
    if (outOfBounds(x, y)) {
      throw new IllegalArgumentException("Out of bounds");
    }

    if (!inLPattern(x, y)) {
      throw new IllegalArgumentException("Knight cannot move to this location");
    }
  }

  @Override
  public String toString() {
    return "Knight";
  }

  private boolean inLPattern(int x, int y) {
    return inLDirection(x, y, Direction.UP, Direction.RIGHT) ||
            inLDirection(x, y, Direction.RIGHT, Direction.UP) ||
            inLDirection(x, y, Direction.RIGHT, Direction.DOWN) ||
            inLDirection(x, y, Direction.DOWN, Direction.RIGHT) ||
            inLDirection(x, y, Direction.DOWN, Direction.LEFT) ||
            inLDirection(x, y, Direction.LEFT, Direction.DOWN) ||
            inLDirection(x, y, Direction.LEFT, Direction.UP) ||
            inLDirection(x, y, Direction.UP, Direction.LEFT);
  }


  private boolean inLDirection(int targetX, int targetY, Direction twoStep, Direction oneStep) {
    int x = currentXCoordinate;
    int y = currentYCoordinate;

    for (int i = 0; i < 2; i++ ) {
      x += twoStep.getX_axis();
      y += twoStep.getY_axis();
    }
    x += oneStep.getX_axis();
    y += twoStep.getY_axis();

    return x == targetX && y == targetY;
  }







}
