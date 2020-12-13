import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube - should return cube of 3") {
    assert(CubeCalculator.cube(3) === 27)
  }
  test("CubeCalculator.cube - should return zero if cube of zero") {
    assert(CubeCalculator.cube(0) === 0)
  }
}
