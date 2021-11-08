package pr2;

import pr2.Lok;

public class main {
    public static void main(String[] args) {
        Lok Smeshenie1 = new Lok();
        Lok Smeshenie3 = new Lok(3,12);
        Lok Smeshenie2 = new Lok(6, 31);
        System.out.println("1." + Smeshenie1);
        System.out.println("2." + Smeshenie2);
        System.out.println("3." + Smeshenie3);
        Smeshenie1.Dvijenie(21,79);
        System.out.println("передвигаем первый мяч : " + Smeshenie1);
        Smeshenie2.Dvijenie(-70.43,-3.95);
        System.out.println("передвигаем второй мяч : " + Smeshenie2);
        Smeshenie3.Dvijenie(-24,-9);
        System.out.println("передвигаем третий мяч : " + Smeshenie3);
    }
}
