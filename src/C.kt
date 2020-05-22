import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    var t:Int = reader.nextInt()
    while(t > 0){
        var a:Int = reader.nextInt()
        var ans1 = Array<Int>(15){0}
        var cnt:Int = 1
        var ok:Int = 0
        while(a > 0){
             var b:Int = a%10;
             var ans:Int= cnt*b;
            if(ans > 0){
                ans1[ok] = ans
                ok=ok+1
            }
            cnt = cnt *10
            a=a/10
        }
        println("$ok")
        for(i in 0..ok-1){
            print(ans1[i])
            print(" ")
        }
        println()
        t= t -1;
    }
}