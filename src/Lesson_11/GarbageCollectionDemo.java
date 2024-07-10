package Lesson_11;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        UnreachableObj obj=new UnreachableObj();
        UnreachableObj obj2=new UnreachableObj();
        obj2=obj;
        runGarbageCollector();
        System.out.println(obj.a);
        System.out.println(obj2.a);
        System.out.println(obj);  //@5b480cf9
        System.out.println(obj2); //@5b480cf9
    }
    public static void runGarbageCollector(){
        System.gc();
    }
}
