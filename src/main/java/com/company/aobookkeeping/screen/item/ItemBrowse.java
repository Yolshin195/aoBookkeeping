package com.company.aobookkeeping.screen.item;

import io.jmix.ui.screen.*;
import com.company.aobookkeeping.entity.Item;

@UiController("aobook_Item.browse")
@UiDescriptor("item-browse.xml")
@LookupComponent("itemsTable")
public class ItemBrowse extends StandardLookup<Item> {
}