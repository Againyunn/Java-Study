package Lecture;

abstract class University {
    String uni_name;

    University(String name) {
        uni_name = name;
    }

    public abstract void eng();
    public abstract void text();
}

class SchoolName extends University {
    public SchoolName(String name) {
        super(name);
    }

    @Override
    public void eng() {
        System.out.println("HUFS");
    }

    @Override
    public void text() {
        System.out.println("특이사항: 서울 캠퍼스 & 글로벌 캠퍼스 최우수 대학교");
    }
}

class SubjectName extends University {
    public SubjectName(String name) {
        super(name);
    }

    @Override
    public void eng() {
        System.out.println("OOP");
    }

    @Override public void text() {
        System.out.println("특이사항: 객체들 간의 유기적인 상호작용을 통해 "
                + "로직을 구성하는 프로그래밍 방법");
    }
}

public class ch11_AbstractEx2 {
    public static void main(String [] ar){
        SchoolName school = new SchoolName("한국외국어대학교");
        school.eng();
        school.text();
        System.out.println("학교 이름 : " + school.uni_name);

        SubjectName subject = new SubjectName("객체지향프로그래밍");
        subject.eng();
        subject.text();
        System.out.println("수강 과목: " + subject.uni_name);
    }
}