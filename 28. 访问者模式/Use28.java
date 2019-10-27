public class Use28 {

    public static void main(String[] args){

        ObjectStructure structure = new ObjectStructure();
        structure.Add(new Man());
        structure.Add(new Woman());

        Success success = new Success();
        structure.Show(success);

        Failure failure = new Failure();
        structure.Show(failure);

    }

}
