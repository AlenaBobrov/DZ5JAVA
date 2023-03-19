import ru.netology.services.RestService;

public class Main {

    public static void main(String[] args) {
        RestService service = new RestService();
        int months = service.calculate(0,100_000,60_000,150_000);
        System.out.println(months);

    }
}