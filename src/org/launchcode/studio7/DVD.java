package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    public DVD(String aName, String aDiscType, String aContentDescription, double aStorageCapacity) {
        super(aName, aDiscType, aContentDescription, aStorageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void discReport() {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.





}
