package tugas;
import Fly.*;
import Sounds.*;
import Attack.*;
import Defend.*;
public class Duck {
    private FlyBehaviour flyBehaviour;
    private SoundsBehaviour soundsBehaviour;
    private AttackBehaviour attackBehaviour;
    private DefendBehaviour defendBehaviour;
    
    public Duck(FlyBehaviour flyBehaviour,
        SoundsBehaviour soundsBehaviour,
        AttackBehaviour attackBehaviour, 
        DefendBehaviour defendBehaviour){
    this.flyBehaviour = flyBehaviour;
    this.soundsBehaviour = soundsBehaviour;
    this.attackBehaviour = attackBehaviour;
    this.defendBehaviour = defendBehaviour;
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    public void setSoundBehaviour(SoundsBehaviour soundsBehaviour){
        this.soundsBehaviour = soundsBehaviour;
    }
    public void setAttackBehaviour(AttackBehaviour attackBehaviour){
        this.attackBehaviour = attackBehaviour;
    }
    public void setDefendBehaviour(DefendBehaviour defendBehaviour){
        this.defendBehaviour = defendBehaviour;
    }
    public void fly(){
        flyBehaviour.fly();
    }
    public void sound(){
        soundsBehaviour.sound();
    }
     public void attack(){
        attackBehaviour.attack();
    }
    public void defend(){
        defendBehaviour.defend();
    }
}
