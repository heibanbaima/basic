package collections;

import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class propertiesep1 {
    public static void main(String[] args) throws IOException {
        String settings = "# test" + "\n" + "course=Java" + "\n" + "last_open_date=2020-11-07T12:35:01";
        ByteArrayInputStream input = new ByteArrayInputStream(settings.getBytes("UTF-8"));
        Properties props = new Properties(); //创建Properties实例
        props.load(input); //调用load()读取文件
//        props.load(new FileReader("settings.properties",StandardCharsets.UTF_8)); 正常读取中文
        System.out.println("course:" + props.getProperty("course")); //调用getProperty()读取配置
        System.out.println("last_open_date:" + props.getProperty("last_open_date"));
        System.out.println("last_open_file:" + props.getProperty("last_open_file"));
        System.out.println("auto_save:" + props.getProperty("auto_save", "60"));
    }
}
