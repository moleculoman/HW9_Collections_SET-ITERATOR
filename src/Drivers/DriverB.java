package Drivers;

import Exceptions.NoAccesException;

public class DriverB extends Driver {

    private String categoryB;


    public String getCategoryB() {
        return categoryB;
    }

    public DriverB(String sFM, boolean license, int experience, String categoryB) throws NoAccesException {
        super(sFM, license, experience);
        if (categoryB == null || categoryB.isEmpty() || categoryB.isBlank()) {
            throw new NoAccesException("Отсутсвует водительское удостоверение категории " + getCategoryB());
        } else this.categoryB = categoryB;
    }


    @Override
    public String toString() {
        return "Водитель " + getFullName() + " с наличием прав категории " + getCategoryB();
    }
}