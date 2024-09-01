package com.example.springboot.sql;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.text.StrBuilder;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.db.Db;
import cn.hutool.db.DbUtil;
import cn.hutool.db.Entity;
import cn.hutool.db.ds.DSFactory;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.experimental.Accessors;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 生成的sql：删除表 + 创建表 + insert
 *
 * @author jason
 */
public class CreateAndInsertSqlJob {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        String command = getExportCommand();
        // 这里其实是在命令窗口中执行的 command 命令行
        try {
            Process exec = runtime.exec(command);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    // 得到导出数据的命令行语句
    private static String getExportCommand() {
        StringBuffer command = new StringBuffer();
        String username = "root";// 用户名
        String password = "root";// 密码
        String host = "localhost";// 导入的目标数据库所在的主机
        String port = "3306";// 使用的端口号
        String exportDatabaseName = "jiayou";// 导入的目标数据库的名称
        String exportPath = "D:/mytable.sql";// 导入的目标文件所在的位置

        String MysqlPath = "C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\"; //路径是mysql中
        // 注意哪些地方要空格，哪些不要空格
        command.append(MysqlPath).append("mysqldump -u").append(username).append(" -p").append(password)// 密码是用的小p，而端口是用的大P。
                .append(" -h").append(host).append(" -P").append(port).append(" ").append(exportDatabaseName)
                .append(" -r ").append(exportPath);
        return command.toString();
    }
}

