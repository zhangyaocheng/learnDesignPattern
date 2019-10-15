public class Use9 {

    public static void main(String[] args) throws CloneNotSupportedException{

        Resume a = new Resume("小明");
        a.setPersonalInfo(12,"男");
        a.setWorkExperience("20190515-20190826","字节跳动");

        Resume b = (Resume)a.clone();
        b.setWorkExperience("20190515-20190923","百度");

        Resume c = (Resume)a.clone();
        c.setPersonalInfo(23,"男");

        a.dispay();
        b.dispay();
        c.dispay();


    }

}
