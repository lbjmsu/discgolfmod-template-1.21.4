package ejcraft2.discgolfmod.item;

import ejcraft2.discgolfmod.DiscGolfMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
//    // Items
//    public static final Item DISC = register(new Item.Settings(), "disc");
//
//    // Functions
//    public static Item register(Item.Settings itemSettings, String id) {
//        Identifier itemID = Identifier.of(DiscGolfMod.MOD_ID, id);
//        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, itemID);
//        Item.Settings settings = itemSettings.registryKey(key);
//
//        Item registeredItem = Registry.register(Registries.ITEM, key, new Item(settings));
//
//        return registeredItem;
//    }

    public static final Item DISC = register("disc", Item::new, new Item.Settings());

    public static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("discgolfmod", id));
        return Items.register(registryKey, factory, settings);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(DISC));
    }

}
