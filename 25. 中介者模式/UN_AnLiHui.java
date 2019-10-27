/**
 * 安理会
 * 继承自联合国
 */
public class UN_AnLiHui extends UnitedNations{

    private American american; //这里存放具体国家
    private Iraq iraq;

    public void setAmerican(American american) {
        this.american = american;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void send(String message, Country country) {

        if (country==american){
            iraq.getMessage(message);
        }else if (country==iraq){
            american.GetMessage(message);
        }

    }
}
