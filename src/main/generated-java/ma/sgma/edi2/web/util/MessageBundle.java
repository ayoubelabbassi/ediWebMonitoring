/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-jsf2-spring-conversation:src/main/java/util/MessageBundle.p.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-jsf2-spring-conversation
 */
package ma.sgma.edi2.web.util;

import java.util.Enumeration;
import java.util.ResourceBundle;

import ma.sgma.edi2.util.ResourcesUtil;

/**
 * This {@link ResourceBundle} is set in faces-config.xml under <code>msg</code> var.
 * <p>
 * Implementation uses Spring {@link MessageSource}.
 * <p>
 * From your JSF2 pages, you may use <code>#{msg.property_key}</code>.
 * <p>
 * _HACK_ as it is a tricky JSF/Spring integration point.
 */
public class MessageBundle extends ResourceBundle {

    private ResourcesUtil resourcesUtil;

    @Override
    public Enumeration<String> getKeys() {
        return null;
    }

    @Override
    protected Object handleGetObject(String key) {
        if (resourcesUtil == null) {
            resourcesUtil = ResourcesUtil.getInstance();
        }
        return resourcesUtil.getProperty(key);
    }
}