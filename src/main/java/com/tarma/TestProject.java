package com.tarma;

import info.magnolia.module.ModuleLifecycle;
import info.magnolia.module.ModuleLifecycleContext;

/**
 * This class is optional and represents the configuration for the TEST_PROJECT module.
 * By exposing simple getter/setter/adder methods, this bean can be configured via content2bean
 * using the properties and node from <tt>config:/modules/TEST_PROJECT</tt>.
 * If you don't need this, simply remove the reference to this class in the module descriptor xml.
 * See https://documentation.magnolia-cms.com/display/DOCS/Module+configuration for information about module configuration.
 */
public class TestProject implements ModuleLifecycle {
    /* you can optionally implement info.magnolia.module.ModuleLifecycle */
    @Override
    public void start(ModuleLifecycleContext moduleLifecycleContext) {
        var change = "change3";
        System.out.println("Module started! " + change);
    }

    @Override
    public void stop(ModuleLifecycleContext moduleLifecycleContext) {

    }
}
