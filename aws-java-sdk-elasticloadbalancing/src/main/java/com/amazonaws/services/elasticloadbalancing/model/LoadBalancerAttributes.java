/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>LoadBalancerAttributes</code> data type.
 * </p>
 */
public class LoadBalancerAttributes implements Serializable, Cloneable {

    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * routes the request traffic evenly across all back-end instances
     * regardless of the Availability Zones. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html">Enable
     * Cross-Zone Load Balancing</a>.
     */
    private CrossZoneLoadBalancing crossZoneLoadBalancing;

    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * captures detailed information of all the requests and delivers the
     * information to the Amazon S3 bucket that you specify. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html">Enable
     * Access Logs</a>.
     */
    private AccessLog accessLog;

    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * allows existing requests to complete before the load balancer shifts
     * traffic away from a deregistered or unhealthy back-end instance.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html">Enable
     * Connection Draining</a>.
     */
    private ConnectionDraining connectionDraining;

    /**
     * The name of the load balancer attribute. <p>By default, Elastic Load
     * Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. If the
     * <code>ConnectionSettings</code> attribute is set, Elastic Load
     * Balancing will allow the connections to remain idle (no data is sent
     * over the connection) for the specified duration. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html">Configure
     * Idle Connection Timeout</a>.
     */
    private ConnectionSettings connectionSettings;

    /**
     * This parameter is reserved for future use.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AdditionalAttribute> additionalAttributes;

    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * routes the request traffic evenly across all back-end instances
     * regardless of the Availability Zones. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html">Enable
     * Cross-Zone Load Balancing</a>.
     *
     * @return The name of the load balancer attribute. If enabled, the load balancer
     *         routes the request traffic evenly across all back-end instances
     *         regardless of the Availability Zones. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html">Enable
     *         Cross-Zone Load Balancing</a>.
     */
    public CrossZoneLoadBalancing getCrossZoneLoadBalancing() {
        return crossZoneLoadBalancing;
    }
    
    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * routes the request traffic evenly across all back-end instances
     * regardless of the Availability Zones. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html">Enable
     * Cross-Zone Load Balancing</a>.
     *
     * @param crossZoneLoadBalancing The name of the load balancer attribute. If enabled, the load balancer
     *         routes the request traffic evenly across all back-end instances
     *         regardless of the Availability Zones. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html">Enable
     *         Cross-Zone Load Balancing</a>.
     */
    public void setCrossZoneLoadBalancing(CrossZoneLoadBalancing crossZoneLoadBalancing) {
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
    }
    
    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * routes the request traffic evenly across all back-end instances
     * regardless of the Availability Zones. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html">Enable
     * Cross-Zone Load Balancing</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param crossZoneLoadBalancing The name of the load balancer attribute. If enabled, the load balancer
     *         routes the request traffic evenly across all back-end instances
     *         regardless of the Availability Zones. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-disable-crosszone-lb.html">Enable
     *         Cross-Zone Load Balancing</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LoadBalancerAttributes withCrossZoneLoadBalancing(CrossZoneLoadBalancing crossZoneLoadBalancing) {
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
        return this;
    }

    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * captures detailed information of all the requests and delivers the
     * information to the Amazon S3 bucket that you specify. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html">Enable
     * Access Logs</a>.
     *
     * @return The name of the load balancer attribute. If enabled, the load balancer
     *         captures detailed information of all the requests and delivers the
     *         information to the Amazon S3 bucket that you specify. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html">Enable
     *         Access Logs</a>.
     */
    public AccessLog getAccessLog() {
        return accessLog;
    }
    
    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * captures detailed information of all the requests and delivers the
     * information to the Amazon S3 bucket that you specify. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html">Enable
     * Access Logs</a>.
     *
     * @param accessLog The name of the load balancer attribute. If enabled, the load balancer
     *         captures detailed information of all the requests and delivers the
     *         information to the Amazon S3 bucket that you specify. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html">Enable
     *         Access Logs</a>.
     */
    public void setAccessLog(AccessLog accessLog) {
        this.accessLog = accessLog;
    }
    
    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * captures detailed information of all the requests and delivers the
     * information to the Amazon S3 bucket that you specify. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html">Enable
     * Access Logs</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessLog The name of the load balancer attribute. If enabled, the load balancer
     *         captures detailed information of all the requests and delivers the
     *         information to the Amazon S3 bucket that you specify. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/enable-access-logs.html">Enable
     *         Access Logs</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LoadBalancerAttributes withAccessLog(AccessLog accessLog) {
        this.accessLog = accessLog;
        return this;
    }

    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * allows existing requests to complete before the load balancer shifts
     * traffic away from a deregistered or unhealthy back-end instance.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html">Enable
     * Connection Draining</a>.
     *
     * @return The name of the load balancer attribute. If enabled, the load balancer
     *         allows existing requests to complete before the load balancer shifts
     *         traffic away from a deregistered or unhealthy back-end instance.
     *         <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html">Enable
     *         Connection Draining</a>.
     */
    public ConnectionDraining getConnectionDraining() {
        return connectionDraining;
    }
    
    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * allows existing requests to complete before the load balancer shifts
     * traffic away from a deregistered or unhealthy back-end instance.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html">Enable
     * Connection Draining</a>.
     *
     * @param connectionDraining The name of the load balancer attribute. If enabled, the load balancer
     *         allows existing requests to complete before the load balancer shifts
     *         traffic away from a deregistered or unhealthy back-end instance.
     *         <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html">Enable
     *         Connection Draining</a>.
     */
    public void setConnectionDraining(ConnectionDraining connectionDraining) {
        this.connectionDraining = connectionDraining;
    }
    
    /**
     * The name of the load balancer attribute. If enabled, the load balancer
     * allows existing requests to complete before the load balancer shifts
     * traffic away from a deregistered or unhealthy back-end instance.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html">Enable
     * Connection Draining</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionDraining The name of the load balancer attribute. If enabled, the load balancer
     *         allows existing requests to complete before the load balancer shifts
     *         traffic away from a deregistered or unhealthy back-end instance.
     *         <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-conn-drain.html">Enable
     *         Connection Draining</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LoadBalancerAttributes withConnectionDraining(ConnectionDraining connectionDraining) {
        this.connectionDraining = connectionDraining;
        return this;
    }

    /**
     * The name of the load balancer attribute. <p>By default, Elastic Load
     * Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. If the
     * <code>ConnectionSettings</code> attribute is set, Elastic Load
     * Balancing will allow the connections to remain idle (no data is sent
     * over the connection) for the specified duration. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html">Configure
     * Idle Connection Timeout</a>.
     *
     * @return The name of the load balancer attribute. <p>By default, Elastic Load
     *         Balancing maintains a 60-second idle connection timeout for both
     *         front-end and back-end connections of your load balancer. If the
     *         <code>ConnectionSettings</code> attribute is set, Elastic Load
     *         Balancing will allow the connections to remain idle (no data is sent
     *         over the connection) for the specified duration. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html">Configure
     *         Idle Connection Timeout</a>.
     */
    public ConnectionSettings getConnectionSettings() {
        return connectionSettings;
    }
    
    /**
     * The name of the load balancer attribute. <p>By default, Elastic Load
     * Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. If the
     * <code>ConnectionSettings</code> attribute is set, Elastic Load
     * Balancing will allow the connections to remain idle (no data is sent
     * over the connection) for the specified duration. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html">Configure
     * Idle Connection Timeout</a>.
     *
     * @param connectionSettings The name of the load balancer attribute. <p>By default, Elastic Load
     *         Balancing maintains a 60-second idle connection timeout for both
     *         front-end and back-end connections of your load balancer. If the
     *         <code>ConnectionSettings</code> attribute is set, Elastic Load
     *         Balancing will allow the connections to remain idle (no data is sent
     *         over the connection) for the specified duration. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html">Configure
     *         Idle Connection Timeout</a>.
     */
    public void setConnectionSettings(ConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
    }
    
    /**
     * The name of the load balancer attribute. <p>By default, Elastic Load
     * Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. If the
     * <code>ConnectionSettings</code> attribute is set, Elastic Load
     * Balancing will allow the connections to remain idle (no data is sent
     * over the connection) for the specified duration. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html">Configure
     * Idle Connection Timeout</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionSettings The name of the load balancer attribute. <p>By default, Elastic Load
     *         Balancing maintains a 60-second idle connection timeout for both
     *         front-end and back-end connections of your load balancer. If the
     *         <code>ConnectionSettings</code> attribute is set, Elastic Load
     *         Balancing will allow the connections to remain idle (no data is sent
     *         over the connection) for the specified duration. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/config-idle-timeout.html">Configure
     *         Idle Connection Timeout</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LoadBalancerAttributes withConnectionSettings(ConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
        return this;
    }

    /**
     * This parameter is reserved for future use.
     *
     * @return This parameter is reserved for future use.
     */
    public java.util.List<AdditionalAttribute> getAdditionalAttributes() {
        if (additionalAttributes == null) {
              additionalAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<AdditionalAttribute>();
              additionalAttributes.setAutoConstruct(true);
        }
        return additionalAttributes;
    }
    
    /**
     * This parameter is reserved for future use.
     *
     * @param additionalAttributes This parameter is reserved for future use.
     */
    public void setAdditionalAttributes(java.util.Collection<AdditionalAttribute> additionalAttributes) {
        if (additionalAttributes == null) {
            this.additionalAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AdditionalAttribute> additionalAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AdditionalAttribute>(additionalAttributes.size());
        additionalAttributesCopy.addAll(additionalAttributes);
        this.additionalAttributes = additionalAttributesCopy;
    }
    
    /**
     * This parameter is reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalAttributes This parameter is reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LoadBalancerAttributes withAdditionalAttributes(AdditionalAttribute... additionalAttributes) {
        if (getAdditionalAttributes() == null) setAdditionalAttributes(new java.util.ArrayList<AdditionalAttribute>(additionalAttributes.length));
        for (AdditionalAttribute value : additionalAttributes) {
            getAdditionalAttributes().add(value);
        }
        return this;
    }
    
    /**
     * This parameter is reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalAttributes This parameter is reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LoadBalancerAttributes withAdditionalAttributes(java.util.Collection<AdditionalAttribute> additionalAttributes) {
        if (additionalAttributes == null) {
            this.additionalAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AdditionalAttribute> additionalAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AdditionalAttribute>(additionalAttributes.size());
            additionalAttributesCopy.addAll(additionalAttributes);
            this.additionalAttributes = additionalAttributesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCrossZoneLoadBalancing() != null) sb.append("CrossZoneLoadBalancing: " + getCrossZoneLoadBalancing() + ",");
        if (getAccessLog() != null) sb.append("AccessLog: " + getAccessLog() + ",");
        if (getConnectionDraining() != null) sb.append("ConnectionDraining: " + getConnectionDraining() + ",");
        if (getConnectionSettings() != null) sb.append("ConnectionSettings: " + getConnectionSettings() + ",");
        if (getAdditionalAttributes() != null) sb.append("AdditionalAttributes: " + getAdditionalAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCrossZoneLoadBalancing() == null) ? 0 : getCrossZoneLoadBalancing().hashCode()); 
        hashCode = prime * hashCode + ((getAccessLog() == null) ? 0 : getAccessLog().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionDraining() == null) ? 0 : getConnectionDraining().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionSettings() == null) ? 0 : getConnectionSettings().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LoadBalancerAttributes == false) return false;
        LoadBalancerAttributes other = (LoadBalancerAttributes)obj;
        
        if (other.getCrossZoneLoadBalancing() == null ^ this.getCrossZoneLoadBalancing() == null) return false;
        if (other.getCrossZoneLoadBalancing() != null && other.getCrossZoneLoadBalancing().equals(this.getCrossZoneLoadBalancing()) == false) return false; 
        if (other.getAccessLog() == null ^ this.getAccessLog() == null) return false;
        if (other.getAccessLog() != null && other.getAccessLog().equals(this.getAccessLog()) == false) return false; 
        if (other.getConnectionDraining() == null ^ this.getConnectionDraining() == null) return false;
        if (other.getConnectionDraining() != null && other.getConnectionDraining().equals(this.getConnectionDraining()) == false) return false; 
        if (other.getConnectionSettings() == null ^ this.getConnectionSettings() == null) return false;
        if (other.getConnectionSettings() != null && other.getConnectionSettings().equals(this.getConnectionSettings()) == false) return false; 
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null) return false;
        if (other.getAdditionalAttributes() != null && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false) return false; 
        return true;
    }
    
    @Override
    public LoadBalancerAttributes clone() {
        try {
            return (LoadBalancerAttributes) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    