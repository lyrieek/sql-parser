package com.lyrieek.sqlParser.processor.base;

import com.lyrieek.sqlParser.processor.IProcess
import com.lyrieek.sqlParser.processor.ProcessResult

/**
 * 关键词处理器
 */
class KeywordProcess(override val findKeywords: String = "") : IProcess() {

    override fun submit(): ProcessResult {
        val find = Regex("^[a-zA-Z_]+").find(backSql) ?: return ProcessResult(0)
        System.err.println("未知关键词:\"${find.value}\"")
        return ProcessResult(find.range.last + 1)
    }

}
