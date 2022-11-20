/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debitcard;
import java.io.Serializable;
/**
 *
 * @author KEN ALGER DIMAYMAY
 */
public class Name implements Serializable{
    private String name;

    public Name(){}

    public Name(String name) {
            this.name = name;
    }

    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }

    @Override
    public String toString() {	
            return this.name + " " ;
    }
}