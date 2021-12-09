package Lecture;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ch12_MallMain implements ch12_MallInfo{
    ch12_MallUser[] users = new ch12_MallUser[3];
    ch12_MallProduct[] products = new ch12_MallProduct[6];
    ArrayList<ch12_MallProduct> cart = new ArrayList<ch12_MallProduct>();
    Scanner scan = new Scanner(System.in);

    int selUser;
    String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void start() {
        System.out.println("====================================================");
        System.out.println(title+" : 메인 [선택]");
        System.out.println("====================================================");
        int i=0;

        for(ch12_MallUser u : users) {
            System.out.printf("[%d]%s(%s)\n",i++,u.getName(),u.getPayType());
        }

        System.out.println("[x]종 료");
        System.out.print("선택 : ");
        String select = scan.next();
        System.out.println("## "+select+"선택 ##");

        switch(select) {
            case "x": System.exit(0);break;
            default:
                selUser = Integer.parseInt(select);
                productList();
        }
    }

    public void productList() {
        System.out.println("----------------------------------------------------");
        System.out.println(title+" : 상품 [선택]");
        System.out.println("----------------------------------------------------");
        int i=0;

        for(ch12_MallProduct p : products) {
            System.out.print("["+i+"]");
            p.printDetail();
            i++;
        }
        System.out.println("[m]메인화면");
        System.out.println("[c]체크아웃");
        System.out.print("선택 : ");
        String select = scan.next();
        System.out.println("## "+select+"선택 ##");

        switch(select) {
            case "m":start();break;
            case "c":checkOut();break;
            default:
                int pselect = Integer.parseInt(select);
                cart.add(products[pselect]);
                productList();
        }
    }

    public void checkOut() {
        System.out.println(title+" : 체크아웃");
        System.out.println("----------------------------------------------------");
        int total=0;
        int i=0;

        DecimalFormat df = new DecimalFormat("###,###");    // 1000 단위 콤마, 가독성에서 좋음
        for(ch12_MallProduct p : cart) {
            System.out.printf("[%d]%s(%s)\n",i++,p.pName,df.format(p.pPrice));
            total = total + p.pPrice;
        }
        System.out.println("====================================================");

        System.out.println("결제 방법: "+users[selUser].getPayType());

        System.out.println("합계: "+df.format(total)+" 원 입니다.");
        System.out.println("[b]이전 , [x]결제 완료");
        System.out.print("선택 : ");
        String select = scan.next();

        switch(select) {
            case "x":System.out.println("## 프로그램 종료 ##");
                System.exit(0);break;
            case "b":productList();break;
            default: checkOut();
        }
    }

    public void runUser() {
        ch12_MallUser user = new ch12_MallUser("멍멍이",ch12_PayType.카드);
        users[0] = user;
        user = new ch12_MallUser("야옹이",ch12_PayType.현금);
        users[1] = user;
        user = new ch12_MallUser("호랑이",ch12_PayType.외상);
        users[2] = user;
    }

    public void runProduct() {
        ch12_MallSmartPhone sp = new ch12_MallSmartPhone("Apple 아이폰13",1500000,"5.6인치");
        products[0] = sp;
        sp = new ch12_MallSmartPhone("SAMSUNG 갤럭시S",1050000,"7인치");
        products[1] = sp;
        ch12_MallSmartTV st = new ch12_MallSmartTV("Apple TV",3000000,"UHD");
        products[2] = st;
        st = new ch12_MallSmartTV("SAMSUNG TV",2700000,"UHD");
        products[3] = st;
        ch12_MallPC pc = new ch12_MallPC("LG 그램",3200000,"17인치");
        products[4] = pc;
        pc = new ch12_MallPC("SAMSUNG 노트북",2900000,"16.5인치");
        products[5] = pc;
    }
}
