public class  students{

    public static void main(String[] args) {
      
      Student myBio = new Student("sabitaaaa", 233, 2445);//Argument
      Student myBio1 = new Student();//with out argument
       System.out.println(myBio.getName());
      System.out.println(myBio.getId());
      System.out.println(myBio.getSalary());
      System.out.println(myBio1.getName());
      System.out.println(myBio1.getId());
      System.out.println(myBio1.getSalary());
  }
}

class Student {
  private String name ;
  private int Id ;
 private  int Salary;

  public String getName(){
    return name;
  }
   public void setName(String n){
      name = n;
  }
  public int getId(){
   return Id;
     }
      public void setId(int a){
    Id=a;
  }
   public int getSalary(){
    return Salary;
     }
      public void setSalary(int b){
  Salary=b;
  }
  public Student(){//constructors without parameters
    Id = 23;
    name = "sabita";
    Salary = 245;
  }
  public Student(String n1,int a1,  int b1){// constructors with parameters
 name = n1;
 Salary=b1;
 Id=a1;
  }
  
}
