/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-jsf2-spring-conversation:src/main/java/permission/Permission.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-jsf2-spring-conversation
 */
package ma.sgma.edi2.web.permission;

import javax.inject.Named;
import javax.inject.Singleton;

import ma.sgma.edi2.domain.Sgedircci;
import ma.sgma.edi2.web.permission.support.GenericPermission;

@Named
@Singleton
public class SgedircciPermission extends GenericPermission<Sgedircci> {
    public SgedircciPermission() {
        super(Sgedircci.class);
    }
}