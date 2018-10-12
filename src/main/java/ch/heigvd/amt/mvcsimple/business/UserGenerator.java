package ch.heigvd.amt.mvcsimple.business;

import ch.heigvd.amt.mvcsimple.model.User;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Stateless //permet de spécifier que c'est un statelesss EJB
public class UserGenerator {

    private List<User> users;
    private static AtomicInteger counter =  new AtomicInteger(0);

    public UserGenerator(){
        users = new ArrayList<>();
        counter.incrementAndGet();
    }

    public void generateUsers() {
        List<User> result = new ArrayList<>();
        result.add(new User("Yann", "Lederrey", "1234"));
        result.add(new User("José", "Garcias", "password"));
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<User> getUsers(){
        return users;
    }

    public int getCounter(){
        return counter.intValue();
    }
}
