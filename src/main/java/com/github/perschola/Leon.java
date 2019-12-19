package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Leon extends PetOwner{
    private Person person;

    public Leon(){
        Pet milo = new Pet("Milo", 6);
        super.setPet(milo);
        super.setFirstName("Leon");
        super.setLastName("Hunter");
    }
}
