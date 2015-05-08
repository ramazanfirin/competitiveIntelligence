import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.avea.ci.model.AdvertisingCompany;
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
public class InsertTest {

	
	@Autowired(required=true)
	private CompanyService companyService;
	
	
	@Rollback(false)
	@Ignore
	@Test
    public void deleteAll() throws Exception{
		companyService.deleteAll();
		System.out.println("bitti");
	}
	
	
	@Rollback(false)
	//@Ignore
	@Test
    public void test() throws Exception{
		
	    companyService.deleteAll();
		
		Company company = new Company("AVEA");
		company.setMission("mission");
		company.setNumberOfEmployes(2900);
		company.setOrganizationChart("organizationChart");
		company.setProfile("profile");
		company.setStockExchangeCode("TR");
		company.setType("innovative");
		company.setVision("vision");
		company.setWebSite("www.avea.com.tr");
		company.setBaseLocation("istanbul");
		company.setCoreCompedance("insan gücü");
		company.setFinancialPerformance("positive");
		
		AdvertisingCompany advertisingCompany = new AdvertisingCompany("advertising Company");
		company.setAdvertisingCompany(advertisingCompany);
		
		Country country = new Country();
		country.setName("TURKIYE");
		company.setCountry(country);
		
		Company competitor1 = new Company("TURKCELL");
		Company competitor2 = new Company("VODAPHONE");
		companyService.save(competitor1);
		companyService.save(competitor2);
		ViewPoint viewPoint1 = new ViewPoint(company, competitor1, "BUSINESS");
		ViewPoint viewPoint2 = new ViewPoint(company, competitor2, "BUSINESS");
		company.getCompetitors().add(viewPoint1);
		company.getCompetitors().add(viewPoint2);
		
		
        Group group = new Group();
        group.setName("TURK TELEKOM");
		company.setGroup(group);
		
		//Company groupCompany = new Company();
		Company groupCompany = new Company("TTNET");
		Company groupCompany2 = new Company("INNOVA");
		group.getCompanyList().add(groupCompany);
		group.getCompanyList().add(groupCompany2);
				
		People people = new People();
		people.setName("Erkan Akdemir");
		People people2 = new People();
		people2.setName("Coskun Sahin");
		company.getStrategicPositions().add(people);
		company.getStrategicPositions().add(people2);
		
		SuccessFactor successFactor = new SuccessFactor();
		successFactor.setName("KAR ETME");
		successFactor.setEnterprise("enterprise");
		successFactor.setIndustry("TEELCOM");
		Strategy strategy= new Strategy();
		strategy.setName("REKABET");
		Strategy strategy2= new Strategy();
		strategy2.setName("KAMPANYALAR");
		successFactor.getStrategies().add(strategy);
		successFactor.getStrategies().add(strategy2);
		company.getSuccessFactors().add(successFactor);

		Product product = new Product();
		product.setName("paket1");
		product.setDiscount(new Double(10));
		product.setPrice(new Double(15));
		product.setStrengless("ucuz");
		product.setStrengless("yetersiz");
		
		Product product2 = new Product();
		product2.setName("paket2");
		product2.setDiscount(new Double(20));
		product2.setPrice(new Double(30));
		product2.setStrengless("ucuz");
		product2.setStrengless("yetersiz");
		
		company.getProducts().add(product);
		company.getProducts().add(product2);
		
		companyService.save(company);
		
		System.out.println("b,tt,");
		companyService.updateLabels("Product");
		System.out.println("bitti label");
		
		
	}
	
	@Rollback(false)
	@Ignore
	@Test
    public void updateLabels() throws Exception{
		companyService.updateLabels("Product");
		System.out.println("bitti label");
	}
}
