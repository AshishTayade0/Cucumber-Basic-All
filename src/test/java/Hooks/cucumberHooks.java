package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucumberHooks {
    @Before("@TabValidation")
    public void runBeforeMultiCredentialScenarios(){
        System.out.println("Before Hooks- Tab Validation");
    }
    @Before("@MobileValidation")
    public void runBeforeMobileValidation(){
        System.out.println("Before Hooks- Mobile Validation");
    }
    @Before
    public void beforeAll(){
        System.out.println("Before all Hook");
    }
    @After()
    public void afterScenarioHook(){
        System.out.println("After Hook");
    }
}
