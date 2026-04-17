package P18_Prototype.Advanced.src;

public class Director {
    public void constructInfantrySoldier(SoldierBuilder builder){
        builder.addGenericItem("Armor");
        builder.addWeapon("Rifle");
        builder.addGenericItem("Helmet");
    }
    
}
