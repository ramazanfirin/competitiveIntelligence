import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.avea.ci.model.Company;import com.avea.ci.model.Country;
import com.avea.ci.model.People;
import com.avea.ci.model.Group;
import com.avea.ci.model.Product;
import com.avea.ci.model.Strategy;
import com.avea.ci.model.SuccessFactor;
import com.avea.ci.model.ViewPoint;
import com.avea.ci.repository.CompanyRepository;
import com.avea.ci.service.CompanyService;

@ContextConfiguration(locations = "classpath:helloWorldContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class TestSystem {

	
	@Autowired(required=true)
	private CompanyService companyService;
	
	
	@Rollback(false)
	//@Ignore
	@Test
    public void test() throws Exception{
		
		Company company = new Company("denem");

		
		companyService.save(company);
		
		System.out.println("b,tt,");
	}
}
