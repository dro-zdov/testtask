object Main extends App {
  val string = "fligdkmtmgdldkgkkfjsivjoqqxasoskvprfejrgkrlidgkdssadkudfglidgkmashdua"
  val substring = "ligdkm"

  val startBruteForce = System.currentTimeMillis()
  val cntBruteForce = countSubstringsBruteForce(string, substring)
  println(s"substring count brute force = $cntBruteForce; executed by ${System.currentTimeMillis() - startBruteForce}ms")

  val startOptimized = System.currentTimeMillis()
  val cntOptimized = countSubstringOptimized(string, substring)
  println(s"substring count optimized = $cntOptimized; executed by ${System.currentTimeMillis() - startOptimized}ms")

  def countSubstringsBruteForce(s: String, sub: String): Int = {
    sub.permutations.count(s.contains(_))
  }

  def countSubstringOptimized(s: String, sub: String): Int = {
    val subSorted = sub.sorted
    (0 to s.length - sub.length)
      .map(i => s.substring(i, i + sub.length).sorted)
      .count(subSorted.equals)
  }
}

