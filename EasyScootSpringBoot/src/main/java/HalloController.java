
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloController {

    @RequestMapping("/hallo")
    public String hallo() {
        return "hAlloo";
    }
}
