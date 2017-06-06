package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  val s5 = Set(41,52,63,84,5,87)
//  val s6 = Set(23, 52, 63, 76)

//  printSet(map(s5, x => x * 2))
//  printSet(union(s5, s6))
  printSet(filter(s5, x => x < 60 && x > 1))
}
