def someMethod() {
  def list = [1, 2, 3]
  def iterator = list.iterator()
  while (iterator.hasNext()) {
    def item = iterator.next()
    println "Item: $item, Index: "+ list.indexOf(item)
    if (item == 2) {
      iterator.remove()
    }
  }
}
