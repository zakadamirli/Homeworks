package MentorDay16.Exercise;

public class Main {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(2, 4));
        System.out.println(calc.add(1.2, 3.4));
        System.out.println(calc.power(2, 2));
    }
}
