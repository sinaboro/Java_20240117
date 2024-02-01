package ex02;

public class Speaker3 implements Speaker{

   public void powerOn() {
       System.out.println("전원 On");
   }

   public void powerOff() {
       System.out.println("전원 Off");
   }

   public void soundUp() {
       System.out.println("볼륨 Up");
   }

   public void soundDown() {
       System.out.println("볼륨 Down");
   }
}