public class UndergraduateFactory implements IFactory {
    @Override
    public Leifeng createLeifent() {
        return new Undergraduate(); // 返回大学生对象
    }
}
