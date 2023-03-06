fun main(){
    println("с чем вы хотите поработать? (Color,Day)")
    var text= readLine()!!.toString()
    while(true){
        if(text=="Color" || text=="Day") break
        else{
            println("Error")
            var text= readLine()!!.toString()
        }
    }
    when(text){
        "Color" ->{
            var Color:ColorType=ColorType.RED
            Color.colorss()
            println(Color.randomm())
        }
        "Day"->{
            var Day:Days=Days.Friday
            Day.NumbDay()
            Day.Weekends()
            println(Day.wait_weekends())
            println(Day.rand())
        }
    }
}