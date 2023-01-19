package Drivers;

import Exceptions.NoAccesException;

public class DriverC extends Driver {

    private String categoryC;

    public String getCategoryC() {
        return categoryC;
    }

    public DriverC(String fullName, boolean license, int experience, String categoryC) throws NoAccesException {
        super(fullName, license, experience);
        if (categoryC == null || categoryC.isEmpty() || categoryC.isBlank()) {
            throw new NoAccesException("Отсутсвует водительское удостоверение категории " + getCategoryC());
        } else this.categoryC = categoryC;
    }

    public String toString() {
        return "Водитель " + getFullName() + " с наличием прав категории " + getCategoryC();
    }
}
