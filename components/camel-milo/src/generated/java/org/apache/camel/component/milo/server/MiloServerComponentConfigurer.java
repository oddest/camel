/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milo.server;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MiloServerComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MiloServerComponent target = (MiloServerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "applicationname":
        case "applicationName": target.setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationuri":
        case "applicationUri": target.setApplicationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bindaddresses":
        case "bindAddresses": target.setBindAddresses(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "buildinfo":
        case "buildInfo": target.setBuildInfo(property(camelContext, org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo.class, value)); return true;
        case "certificate": target.setCertificate(property(camelContext, java.security.cert.X509Certificate.class, value)); return true;
        case "certificatemanager":
        case "certificateManager": target.setCertificateManager(property(camelContext, org.eclipse.milo.opcua.stack.core.security.CertificateManager.class, value)); return true;
        case "certificatevalidator":
        case "certificateValidator": target.setCertificateValidator(property(camelContext, org.eclipse.milo.opcua.stack.core.security.CertificateValidator.class, value)); return true;
        case "defaultcertificatevalidator":
        case "defaultCertificateValidator": target.setDefaultCertificateValidator(property(camelContext, java.lang.String.class, value)); return true;
        case "enableanonymousauthentication":
        case "enableAnonymousAuthentication": target.setEnableAnonymousAuthentication(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "namespaceuri":
        case "namespaceUri": target.setNamespaceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "path": target.setPath(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.setPort(property(camelContext, int.class, value)); return true;
        case "producturi":
        case "productUri": target.setProductUri(property(camelContext, java.lang.String.class, value)); return true;
        case "securitypolicies":
        case "securityPolicies": target.setSecurityPolicies(property(camelContext, java.util.Set.class, value)); return true;
        case "securitypoliciesbyid":
        case "securityPoliciesById": target.setSecurityPoliciesById(property(camelContext, java.lang.String.class, value)); return true;
        case "userauthenticationcredentials":
        case "userAuthenticationCredentials": target.setUserAuthenticationCredentials(property(camelContext, java.lang.String.class, value)); return true;
        case "usernamesecuritypolicyuri":
        case "usernameSecurityPolicyUri": target.setUsernameSecurityPolicyUri(property(camelContext, org.eclipse.milo.opcua.stack.core.security.SecurityPolicy.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("applicationName", java.lang.String.class);
        answer.put("applicationUri", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bindAddresses", java.lang.String.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("buildInfo", org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo.class);
        answer.put("certificate", java.security.cert.X509Certificate.class);
        answer.put("certificateManager", org.eclipse.milo.opcua.stack.core.security.CertificateManager.class);
        answer.put("certificateValidator", org.eclipse.milo.opcua.stack.core.security.CertificateValidator.class);
        answer.put("defaultCertificateValidator", java.lang.String.class);
        answer.put("enableAnonymousAuthentication", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("namespaceUri", java.lang.String.class);
        answer.put("path", java.lang.String.class);
        answer.put("port", int.class);
        answer.put("productUri", java.lang.String.class);
        answer.put("securityPolicies", java.util.Set.class);
        answer.put("securityPoliciesById", java.lang.String.class);
        answer.put("userAuthenticationCredentials", java.lang.String.class);
        answer.put("usernameSecurityPolicyUri", org.eclipse.milo.opcua.stack.core.security.SecurityPolicy.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MiloServerComponent target = (MiloServerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "applicationname":
        case "applicationName": return target.getApplicationName();
        case "applicationuri":
        case "applicationUri": return target.getApplicationUri();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bindaddresses":
        case "bindAddresses": return target.getBindAddresses();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "buildinfo":
        case "buildInfo": return target.getBuildInfo();
        case "certificate": return target.getCertificate();
        case "certificatemanager":
        case "certificateManager": return target.getCertificateManager();
        case "certificatevalidator":
        case "certificateValidator": return target.getCertificateValidator();
        case "defaultcertificatevalidator":
        case "defaultCertificateValidator": return target.getDefaultCertificateValidator();
        case "enableanonymousauthentication":
        case "enableAnonymousAuthentication": return target.isEnableAnonymousAuthentication();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "namespaceuri":
        case "namespaceUri": return target.getNamespaceUri();
        case "path": return target.getPath();
        case "port": return target.getPort();
        case "producturi":
        case "productUri": return target.getProductUri();
        case "securitypolicies":
        case "securityPolicies": return target.getSecurityPolicies();
        case "securitypoliciesbyid":
        case "securityPoliciesById": return target.getSecurityPoliciesById();
        case "userauthenticationcredentials":
        case "userAuthenticationCredentials": return target.getUserAuthenticationCredentials();
        case "usernamesecuritypolicyuri":
        case "usernameSecurityPolicyUri": return target.getUsernameSecurityPolicyUri();
        default: return null;
        }
    }
}

