public class VolunteerFactory implements IFactory {
    @Override
    public Leifeng createLeifent() {
        return new Volunteer(); // 返回志愿者对象
    }
}
