package org.socramob.mock.signup;

import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class SignupTest {
    Dao dao = mock(Dao.class);
    Mail mail = mock(Mail.class);
    SignupService service = new SignupService(dao, mail);

    @Test
    public void shouldInvokeDao() throws Exception {
        service.signup("Erika", "Mustermann");

        verify(dao).save("Erika", "Mustermann");
    }

    @Test
    public void shouldSendMail() throws Exception {
        service.signup("Erika", "Mustermann");

        verify(mail).send("Erika@Mustermann.de");
    }
}
