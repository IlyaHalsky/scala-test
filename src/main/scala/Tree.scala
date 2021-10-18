package ee.cone

trait Tree {
  def isEmpty: Boolean
  def contains(value: Int): Boolean
  def insert(value: Int): Tree
  def delete(value: Int): Tree
}

object Tree {
  def fromList(list: List[Int]): Tree = ???
}
