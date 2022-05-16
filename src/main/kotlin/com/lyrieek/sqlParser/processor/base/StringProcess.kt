package com.lyrieek.sqlParser.processor.base

import com.lyrieek.sqlParser.processor.IProcess
import com.lyrieek.sqlParser.processor.ProcessResult

/**
 * 字符串处理
 */
class StringProcess(override val findKeywords: String = "'") : IProcess() {

    override fun submit(): ProcessResult {
        val charPoint = backSql.substring(1).indexOf(findKeywords)
        if (charPoint == -1) {
            throw RuntimeException("loss '")
        }
        return ProcessResult(charPoint + 1)
    }

}
