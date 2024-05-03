package Abstraction.Interface;
interface A{
    default  void  play()
    {
        System.out.println("Ganesh");
    }
}
public class One implements A {

    @Override
    public void play()
    {
        System.out.println("play ");
    }
    public static void main(String[] args) {
        One one = new One();
        one.play();
    }
}
