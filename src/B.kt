import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    var t:Int = reader.nextInt()
    while(t > 0){
        var a1:Int = reader.nextInt()
        var b1:Int = reader.nextInt()
        var a2:Int = reader.nextInt()
        var b2:Int = reader.nextInt()
        if(a1 == a2 && b1+b2 == a1){
            println("Yes")
        }
        else if(a1 == b2 && a2+b1 == a1) println("Yes")
        else if(b1 == a2 && a1+b2 == b1) println("Yes")
        else if(b1 == b2 && a1+a2 == b1) println("Yes")
        else println("No")
        t= t -1;
    }
}