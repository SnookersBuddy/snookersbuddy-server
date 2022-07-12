package de.snookersbuddy.snookersbuddyserver;

import de.snookersbuddy.snookersbuddyserver.application.assignment.AssignmentService;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(initializers = {AssignmentRepositoryTCIntegrationTest.Initializer.class})
public class AssignmentRepositoryTCIntegrationTest {

    @Autowired
    private AssignmentService assignmentService;

    @ClassRule
    public static PostgreSQLContainer postgreSQLContainer =
            new PostgreSQLContainer("snookers-sells-be")
                    .withDatabaseName("snookers")
                    .withUsername("snookers")
                    .withPassword("snookers");

    static class Initializer
            implements ApplicationContextInitializer<ConfigurableApplicationContext> {
        public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
            try {
                DockerImageName myImage = DockerImageName.parse("snookers-sells-be").asCompatibleSubstituteFor("postgres");
                TestPropertyValues.of(
                        "spring.datasource.url=" + postgreSQLContainer.getJdbcUrl(),
                        "spring.datasource.username=" + postgreSQLContainer.getUsername(),
                        "spring.datasource.password=" + postgreSQLContainer.getPassword()
                ).applyTo(configurableApplicationContext.getEnvironment());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    @Transactional
    public void getCountOfDefaultAssignmentsTest() {
        Assert.assertEquals(25, assignmentService.getAllAssignments().size());
    }
}
