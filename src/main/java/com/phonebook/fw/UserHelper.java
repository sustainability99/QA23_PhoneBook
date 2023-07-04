package com.phonebook.fw;

import com.phonebook.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegistrationButton() {
        click(By.name("registration"));
    }

    public void fillLoginRegistrationForm(User user) {
        type(By.cssSelector("[placeholder='Email']"), user.getEmail());
        type(By.cssSelector("[placeholder='Password']"), user.getPassword());
    }

    public void clickOnLoginButton() {
        click(By.name("login"));
    }

    public void login() {
        fillLoginRegistrationForm(new User()
                .setEmail("ka@online.com")
                .setPassword("Ka12345678$"));
        clickOnLoginButton();
    }
}
