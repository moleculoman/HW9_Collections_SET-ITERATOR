package Transports;

import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Enumerations.BodyType;
import Enumerations.Capacity;
import Enumerations.LoadCapacity;
import Exceptions.ImmposiblePassDiagnostic;
import Exceptions.NoAccesException;
import Mechanics.Mechanics;

import java.util.*;


public class Main {
    public static void main(String[] args) throws ImmposiblePassDiagnostic, NoAccesException {

        //Транспорт
        Bus volkswagen = new Bus("Volkswagen", "Crafter", 2.0,Capacity.S);
        Bus fiat = new Bus("Fiat", "Ducato", 2.3,Capacity.XS);
        Bus iveco = new Bus("Iveco", "Daily", 3.0,Capacity.XL);

        Passenger ford = new Passenger("Ford", "Escape", 3.0,BodyType.SEDAN);
        Passenger bmw = new Passenger("BMW", "3", 1.8,BodyType.COUPE);
        Passenger toyota = new Passenger("Toyota", "Corolla", 1.6,BodyType.HATCHBACK);

        Cargo man = new Cargo("MAN", "TGX", 10.5,LoadCapacity.N1);
        Cargo scania = new Cargo("SCANIA", "R-Series", 12,LoadCapacity.N2);
        Cargo renault = new Cargo("Renault", "Magnum", 12.8,LoadCapacity.N3);

        //Водители
        DriverB petrov = new DriverB("Petrov Petr", true, 15, "B");
        DriverC ivanov = new DriverC("Ivanov Ivan", true, 18, "C");
        DriverD sidorov = new DriverD("Sidorov Kolya", true, 21, "D");

        ///Совмещение водителя и техники
        Driver<Cargo> ivan = new Driver<>("Ivanov Ivan", true,18, scania);
        Driver<Bus> kolya = new Driver<>("Sidorov Kolya", true,21, fiat);
        Driver<Passenger> petr = new Driver<>("Petrov Petr", true, 15, bmw);


        ///Работа с коллекциями ArrayList
        //Механики лист

        Mechanics sokolov = new Mechanics("Ignat Sokolov", "Анти-ВАГ центр", petr, bmw);
        Mechanics solovev = new Mechanics("Alex Solovev", "ШведКомпани", ivan, scania);
        Mechanics fenix = new Mechanics("Ruslan Fenix","Ара-тюнинг", kolya, fiat);

        /*
        System.out.println(sokolov);
        System.out.println(solovev);
        System.out.println(fenix);
        List<Mechanics> mechanicslist = new ArrayList<>();
        mechanicslist.add(sokolov);
        mechanicslist.add(solovev);
        mechanicslist.add(fenix);
        mechanicslist.add(new Mechanics("No name", "Unknown", petr, bmw));
        System.out.println(mechanicslist);

        //Транспорт лист
        List<Transport> transportList = new ArrayList<>();
        transportList.add(volkswagen);
        transportList.add(fiat);
        transportList.add(iveco);
        transportList.add(ford);
        transportList.add(bmw);
        transportList.add(toyota);
        transportList.add(man);
        transportList.add(scania);
        transportList.add(renault);
        System.out.println(transportList);
        System.out.println();
*/
        /// Проверка метода провести ТО и ремонт
        /*
        scania.serviceAndRepair(950);
        iveco.serviceAndRepair(30000);
        bmw.serviceAndRepair(1850);
        System.out.println();

        /// Проверка метода вывода механика, водителя и авто
        sokolov.infoAbout();
        solovev.infoAbout();
        fenix.infoAbout();
*/

        ///Работа с коллекциями HASHMAP
        //Механики лист(ХЭШ-МАПА)

        Map<Transport, Mechanics> mechanicslist = new HashMap<>();
        mechanicslist.put(petr.getMachine(), sokolov);
        mechanicslist.put(ivan.getMachine(), solovev);
        mechanicslist.put(kolya.getMachine(), fenix);
        mechanicslist.put(kolya.getMachine(), fenix); //добавим ловушечного механика

        //Делаем вывод элементов
        Set<Map.Entry<Transport, Mechanics>> set = mechanicslist.entrySet();
        for (Map.Entry<Transport, Mechanics> me : set){
            System.out.println(me.getKey() + ";  " + me.getValue());
        }

    }
}