package com.example.springboot.sql;

import cn.hutool.core.date.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component // 把此类托管给 Spring，不能省略
public class TaskUtils {    
    // 添加定时任务    
//    @Scheduled(cron = "0 */1 * * * ?") // cron表达式：每周一 23:40:30 执行
    public void doTask(){
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
        String fileName = DateUtil.now() + ".sql";
        String username = "root";// 用户名
        String password = "123456";// 密码
        String host = "localhost";// 导入的目标数据库所在的主机
        String port = "3306";// 使用的端口号
        String exportDatabaseName = "t003";// 导入的目标数据库的名称
        String exportPath = "D://jiayou.sql" ;// 导入的目标文件所在的位置

        String MysqlPath = "C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\"; //路径是mysql中
        // 注意哪些地方要空格，哪些不要空格
        command.append(MysqlPath).append("mysqldump -u").append(username).append(" -p").append(password)// 密码是用的小p，而端口是用的大P。
                .append(" -h").append(host).append(" -P").append(port).append(" ").append(exportDatabaseName)
                .append(" -r ").append(exportPath);
        return command.toString();
    }
}