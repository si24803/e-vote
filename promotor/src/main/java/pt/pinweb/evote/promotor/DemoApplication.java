package pt.pinweb.evote.promotor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import pt.pinweb.evote.promotor.model.Person;

import com.mongodb.client.MongoClients;

@SpringBootApplication
public class DemoApplication {
	private static final Log log = LogFactory.getLog(DemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		MongoOperations mongoOps = new MongoTemplate(MongoClients.create(), "database");
		mongoOps.insert(new Person("Joe", "Doe"));

		log.info(mongoOps.findOne(new Query(where("firstName").is("Joe")), Person.class));

		mongoOps.dropCollection("person");
	}

}
