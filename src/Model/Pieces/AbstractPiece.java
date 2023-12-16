package Model.Pieces;

import Model.Direction;

public abstract class AbstractPiece implements Piece {

  protected int currentXCoordinate;
  protected int currentYCoordinate;
  protected boolean isWhite;

  public AbstractPiece(int xCoord, int yCoord, boolean isWhite) {
    currentXCoordinate = xCoord;
    currentYCoordinate = yCoord;
    this.isWhite = isWhite;
  }

  @Override
  public void move(int x, int y) {
    legalMovePosition(x, y);

    currentXCoordinate = x;
    currentYCoordinate = y;
  }

  protected abstract void legalMovePosition(int x, int y);

  @Override
  public abstract String toString();

  @Override
  public int take(Piece piece) {
    return determinePieceAmount(piece);
  }

  private int determinePieceAmount(Piece piece) {
    return switch (piece.toString()) {
      case "King" -> 100;
      case "Queen" -> 8;
      case "Bishop", "Knight" -> 3;
      case "Rook" -> 5;
      case "Pawn" -> 1;
      default -> throw new IllegalArgumentException("Piece not added yet");
    };
  }

  @Override
  public boolean isWhite() {
    return this.isWhite;
  }

  public boolean outOfBounds(int x, int y) {
    return x < 0 || x > 7 || y < 0 || y > 7;
  }

  public boolean inDiagonalDirection(int x, int y) {
    return (testDirection(x, y, Direction.UP_RIGHT) || testDirection(x, y, Direction.UP_LEFT) ||
            testDirection(x, y, Direction.DOWN_RIGHT) || testDirection(x, y, Direction.DOWN_LEFT));
  }

  private boolean testDirection(int x, int y, Direction direction) {
    int tempX = currentXCoordinate;
    int tempY = currentYCoordinate;
    Direction d = direction;

    while (!outOfBounds(tempX, tempY)) {
      if (((tempX += d.getX_axis()) == x) && ((tempY += d.getY_axis()) == y)) {
        return true;
      }
    }
    return false;
  }

  public boolean inStraightDirection(int x, int y) {
    return (testDirection(x, y, Direction.UP) || testDirection(x, y, Direction.DOWN) ||
            testDirection(x, y, Direction.RIGHT) || testDirection(x, y, Direction.LEFT));
  }

}
