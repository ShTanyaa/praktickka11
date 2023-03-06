enum class Days{
    Monday,Tuesday,Wednesday,Thurstday,Friday,Saturday,Sunday;
    fun NumbDay(){
        println("введите номер дня недели")
        var numb= readLine()!!.toInt()
        while(true){
            if(numb>0 && numb<=7){
                when{
                    (numb==1)-> println(Days.Monday)
                    (numb==2)-> println(Days.Tuesday)
                    (numb==3)-> println(Days.Wednesday)
                    (numb==4)-> println(Days.Thurstday)
                    (numb==5)-> println(Days.Friday)
                    (numb==6)-> println(Days.Saturday)
                    (numb==7)-> println(Days.Sunday)
                }
            }
            else{
                println("день недели введен неправильно")
                numb= readLine()!!.toInt()
            }
        }
    }
    fun Weekends(){
        println("введите номер дня недели")
        var numb= readLine()!!.toInt()
        while(true){
            if(numb>0 && numb<=7){
                when{
                    (numb==1)-> println("${Days.Monday} - рабочий день")
                    (numb==2)-> println("${Days.Tuesday} - рабочий день")
                    (numb==3)-> println("${Days.Wednesday} - рабочий день")
                    (numb==4)-> println("${Days.Thurstday} - рабочий день")
                    (numb==5)-> println("${Days.Friday} - рабочий день")
                    (numb==6)-> println("${Days.Saturday} - выходной день")
                    (numb==7)-> println("${Days.Sunday} - выходной день")
                }
            }
            else{
                println("день недели введен неправильно")
                numb= readLine()!!.toInt()
            }
        }
    }
    fun wait_weekends(){
        var numb= readLine()!!.toInt()
        if(numb>0 && numb<=7){
            when{
                (numb==1)-> println("до выходных осталось 5 дней")
                (numb==2)-> println("до выходных осталось 4 дня")
                (numb==3)-> println("до выходных осталось 3 дня")
                (numb==4)-> println("до выходных осталось 2 дня")
                (numb==5)-> println("до выходных остался 1 день")
                (numb==6)-> println("уже выходной,ура!!")
                (numb==7)-> println("помледний выходной,завтра понедельник:(")
            }
        }
        else{
            println("день недели введен неправильно")
            numb= readLine()!!.toInt()
        }
    }
    fun rand(): Days{
        println("случайный день недели")
        return values().random()
    }
}