package easyscoot.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Klassen.Nutzerverwaltung;

@RestController
@RequestMapping("/api/accounts")
public class NutzerverwaltungController {

    @Autowired
    private Nutzerverwaltung nutzerverwaltung;

    @PostMapping("/login")
    public boolean checkAccount(@RequestParam String email, @RequestParam String password) {
        return nutzerverwaltung.checkAccount(email, password);
    }

    @PostMapping("/create")
    public void createAccount(@RequestParam String email, @RequestParam String password) {
        nutzerverwaltung.createAccount(email, password);
    }

    @DeleteMapping("/delete")
    public void deleteAccount(@RequestParam String email) {
        nutzerverwaltung.deleteAccount(email);
    }

    @PutMapping("/updateEmail")
    public void updateEmail(@RequestParam String oldEmail, @RequestParam String newEmail) {
        nutzerverwaltung.changeEmailAddress(oldEmail, newEmail);
    }

    @PutMapping("/updatePassword")
    public void updatePassword(@RequestParam String email, @RequestParam String newPassword) {
        nutzerverwaltung.changePassword(email, newPassword);
    }

}
