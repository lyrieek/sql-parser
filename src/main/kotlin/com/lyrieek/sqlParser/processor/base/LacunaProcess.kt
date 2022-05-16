package com.lyrieek.sqlParser.processor.base

import com.lyrieek.sqlParser.processor.IProcess
import com.lyrieek.sqlParser.processor.ProcessResult

/**
 * 空白内容
 */
class LacunaProcess : IProcess() {

    override val findKeywords = " |\n|\t|\r"

    override fun submit(): ProcessResult {
        return ProcessResult(backSql.length - backSql.trimStart().length)
    }
}