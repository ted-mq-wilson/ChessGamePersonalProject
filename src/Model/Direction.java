package Model;

/**
 * An enum to represent the different directions on a board in chess. To utilize when taking pieces
 * and moving around the board. Also, to check if check is available in this direction.
 */
public enum Direction {

  UP (0, 1),
  UP_RIGHT (1, 1),
  RIGHT(1, 0),
  DOWN_RIGHT(1, -1),
  DOWN(0, -1),
  DOWN_LEFT(-1, -1),
  LEFT(-1, 0),
  UP_LEFT(-1, 1);

  private final int x_axis;
  private final int y_axis;

  Direction(int xAxis, int yAxis) {
    x_axis = xAxis;
    y_axis = yAxis;
  }

  public int getX_axis() {
    return x_axis;
  }

  public int getY_axis() {
    return y_axis;
  }
}
