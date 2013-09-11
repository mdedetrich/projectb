import projectaexample.Colors
import projectbexample.Fish

object Main extends App {
  /**
   * These generate runtime errors
   */
  Fish.all.foreach(a=>println(a.formattedName))
  Colors.all.foreach(a=>println(a.formattedName))

}
