package com.wbl.tests.ui;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.base.BaseWebTest;
import com.wbl.pages.HomePage;
import com.wbl.pages.SchedulePage;



public class ShedulePageTest extends BaseWebTest {
	private SchedulePage _sp;

    @BeforeClass
    public void beforeClass() {
        _sp = new SchedulePage(driver);
    }
    
    
    @Test(priority = 1, alwaysRun = true)
    public void testSchedule() {
    	
        assertEquals(true, _sp.isSchedulePresent());
        assertEquals(true, _sp.isCourseContentPresent());
    }


}
