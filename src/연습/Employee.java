package 연습;


public class Employee {
    public int emID;
    public String name;
    public boolean isManager;


    private long  wage;
    private int over_time;

    // 연결고리
    Employee next = null ;// 주소를 지칭하는 변수 next 지정(연결고리)
    Employee prev = null;

    public Employee(int emID, String name, boolean isManager){
        this.emID = emID;
        this.name = name;
        this.isManager = isManager;
        over_time = 0;
        wage = 3000000;
        if(isManager)
            wage *= 1.2;
    }


    public void setOvertime(int over)
    {
        over_time = over;
    }
    public long getWage()
    {

        return wage+ over_time * 10000;
    }

    public void promoted()
    {
        isManager =true;

    }
}
