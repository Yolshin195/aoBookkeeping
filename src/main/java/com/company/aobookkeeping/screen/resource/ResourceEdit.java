package com.company.aobookkeeping.screen.resource;

import io.jmix.ui.screen.*;
import com.company.aobookkeeping.entity.Resource;

@UiController("aobook_Resource.edit")
@UiDescriptor("resource-edit.xml")
@EditedEntityContainer("resourceDc")
public class ResourceEdit extends StandardEditor<Resource> {
}