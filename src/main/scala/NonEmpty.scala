package ee.cone

case class NonEmpty[A](head: A, tail: List[A]) {
  def map[B](f: A => B): NonEmpty[B] =
    NonEmpty(f(head), tail.map(f))
  // You can modify code from here
  // You can modify code to there
}
