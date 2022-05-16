package com.lyrieek.sqlParser

object ParseFactory {

    fun getEngine(pe: ParseEngine): SQLStream {
        return SQLStream(pe)
    }
}