fun main() {
    println("Hello World")
    var op_resp : Int = 0
    var continua : String = "S"
    var Operacoes = mapOf (1 to "Soma", 2 to "Subtração",
    3 to "Multiplicação", 4 to "Divisão", 5 to "Sair")
    
    while
    ((continua == "S") or (continua == "s"))
    {
        do 
        {
            for(op in Operacoes.keys)
            {
                println(op.toString() + " - " + Operacoes[op])
            }
            println("\nQual operação desejada")
            op_resp = readLine().toString().toInt()
        }
        while(!(op_resp in Operacoes.keys)) 
        print("\nOperação escolhida: $op_resp")
        
        var x: Float
        var y: Float
        
        println("\n\nDigite o primeiro número")
        x= readLine().toString().toFloat()
        println("\n\nDigite o segundo número")
        y= readLine().toString().toFloat()
        
        var res = when (op_resp){
            1->x+y
            2->x-y
            3->x*y
            4->{
                if(y!= 0.0f){
                    x/y
                }else{
                    println("Impossível dividir por 0")
                    return
                }
            }
             else->println("Erro!")
        }
        
        println("O resultado é $res")
        println ("\n\nDeseja continuar? ")
        continua = readLine().toString()
    }
    
}



