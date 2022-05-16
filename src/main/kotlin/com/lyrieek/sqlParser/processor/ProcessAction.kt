package com.lyrieek.sqlParser.processor

enum class ProcessAction {
    ROOT_OBJ,//指定根对象,例如SELECT
    APPEND_OBJ,//追加子对象,例如FROM Table,SubQuery
    SET_ATTR,//设置属性,例如COLUMN,WHERE
    NONE,//无处理
}