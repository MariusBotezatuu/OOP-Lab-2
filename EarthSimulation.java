class World{  //choose size of the world
    private int blocksVertical,blocksHorizontal;

    public void setblocksVertical(int blocksVertical){
        this.blocksVertical=blocksVertical;
    }

    public void setblocksHorizontal(int blocksHorizontal){
        this.blocksHorizontal=blocksHorizontal;
    }

    public int getblocksVertical(){
        return blocksVertical;
    }

    public int getblocksHorizontal(){
        return blocksHorizontal;
    }

}

class Block{  //choose what type of blocks the ground will be
    private String blockType;

    public void setblockType(String blockType){
        this.blockType=blockType;
    }

    public String getblockType(){
        return blockType;
    }

}

class Hill{  //create hills/mountains
    private int width,height;
    private String hillType; 

    public void setHillElements(int width,int height, String hillType){
        this.width=width;
        this.height=height;
        this.hillType=hillType;
    }

    public int getHillWidth(){
        return width;
    }

    public int getHillHeight(){
        return height;
    }

    public String getHillType(){
        return hillType;
    }

}

class Person{  //create people
    private int strength,intelligence,speed;

    public void setPersonAttributes(int strength,int intelligence,int speed){
        this.strength=strength;
        this.intelligence=intelligence;
        this.speed=speed;
    }

    public void modifyPersonAttributes(int strength,int intelligence,int speed){
        this.strength=this.strength+strength;
        this.intelligence=this.intelligence+intelligence;
        this.speed=this.speed+speed;
    }

    public int getPersonStrength(){
        return strength;
    }

    public int getPersonIntelligence(){
        return intelligence;
    }

    public int getPersonSpeed(){
        return speed;
    }

}

class Plant{  //add plants
    private int plantLife;
    private String plantType;

    public void setPlantAttributes(int plantLife,String plantType){
        this.plantLife=plantLife;
        this.plantType=plantType;
    }

    public void modifyplantLife(int plantLife){
        this.plantLife=this.plantLife+plantLife;
    }

    public int getplantLife(){
        return plantLife;
    }

    public String getplantType(){
        return plantType;
    }

}

class Animal{ //add animals
    private int strength,intelligence,speed;
    private String animalType;

    public void setAnimalAttributes(int strength,int intelligence,int speed,String animalType){
        this.strength=strength;
        this.intelligence=intelligence;
        this.speed=speed;
        this.animalType=animalType;
    }

    public void modifyAnimalAttributes(int strength,int intelligence,int speed){
        this.strength=this.strength+strength;
        this.intelligence=this.intelligence+intelligence;
        this.speed=this.speed+speed;
    }

    public int getAnimalStrength(){
        return strength;
    }

    public int getAnimalIntelligence(){
        return intelligence;
    }

    public int getAnimalSpeed(){
        return speed;
    }

    public String getAnimalType(){
        return animalType;
    }

}

class Weather {  //set a specific type of weather
    private String weatherType;

    public void setweatherType(String weatherType){
        this.weatherType=weatherType;
    }

    public String getweatherType(){
        return weatherType;
    }

}

class Calamity{  //create calamities
    private int calamityDangerousness,calamityDuration;
    private String calamityType;

    public void setCalamityProperties(int calamityDangerousness,int calamityDuration, String calamityType){
        this.calamityDangerousness=calamityDangerousness;
        this.calamityType=calamityType;
        this.calamityDuration=calamityDuration;
    }

    public int getcalamityDangerousness(){
        return calamityDangerousness;
    }

    public int getcalamityDuration(){
        return calamityDuration;
    }

    public String getcalamityType(){
        return calamityType;
    }

}

class Weapon{  //create weapons
    private int damage,durability,usageSpeed;
    private String weaponType;

    public void setWeaponAttributes(int damage,int durability,int usageSpeed,String weaponType){
        this.damage=damage;
        this.durability=durability;
        this.usageSpeed=usageSpeed;
        this.weaponType=weaponType;
    }

    public void changeWeaponAttributes(int damage,int durability){
        this.damage=this.damage+damage;
        this.durability=this.durability+durability;
    }

    public int getWeaponDamage(){
        return damage;
    }

    public int getWeaponDurability(){
        return durability;
    }

    public int getWeaponUsageSpeed(){
        return usageSpeed;
    }

    public String getWeaponType(){
        return weaponType;
    }

}

class Building{  //add buildings
    private int width,height,durability,rooms;
    private String buildingType;

    public void setBuildingAttributes(int width,int height,int durability,int rooms,String buildingType){
        this.width=width;
        this.height=height;
        this.durability=durability;
        this.rooms=rooms;
        this.buildingType=buildingType;
    }

    public void changeBuildingDurability(int durability){
        this.durability=this.durability+durability;
    }

    public int getBuildingWidth(){
        return width;
    }

    public int getBuildingHeight(){
        return height;
    }

    public int getBuildingDurability(){
        return durability;
    }

    public int getBuildingRooms(){
        return rooms;
    }

    public String getBuildingType(){
        return buildingType;
    }

}

public class EarthSimulation{
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setPersonAttributes(100, 80, 150);
        person1.modifyPersonAttributes(-30, 0, 0);
        System.out.print("Person1 strength = ");
        System.out.println(person1.getPersonStrength());
    }
}