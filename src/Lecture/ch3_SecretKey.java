package Lecture;

public class ch3_SecretKey {
    public static void main(String[] args) {

        int pwd = 20210928;
        int encPwd, decPwd; //null로 우선 선언
        int key = 0x1A253B65; //key의 암호화 수

        System.out.println("원본 비밀번호 : "+pwd);

        encPwd = pwd ^ key;

        System.out.println("암호화 비밀번호 : "+encPwd);

        decPwd = encPwd ^ key;

        System.out.println("복호화 비밀번호 : "+decPwd);

    }
}
