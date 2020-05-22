import java.util.*

fun main(args: Array<String>) {
    //some missing changes
    val reader = Scanner(System.`in`)
    var t:Int = reader.nextInt()
    while(t > 0){
        // nextInt() reads the next integer from the keyboard
        var a:Int = reader.nextInt()
        var b:Int = reader.nextInt()
        var c:Int = a+b
        println("$c")
        t= t -1;
    }
}