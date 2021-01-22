val tabla: List[(Int , Int )] = List((2, 2), (3, 2), (5, 1),(6, 3))

val N = tabla.map(_._2).sum.toDouble
val xMediaFun = (tabla: List[(Int, Int)]) => tabla.map(t => t._1 * t._2).sum / N
val xMedia = xMediaFun(tabla)
val s2 = (tabla: List[(Int, Int)]) => tabla.map(t => (t._1 * t._1)*t._2).sum/N - Math.pow(xMedia,2)
val CV = Math.sqrt( s2 ( tabla  ))/xMedia

val N1 = 3
val Fun = Math.sqrt( N1 (2))
val q: (Int => x - 1)> Int, Int => Int) = (x => x + 1, x =