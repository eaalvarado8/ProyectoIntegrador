val ingredient = ("Sugar", 25)
println(ingredient._1) // Sugar
println(ingredient._2) // 25
val (name, quantity) = ingredient
println(name)     // Sugar
println(quantity) // 25
val planets =
  List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
    ("Mars", 227.9), ("Jupiter", 778.3))
planets.foreach{
  case ("Earth", distance) =>
    println(s"Nuestro planeta está a $distance millones de kilómetros del Sol.")
  case _ =>
}
val numPairs = List((2, 5), (3, -7), (20, 56))
for ((a, b) <- numPairs) {
  println(a * b)
}
val x = (1, "hello")
x: (Int, String)
val y = 2 -> "world"
y: (Int, String)
val z = 3 -> "foo"
z: (Int, String)

val m = Map[Int, String](2 -> "world")
m: scala.collection.immutable.Map[Int,String]

 m + x

(m + x).toList



val tabla: List[(Int , Int )] = List((2, 2), (3, 2), (5, 1),(6, 3))

  val N = tabla.map(_._2).sum.toDouble
  val xMediaFun = (tabla: List[(Int, Int)]) => tabla.map(t => t._1 * t._2).sum / N
  val xMedia = xMediaFun(tabla)
  val s2 = (tabla: List[(Int, Int)]) => tabla.map(t => (t._1 * t._1)*t._2).sum/N - Math.pow(xMedia,2)
  val CV = Math.sqrt( s2 ( tabla  ))/xMedia


