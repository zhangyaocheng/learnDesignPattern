/**
 * 抽象表达式类
 * 用来抽象解析文本
 */
public abstract class AbstractExpress {

    public void interpret(PlayContext context){ //这里的方法是用来解析一个音乐文本

        if (context==null){return;}
        else{
            String[] strs = context.getText().split(" ");
            String playKey = strs[0];
            String playVlue = strs[1];//
            StringBuffer sb = new StringBuffer();
            for (int i=2;i<strs.length;i++){
                sb.append(strs[i]+" ");
            }
            context.setText(sb.toString());
            execute(playKey,playVlue);
        }

    }

    public abstract void execute(String key, String value);

}
