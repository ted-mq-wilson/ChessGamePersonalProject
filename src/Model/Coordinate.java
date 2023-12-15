package Model;

public class Coordinate {

  private final CoordinateLetter coordinateLetter;
  private final CoordinateNumber coordinateNumber;

  public Coordinate(CoordinateLetter coordinateLetter, CoordinateNumber coordinateNumber) {
    this.coordinateLetter = coordinateLetter;
    this.coordinateNumber = coordinateNumber;
  }

  public CoordinateLetter getCoordinateLetter() {
    return coordinateLetter;
  }

  public CoordinateNumber getCoordinateNumber() {
    return coordinateNumber;
  }

  private String coordinateNumberToString() {
    return switch (coordinateNumber) {
      case ONE -> "1";
      case TWO -> "2";
      case THREE -> "3";
      case FOUR -> "4";
      case FIVE -> "5";
      case SIX -> "6";
      case SEVEN -> "7";
      case EIGHT -> "8";
      default -> throw new IllegalArgumentException("Cannot be outside of the enum");
    };
  }

  private String coordinateLetterToString() {
    return coordinateLetter.toString();
  }

  @Override
  public String toString() {
    return coordinateLetterToString() + coordinateNumberToString();
  }

//  public boolean equals(Coordinate other) {
//    return (other.getCoordinateLetter() == this.getCoordinateLetter() &&
//            other.getCoordinateNumber() == (this.getCoordinateNumber()));
//  }



}
