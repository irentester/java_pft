package ru.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Irina on 3/28/2016.
 */
public class AplicationManager {
  public FirefoxDriver wd;
  public SessionHelper sessionHelper = new sessionHelper(wd);
  private  NavigationHelper navigationHelper ;
  private GroupHelper groupHelper ;



  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper. login("admin", "secret");
  }



  public void stop() {
   wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
