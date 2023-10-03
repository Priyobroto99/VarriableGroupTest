package Runners;

import org.testng.annotations.Test;

public class TestingVarriableGroups {

    @Test
    public void method1(){
        System.out.println("====================================================");

        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("Test_Group_1"));
        System.out.println(System.getenv("name"));

        System.out.println("====================================================");
    }
}
