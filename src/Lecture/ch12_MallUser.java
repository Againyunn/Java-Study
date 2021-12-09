package Lecture;

public class ch12_MallUser {
    private String name;
    private ch12_PayType payType;

    public ch12_MallUser(String name, ch12_PayType payType) {
        this.name = name;
        this.payType = payType;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Object getPayType() {
        return payType;
    }
    public void setPayType(ch12_PayType payType) {
        this.payType = payType;
    }
}