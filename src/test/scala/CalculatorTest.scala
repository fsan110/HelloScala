import org.scalatest.FunSuite


class CalculatorTest extends FunSuite {
  //  testName convention = ClassName.MethodName
  test("Calculator.cube") {
    assert(Calculator.cube(3) === 27)
  }
}
