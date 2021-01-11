package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.abstract_page.ShoppingCartPage;
import page.abstract_page.loginWithEmailPage;

public class ShoppingCartTests extends CommonConditions {
    @Test
    public void placingAnOrderWithAnEmptyShoppingCart() throws InterruptedException {
        boolean isPlacingAnOrderButtonAvailable=new ShoppingCartPage(driver)
                .openPage()
                .findAndClickDeleteButtons()
                .placingOrder();
        Assert.assertTrue(isPlacingAnOrderButtonAvailable,"Button place order not missing!!!!!!!!!");
         }

    }







