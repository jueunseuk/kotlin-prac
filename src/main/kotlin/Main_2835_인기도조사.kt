import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    var diff = IntArray(n+1) {0}
    for(i in 0..< n) {
        var st = StringTokenizer(br.readLine(), " ")
        val a = st.nextToken().split(":").toTypedArray()
        st.nextToken()
        val b = st.nextToken().split(":").toTypedArray()

        val s: Int = makeToSecond(a)+1
        val e: Int = makeToSecond(b)
        
    }
}

fun makeToSecond(time: Array<String>): Int {
    return time[0].toInt()*3600 + time[1].toInt()*60 + time[2].toInt()
}
