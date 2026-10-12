class person{
String name;
int age;
person(String name,int age){
this.name=name;
this.age=age;
}
void display(){
System.out.println("Name :"+name);
System.out.println("age :"+age);
}
public class PersonDemo{
public static void main(String args[]){
Person p1 =new Person("Ankit",21);
Person p2 = new Person("Rahul",22);
}
}