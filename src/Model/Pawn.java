package Model;

public class Pawn implements Piece {
  @Override
  public void move(int x, int y) {

  }

  @Override
  public boolean isValidMove(int x, int y) {
    return false;
  }

  @Override
  public boolean movePutsThisKingInCheck(int x, int y) {
    return false;
  }

  @Override
  public boolean movePutsOpposingKingInCheck(int x, int y) {
    return false;
  }

  @Override
  public boolean movePutsOpposingKingInCheckMate(int x, int y) {
    return false;
  }

  @Override
  public int take(int x, int y) {
    return 0;
  }

  @Override
  public boolean isValidTake(int x, int y) {
    return false;
  }

  @Override
  public boolean isWhite() {
    return false;
  }
}
