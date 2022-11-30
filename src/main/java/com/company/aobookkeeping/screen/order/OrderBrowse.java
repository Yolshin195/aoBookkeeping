package com.company.aobookkeeping.screen.order;

import io.jmix.ui.screen.*;
import com.company.aobookkeeping.entity.Order;

@UiController("aobook_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
public class OrderBrowse extends StandardLookup<Order> {
}