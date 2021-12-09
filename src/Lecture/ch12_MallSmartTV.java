package Lecture;

public class ch12_MallSmartTV extends ch12_MallProduct {
    String infoText;

    public ch12_MallSmartTV(String pName, int pPrice, String infoText) {
        this.pName = pName;
        this.pPrice = pPrice;
        this.infoText = infoText;
    }

    @Override
    public void printInfoText() {
        System.out.println("해상도: "+infoText);
    }
}
