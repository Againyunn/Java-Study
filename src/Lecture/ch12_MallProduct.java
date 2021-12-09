package Lecture;

public abstract class ch12_MallProduct {
    String pName;
    int pPrice;

    public void printDetail() {
        System.out.print("상품: "+pName+" , ");
        System.out.print("가격: "+pPrice+" , ");
        printInfoText();
    }

    public abstract void printInfoText();
}