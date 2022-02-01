package me.drigster.foxycore.items;

import me.drigster.foxycore.managers.MessageManager;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GuiElements {
    public static ItemStack blank;
    public static ItemStack rightArrow;
    public static ItemStack leftArrow;
    public static ItemStack withdraw;
    public static ItemStack back;
    public static ItemStack convert;
    public static ItemStack diamondCoin;
    public static ItemStack goldCoin;
    public static ItemStack ironCoin;
    public static ItemStack info;
    public static ItemStack upgrade;

    public static void init(){
        createBlank();
        createRightArrow();
        createLeftArrow();
        createWithdraw();
        createBack();
        createConvert();
        createDiamondCoin();
        createGoldCoin();
        createIronCoin();
        createInfo();
        createUpgrade();
    }

    private static void createBlank() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageManager.createLocalizedString("words.background"));

        item.setItemMeta(meta);

        blank = item;
    }

    private static void createRightArrow() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageManager.createLocalizedString("words.convert"));

        meta.setCustomModelData(1);
        item.setItemMeta(meta);

        rightArrow = item;
    }

    private static void createLeftArrow() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageManager.createLocalizedString("words.convert"));

        meta.setCustomModelData(2);
        item.setItemMeta(meta);

        leftArrow = item;
    }

    private static void createWithdraw() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageManager.createLocalizedString("words.withdraw"));

        meta.setCustomModelData(3);
        item.setItemMeta(meta);

        withdraw = item;
    }

    private static void createBack() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageManager.createLocalizedString("words.back"));

        meta.setCustomModelData(4);
        item.setItemMeta(meta);

        back = item;
    }

    private static void createConvert() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(MessageManager.createLocalizedString("words.convert"));

        meta.setCustomModelData(5);
        item.setItemMeta(meta);

        convert = item;
    }

    private static void createDiamondCoin() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Алмазная монета");

        meta.setCustomModelData(6);
        item.setItemMeta(meta);

        diamondCoin = item;
    }

    private static void createGoldCoin() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Золотая монета");

        meta.setCustomModelData(7);
        item.setItemMeta(meta);

        goldCoin = item;
    }

    private static void createIronCoin() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Железная монета");

        meta.setCustomModelData(8);
        item.setItemMeta(meta);

        ironCoin = item;
    }

    private static void createInfo() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Информация");

        meta.setCustomModelData(9);
        item.setItemMeta(meta);

        info = item;
    }

    private static void createUpgrade() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Улучшить");
        List<String> lore = new ArrayList<>();
        lore.add("Улучшени позволяет расширить");
        lore.add("территорию действия защиты");
        lore.add("Уровень1 - 1х1 чанк");
        lore.add("Уровень2 - 3х3 чанка");
        lore.add("Уровень3 - 5х5 чанков");
        lore.add("Уровень4 - 7х7 чанков");
        lore.add("Уровень5 - 9х9 чанков");
        lore.add("---------------------");
        meta.setLore(lore);

        meta.setCustomModelData(10);
        item.setItemMeta(meta);

        upgrade = item;
    }
}