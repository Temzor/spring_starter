import com.spring.ioc.Container;
import com.spring.sevice.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {
        Container container = new Container();
        /*
        Inversion control.
        Dependency injection.
        ConnectionPool connectionPool = container.get(ConnectionPool.class);
        UserRepository userRepository = container.get(UserRepository.class);
        CompanyRepository companyRepository = container.get(CompanyRepository.class);

         */
        UserService userService = container.get(UserService.class);
    }
}
