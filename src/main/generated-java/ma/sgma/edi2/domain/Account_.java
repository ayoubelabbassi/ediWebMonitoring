/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-backend-jpa:src/main/java/domain/EntityMeta_.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-backend-jpa
 */
package ma.sgma.edi2.domain;

import java.util.Date;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Account.class)
public abstract class Account_ {

    // Raw attributes
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SingularAttribute<Account, String> username;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, Boolean> isEnabled;
    public static volatile SingularAttribute<Account, Date> lastConnection;
    public static volatile SingularAttribute<Account, Date> mdpExpiration;
    public static volatile SingularAttribute<Account, String> email;

    // Many to many
    public static volatile ListAttribute<Account, Userrole> securityRoles;
}