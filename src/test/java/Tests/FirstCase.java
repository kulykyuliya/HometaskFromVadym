package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstCase extends TestInit {
    @Test
    public void test() {
        openSite();
        //  sleep(3);
        fullscreen();
        sleep(5);
        driver.findElements(By.xpath("//*[@viewBox='0 0 15 15']")).get(1).click();
        searchChapters().click();

        //inputFirstNameField().sendKeys("   ");
    }

//    public String main(String[] args) {
//
//        String name = "Ivan";
//        System.out.println(name);
//
//
//        public String getName () {
//            return name;
//        }
//
//        String name1 = name;
//        public void setName (String name){
//            this.name = name;
//        }

//    }

//    public static void main(String[] args) {
//        String w = new String("dfjkvv");
//        String a = "dfjkvv";
//        String b = "dfjkvv";
//
//
//        float k = 1.1f;
//        double j = 1.1d;
//        System.out.println(j);

    }



//}
