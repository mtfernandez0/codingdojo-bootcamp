package lifeforms;

public class Mammal{
    private int energyLevel;

    Mammal(){
        this.energyLevel = 100;
    }

    Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel(){
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }
}