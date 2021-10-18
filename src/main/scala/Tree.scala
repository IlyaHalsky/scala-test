package ee.cone

// You can modify code from here
trait Tree {
  def isEmpty: Boolean
  def contains(value: Int): Boolean
  def insert(value: Int): Tree
  def delete(value: Int): Tree
  def toList: List[Int]
}

object Tree {
  def fromList(list: List[Int]): Tree = ???
}
// You can modify code to there
