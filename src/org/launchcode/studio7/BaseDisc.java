package org.launchcode.studio7;

public abstract class BaseDisc {

    private String name;
    private String discType;
    private String contentDescription;
    private double storageCapacity;

    public BaseDisc (String aName, String aDiscType, String aContentDescription, double aStorageCapacity) {
        name = aName;
        discType = aDiscType;
        contentDescription = aContentDescription;
        storageCapacity = aStorageCapacity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
