package com.lyrieek.sqlParser;

import com.lyrieek.sqlParser.processor.IProcess
import com.lyrieek.sqlParser.processor.base.*

interface ParseEngine {

    /**
     * 依照优先循序加载预备处理器
     */
    fun preparation(process: LinkedHashSet<IProcess>) {
        process.add(LacunaProcess())
        process.add(CommentProcess())
        process.add(StringProcess())
        process.add(KeywordProcess())
        process.add(SymbolProcess())
    }

}
