package com.company.aobookkeeping.screen.resource;

import io.jmix.ui.screen.*;
import com.company.aobookkeeping.entity.Resource;

@UiController("aobook_Resource.browse")
@UiDescriptor("resource-browse.xml")
@LookupComponent("resourcesTable")
public class ResourceBrowse extends StandardLookup<Resource> {
}