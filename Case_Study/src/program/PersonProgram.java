package program;

import object.Person;
import java.io.Serializable;
import java.util.Scanner;
public class PersonProgram implements Serializable {
    Scanner scanner = new Scanner(System.in);

    public Person roomer() {
        Person person = new Person();
        System.out.println("Nhập tên khách thuê: ");
        String nameTenant = scanner.nextLine();
        person.setName(nameTenant);

        System.out.println("Nhập quê quán: ");
        String villageTenant = scanner.nextLine();
        person.setVillage(villageTenant);

        System.out.println("Nhập tuổi: ");
        int ageTenant = Integer.parseInt(scanner.nextLine());
        person.setAge(ageTenant);

        System.out.println("Nhập số chứng minh thư nhân dân: ");
        int idTenant = Integer.parseInt(scanner.nextLine());
        person.setIdCard(idTenant);

        return person;
    }
}
