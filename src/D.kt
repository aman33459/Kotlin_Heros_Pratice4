import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    var t:Int = reader.nextInt()
    while(t > 0){
        var a = Array<Int>(1005){0}
        var n:Int = reader.nextInt()
        for(i in 0..n-1){
            a[i] = reader.nextInt()
        }
        var l:Int = 1
        var r:Int = n-1
        var ok:Int = a[0]
        var ok1:Int = 0
        var f:Int = 0
        var tmp:Int=a[0]
        var tm:Int = 0
        var ans:Int = 0
        while(l<= r){
            ans = ans +1
            if(f == 1){
                while(l < n && l<=r && tmp <= tm) {
                   // ok += a[l]
                    tmp+=a[l]
                    l++
                }
                //println("$tmp $tm *** ")
                ok+=tmp
                tm=0
            }
            else{
                while(r >=0 && l<=r && tm <= tmp){
                    //ok1+=a[r]
                    tm+=a[r]
                    r--;
                }
               // println("$tmp $tm *** ")
                ok1+=tm
                tmp=0
            }
            f=1-f
           // println("$l $r")
        }
        ans+=1
        println("$ans $ok $ok1")
        t= t -1;
    }
}