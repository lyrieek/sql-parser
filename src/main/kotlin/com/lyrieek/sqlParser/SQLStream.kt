package com.lyrieek.sqlParser

import com.lyrieek.sqlParser.processor.IProcess
import com.lyrieek.sqlParser.processor.ProcessAction
import com.lyrieek.sqlParser.processor.ProcessResult
import com.lyrieek.sqlParser.stroll.DataLinkedArray
import com.lyrieek.sqlParser.structure.Entity

class SQLStream(private val pe: ParseEngine) : Iterator<IProcess> {

    private val dataArray: DataLinkedArray = DataLinkedArray()
    private val process: LinkedHashSet<IProcess> = LinkedHashSet()
    private var index = 0
    private var sql = ""
    private var entity: Entity? = null

    /**
     * 接收SQL语句
     */
    fun devour(sql: String) {
        pe.preparation(process)
        this.sql = sql
    }

    fun infer() {
    }

    /**
     * 推进流程
     */
    fun propel(pr: ProcessResult) {
        if (pr.pos == 0) {
            return
        }
        if (pr.action == ProcessAction.ROOT_OBJ) {
            entity = pr.value as Entity
        }
        index = 0
        this.sql = this.sql.substring(pr.pos)
    }

    /**
     * 检查扫描是否完毕
     */
    override fun hasNext(): Boolean {
        return this.sql.isNotEmpty()
    }

    /**
     * 寻求下一个处理项
     */
    override fun next(): IProcess {
        if (process.size <= index) {
            throw RuntimeException("无法处理接下来的内容:$sql")
        }
        val item = process.elementAt(index++)
        if (!item.check(sql)) {
            return next()
        }
        return item
    }

}