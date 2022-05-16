package com.lyrieek.sqlParser

import com.lyrieek.sqlParser.dialect.PostgreParse

object Run {

    @JvmStatic
    fun main(args: Array<String>) {
        val sqlStream: SQLStream = ParseFactory.getEngine(PostgreParse())
        sqlStream.devour(" SELECT * FROM APP_USER")
        for (process in sqlStream) {
            sqlStream.propel(process.submit())
        }
        sqlStream
//        sqlStream.infer()
    }

}