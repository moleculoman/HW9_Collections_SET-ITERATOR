package Drivers;

import Exceptions.NoAccesException;

public class DriverD extends Driver{

    private String categoryD;

    public DriverD(String sFM, boolean license, int experience, String categoryD) throws NoAccesException {
        super(sFM, license, experience);
        if (categoryD == null || categoryD.isEmpty() || categoryD.isBlank()) {
            throw new NoAccesException("Отсутствует водительское удостоверение категории " + getCategoryD());
        } else this.categoryD = categoryD;
    }

    public String getCategoryD() {
        return categoryD;
    }

    public String toString() {
        return "Водитель " + getFullName() + " с наличием прав категории " + getCategoryD();
    }
}
