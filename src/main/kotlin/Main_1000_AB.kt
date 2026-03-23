import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st: StringTokenizer = StringTokenizer(br.readLine(), " ")

    val a: Int = st.nextToken().toInt()
    val b: Int = st.nextToken().toInt()

    println(a+b)
}