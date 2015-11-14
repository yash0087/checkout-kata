import main.Item;
import main.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;


public class ShoppingCartTest {
    private static Map<Item, Integer> itemPrices = new HashMap<>();
    static{
        itemPrices.put(new Item("A"), 50);
        itemPrices.put(new Item("B"), 30);
    }

    private ShoppingCart shoppingCart = new ShoppingCart(itemPrices);

    @Test
    public void shouldReturn_0_whenNoItemsInShoppingCart(){
        assertTrue(shoppingCart.totalPrice() == 0);
    }

    @Test
    public void shouldReturnTotalPriceWhenOneOrMoreITemsInShoppingCart(){
        Map<Item, Integer> items = new HashMap<>();
        items.put(new Item("A"), 1);
        items.put(new Item("B"), 1);
        shoppingCart.updateItems(items);

        assertTrue(shoppingCart.totalPrice() == 80);
    }
}