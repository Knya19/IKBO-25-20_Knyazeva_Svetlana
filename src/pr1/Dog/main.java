package pr1.Dog;
import java.lang.*;

public class main
{
    public static void main(String[] args)
    {
        Dog test = new Dog("Mike", 2);
        Dog test1 = new Dog("Helen", 7);
        Dog test2 = new Dog("Bob");
        test2.setAge(1);
        System.out.println(test);
        test.intoHumanAge();
        test1.intoHumanAge();
        test2.intoHumanAge();
    }
}
