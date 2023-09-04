package OOP.Dependency_Injection;
/*
 look CarService, MOTService
 In large application could be 100s of this kind situation (2 "calls" of 1 object)
 to connect all dependencies to 1 instance we use Singleton Pattern
 we instantiated class just once, whichever class needs emailService, they basically reuse this same one
 @Beans, @Component
 @Autowired == @Inject
 We state annotation @Bean on the top of class - CarService, CarDao, MOTService, EmailService
 When we have injection in classes, use @Autowired or @Inject, which mean go and find instance and inject for me pls
 Therefore we don't need it new, new, new in main
 but that's later
*/

public class Main {
    public static void main(String[] args) {

        //dependencies
        CarDao carDao = new CarDao();
        EmailService emailService = new EmailService();         //emailService object1
        MOTService motService = new MOTService(emailService);   //emailService ??? object1



        // this is dependency injection
        CarService carService = new CarService(carDao, emailService, motService);   //emailService ??? object1


    }
}
