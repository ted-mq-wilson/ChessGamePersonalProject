package Model;

public interface Piece {
  void move(int x, int y);
  boolean isValidMove(int x, int y);
  boolean movePutsThisKingInCheck(int x, int y);
  boolean movePutsOpposingKingInCheck(int x, int y);
  boolean movePutsOpposingKingInCheckMate(int x, int y);
  int take(int x, int y);
  boolean isValidTake(int x, int y);
  boolean isWhite();
}
