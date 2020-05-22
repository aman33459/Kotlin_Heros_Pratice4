import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    var t:Int = reader.nextInt()
    while(t > 0){
        //var a = Array<Int>(1005){0}
        var n:Int = reader.nextInt()
        if(n<=3) println("-1")
        else{
            if(n%2 == 1) {
                var i:Int = n
                while(i >0){
                    print("$i ")
                    i=i-2
                }
                print("4 ")
                print("2 ")
                i = 6
                while(i < n){
                    print("$i ")
                    i = i + 2
                }
            }
            else{
                var i:Int = n-1
                while(i > 0){
                    print("$i ")
                    i=i-2
                }
                print("4 ")
                print("2 ")
                i = 6
                while(i <=n){
                    print("$i ")
                    i = i + 2
                }
            }
            println()
        }
        t= t -1;
    }
}