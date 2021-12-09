package Lecture;

@FunctionalInterface
interface Myfunction {
    int calc(int i);
}
public class ch12_LambdaEx1 {

    public ch12_LambdaEx1() {
        Myfunction isquare = (i) -> {return i*i;};
        System.out.println("i의 제곱: "+isquare.calc(9));
    }
    public static void main(String[] args) {
        new ch12_LambdaEx1();
    }
}