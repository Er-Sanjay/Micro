package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import util.CassandraUtil;
import util.MyCassandraTemplate;

@Configuration
@Import(CassandraUtil.class)
public class MainAppConfiguration {
    
    /**
     * Creating the EmployeeService bean.
     * @return {@link EmployeeService}
     */
    @Bean
    public EmployeeService getEmployeeService() {
        return new EmployeeServiceImpl();
    }

    /**
     * Creating the EmployeeDAO bean.
     * @return {@link EmployeeDAO}
     */
    @Bean
    public EmployeeDAO getEmployeeDAO() {
        return new EmployeeDAOImpl();
    }
    
    /**
     * Creating the MyCassandraTemplate bean.
     * @return {@link MyCassandraTemplate}
     */
    @Bean
    public MyCassandraTemplate getMyCassandraTemplate() {
        return new MyCassandraTemplate();
    }
}