public class Use16 {

    public static void main(String[] args){

        Work emegence = new Work();
        emegence.setHour(9);
        emegence.writeProgram();
        emegence.setHour(10);
        emegence.writeProgram();

        emegence.setFinish(false);
        emegence.setHour(20);
        emegence.writeProgram();

    }

}
