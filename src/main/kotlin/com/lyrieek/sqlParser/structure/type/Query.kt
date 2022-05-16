package com.lyrieek.sqlParser.structure.type

import com.lyrieek.sqlParser.structure.Entity

class Query : Demonstrable() {

    private val columns: ArrayList<String> = ArrayList()

    fun setTarget(entity: Entity) {
        viewEntity.add(entity)
    }

    override fun toString(): String {
        return "查询目标:$viewEntity\n过滤条件:$params\n提取列:$columns"
    }

}