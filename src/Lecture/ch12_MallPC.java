package Lecture;

public class ch12_MallPC extends ch12_MallProduct {
    String infoText;

    public ch12_MallPC(String pName, int pPrice, String infoText) {
        this.pName = pName;
        this.pPrice = pPrice;
        this.infoText = infoText;
    }

    @Override
    public void printInfoText() {
        System.out.println("사이즈: "+infoText);
    }
}
