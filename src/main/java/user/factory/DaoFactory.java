package user.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import user.dao.ConnectionMaker;
import user.dao.DConnectionMaker;
import user.dao.UserDao3;

@Configuration
public class DaoFactory {
    @Bean
    public ConnectionMaker getConnectionMaker() {
        return new DConnectionMaker();
    }

    @Bean
    public UserDao3 userDao3() {
        UserDao3 userDao3 = new UserDao3();
        userDao3.setConnectionMaker(getConnectionMaker());
        return userDao3;
    }
}
