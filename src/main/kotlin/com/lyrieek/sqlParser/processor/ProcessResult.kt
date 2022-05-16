package com.lyrieek.sqlParser.processor

/**
 * 处理结果
 */
class ProcessResult(public var pos: Int) {

    var action: ProcessAction = ProcessAction.NONE

    lateinit var value: Any

}