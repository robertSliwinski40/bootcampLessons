package OOP.Dependency_Injection;

public class CarService {

    //CarDao carDao = new CarDao();     //don't do that
    private CarDao carDao;              //do this way
    private EmailService emailService;
    private MOTService motService;

    public CarService(CarDao carDao, EmailService emailService, MOTService motService) {
        this.carDao = carDao;
        this.emailService = emailService;
        this.motService = motService;
    }
}
