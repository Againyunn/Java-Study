package Lecture;

public class ch12_MallSmartPhone extends ch12_MallProduct {
    String infoText;

    public ch12_MallSmartPhone(String pName, int pPrice, String infoText) {
        this.pName = pName;
        this.pPrice = pPrice;
        this.infoText = infoText;
    }

    @Override
    public void printInfoText() {
        System.out.println("화면크기: "+infoText);
    }
}
