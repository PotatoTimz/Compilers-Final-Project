package backend

abstract class Expr {
    abstract fun eval(runtime:Runtime):Data
}

enum class Operator {
    ADD,
    SUB,
    MUL,
    DIV
}

enum class CmpOperators {
    LT,
    GT,
    EQ,
}

class IntLiteral(val lexeme:String):Expr() {
    override fun eval(runtime:Runtime):Data 
    = IntData(Integer.parseInt(lexeme))
}

class StringLiteral(val lexeme:String):Expr() {
    override fun eval(runtime:Runtime):Data 
    = StringData(lexeme)
}

class ListStringLiteral(val lexeme:List<String>):Expr() {
    override fun eval(runtime:Runtime):Data 
    = ListStringData(lexeme)
}

class ListIntLiteral(val lexeme:List<Int>):Expr() {
    override fun eval(runtime:Runtime):Data 
    = ListIntData(lexeme)
}

class Arith( val op:Operator, val left:Expr, val right:Expr) : Expr() {
    override fun eval(runtime:Runtime):Data {
        val x = left.eval(runtime)
        val y = right.eval(runtime)
        if(x is IntData && y is IntData) {
            return IntData(
                when(op) {
                    Operator.ADD -> x.v + y.v
                    Operator.SUB -> x.v - y.v
                    Operator.MUL -> x.v * y.v
                    Operator.DIV -> x.v / y.v
                }
            )
        } 
        else if(x is StringData && y is StringData && op == Operator.ADD){
            return StringData(x.v + y.v)
        }
        else if((x is StringData && y is IntData) && op == Operator.MUL){
            var message = x.v
            for (i in 0..y.v -2) {
                message += x.v
            }
            return StringData(message)
        }
        else if((x is IntData && y is StringData) && op == Operator.MUL){
            var message = y.v
            for (i in 0..x.v -2) {
                message += y.v
            }
            return StringData(message)
        }
        else if((x is StringData && y is IntData) && op == Operator.ADD){
            return StringData(x.v + y.v.toString())
        }
        else if((x is IntData && y is StringData) && op == Operator.ADD){
            return StringData(x.v.toString() + y.v)
        }
        else {
            throw Exception("only support int")
        }
    }
}

class Assign(
    val name: String,
    val expr: Expr
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v:Data = expr.eval(runtime)
        runtime.symbols.put(name, v)
        return None
    }
}

class ListAddAt(
    val index: Expr,
    val name: String,
    val expr: Expr
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = runtime.symbols[name]
        val i = index.eval(runtime).toString().toInt()
        val new_v = expr.eval(runtime)

        if(v is ListIntData){
            var list = v.toString().drop(1).dropLast(1).split(", ").map { it.toInt() }.toMutableList()
            list.add(i, new_v.toString().toInt())
            runtime.symbols.put(name, ListIntData(list))
            return None
        }
        else if(v is ListStringData){
            var list = v.toString().drop(1).dropLast(1).split(", ").map { it.toString() }.toMutableList()
            list.add(i, new_v.toString())
            runtime.symbols.put(name, ListStringData(list))
            return None
        }
        else{
            return None
        }
        
    }
}

class ReassignList(
    val index: Expr,
    val name: String,
    val expr: Expr
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = runtime.symbols[name]
        val i = index.eval(runtime).toString().toInt()
        val new_v = expr.eval(runtime)
        
        if(v is ListIntData){
            var list = v.toString().drop(1).dropLast(1).split(", ").map { it.toInt() }.toMutableList()
            list[i] = new_v.toString().toInt()
            runtime.symbols.put(name, ListIntData(list))
            return None
        }
        else if(v is ListStringData){
            var list = v.toString().drop(1).dropLast(1).split(", ").map { it.toString() }.toMutableList()
            list[i] = expr.eval(Runtime()).toString()
            runtime.symbols.put(name, ListStringData(list))
            return None
        }
        else{
            return None
        }
        
    }
}

class ListAddFrontBack(
    val front: Boolean,
    val name: String,
    val expr: Expr
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = runtime.symbols[name]
        val new_v = expr.eval(runtime)

        if(v is ListIntData){
            var list = v.toString().drop(1).dropLast(1).split(", ").map { it.toInt() }.toMutableList()
            if(front){
                list.add(0, new_v.toString().toInt())
            }
            else{
                list.add(list.size, new_v.toString().toInt())
            }
            runtime.symbols.put(name, ListIntData(list))
            return None
        }
        else if(v is ListStringData){
            var list = v.toString().drop(1).dropLast(1).split(", ").map { it.toString() }.toMutableList()
            if(front){
                list.add(0, new_v.toString())
            }
            else{
                list.add(list.size, new_v.toString())
            }
            runtime.symbols.put(name, ListStringData(list))
            return None
        }
        else{
            return None
        }
        
    }
}

class Deref(
    val name:String
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = runtime.symbols[name]
        if(v != null) {
            return v
        } else {
            return None
        }
    }
}

class DerefList(
    val name:String,
    val index:Expr
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = runtime.symbols[name]
        val i = index.eval(runtime).toString().toInt()
        if(v is ListIntData){
            val list = v.toString().drop(1).dropLast(1).split(", ").map { it.toInt() }
            return IntData(list[i])
        }
        else if (v is ListStringData){
            val list = v.toString().drop(1).dropLast(1).split(", ").map { it.toString() }
            return StringData(list[i])
        }
        else{
            return None
        }
    }
}

class Output(
    val exprs: List<Expr>
): Expr() {
    override fun eval(runtime:Runtime): Data {
        exprs.forEach {
            val data = it.eval(runtime)
            println(data)
        }
        return None
    }
}

class Block(val exprs:List<Expr>):Expr() {
    override fun eval(runtime:Runtime):Data
    = exprs.map { it.eval(runtime) }.last()
}

class NoneExpr(): Expr() {
    override fun eval(runtime:Runtime) = None
}

class ForLoop(
    val itteration: String,
    val start: Expr,
    val end: Expr,
    val body: Expr,
): Expr() {
    override fun eval(runtime:Runtime): Data {
        val x = start.eval(runtime)
        val y = end.eval(runtime)
        runtime.symbols.put(itteration, x)
        
        if(x is IntData && y is IntData){
            for(i in x.v..y.v) {
                val z = IntData(i)
                runtime.symbols.put(itteration, z)
                body.eval(runtime)
            }
        }
        
        else{
            throw Exception("Start and End values are invalid")
        }
        return None
    }
}

class Declare(
    val name: String,
    val parameters: List<String>,
    val body: Expr,
) : Expr() {
    override fun eval(runtime:Runtime):Data {
        val funcdata = FuncData(name, parameters, body)
        runtime.symbols[name] = funcdata
        return None
    }
}

class Invoke(
    val funcname: String,
    val arguments: List<Expr>,
) : Expr() {
    override fun eval(runtime:Runtime): Data {
        val f = runtime.symbols[funcname]
        if(f == null) {
            throw Exception("$funcname does not exist.")
        }
        if(f !is FuncData) {
            throw Exception("$funcname is not a function.")
        }
        if(arguments.size != f.parameters.size) {
            throw Exception("$funcname expects ${f.parameters.size} arguments, but ${arguments.size} given.")
        }
        
        // evaluate each argument to a data
        val argumentData = arguments.map {
            it.eval(runtime)
        }

        // create a subscope and evaluate the body using the subscope
        return f.body.eval(runtime.copy(
            f.parameters.zip(argumentData).toMap()
        ))
    }
}

class MapList(
    val funcname: String,
    val name: String,
    val arguments: List<Expr>
) : Expr() {
    override fun eval(runtime:Runtime): Data {
        val f = runtime.symbols[funcname]
        val v = runtime.symbols[name]
        if(f == null) {
            throw Exception("$funcname does not exist.")
        }
        if(f !is FuncData) {
            throw Exception("$funcname is not a function.")
        }
        if(arguments.size != f.parameters.size-1) {
            throw Exception("$funcname expects ${f.parameters.size-1} arguments, but ${arguments.size} given.")
        }
        
        if (v is ListIntData){
            val list = v.toString().drop(1).dropLast(1).split(", ").map { it.toInt() }.toMutableList()        
            var returned_list = mutableListOf<Int>()
            
            for (i in 0..(list.size-1)){
                var argumentData = arguments.map {
                    it.eval(runtime)
                }
                argumentData = argumentData + IntData(list[i])
                val number_return = f.body.eval(runtime.copy(
                                f.parameters.zip(argumentData).toMap()
                                ))
                returned_list.add(number_return.toString().toInt())
            }

            return ListIntData(returned_list)
        }
        else if(v is ListStringData){
            var list = v.toString().drop(1).dropLast(1).split(", ").map { it.toString() }.toMutableList()
            var returned_list = mutableListOf<String>()
            for (i in 0..(list.size-1)){
                var argumentData = arguments.map {
                    it.eval(runtime)
                }
                argumentData = argumentData + StringData(list[i])
                val string_return = f.body.eval(runtime.copy(
                                f.parameters.zip(argumentData).toMap()
                                ))
                returned_list.add(string_return.toString())
            }

            return ListStringData(returned_list)            
        }
        else{
            return None
        }
    }
}

class Cmp(
    val op:CmpOperators,
    val left:Expr,
    val right:Expr
) : Expr() {
    override fun eval(runtime:Runtime): Data {
        val x:Data = left.eval(runtime)
        val y:Data = right.eval(runtime)
        if(x is IntData && y is IntData) {
            val result = when(op) {
                CmpOperators.LT -> x.v < y.v
                CmpOperators.GT -> x.v > y.v
                CmpOperators.EQ -> x.v == y.v
            }
            return BooleanData(result)
        } else {
            throw Exception("Cannot perform comparison")
        }
    }
}

class Ifelse(
    val cond: Expr,
    val trueExpr: Expr,
    val falseExpr: Expr,
) : Expr() {
    override fun eval(runtime:Runtime): Data {
        val result = cond.eval(runtime) as BooleanData
        return if(result.v) {
            trueExpr.eval(runtime)
        } else {
            falseExpr.eval(runtime)
        }
    }
}

//Aggregate Operations
class MaxList(
    val list:Expr,
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = list.eval(runtime)
        
        if(v is ListIntData){
            val list = v.toString().drop(1).dropLast(1).split(", ").map { it.toInt() }
            var max = list[0]
            
            for (number in list){
                if(number > max){
                    max = number
                }
            }
            
            return IntData(max)
        }
        else{
            return None
        }
    }
}

class MinList(
    val list:Expr,
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = list.eval(runtime)
        
        if(v is ListIntData){
            val list = v.toString().drop(1).dropLast(1).split(", ").map { it.toInt() }
            var min = list[0]
            
            for (number in list){
                if(number < min){
                    min = number
                }
            }
            
            return IntData(min)
        }
        else{
            return None
        }
    }
}

class AverageList(
    val list:Expr,
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = list.eval(runtime)
        
        if(v is ListIntData){
            val list = v.toString().drop(1).dropLast(1).split(", ").map { it.toInt() }
            var sum = 0
            
            for (number in list){
                sum = sum + number
            }
            
            return IntData(sum/list.size)
        }
        else{
            return None
        }
    }
}

class SumList(
    val list:Expr,
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = list.eval(runtime)
        
        if(v is ListIntData){
            val numbers = v.toString().drop(1).dropLast(1).split(", ").map { it.toInt() }.toMutableList()
            var sum = 0
            for(number in numbers){
                sum += number
            }
            return IntData(sum)
        }
        else{
            return None
        }

    }
}

class CountList(
    val list:Expr,
): Expr() {
    override fun eval(runtime:Runtime):Data {
        val v = list.eval(runtime)
        
        if(v is ListIntData || v is ListStringData){
            val list = v.toString().drop(1).dropLast(1).split(", ").map { it.toString() }
            return IntData(list.size)
        }
        else{
            return None
        }
    }
}
