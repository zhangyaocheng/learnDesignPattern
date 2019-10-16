import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Java读取配置文件的类
 * 写一个处理配置文件的方法
 * 读取.properties格式的文件
 */
public class ReadConfigFile {

    public String getValue(String filepath, String key) {

        Properties properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream(filepath));
        }catch (Exception e){
            System.out.println(e);
        }

        return properties.get(key)+"";

    }

    public static void main(String[] args) throws IOException {
        ReadConfigFile readConfigFile = new ReadConfigFile();
        String value = readConfigFile.getValue("/DB.properites","db");
        System.out.println("you get value of db="+value);
    }

}
