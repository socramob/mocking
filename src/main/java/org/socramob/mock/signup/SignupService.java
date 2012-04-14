package org.socramob.mock.signup;

public class SignupService {
    private final Dao dao;
    private final Mail mail;

    public SignupService(Dao dao, Mail mail) {
        this.dao = dao;
        this.mail = mail;
    }

    public void signup(String vorname, String nachname) {
        dao.save(vorname, nachname);

        mail.send(vorname + "@" + nachname + ".de");
    }
}
