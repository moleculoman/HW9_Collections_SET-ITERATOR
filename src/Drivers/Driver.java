package Drivers;

import Transports.Transport;

public class Driver <T extends Transport> {
    private String fullName;

    private boolean license;

    private int experience;

    private T machine;

    public Driver(String fullName, boolean license, int experience, T machine) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
        this.machine = machine;
    }

    public Driver(String fullName, boolean license, int experience) {
    }

    public String getFullName() {
        return fullName;
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
