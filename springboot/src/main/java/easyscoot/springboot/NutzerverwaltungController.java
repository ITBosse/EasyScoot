package easyscoot.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Klassen.Nutzerverwaltung;

@RestController
@RequestMapping("/api/accounts")
@CrossOrigin(origins = "http/localhost:8080")
public class NutzerverwaltungController {

    @Autowired
    private Nutzerverwaltung nutzerverwaltung;

    @PostMapping("/login")
    public String checkAccount(@RequestParam String email, @RequestParam String password) {
        boolean loginSuccess = nutzerverwaltung.checkAccount(email, password);
        if (loginSuccess) {
            return "redirect:/homepage.html";
        }
        return ""; // Falscher Login
    }

    @PostMapping("/create")
    public String createAccount(@RequestParam String email, @RequestParam String password) {
        boolean emailExists = nutzerverwaltung.createAccount(email, password);
        if (!emailExists) {
            return "redirect:/index.html"; // Konto erfolgreich erstellt
        } else {
            return "redirect:/register.html"; // Konto konnte nicht erstellt werden
        }
    }

    @DeleteMapping("/delete")
    public void deleteAccount(@RequestParam String email) {
        nutzerverwaltung.deleteAccount(email);
    }

    @PutMapping("/updateEmail")
    public boolean updateEmail(@RequestParam String oldEmail, @RequestParam String newEmail) {
        return nutzerverwaltung.changeEmailAddress(oldEmail, newEmail);
    }

    @PutMapping("/updatePassword")
    public void updatePassword(@RequestParam String email, @RequestParam String newPassword) {
        nutzerverwaltung.changePassword(email, newPassword);
    }

}
