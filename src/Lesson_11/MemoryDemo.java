package Lesson_11;

public class MemoryDemo {
    public static void main(String[] args) {
        int a=6;  //'a' is stored in stack memory
        int b=4;  //'b' is stored in stack memory
        int add=stackVsHeap(3,4); // Method call, so 'add' is stored in the stack as well
        System.out.println("sum: "+add);
        HeapMemory obj1=new HeapMemory(1,"Heap Memory"); // Object created in heap memory
        HeapMemory obj2=new HeapMemory(3,"Heap Memory"); // Another object in heap memory
        System.out.println("Obj 1: "+obj1.d);
        System.out.println("Obj 2: "+obj2.d);
    }

    public static int stackVsHeap(int a,int b){  // 'a' and 'b' are method parameters and are stored in stack memory
        return a+b;  // The result is also stored in stack memory before returning
    }

}
