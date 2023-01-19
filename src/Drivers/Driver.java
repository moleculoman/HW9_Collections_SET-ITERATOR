package Drivers;

import Transports.Transport;

import java.util.Objects;

public class Driver <T extends Transport> {
    private String sFM;

    private boolean license;

    private int experience;

    private T machine;

    public Driver(String sFM, boolean license, int experience, T machine) {
        this.sFM = sFM;
        this.license = license;
        this.experience = experience;
        this.machine = machine;
    }

    public Driver(String sFM, boolean license, int experience) {
        this.sFM = sFM;
        this.license = license;
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return license == driver.license && experience == driver.experience && Objects.equals(sFM, driver.sFM) && Objects.equals(machine, driver.machine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sFM, license, experience, machine);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "sFM='" + sFM + '\'' +
                ", license=" + license +
                ", experience=" + experience +
                ", machine=" + machine +
                '}';
    }

    public String getFullName() {
        return sFM;
    }

    public boolean isLicense() {
        return license;
    }

    public int getExperience() {
        return experience;
    }

    public T getMachine() {
        return machine;
    }

    public void movement() {
        System.out.println(getFullName() + " - вставляет ключ, снимает ручник, заводит двигатель.");
    }

    public void stop() {
        System.out.println(getFullName() + " - остановливает автомобиль, глушит двигатель, ставит на ручник.");
    }

    public void refuel() {
        System.out.println(getFullName() +  " - останавливает автомобиль, засовывает пистолет, оплачивает, вытаскивает пистолет, уезжает.");
    }

    public void toRace() {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем " + getMachine() + " и будет учавствовать в заезде.");
    }

}
