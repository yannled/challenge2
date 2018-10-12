package ch.heigvd.amt.mvcsimple.business;
import javax.ejb.Remote;
import java.util.List;

@Remote // interface optionnel car local avant on utilisait remote
// car on avait des projet ou cette partie était séparée du code principal.
public interface UserSessionBeanLocal {
    void generateUsers();
    List getUsers();
}
