class ExampleTest {
    Webdriver driver = new Chromedriver();
    driver.get("www.example.com");
    
// Empable
Webelement empNameField = driver.findElement(By.name="Emp Name");
Webelement deptDropdown = driver.findElement(By.name="Dept");
Webelement submitBtn = driver.findElement(By.name="Submit");

empNameField.clear();
empNameField.sendKeys("Himanil");
String empFieldValue = empNameField.getAttribute("value");
Select selectDept = new Select(deptDropdown);
submitBtn.click

WebDriverWait wait = new WebDriverWait(10,Time.SECOND);
wait.visibilityOfElement(By.tagName("table"));

List<WebElement> empTables = driver.findElements(By.xpath("//table/tbody/tr/td"));
for (WebElement emp : empTables) {
    if(emp.text().equals(empFieldValue)) {
        Assert.assertEquals(Expected:empFieldValue, Actual:emp.text(), message:'assert faile')
    }
}

driver.close();
driver.quite();

public void sortArray(){
    // Example: array- 5 3 1 9 7
    // Output – 1 3 5 7 9  
    int a[] = {5,3,1,9,7};
    int sorted[];
    int max = a[0]; 
    for(int i=0;i<a.length;i++){
        if(a[i]>max) {
            max = a[i];
            sorted[i] = a[i];
        }
    }
}



}