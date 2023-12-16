package Model.Pieces;

public interface Piece {
  void move(int x, int y);
  int take(Piece piece);
  boolean isWhite();
}
