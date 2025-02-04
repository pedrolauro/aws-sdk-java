/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing additional attributes related to a suppressed destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SuppressedDestinationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuppressedDestinationAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier of the message that caused the suppression of the email destination.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * A unique identifier of the suppression cause.
     * </p>
     */
    private String feedbackId;

    /**
     * <p>
     * A unique identifier of the message that caused the suppression of the email destination.
     * </p>
     * 
     * @param messageId
     *        A unique identifier of the message that caused the suppression of the email destination.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * A unique identifier of the message that caused the suppression of the email destination.
     * </p>
     * 
     * @return A unique identifier of the message that caused the suppression of the email destination.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * A unique identifier of the message that caused the suppression of the email destination.
     * </p>
     * 
     * @param messageId
     *        A unique identifier of the message that caused the suppression of the email destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuppressedDestinationAttributes withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the suppression cause.
     * </p>
     * 
     * @param feedbackId
     *        A unique identifier of the suppression cause.
     */

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * <p>
     * A unique identifier of the suppression cause.
     * </p>
     * 
     * @return A unique identifier of the suppression cause.
     */

    public String getFeedbackId() {
        return this.feedbackId;
    }

    /**
     * <p>
     * A unique identifier of the suppression cause.
     * </p>
     * 
     * @param feedbackId
     *        A unique identifier of the suppression cause.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuppressedDestinationAttributes withFeedbackId(String feedbackId) {
        setFeedbackId(feedbackId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getFeedbackId() != null)
            sb.append("FeedbackId: ").append(getFeedbackId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuppressedDestinationAttributes == false)
            return false;
        SuppressedDestinationAttributes other = (SuppressedDestinationAttributes) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getFeedbackId() == null ^ this.getFeedbackId() == null)
            return false;
        if (other.getFeedbackId() != null && other.getFeedbackId().equals(this.getFeedbackId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getFeedbackId() == null) ? 0 : getFeedbackId().hashCode());
        return hashCode;
    }

    @Override
    public SuppressedDestinationAttributes clone() {
        try {
            return (SuppressedDestinationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.SuppressedDestinationAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
