package me.d3rp.theetje.Setup;

import me.d3rp.theetje.Util.Registration;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    // hamburger
    public static final RegistryObject<Item> BURGER = Registration.ITEMS.register("burger",
            () -> new Item(new Item.Properties()
                    .group(ItemGroup.FOOD)
                    .food(new Food.Builder()
                            .hunger(8)
                            .saturation(1.2F)
                            .build()))

            );
    public static final RegistryObject<Item> STARMINT_TEA = Registration.ITEMS.register("starmint_tea",
            () -> new Item(new Item.Properties()
                    .group(ItemGroup.FOOD)
                    .food(new Food.Builder()
                            .hunger(3)
                            .saturation(1.2F)
                            .build()))
    );
    public static final RegistryObject<Item> FORESTFRUIT_TEA = Registration.ITEMS.register("forestfruit_tea",
            () -> new Item(new Item.Properties()
                    .group(ItemGroup.FOOD)
                    .food(new Food.Builder()
                            .hunger(3)
                            .saturation(1.2F)
                            .build()))
    );
    public static final RegistryObject<Item> LEMON_TEA = Registration.ITEMS.register("lemon_tea",
            () -> new Item(new Item.Properties()
                    .group(ItemGroup.FOOD)
                    .food(new Food.Builder()
                            .hunger(3)
                            .saturation(1.2F)
                            .build()))
    );
    public static final RegistryObject<Item> STRAWBERRY_TEA = Registration.ITEMS.register("strawberry_tea",
            () -> new Item(new Item.Properties()
                    .group(ItemGroup.FOOD)
                    .food(new Food.Builder()
                            .hunger(3)
                            .saturation(1.2F)
                            .build()))
    );

    public static void Register() {}
}
