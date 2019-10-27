/**
 * Note类用来解析音符，对于C,D,E,F,G,A,B分别代表do,ra,mi,fa,so,la,xi.
 * P代表休止符
 */
public class Note extends AbstractExpress{
    @Override
    public void execute(String key, String value) {
        String note = "";
        switch (key){
            case "C":note = "1";break;
            case "D":note = "2";break;
            case "E":note = "3";break;
            case "F":note = "4";break;
            case "G":note = "5";break;
            case "A":note = "6";break;
            case "B":note = "7";break;
        }
        System.out.println(note+" ");
    }
}
