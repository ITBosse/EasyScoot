package Klassen;

import org.springframework.stereotype.Service;

import Interfaces.INutzerverwaltung;
import Models.Account;
import Models.Datenbank;

/**
 * Diese Klasse verwaltet Benutzerkonten, indem sie die Erstellung, Löschung,
 * Aktualisierung und Deaktivierung von Konten sowie An- und Abmeldung
 * ermöglicht.
 */
@Service
public class Nutzerverwaltung implements INutzerverwaltung {

    @Override
    public boolean checkAccount(String emailAddress, String password) {
        for (Account ac : Datenbank.accountList) {
            if (ac.getEmailAddress().equals(emailAddress)) {
                if (ac.getPassword().equals(password)) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    /**
     * Erstellt ein neues Benutzerkonto.
     * 
     * @param emailAddress Die E-Mail-Adresse des neuen Kontos.
     * @param password     Das Passwort des neuen Kontos.
     */
    @Override
    public void createAccount(String emailAddress, String password) {
        boolean emailExists = false;
        for (Account ac : Datenbank.accountList) {
            if (ac.getEmailAddress().equals(emailAddress)) {
                emailExists = true;
                break;
            }
        }
        if (!emailExists) {
            Account account = new Account(emailAddress, password);
            Datenbank.accountList.add(account);
        }
    }

    /**
     * Löscht ein bestehendes Benutzerkonto.
     * 
     * @param emailAddress Die E-Mail-Adresse des zu löschenden Kontos.
     */
    @Override
    public void deleteAccount(String emailAddress) {
        Datenbank.accountList.removeIf(ac -> ac.getEmailAddress().equals(emailAddress));
    }

    /**
     * Ändert die E-Mail-Adresse eines bestehenden Benutzerkontos.
     * 
     * @param currentEmailAddress Die aktuelle E-Mail-Adresse des Kontos.
     * @param newEmailAddress     Die neue E-Mail-Adresse des Kontos.
     */
    @Override
    public void changeEmailAddress(String currentEmailAddress, String newEmailAddress) {
        for (Account ac : Datenbank.accountList) {
            if (ac.getEmailAddress().equals(currentEmailAddress)) {
                ac.setEmailAddress(newEmailAddress);
            }
        }
    }

    /**
     * Ändert das Passwort eines bestehenden Benutzerkontos.
     * 
     * @param emailAddress Die E-Mail-Adresse des Kontos.
     * @param newPassword  Das neue Passwort des Kontos.
     */
    @Override
    public void changePassword(String emailAddress, String newPassword) {
        for (Account ac : Datenbank.accountList) {
            if (ac.getEmailAddress().equals(emailAddress)) {
                ac.setPassword(newPassword);
            }
        }
    }

    /**
     * Meldet einen Benutzer an.
     * 
     * @param emailAddress Die E-Mail-Adresse des Kontos.
     * @param password     Das Passwort des Kontos.
     */
    @Override
    public void login(String emailAddress, String password) {
        // Login-Logik hier implementieren
    }

    /**
     * Meldet einen Benutzer ab.
     * 
     * @param emailAddress Die E-Mail-Adresse des Kontos.
     */
    @Override
    public void logout(String emailAddress) {
        // Logout-Logik hier implementieren
    }

    /**
     * Deaktiviert ein bestehendes Benutzerkonto.
     * 
     * @param emailAddress Die E-Mail-Adresse des zu deaktivierenden Kontos.
     */
    @Override
    public void disableAccount(String emailAddress) {
        // Konto-Deaktivierungslogik hier implementieren
    }
}