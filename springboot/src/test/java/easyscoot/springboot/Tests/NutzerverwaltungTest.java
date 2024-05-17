package easyscoot.springboot.Tests;

import Klassen.Nutzerverwaltung;
import Models.Datenbank;
import org.junit.*;

public class NutzerverwaltungTest {

    private static Nutzerverwaltung nutzerverwaltung = new Klassen.Nutzerverwaltung();
    private static Datenbank datenbank;

    @Test
    public void testCreateAccount() {
        nutzerverwaltung.createAccount("test@gmail.com", "password123");
        System.out.println(Datenbank.accountList.get(0));
        Assert.assertEquals(1, datenbank.accountList.size());

        nutzerverwaltung.createAccount("test@gmail.com", "anotherPassword");
        Assert.assertEquals(1, datenbank.accountList.size());
    }

    @Test
    public void testDeleteAccount() {
        nutzerverwaltung.createAccount("test@gmail.com", "password123");
        nutzerverwaltung.deleteAccount("test@gmail.com");
        Assert.assertEquals(0, datenbank.accountList.size());

        nutzerverwaltung.deleteAccount("nonexistent@gmail.com");
        Assert.assertEquals(0, datenbank.accountList.size());
    }

    @Test
    public void testChangeEmailAddress() {
        nutzerverwaltung.createAccount("test@gmail.com", "password123");
        nutzerverwaltung.changeEmailAddress("test@gmail.com", "new@gmail.com");
        Assert.assertEquals("new@gmail.com", datenbank.accountList.get(0).getEmailAddress());

        nutzerverwaltung.changeEmailAddress("nonexistent@gmail.com", "new@gmail.com");
        Assert.assertEquals("new@gmail.com", datenbank.accountList.get(0).getEmailAddress());
    }

    @Test
    public void testChangePassword() {
        nutzerverwaltung.createAccount("test@gmail.com", "password123");
        nutzerverwaltung.changePassword("test@gmail.com", "newPassword123");
        Assert.assertEquals("newPassword123", datenbank.accountList.get(0).getPassword());

        nutzerverwaltung.changePassword("nonexistent@gmail.com", "newPassword123");
        Assert.assertEquals("newPassword123", datenbank.accountList.get(0).getPassword());
    }

    /*
     * @Test
     * public void testLogin() {
     * nutzerverwaltung.createAccount("test@gmail.com", "password123");
     * nutzerverwaltung.login("test@gmail.com", "password123");
     * // Überprüfen, ob der Benutzer erfolgreich angemeldet wurde
     * Assert.assertTrue(datenbank.accountList.get(0).isLoggedIn());
     * 
     * nutzerverwaltung.login("test@gmail.com", "wrongPassword");
     * Assert.assertFalse(datenbank.accountList.get(0).isLoggedIn());
     * }
     * 
     * @Test
     * public void testLogout() {
     * nutzerverwaltung.createAccount("test@gmail.com", "password123");
     * nutzerverwaltung.login("test@gmail.com", "password123");
     * nutzerverwaltung.logout("test@gmail.com");
     * // Überprüfen, ob der Benutzer erfolgreich abgemeldet wurde
     * Assert.assertFalse(datenbank.accountList.get(0).isLoggedIn());
     * // Überprüfen, ob der Benutzer nicht abgemeldet wird, wenn er nicht
     * angemeldet
     * // ist
     * nutzerverwaltung.logout("test@gmail.com");
     * Assert.assertFalse(datenbank.accountList.get(0).isLoggedIn());
     * }
     * 
     * @Test
     * public void testDisableAccount() {
     * nutzerverwaltung.createAccount("test@gmail.com", "password123");
     * nutzerverwaltung.disableAccount("test@gmail.com");
     * // Überprüfen, ob das Konto erfolgreich deaktiviert wurde
     * Assert.assertFalse(datenbank.accountList.get(0).isActive());
     * // Überprüfen, ob das Konto nicht deaktiviert wird, wenn die E-Mail-Adresse
     * // nicht gefunden wird
     * nutzerverwaltung.disableAccount("nonexistent@gmail.com");
     * Assert.assertTrue(datenbank.accountList.get(0).isActive()); // Konto sollte
     * weiterhin deaktiviert sein
     * }
     */

}
