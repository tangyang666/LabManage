package test;

import com.xbn.dao.ResearchDao;
import com.xbn.pojo.ResearchInfo;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext.xml"})
public class Test {
    @Autowired
    private ResearchDao researchDao;

    @org.junit.Test
    public void test() {
        ResearchInfo researchInfo = researchDao.queryResearchInfoById("1");
        System.out.println(researchInfo.getResearchName());
    }

}
