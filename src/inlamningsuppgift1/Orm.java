/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlamningsuppgift1;

/**
 *
 * @author buster
 */
public class Orm extends Djur{

    Orm(int vikt, String namn, String art) {
        super(vikt, namn, art);
    }

    
    public String getFoder(Djur djur) {
        return 20 + " gram ormpellets";
    }

}
