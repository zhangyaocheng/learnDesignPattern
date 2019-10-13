public class Use6 {

    public static void main(String[] args){

        Person person = new Person("小明");

        System.out.println("第一种穿法");
        xifu xifu1 = new xifu();
        loudongku loudongku1 = new loudongku();
        tuoxie tuoxie1 = new tuoxie();

        xifu1.Decorate(person);
        loudongku1.Decorate(xifu1);
        tuoxie1.Decorate(loudongku1);
        tuoxie1.show();


    }

}
