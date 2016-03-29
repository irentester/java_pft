package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Irina on 3/29/2016.
 */
public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
   super(wd);
  }

  void gotoGroupPage() {
  click(By.linkText("groups"));
  }
}
