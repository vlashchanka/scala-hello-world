import org.scalatest.FunSuite

class StringPowerTest extends FunSuite {
  test("StringPower - should return cube of 3") {
    assert(StringPower.pow("yes") === 27)
  }
  test("StringPower - should return zero if cube of zero") {
    assert(StringPower.pow("") === 0)
  }
}
