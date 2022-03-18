package componentscan;

import com.example.com.SpringLessons.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Repository
public class ComponentDAO {

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return jdbcConnection;
    }

    public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @Autowired
    ComponentJdbcConnection jdbcConnection;

}
