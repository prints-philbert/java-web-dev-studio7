package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {


    // TODO: Implement your custom interface.

    public CD(String aName, String aDiscType, String aContentDescription, double aStorageCapacity) {
        super(aName, aDiscType, aContentDescription, aStorageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
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
