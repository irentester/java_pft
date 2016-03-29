package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Irina on 3/29/2016.
 */
public class NavigationHelper {
 private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  void gotoGroupPage() {
   wd.findElement(By.linkText("groups")).click();
  }
}
