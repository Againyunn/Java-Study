package 연습;

public class EmployeeList {
    private Employee head= null; // 헤드값 비워두기
    private Employee tail = null;

    public void AddEmployee(int id, String name, boolean isManager)
    {// 마지막 직원옆에 새로운 직원 추가

        Employee newEmployee = new Employee(id, name, isManager);

        if(head == null)
        {      head = newEmployee;
            return;
        }
        else
        {
            // 마지막 직원을 먼저 찾는다.
            // 마지막 직원의 next가 newEmployee를 가리키도록 한다.
            Employee current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newEmployee;
        }
    }

    public void InsertEmployee(int idafter,int id, String name, boolean isManager)
    {//경력직 추가
        Employee newEmployee = new Employee(id, name, isManager);
        newEmployee.emID = id;

        newEmployee.isManager = isManager;
        newEmployee.name = name;

        Employee current = head;
//        for(int i =0; i< id; i++)
        while(current != null)
        {

            //재윤
            //코드 구조를 보니까 idafter 뒤에 새로운 사원을 추가하는 구조인데,
            //for문으로 무한 루프돌고 신규사원 추가하는 조건이 없더라구
            //교수님은 for문으로 쓰시려던 것 같은데, 사실 이 상황에서는 while로 돌면서 찾는 거 더 간단하고 빨라서 이렇게 짰어
           if(current.emID == idafter){ //기존의 사원번호 중 함수의 인자로 입력한 최근 사원번호(idafter)과 일치하는 값 찾아서 다음 노드에 신규 사원 정보 저장하기
                newEmployee.next = current.next;
                current.next = newEmployee;
            }

            current = current.next; //다음 노드로 주소 바꾸기

        }
    }
    public void DelEmployee(int id)// 사번으로 특정 직원 삭제 해당 아이디 어디있는 지 몰라서 계속 찾아가는 것
    {
        // 특정 employee를 지울떄  특정 직원을 찾으려면 연결리스트로 이어져있으니까 만약 사근섭을 지우고 싶다면 앞에 연결되어있는
        // 삼근섭을 찾아야함 그리고 그 연결고리를 끊어야함 삼근섭의 next를 끊어버려야함
        Employee current = head;
        Employee prev = null;// 이전 직원을 찾아야하니까 일단 이전  기본 값 비워 둠
        while(current != null)
        {
            if (current.emID == id)// 만약에 현재 이엠아이디와 사번(현재 사근섭)이 같다면 사근섭 찾기 가능
                break;

            prev = current; // 현재 커런트는 그 이전 사람
            current = current.next;// 커런트는 프레브 다음사람
        }
        // 여기 까지 prev가 누군지 가르키고 있음(저장되어 있다.) current가 특정 직원을 가리킬때 prev가 그 이전직원을 가리키도록
        if(prev ==null)// current가  head 값이랑 똑같다
        {
            head=head.next;// 헤드에 헤드 다음 주소 저장.
            //만약 이근섭이 헤드여서 삼근섭을 헤드로 만들고 싶다면 커런트(헤드)에 삼근섭 주소 저장

        }
        else if(current == null)//  사장 해고

            prev.next = current.next;//삼근섭의 넥스트가 오근섭이도록 우회해줘야함.
    }


// 전체 직원 월급의 총액을 계산하는 함수


    public long Wage_all()

    {
        long total_wage =0;
        Employee current = head;

        while(current != null)
        {
            total_wage += current.getWage();
            //테스트 용
            //System.out.println("지금 값:"+total_wage);
            current = current.next;
        }

        return total_wage;

    }
    public void Employee_info(int id)// 직원 모든 정보 조회
    {
        Employee current = head;

        while(current != null)
        {
            System.out.println("name: "+ current.name);
            System.out.println("ID :"+ current.emID);
            System.out.println("Momthly Wage :"+ current.getWage());

            current = current.next;
        }

    }
    public int getEmployee(int id)
    {// 특정 번째의 노드 출력
        Employee current = head;
        for(int i = 0; i <id; i++)
        {// 특정 직원 찾을때까지 i 탐색
            current = current.next;
        }
        return current.emID;// 특정 번째 데이터 반환
    }

    public int Employee_Info(int id)
    {
        Employee current = head;
        while(current != null)
        {

            //재윤
            //입력받은 id와 일치하는 사워번호가 있다면 결과값을 출력한 뒤 무한루프 탈출과 동시에 함수 종료(return의 역할)
            if(current.emID == id){
                System.out.println("name: "+ current.name);
                System.out.println("ID :"+ current.emID);
                System.out.println("Momthly Wage :"+ current.getWage());
                return 1; //1 == True
            }

            current = current.next;
        }

        //입력한 id에 일치하는 사번이 저장되어 있지 않은 경우 에러 값 출력
        System.out.println("사번을 다시 확인해주세요.");
        return 0; //0 == False
    }

    // 모든 직원 정보를 반복해서 찾는다. current 가 null일떄까지
    // 직원의 이엠 아이디와 이엠아이디가 같은 경우 해당 정보 출력
    // 반복은 없다
}

