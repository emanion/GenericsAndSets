
package laba;

/**
 *
 * @author emanion
 */
public class BattleShip {
    
    private String name;
    private int numberOfMainGuns;

    public BattleShip(String name, int numberOfMainGuns) {
        setName(name);
        setNumberOfMainGuns(numberOfMainGuns);
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMainGuns() {
        return numberOfMainGuns;
    }

    public void setNumberOfMainGuns(int numberOfMainGuns) {
        this.numberOfMainGuns = numberOfMainGuns;
    }

    @Override
    public String toString() {
        return "BattleShip{" + "name=" + name + ", numberOfMainGuns=" + numberOfMainGuns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BattleShip other = (BattleShip) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
