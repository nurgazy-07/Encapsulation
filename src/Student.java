import java.util.Scanner;

public class Student {
   private String name;
   private int age;

   public Student(String name, int age){
       this.name = name;

   }
   public String getName() {
       return name;

   }
   public void setName(String consol){
       this.name = consol;
   }
   public int getAge(){
       return  age;
   }
   public void setAge(int con){
      this.age = con;
   }
}
