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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Requests Amazon API Gateway to change information about a <a>Stage</a>
 * resource.
 * </p>
 */
public class UpdateStageRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     * resource to change information about.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the <a>Stage</a> resource to change information about.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     */
    private java.util.List<PatchOperation> patchOperations;

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     * resource to change information about.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     *        resource to change information about.
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     * resource to change information about.
     * </p>
     * 
     * @return The identifier of the <a>RestApi</a> resource for the
     *         <a>Stage</a> resource to change information about.
     */
    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     * resource to change information about.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     *        resource to change information about.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateStageRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource to change information about.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> resource to change information about.
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource to change information about.
     * </p>
     * 
     * @return The name of the <a>Stage</a> resource to change information
     *         about.
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource to change information about.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> resource to change information about.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateStageRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     * 
     * @return A list of operations describing the updates to apply to the
     *         specified resource. The patches are applied in the order
     *         specified in the list.
     */
    public java.util.List<PatchOperation> getPatchOperations() {
        return patchOperations;
    }

    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     * 
     * @param patchOperations
     *        A list of operations describing the updates to apply to the
     *        specified resource. The patches are applied in the order specified
     *        in the list.
     */
    public void setPatchOperations(
            java.util.Collection<PatchOperation> patchOperations) {
        if (patchOperations == null) {
            this.patchOperations = null;
            return;
        }

        this.patchOperations = new java.util.ArrayList<PatchOperation>(
                patchOperations);
    }

    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPatchOperations(java.util.Collection)} or
     * {@link #withPatchOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param patchOperations
     *        A list of operations describing the updates to apply to the
     *        specified resource. The patches are applied in the order specified
     *        in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateStageRequest withPatchOperations(
            PatchOperation... patchOperations) {
        if (this.patchOperations == null) {
            setPatchOperations(new java.util.ArrayList<PatchOperation>(
                    patchOperations.length));
        }
        for (PatchOperation ele : patchOperations) {
            this.patchOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     * 
     * @param patchOperations
     *        A list of operations describing the updates to apply to the
     *        specified resource. The patches are applied in the order specified
     *        in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateStageRequest withPatchOperations(
            java.util.Collection<PatchOperation> patchOperations) {
        setPatchOperations(patchOperations);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getStageName() != null)
            sb.append("StageName: " + getStageName() + ",");
        if (getPatchOperations() != null)
            sb.append("PatchOperations: " + getPatchOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStageRequest == false)
            return false;
        UpdateStageRequest other = (UpdateStageRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null
                && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getPatchOperations() == null
                ^ this.getPatchOperations() == null)
            return false;
        if (other.getPatchOperations() != null
                && other.getPatchOperations().equals(this.getPatchOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode
                + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPatchOperations() == null) ? 0 : getPatchOperations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateStageRequest clone() {
        return (UpdateStageRequest) super.clone();
    }
}