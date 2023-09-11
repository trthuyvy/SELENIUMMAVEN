package BT_AddCategory;

import Locators.LocatorCms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAddNewCategory extends BaseTest {

    @Test(priority = 1)
    public void testLoginSuccess(){
        driver.get("https://cms.anhtester.com/login");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        sleep(1);
    }

    @Test(priority = 2)
    public void testAddNewCategory(){

        String name = "zy456";
        testLoginSuccess(); //Gọi lại phần auto Login từ test case testLoginSuccess

        //Add new category

        driver.findElement(By.xpath(LocatorCms.menuProducts)).click();
        driver.findElement(By.xpath(LocatorCms.CategoryInProduct)).click();
        sleep(1);
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCms.HeaderAllCategories)).isDisplayed(),"Not All Categories Page");

        driver.findElement(By.xpath(LocatorCms.buttonAddNewCategory)).click();
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCms.headerCatagoryInfomation)).isDisplayed(),"Not Add New Category table");
        sleep(1);

        driver.findElement(By.xpath(LocatorCms.inputNameCategory)).sendKeys(name);
        driver.findElement(By.xpath(LocatorCms.dropdownParentCategory)).click();
        driver.findElement(By.xpath(LocatorCms.optionHoai1)).click();
        driver.findElement(By.xpath(LocatorCms.dropdownTypeCategory)).click();
        driver.findElement(By.xpath(LocatorCms.optionPhysical)).click();
        driver.findElement(By.xpath(LocatorCms.chooseBanner)).click();
        driver.findElement(By.xpath(LocatorCms.selectImageBanner)).click();
        driver.findElement(By.xpath(LocatorCms.buttonAddFileBanner)).click();
        driver.findElement(By.xpath(LocatorCms.chooseIcon)).click();
        driver.findElement(By.xpath(LocatorCms.selectImageIcon)).click();
        driver.findElement(By.xpath(LocatorCms.buttonAddFileIcon)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorCms.buttonSaveCategory)).click();

        //Check New Category
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCms.HeaderAllCategories)).isDisplayed(),"Not All Categories Page");
        sleep(1);
        driver.findElement(By.xpath(LocatorCms.inputSearchNameCategory)).sendKeys(name);
        sleep(1);
        driver.findElement(By.xpath(LocatorCms.inputSearchNameCategory)).sendKeys(Keys.ENTER);
        sleep(1);
        Assert.assertEquals(driver.findElement(By.xpath(LocatorCms.inputSearchNameCategory)).getAttribute("value"),name,"Category Name is not matched !!!");

    }



}