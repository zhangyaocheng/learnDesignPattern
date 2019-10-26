public class KaoJiChi extends Command{

    public KaoJiChi(Recivier recivier){
        super(recivier);
    }
    @Override
    public void ExecuteCommand() {
        recivier.kaoJiChi();
    }
}
