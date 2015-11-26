
object CopyBytes extends App {

  var in = "/Users/xuan.huang/git/dev-challenge/visual/resources/image.txt"

  val source = scala.io.Source.fromFile(in)
  val byteArray = source.map(_.toByte).toArray
  source.close()

}
