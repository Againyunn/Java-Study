package 연습;
import java.util.Scanner;

public class HRISui {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

      /* Employee [] EmList = new Employee[3];

      EmList [0] = new Employee(201901542,"박수민",true);
      EmList [1] = new Employee(202001542,"박수민a",false);
      EmList [2] = new Employee(202101542,"박수민b",false);*/



        EmployeeList emList = new EmployeeList();
        emList.AddEmployee(201801542,"박수민",true);
        emList.AddEmployee(201901542,"박수민a",false);
        emList.AddEmployee(20201542,"박수민b",false);
        emList.AddEmployee(202201542, "박수민c", false);
        //테스트용
        emList.AddEmployee(2019015, "삼근섭", false);

        emList.InsertEmployee(202001542,201901542,"인서트 수민",false);

        long wage_all = emList.Wage_all();
        System.out.println("월급 총액 "+ wage_all);


        System.out.print("조회할 직원의 사번은?: ");
        Scanner scan = new Scanner(System.in);
        int emID = scan.nextInt();
        int employee_Info = emList.Employee_Info(emID);

    }

}