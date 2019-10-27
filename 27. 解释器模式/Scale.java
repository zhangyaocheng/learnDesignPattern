/**
 * 音阶类
 */
public class Scale extends AbstractExpress{ // 针对以O开始的字符
    @Override
    public void execute(String key, String value) {
        String scale = "";
        switch (value){
            case "1":scale = "低音";break;
            case "2":scale = "中音";break;
            case "3":scale = "高音";break;
        }
        System.out.println(scale+" ");

    }
}
