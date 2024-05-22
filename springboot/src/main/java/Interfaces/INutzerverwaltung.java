package Interfaces;

/**
 * Dieses Interface definiert die Methoden zur Verwaltung von Benutzerkonten.
 */
public interface INutzerverwaltung {

    public boolean checkAccount(String emailAddress, String newPassword);

    /**
     * Erstellt ein neues Benutzerkonto.
     * 
     * @param emailAddress Die E-Mail-Adresse des neuen Kontos.
     * @param newPassword  Das Passwort des neuen Kontos.
     */
    public boolean createAccount(String emailAddress, String newPassword);

    /**
     * Löscht ein bestehendes Benutzerkonto.
     * 
     * @param emailAddress Die E-Mail-Adresse des zu löschenden Kontos.
     */
    public boolean deleteAccount(String emailAddress);

    /**
     * Ändert die E-Mail-Adresse eines bestehenden Benutzerkontos.
     * 
     * @param currentAddress Die aktuelle E-Mail-Adresse des Kontos.
     * @param newAddress     Die neue E-Mail-Adresse des Kontos.
     */
    public boolean changeEmailAddress(String currentAddress, String newAddress);

    /**
     * Ändert das Passwort eines bestehenden Benutzerkontos.
     * 
     * @param emailAddress Die E-Mail-Adresse des Kontos.
     * @param newPassword  Das neue Passwort des Kontos.
     */
    public boolean changePassword(String emailAddress, String newPassword);

    /**
     * Meldet einen Benutzer an.
     * 
     * @param emailAddress Die E-Mail-Adresse des Kontos.
     * @param password     Das Passwort des Kontos.
     */
    public void login(String emailAddress, String password);

    /**
     * Meldet einen Benutzer ab.
     * 
     * @param emailAddress Die E-Mail-Adresse des Kontos.
     */
    public void logout(String emailAddress);

    /**
     * Deaktiviert ein bestehendes Benutzerkonto.
     * 
     * @param emailAddress Die E-Mail-Adresse des zu deaktivierenden Kontos.
     */
    public void disableAccount(String emailAddress);
}
