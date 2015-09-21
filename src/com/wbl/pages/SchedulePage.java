package com.wbl.pages;

import org.openqa.selenium.WebDriver;

import com.wbl.utils.web.PageDriver;

public class SchedulePage extends PortalPage {
	
	public SchedulePage(PageDriver driver) {
        super(driver);
        _logger.error("Open Schdule Page");
        
        driver.findElement("header.schedule.page").click();        
        _logger.error("Open Schdule Page after schdule click");
        
    }

    public boolean isSchedulePresent() {
    	System.out.println("item1="+driver.findElement("home.schedule.items1").getText());
        return driver.findElements("home.schedule.items1").size() > 0;
    }
    public boolean isCourseContentPresent() {
        return driver.findElements("home.schedule.items2").size() > 0;
    }

}
