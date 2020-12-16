package TestPack;

import org.testng.annotations.*;

public class Demo {
    @Test
    public void anyTime(){
        System.out.println("Any time test");
    }
//    @BeforeMethod
//    public void before(){
//        System.out.println("Before Method");
//    }
//    @BeforeClass
//    public void lass(){
//        System.out.println("Before Class");
//    }
//    @AfterClass
//    public void aftClass() {
//        System.out.println("After class");
//    }
//    @AfterMethod
//    public void after(){
//        System.out.println("After Method");
//    }
    @Test(dataProvider = "getData")
    public void reverse(String username, String password){
        System.out.println("Reverse test");
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];
        data[0][0] = "firstUser";
        data[0][1] = "firstPassword";

        data[1][0] = "secondUser";
        data[1][1] = "secondPassword";

        data[2][0] = "thirdUser";
        data[2][1] = "thirdPassword";
        return data;
    }

}
