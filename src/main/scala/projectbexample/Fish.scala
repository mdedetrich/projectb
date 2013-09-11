package projectbexample
import sealedcontents.SealedContents

sealed abstract class Fish(val id:Long, val formattedName:String)
case object Tuna extends Fish(1,"Fish")
case object Salmon extends Fish(2,"Salmon")
case object Carp extends Fish(3,"Carp")

object Fish {
  val all:Set[Fish] = SealedContents.values[Fish]
}
