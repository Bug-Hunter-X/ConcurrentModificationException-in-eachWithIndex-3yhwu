def someMethod() {
  def list = [1, 2, 3]
  list.eachWithIndex { item, index ->
    println "Item: $item, Index: $index"
    if (item == 2) {
      list.remove(item) // This line causes ConcurrentModificationException
    }
  }
}