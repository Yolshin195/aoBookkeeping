package com.company.aobookkeeping.screen.price;

import io.jmix.ui.screen.*;
import com.company.aobookkeeping.entity.Price;

@UiController("aobook_Price.edit")
@UiDescriptor("price-edit.xml")
@EditedEntityContainer("priceDc")
public class PriceEdit extends StandardEditor<Price> {
}