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
public class Katt extends Djur {

    Katt(int vikt, String namn, String art) {
        super(vikt, namn, art);
    }

    @Override
    public String getFoder(Djur djur) {
        return djur.getVikt() / 150 + " gram kattfoder";
    }

}