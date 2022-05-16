package com.lyrieek.sqlParser.processor.base

import com.lyrieek.sqlParser.processor.IProcess
import com.lyrieek.sqlParser.processor.ProcessResult

/**
 * 注释处理
 */
class CommentProcess(override val findKeywords: String = "--") : IProcess() {

    override fun submit(): ProcessResult {
        val lineEnd = backSql.indexOf("\n")
        if (lineEnd == -1) {
            return ProcessResult(backSql.length)
        }
        return ProcessResult(lineEnd)
    }
}