package Lesson_13.EasyLevel;

public class PersonMain {
    public static void main(String[] args) {
        Person pObj=new Person("Jon",24,87.6,187.0);
        System.out.println(pObj.getAge());
        System.out.println(pObj.getName());
        System.out.println(pObj.getHeight());
        System.out.println(pObj.getWeight());
        System.out.println(pObj.getClass()); //determine what class the object is created
    }
}
