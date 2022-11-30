package com.company.aobookkeeping.screen.item;

import io.jmix.ui.screen.*;
import com.company.aobookkeeping.entity.Item;

@UiController("aobook_Item.edit")
@UiDescriptor("item-edit.xml")
@EditedEntityContainer("itemDc")
public class ItemEdit extends StandardEditor<Item> {
}