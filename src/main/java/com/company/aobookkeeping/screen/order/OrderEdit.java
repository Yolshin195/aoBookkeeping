package com.company.aobookkeeping.screen.order;

import com.company.aobookkeeping.entity.Item;
import com.company.aobookkeeping.entity.Price;
import io.jmix.core.DataManager;
import io.jmix.ui.component.EntityPicker;
import io.jmix.ui.component.HasValue;
import io.jmix.ui.component.TextField;
import io.jmix.ui.screen.*;
import com.company.aobookkeeping.entity.Order;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Objects;

@UiController("aobook_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
public class OrderEdit extends StandardEditor<Order> {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(OrderEdit.class);
    @Autowired
    private EntityPicker<Item> itemField;

    @Autowired
    private EntityPicker<Price> priceField;

    @Autowired
    private TextField<BigDecimal> totalAmountField;

    @Subscribe("numberField")
    public void onNumberFieldValueChange(HasValue.ValueChangeEvent<Integer> event) {
        Integer number = event.getValue();

        if (number != null && number > 0 && !itemField.isEmpty() && !priceField.isEmpty()) {
            totalAmountField.setValue(Objects.requireNonNull(priceField.getValue()).getValue().multiply(BigDecimal.valueOf(number)));
        }
    }

    @Subscribe("itemField")
    public void onItemFieldValueChange(HasValue.ValueChangeEvent<Item> event) {
        log.info(event.getValue().toString());
    }

}