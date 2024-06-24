package com.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.Utils.PasswordGenerator;

public class pruebatest {

    PasswordGenerator passwordGenerator;

    @BeforeClass
    public void setUp (){
        passwordGenerator = new PasswordGenerator();
    }
    
    //longitud de la contraseña debe ser igual a 10.
    @Test(invocationCount = 100)
    public void testPasswordLengthIsTen(){
        //given
        int expectedLength = 10;
        //when
        String password = passwordGenerator.generatePassword();
        //then
        Assert.assertEquals(password.length(), expectedLength);
    }
    
    //Debe tener almenos 2 caracteres especiales.
    @Test(invocationCount = 100)
    public void testPasswordHasAtLeastTwoSpecialCharacters(){
        //given
        String specialCharacterPool = "@!._-#;";
        //when
        String password = passwordGenerator.generatePassword();
        //then
        int specialCharacterCount = 0;
        for (int i = 0; i< password.length(); i++){
            for (int j = 0; j < specialCharacterPool.length(); j++) {
                if (password.charAt(i) == specialCharacterPool.charAt(j)) {
                    specialCharacterCount++;
                    break;
                    
                }
            }
        }
        Assert.assertTrue(specialCharacterCount >= 2);
    }

    //Debe tener almenos una letra.
    @Test(invocationCount = 100)
    public void testPasswordHasAtLeastOneLetter() {
    // given
    // when
        String password = passwordGenerator.generatePassword();
    // then
        int letterCount = 0;
        for (int i = 0; i < password. length(); i++) {
            if ('a' <= password.charAt(i) && password.charAt(i) <='z') {
                letterCount++;
            }
            if ('A' <= password.charAt(i) && password.charAt(i) <='Z') {
                letterCount++;
            }
        }
    Assert.assertTrue(letterCount >= 1);
  }
}
