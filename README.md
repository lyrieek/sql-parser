# SQL Parser

一个包容性强，健壮的SQL解析器(包含DDL,DML,DQL,TCL)语句，为语句进行可视化展示，预测展示，测试，纠错，转换，智能生成，分块等功能

## Extract SQL

从不同的代码格式中提取SQL语句

- 日志文件
- Java文件

## Format

默认格式化配置项(本项目kotlin代码也依此配置)

| 配置项                      | 释义           | 默认值   |
|--------------------------|:-------------|-------|
| charset                  | 默认字符集        | UTF-8 | 
| indent_style             | 缩进样式         | tab   | 
| indent_size              | 缩进长度         | 4     | 
| end_of_line              | 换行符          | LF    | 
| trim_trailing_whitespace | 去掉尾随的空格      | true  | 
| insert_final_newline     | 在最后一行插入一个空白行 | false | 

SQL语句专有格式化配置项

| 配置项                  | 释义                                                                         | 默认值                   |
|----------------------|:---------------------------------------------------------------------------|-----------------------|
| max_single_line_size | 最大单行字符长度                                                                   | 30                    | 
| comment_pos          | 注释符号`--`位置 (`start`为在最前面，`aline`为自动识别流程位置对齐，`previous`为对齐上一行，`next`为对齐下一行) | start                 | 
| new_line_keyword     | 无论字符长短，必须换行的关键字                                                            | BEGIN,OPEN            | 
| insert_fold          | 是否视情况插入折叠注释                                                                | false                 | 
| fold_format          | 折叠注释的格式                                                                    | `-- comment [action]` |

HTML视图专有格式化配置项

| 配置项               | 释义        | 默认值                  |
|-------------------|:----------|----------------------|
| if_new_line       | 分支条件块是否换行 | false                | 
| code_weight_color | 代码量颜色标识   | `[green,red,purple]` | 

## File Type

依照语句类别与可视化视图产生以下文件，并会进行不同的行为，产生对应UI

- *.ly-table 表/视图
- *.ly-index 索引
- *.ly-foreign-key 外键
- *.ly-function 函数/存储过程/程序包
- *.ly-trigger 触发器
- *.ly-data-type 数据类型
- *.ly-seq 序列
- *.ly-session 会话连接
- *.ly-role 权限
- *.ly-storage 存储
- *.ly-languages 语言
- *.ly-recycle 回收站
- *.ly-data 数据
- *.ly-sql 语句(通用)

## FAQ

1. 如何构建这个项目？ 使用[Gradle](https://gradle.org/guides/#getting-started)进行构建
2. 它能否提供插件？正在进行IDEA与VSCode插件的开发
3. 它支持哪些数据库？主要是PostgreSQL，Oracle，后期会考虑MySQL，SqlLite与SqlServer的开发

[//]: # (待续)

## License

GNU AFFERO GENERAL PUBLIC LICENSE (A-GPL)
