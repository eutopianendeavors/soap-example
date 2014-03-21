package advocate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.pdx.advocate.dao.AdvocateDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/cxf-servlet.xml"})
public class AdvocateDaoTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testAdvocateDao() {
		AdvocateDao dao = applicationContext.getBean(AdvocateDao.class);
		String test = dao.getTestSTring();
		System.out.println(test);
	}

}
