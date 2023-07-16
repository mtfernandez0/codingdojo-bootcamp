package lifeforms;

public class Bat extends Mammal{
    Bat(int energyLevel) {
        super(energyLevel);
    }

    public void fly(){
        System.out.println("Whoshh...");
        setEnergyLevel(getEnergyLevel() - 50);
    }

    public void eatHumans(){
        System.out.println("bueno, no importa");
        setEnergyLevel(getEnergyLevel() + 25);
    }

    public void attackTown(){
        System.out.println("Riga is burning!!!");
        setEnergyLevel(getEnergyLevel() - 100);
    }
}
