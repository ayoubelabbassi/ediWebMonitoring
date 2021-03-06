/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-backend-jpa:src/main/java/printer/Printer.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-backend-jpa
 */
package ma.sgma.edi2.printer;

import java.util.Locale;

import javax.inject.Named;
import javax.inject.Singleton;

import ma.sgma.edi2.domain.Userrole;
import ma.sgma.edi2.domain.Userrole_;
import ma.sgma.edi2.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link Userrole} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class UserrolePrinter extends GenericPrinter<Userrole> {
    public UserrolePrinter() {
        super(Userrole.class, Userrole_.role);
    }

    @Override
    public String print(Userrole userrole, Locale locale) {
        if (userrole == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, userrole.getRole());
        return ret.toString();
    }
}