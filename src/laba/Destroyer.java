
package laba;

import java.util.Objects;

/**
 *
 * @author emanion
 */
public class Destroyer {
    
    String name;
    int numberOfTorpedos;

    public Destroyer(String name, int numberOfTorpedos) {
        this.name = name;
        this.numberOfTorpedos = numberOfTorpedos;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTorpedos() {
        return numberOfTorpedos;
    }

    public void setNumberOfTorpedos(int numberOfTorpedos) {
        this.numberOfTorpedos = numberOfTorpedos;
    }

    @Override
    public String toString() {
        return "Destroyer{" + "name=" + 
                name + ", numberOfTorpedos=" + numberOfTorpedos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.name);
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
        final Destroyer other = (Destroyer) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
