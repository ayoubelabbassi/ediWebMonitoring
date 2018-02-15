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

import ma.sgma.edi2.domain.SgediEdircciMo;
import ma.sgma.edi2.domain.SgediEdircciMo_;
import ma.sgma.edi2.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link SgediEdircciMo} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class SgediEdircciMoPrinter extends GenericPrinter<SgediEdircciMo> {
    public SgediEdircciMoPrinter() {
        super(SgediEdircciMo.class, SgediEdircciMo_.mouvrage);
    }

    @Override
    public String print(SgediEdircciMo sgediEdircciMo, Locale locale) {
        if (sgediEdircciMo == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, sgediEdircciMo.getMouvrage());
        return ret.toString();
    }
}