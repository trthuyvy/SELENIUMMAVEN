package Locators;

public class LocatorCms {

    //Dashboard
    public static String menuProducts = "//span[normalize-space()='Products']";
    public static String CategoryInProduct = "//span[normalize-space()='Category']";
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";

    //AddNewCategory
    public static String HeaderAllCategories = "(//h1[normalize-space()='All categories'])[1]";
    public static String buttonAddNewCategory = "//span[normalize-space()='Add New category']";
    public static String headerCatagoryInfomation = "//div[@class='card-header']//h5";
    public static String inputNameCategory = "//input[@id='name']";
    public static String dropdownParentCategory = "//button[@title='No Parent']";
    public static String optionHoai1 = "//span[normalize-space()='-- Hoai 1']";
    public static String inputOrderingNumber = "//input[@id='order_level']";
    public static String dropdownTypeCategory = "//button[@title='Physical']";
    public static String optionPhysical = "//span[normalize-space()='Physical']";
    public static String chooseBanner = "//label[.='Banner (200x200)']/following-sibling::div//div[normalize-space()='Choose File']";
    public static String selectImageBanner = "//div[@title='anh.jpg']//img[@class='img-fit']";
    public static String buttonAddFileBanner = "//button[normalize-space()='Add Files']";
    public static String chooseIcon = "//label[.='Icon (32x32)']/following-sibling::div//div[normalize-space()='Choose File']";
    public static String selectImageIcon = "//div[@title='Banner.png']//img[@class='img-fit']";
    public static String buttonAddFileIcon = "//button[normalize-space()='Add Files']";
    public static String buttonSaveCategory = "//div[@class='card-body']//button[normalize-space()='Save']";

   //SearchCategory
    public static String inputSearchNameCategory = "//div[@class='card-header d-block d-md-flex']//input[@id='search']";
    public static String inputSearchAttributesName = "//div[@class='dropdown-menu show']//input[@aria-label='Search']";
}
