package backend

class Runtime() {
    val symbols:MutableMap<String, Data> = mutableMapOf()

    fun subscope(bindings:Map<String, Data>):Runtime {
        val parentSymbolTable = this.symbols
        return Runtime().apply {
            symbols.putAll(parentSymbolTable)
            symbols.putAll(bindings)
        }
    }
    
    fun copy(additionalBindings:Map<String, Data>):Runtime {
        val newRuntime = Runtime()
        newRuntime.symbols.putAll(this.symbols)
        newRuntime.symbols.putAll(additionalBindings)
        return newRuntime
    }

    override fun toString():String {
        return symbols.map {
            entry -> "${entry.key}=${entry.value}"
        }.joinToString("; ")
    }
}


