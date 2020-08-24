package com.company;

public class Main {

    public static void main(String[] args) {
//    Animal dog = new Animal("Tyson", "dog", 10);
//    Animal cat = new Animal("Lusio", "cat", 11);
//    System.out.println(dog.name +"kot ma na imie " + cat.breed);
//    UserService service = new UserService();
//    User uzytkownik = service.getUserByID("konan");
//    System.out.println(uzytkownik.email + "wiek użytkownika to " + uzytkownik.age);
//    int age = service.allAge();
//    System.out.println("suma wszystkich lat to: " + age);
    NumberService numberService = new NumberService();
    int count = numberService.getCountNumbers();
    System.out.println("ilosc liczb to " + count);
    int higherNumbers = numberService.countNumbersHigherThan(5);
    System.out.println("iloc wieszych liczb to " + higherNumbers);
    System.out.println("suma wszystkich liczb to " + numberService.sumNumbers());
   numberService.dupa();
    numberService.displayNumbers();
    }
}
