
package tugas;
import Fly.*;
import Sounds.*;
import Attack.*;
import Defend.*;
public class Main {
    public static void main(String[] args) {
        Duck superDuck = new Duck(new RocketFly(), new ToaSounds(), new SwordAttack(), new ArmorDefend());
        System.out.println("Super duck behaviour");
        superDuck.fly();
        superDuck.sound();
        superDuck.attack();
        superDuck.defend();
        
        System.out.println("");
        System.out.println("noob duck behaviour");
        Duck noobDuck = new Duck (new WingsFly(), new NormalSounds(), new ArrowAttack(), new ShieldDefend());
        noobDuck.fly();
        noobDuck.sound();
        noobDuck.attack();
        noobDuck.defend();
        
        System.out.println("");
        System.out.println("super duck change fly behaviour");
        superDuck.setFlyBehaviour(new PlaneFly());
        superDuck.fly();
        superDuck.sound();
        superDuck.attack();
        superDuck.defend();
    }
}
