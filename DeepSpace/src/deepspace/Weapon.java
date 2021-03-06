package deepspace;

/**
 *
 * @author David Cabezas Berrido
 * @author Patricia Córdoba Hidalgo
 */
class Weapon implements CombatElement{
    
    private String name;
    private WeaponType type;
    private int uses;
    
    Weapon(String nam, WeaponType typ, int use){
        name = nam;
        type = typ;
        uses = use;
    }
    
    Weapon(Weapon w){ 
        name = w.name;
        type = w.type;
        uses = w.uses;
    }
    
    WeaponToUI getUIversion(){
        return new WeaponToUI(this);
    }

    public WeaponType getType() {
        return type;
    }

    @Override
    public int getUses() {
        return uses;
    }
    
    public float power(){
        return type.getPower();
    }
    
    @Override
    public float useIt(){
        
        if (uses > 0){
            uses--;
            return power();
        }
        else
            return 1.0f; 
    }    
    
    @Override
    public String toString(){
        return "Name = " + name + "\nType = " + type + "\nPower = " + type.getPower() + "\nUses = " + uses;
    }
}
