package co.com.designpatterns.structural.adapter;

/**
 * tenemos una clase antigua o legacy de la app
 */
public class EmployeeLegacy {
    private String cod;
    private String givenName;
    private String surName;
    private String mail;

    public EmployeeLegacy(String cod, String givenname, String surName, String mail) {
        this.cod = cod;
        this.givenName = givenname;
        this.surName = surName;
        this.mail = mail;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
