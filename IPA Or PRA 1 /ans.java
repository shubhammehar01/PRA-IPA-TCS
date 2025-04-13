import java.util.*;

public class Main {
    static int findCountOfEmployeesUsingCompTransport(ArrayList<Employee> emp,String str){
      int ans = 0;
      for(Employee e : emp){
        if(e.branch.equals(str) && e.comTrans==(true)){
          ans++;
        }
      }
      return ans;
    }
    static Employee findEmployeeWithSecondHighestRating (ArrayList<Employee> emp){
      Employee highest = null,secHigh = null;
      for(Employee e:emp){
        if(highest==null || e.rating>highest.rating){
          secHigh = highest;
          highest = e;
        }
        else if((secHigh==null || e.rating>secHigh.rating) && e.rating<highest.rating){
          secHigh = e;
        }
      }
      if(secHigh!=null){
        return secHigh;
      }
      return highest;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Hello world!");
      ArrayList<Employee> emp = new ArrayList<>();
      for(int i=0; i<4; i++){
        int id = sc.nextInt();sc.nextLine();
        String name = sc.nextLine();
        String branch = sc.nextLine();
        double rating = sc.nextDouble(); sc.nextLine();
        boolean comTrans = sc.nextBoolean();
        Employee emp1 = new Employee(id,name,branch,rating,comTrans);
        emp.add(emp1);
        
      }
      sc.nextLine();
      String b = sc.nextLine();
      int cnt =  findCountOfEmployeesUsingCompTransport(emp,b);
      System.out.println("cnt is : "+cnt);
      
      Employee e = findEmployeeWithSecondHighestRating(emp);
      System.out.println(e.empId+"\n"+e.name);
      
      
      
  }
}
class Employee{
  int empId;
  String name;
  String branch;
  double rating;
  boolean comTrans;
  
  Employee(int empId,String name,String branch,double rating,boolean comTrans){
    this.empId = empId;
    this.name = name;
    this.branch = branch;
    this.rating = rating;
    this.comTrans = comTrans;
    
  }
}
