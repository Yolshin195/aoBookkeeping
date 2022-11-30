package com.company.aobookkeeping.screen.price;

import io.jmix.ui.screen.*;
import com.company.aobookkeeping.entity.Price;

@UiController("aobook_Price.browse")
@UiDescriptor("price-browse.xml")
@LookupComponent("pricesTable")
public class PriceBrowse extends StandardLookup<Price> {
}