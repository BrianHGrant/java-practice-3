public class Triangle {
  public int mSideA;
  public int mSideB;
  public int mSideC;

  public Triangle(int sideA, int sideB, int sideC) {
    mSideA = sideA;
    mSideB = sideB;
    mSideC = sideC;
  }

  public String isType() {
    if ((mSideA > mSideB + mSideC) || (mSideB > mSideA + mSideC) || (mSideC > mSideA + mSideB)) {
      return "Invalid";
    } else if (mSideA == mSideB && mSideA == mSideC) {
      return "Equilateral";
    } else if ((mSideA == mSideB && mSideA != mSideC) || (mSideB == mSideC && mSideB != mSideA) || (mSideC == mSideA && mSideC != mSideB)) {
      return "Isosceles";
    } else {
      return "Scalene";
    }
  }
}
