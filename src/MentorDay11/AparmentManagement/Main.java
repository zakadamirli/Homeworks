package MentorDay11.AparmentManagement;

public class Main {
    public static void main(String[] args) {

        Person obj=new Person(12,"Eli","sxa",12,"sdad",13,new Building(122,"Faracoglu",22,20,"039",true));
        System.out.println(obj);
        int id = obj.getId();
        System.out.print("Person id: "+id);
        int idA=obj.building.getId();
        System.out.print("\nBuilding id: "+idA);


    }
}
