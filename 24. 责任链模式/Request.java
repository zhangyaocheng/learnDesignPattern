/**
 * 请求类
 * 包含请求类型
 * 请求数目
 * 请求内容
 */
public class Request {

    private String Request_Type;
    private String Request_Content;
    private int Request_num;

    public String getRequest_Type() {
        return Request_Type;
    }

    public void setRequest_Type(String request_Type) {
        Request_Type = request_Type;
    }

    public String getRequest_Content() {
        return Request_Content;
    }

    public void setRequest_Content(String request_Content) {
        Request_Content = request_Content;
    }

    public int getRequest_num() {
        return Request_num;
    }

    public void setRequest_num(int request_num) {
        Request_num = request_num;
    }
}
