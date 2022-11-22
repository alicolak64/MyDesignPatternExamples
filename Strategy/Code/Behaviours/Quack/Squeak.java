package DesignPatterns.StrategyDesignPattern.Code.Behaviours.Quack;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}