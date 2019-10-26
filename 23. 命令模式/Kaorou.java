/**
 * 烤肉类继承Command类
 */
public class Kaorou extends Command{

    public Kaorou(Recivier recivier){
        super(recivier);
    }

    @Override
    public void ExecuteCommand() {
        recivier.kaoRou();
    }
}
