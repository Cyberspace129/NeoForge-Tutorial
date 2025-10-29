package com.cyber.wom.item;

import com.cyber.wom.WOM;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WOM.MOD_ID);
    // COMMON
    public static final DeferredItem<Item> ALUMINUM = ITEMS.register("aluminum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC = ITEMS.register("zinc", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL = ITEMS.register("nickel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN = ITEMS.register("tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD = ITEMS.register("lead", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMIUM = ITEMS.register("chromium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE = ITEMS.register("manganese", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT = ITEMS.register("cobalt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM = ITEMS.register("magnesium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM = ITEMS.register("titanium", () -> new Item(new Item.Properties()));
    // UNCOMMON
    public static final DeferredItem<Item> VANADIUM = ITEMS.register("vanadium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANTIMONY = ITEMS.register("antimony", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM = ITEMS.register("lithium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM = ITEMS.register("sodium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOLYBDENUM = ITEMS.register("molybdenum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER = ITEMS.register("silver", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM = ITEMS.register("platinum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM = ITEMS.register("palladium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODIUM = ITEMS.register("rhodium", () -> new Item(new Item.Properties()));
    // RARE
    public static final DeferredItem<Item> IRIDIUM = ITEMS.register("iridium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM = ITEMS.register("osmium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUTHENIUM = ITEMS.register("ruthenium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TANTALUM = ITEMS.register("tantalum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIOBIUM = ITEMS.register("niobium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAFNIUM = ITEMS.register("hafnium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIUM = ITEMS.register("zirconium", () -> new Item(new Item.Properties()));
    // LEGENDARY
    public static final DeferredItem<Item> RHENIUM = ITEMS.register("rhenium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TECHNETIUM = ITEMS.register("technetium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PROTACTINIUM = ITEMS.register("protactinium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NEPTUNIUM = ITEMS.register("neptunium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMERICIUM = ITEMS.register("americium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CURIUM = ITEMS.register("curium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERKELIUM = ITEMS.register("berkelium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALIFORNIUM = ITEMS.register("californium", () -> new Item(new Item.Properties()));
    // MYTHICAL
    public static final DeferredItem<Item> EINSTEINIUM = ITEMS.register("einsteinium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERMIUM = ITEMS.register("fermium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MENDELEVIUM = ITEMS.register("mendelevium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NOBELIUM = ITEMS.register("nobelium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAWRENCIUM = ITEMS.register("lawrencium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUTHERFORDIUM = ITEMS.register("rutherfordium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUBNIUM = ITEMS.register("dubnium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SEABORGIUM = ITEMS.register("seaborgium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOHRIUM = ITEMS.register("bohrium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HASSIUM = ITEMS.register("hassium", () -> new Item(new Item.Properties()));
    // GODLY
    public static final DeferredItem<Item> MEITNERIUM = ITEMS.register("meitnerium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARMSTADTIUM = ITEMS.register("darmstadtium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROENTGENIUM = ITEMS.register("roentgenium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPERNICIUM = ITEMS.register("copernicium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIHONIUM = ITEMS.register("nihonium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLEROVIUM = ITEMS.register("flerovium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOSCOVIUM = ITEMS.register("moscovium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIVERMORIUM = ITEMS.register("livermorium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TENNESSINE = ITEMS.register("tennessine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OGANESSON = ITEMS.register("oganesson", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FRANCIUM = ITEMS.register("francium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RADIUM = ITEMS.register("radium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLONIUM = ITEMS.register("polonium", () -> new Item(new Item.Properties()));
    // COMMON GEMS (1–20)
    public static final DeferredItem<Item> CITRINE = ITEMS.register("citrine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMOKY_QUARTZ = ITEMS.register("smoky_quartz", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AGATE = ITEMS.register("agate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JASPER = ITEMS.register("jasper", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONYX = ITEMS.register("onyx", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALCITE = ITEMS.register("calcite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE = ITEMS.register("fluorite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OBSIDIAN = ITEMS.register("obsidian", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AVENTURINE = ITEMS.register("aventurine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIGERS_EYE = ITEMS.register("tigers_eye", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SODALITE = ITEMS.register("sodalite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> APATITE = ITEMS.register("apatite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MALACHITE = ITEMS.register("malachite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHALCEDONY = ITEMS.register("chalcedony", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LABRADORITE = ITEMS.register("labradorite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARNELIAN = ITEMS.register("carnelian", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOONSTONE = ITEMS.register("moonstone", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HOWLITE = ITEMS.register("howlite", () -> new Item(new Item.Properties()));
    // UNCOMMON GEMS (21–40)
    public static final DeferredItem<Item> TURQUOISE = ITEMS.register("turquoise", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PERIDOT = ITEMS.register("peridot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GARNET = ITEMS.register("garnet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCON = ITEMS.register("zircon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPINEL = ITEMS.register("spinel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KYANITE = ITEMS.register("kyanite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMAZONITE = ITEMS.register("amazonite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUNSTONE = ITEMS.register("sunstone", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODONITE = ITEMS.register("rhodonite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PREHNITE = ITEMS.register("prehnite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IOLITE = ITEMS.register("iolite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHRYSOPRASE = ITEMS.register("chrysoprase", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AVENTURINE_FELDSPAR = ITEMS.register("aventurine_feldspar", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JADE_NEFRITE = ITEMS.register("jade_nefrite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JADE_JADEITE = ITEMS.register("jade_jadeite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUTILE = ITEMS.register("rutile", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIOPSIDE = ITEMS.register("diopside", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEPIDOLITE = ITEMS.register("lepidolite", () -> new Item(new Item.Properties()));
    // RARE GEMS (41–60)
    public static final DeferredItem<Item> CHAROITE = ITEMS.register("charoite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZOISITE_TANZANITE = ITEMS.register("zoisite_tanzanite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPINEL_RARE = ITEMS.register("spinel_rare", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KUNZITE = ITEMS.register("kunzite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPHENE = ITEMS.register("sphene", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHRYSOBERYL = ITEMS.register("chrysoberyl", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HESSONITE = ITEMS.register("hessonite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GROSSULAR = ITEMS.register("grossular", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PYROPE = ITEMS.register("pyrope", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALMANDINE = ITEMS.register("almandine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODOLITE = ITEMS.register("rhodolite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TORMALINE = ITEMS.register("tourmaline", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPINEL_BLUE = ITEMS.register("spinell_blue", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AQUAMARINE = ITEMS.register("aquamarine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHRYSOBERYL_CATSEYE = ITEMS.register("chrysoberyl_catseye", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> APATITE_RARE = ITEMS.register("apatite_rare", () -> new Item(new Item.Properties()));
    // LEGENDARY GEMS (61–80)
    public static final DeferredItem<Item> BENITOITE = ITEMS.register("benitoite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EUCLASE = ITEMS.register("euclase", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KEMPTONITE = ITEMS.register("kemptonite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DANBURITE = ITEMS.register("danburite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUGILITE = ITEMS.register("sugilite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHRYSOPRASE_RARE = ITEMS.register("chrysoprase_rare", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMETRINE = ITEMS.register("ametrine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TORMALINE_RARE = ITEMS.register("tourmaline_rare", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPINEL_RED = ITEMS.register("spinell_red", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOURMALINE_PINK = ITEMS.register("tourmaline_pink", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPINEL_PURPLE = ITEMS.register("spinell_purple", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IOLITE_RARE = ITEMS.register("iolite_rare", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANDALUSITE = ITEMS.register("andalusite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIASPORE = ITEMS.register("diaspore", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNSTALLITE = ITEMS.register("tunstallite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE_PINK = ITEMS.register("sapphire_pink", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPINEL_GREEN = ITEMS.register("spinell_green", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHRYSOBERYL_ALMANDINE = ITEMS.register("chrysoberyl_almandine", () -> new Item(new Item.Properties()));
    // MYTHICAL → GODLY GEMS (87–100)
    public static final DeferredItem<Item> PAINITE = ITEMS.register("painite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TAAFFEITE = ITEMS.register("taaffeite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSGRAVITE = ITEMS.register("musgravite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALEXANDRITE = ITEMS.register("alexandrite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RED_BERIL = ITEMS.register("red_beryl", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JEREMEJEVITE = ITEMS.register("jeremejevite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRANDIDIERITE = ITEMS.register("grandidierite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POUDRETTEITE = ITEMS.register("poudretteite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SERENDIBITE = ITEMS.register("serendibite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BURMESE_RUBY = ITEMS.register("burmese_ruby", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_DIAMOND = ITEMS.register("blue_diamond", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RED_DIAMOND = ITEMS.register("red_diamond", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINK_STAR_DIAMOND = ITEMS.register("pink_star_diamond", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
