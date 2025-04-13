import java.util.*;

public class Main {
    static ArrayList<Medicine> getPriceByDisease(Medicine[] medicine,String disease){
      ArrayList<Medicine> res = new ArrayList<>();
      
      for(Medicine mObj : medicine){
        if(mObj.disease.equalsIgnoreCase(disease)){
          res.add(mObj);
        }
      }
      return res;
    }
    
   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Hello world!");
      Medicine[] medicine = new Medicine[4];
      for(int i=0; i<4; i++){
        String mName = sc.nextLine();
        String batch = sc.nextLine();
        String disease = sc.nextLine();
        int price = sc.nextInt();sc.nextLine();
        Medicine obj = new Medicine(mName,batch,disease,price);
        medicine[i] = obj;
      }
      String disease = sc.nextLine();
      ArrayList<Medicine> res = getPriceByDisease(medicine,disease);
      for(Medicine obj:res){
        System.out.println(obj.price);
      }
  }
}
class Medicine{
  String medicineName;
  String batch;
  String disease;
  int price;
  
  Medicine(String mName,String batch,String disease,int price){
    this.medicineName = mName;
    this.batch = batch;
    this.disease = disease;
    this.price = price;
    
  }
}
