/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-backend-jpa
 */
package ma.sgma.edi2.domain;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.TemporalType.DATE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.jaxio.jpa.querybyexample.Identifiable;

@Entity
@Table(name = "account")
@Indexed
public class Account implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Account.class);

    // Raw attributes
    private Integer id;
    private String username;
    private String password;
    private Boolean isEnabled;
    private Date lastConnection;
    private Date mdpExpiration;
    private String email;

    // Many to many
    private List<Userrole> securityRoles = new ArrayList<Userrole>();
    // -- [id] ------------------------

    @Override
    @Column(name = "account_id", precision = 10)
    @GeneratedValue(strategy = IDENTITY)
    @Id
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Account id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [username] ------------------------

    @NotEmpty
    @Size(min = 4, max = 255)
    @Column(name = "login", nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Account username(String username) {
        setUsername(username);
        return this;
    }
    // -- [password] ------------------------

    @NotEmpty
    @Size(max = 255)
    @Column(name = "\"password\"", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account password(String password) {
        setPassword(password);
        return this;
    }
    // -- [isEnabled] ------------------------

    @NotNull
    @Column(name = "is_enabled", nullable = false, length = 1)
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Account isEnabled(Boolean isEnabled) {
        setIsEnabled(isEnabled);
        return this;
    }
    // -- [lastConnection] ------------------------

    @Column(name = "last_connection", length = 13)
    @Temporal(DATE)
    public Date getLastConnection() {
        return lastConnection;
    }

    public void setLastConnection(Date lastConnection) {
        this.lastConnection = lastConnection;
    }

    public Account lastConnection(Date lastConnection) {
        setLastConnection(lastConnection);
        return this;
    }
    // -- [mdpExpiration] ------------------------

    @Column(name = "mdp_expiration", length = 13)
    @Temporal(DATE)
    public Date getMdpExpiration() {
        return mdpExpiration;
    }

    public void setMdpExpiration(Date mdpExpiration) {
        this.mdpExpiration = mdpExpiration;
    }

    public Account mdpExpiration(Date mdpExpiration) {
        setMdpExpiration(mdpExpiration);
        return this;
    }
    // -- [email] ------------------------

    @Email
    @Size(max = 250)
    @Column(name = "email", length = 250)
    @Field(analyzer = @Analyzer(definition = "custom") )
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account email(String email) {
        setEmail(email);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to Many
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    // many-to-many: account ==> securityRoles
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    /**
     * Returns the {@link #securityRoles} list.
     */
    @JoinTable(name = "account_role", joinColumns = @JoinColumn(name = "account_id") , inverseJoinColumns = @JoinColumn(name = "role_id") )
    @ManyToMany(cascade = { PERSIST, MERGE })
    public List<Userrole> getSecurityRoles() {
        return securityRoles;
    }

    /**
     * Set the {@link #securityRoles} list.
     *
     * @param securityRoles the list of Userrole
     */
    public void setSecurityRoles(List<Userrole> securityRoles) {
        this.securityRoles = securityRoles;
    }

    /**
     * Helper method to add the passed {@link Userrole} to the {@link #securityRoles} list.
     */
    public boolean addSecurityRole(Userrole securityRole) {
        return getSecurityRoles().add(securityRole);
    }

    /**
     * Helper method to remove the passed {@link Userrole} from the {@link #securityRoles} list.
     */
    public boolean removeSecurityRole(Userrole securityRole) {
        return getSecurityRoles().remove(securityRole);
    }

    /**
     * Helper method to determine if the passed {@link Userrole} is present in the {@link #securityRoles} list.
     */
    public boolean containsSecurityRole(Userrole securityRole) {
        return getSecurityRoles() != null && getSecurityRoles().contains(securityRole);
    }

    /**
     * Apply the default values.
     */
    public Account withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Account && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Account instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("username", getUsername()) //
                .add("password", "XXXX") //
                .add("isEnabled", getIsEnabled()) //
                .add("lastConnection", getLastConnection()) //
                .add("mdpExpiration", getMdpExpiration()) //
                .add("email", getEmail()) //
                .toString();
    }
}