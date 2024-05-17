package Models;

/**
 * Diese Klasse repräsentiert ein Benutzerkonto mit einer E-Mail-Adresse und
 * einem Passwort.
 */
public class Account {
    private String emailAddress;
    private String password;

    /**
     * Konstruktor zur Erstellung eines neuen Accounts.
     * 
     * @param emailAddress Die E-Mail-Adresse des Kontos.
     * @param password     Das Passwort des Kontos.
     */
    public Account(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    /**
     * Gibt die E-Mail-Adresse des Kontos zurück.
     * 
     * @return Die E-Mail-Adresse des Kontos.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setzt die E-Mail-Adresse des Kontos.
     * 
     * @param emailAddress Die neue E-Mail-Adresse des Kontos.
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gibt das Passwort des Kontos zurück.
     * 
     * @return Das Passwort des Kontos.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setzt das Passwort des Kontos.
     * 
     * @param password Das neue Passwort des Kontos.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}