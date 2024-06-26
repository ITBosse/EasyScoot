package Interfaces;

/**
 * Dieses Interface definiert die Methoden zur Verwaltung von Benutzerkonten.
 */
public interface INutzerverwaltung {

    /**
     * Erstellt ein neues Benutzerkonto.
     * 
     * @param emailAddress Die E-Mail-Adresse des neuen Kontos.
     * @param newPassword  Das Passwort des neuen Kontos.
     */
    public void createAccount(String emailAddress, String newPassword);

    /**
     * Löscht ein bestehendes Benutzerkonto.
     * 
     * @param emailAddress Die E-Mail-Adresse des zu löschenden Kontos.
     */
    public void deleteAccount(String emailAddress);

    /**
     * Ändert die E-Mail-Adresse eines bestehenden Benutzerkontos.
     * 
     * @param currentAddress Die aktuelle E-Mail-Adresse des Kontos.
     * @param newAddress     Die neue E-Mail-Adresse des Kontos.
     */
    public void changeEmailAddress(String currentAddress, String newAddress);

    /**
     * Ändert das Passwort eines bestehenden Benutzerkontos.
     * 
     * @param emailAddress Die E-Mail-Adresse des Kontos.
     * @param newPassword  Das neue Passwort des Kontos.
     */
    public void changePassword(String emailAddress, String newPassword);

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
