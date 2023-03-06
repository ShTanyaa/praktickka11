enum class ColorType{
    RED,ORANGE,YELLOW,GREEN,BLUE,DARKBLUE,VIOLET;
    fun colorss(){
        println("введи цвет радуги 1-7")
        var numb= readLine()!!.toInt()
        while(true){
            if(numb>0 && numb<=7){
                when{
                    (numb==1) -> println(ColorType.RED)
                    (numb==2) -> println(ColorType.ORANGE)
                    (numb==3) -> println(ColorType.YELLOW)
                    (numb==4) -> println(ColorType.GREEN)
                    (numb==5) -> println(ColorType.BLUE)
                    (numb==6) -> println(ColorType.DARKBLUE)
                    (numb==7) -> println(ColorType.VIOLET)
                }

            }
            else{
                println("такого цвета в радуге нету")
                numb= readLine()!!.toInt()
            }
        }
    }
    fun randomm():ColorType{
        println("случайный цвет")
        return  values().random()
    }
}