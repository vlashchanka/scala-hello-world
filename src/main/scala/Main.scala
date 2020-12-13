object Main extends App {
  val user = "Vitali"
  val pow = StringPower.pow(user)
  for(_ <- 0 to pow) {
    println(s"Hello, $user!")
  }
  println(s"Printed times: $pow!")
}