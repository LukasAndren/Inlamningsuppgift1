/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlamningsuppgift1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author buster
 */
public class HealthyPets {
    private List<Djur> djur;

    HealthyPets() {
        djur = new ArrayList<>();
    }

    /**
     * Metoden stoppar in djuret i listan
     * @param Ett Djur
     */
    public void checkaIn(Djur d) {
        djur.add(d);
    }

    /**
     * 
     * @param String namn
     * @return Djuret vars namn är samma som String namn, om inget sådant Djur 
     * finns retuneras Djur på plats -1 i listan (som inte finns = Exception)
     */
    public Djur getDjur(String namn) {

        for (Djur djur : djur) {
            if (djur.getNamn().toLowerCase().equals(namn)) {
                return djur;
            }
        }
        return djur.get(-1);
    }

}
