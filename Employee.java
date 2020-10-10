class Employee
{
  String name;
  int age;
  String city;
 Employee(String n, int a, String c)
{
   name=n;
   age=a;
   city=c;
}
void display()
{
  System.out.println("The Name is "+name);
  System.out.println("The Age is "+age);
  System.out.println("The City is "+city);
}
public static void main(String args[])
{
  Employee e = new Employee("Chaitali",20,"Pune");
  Employee s = new Employee("Aditi",21,"Mumbai");
  e.display();
  s.display();
}
}
