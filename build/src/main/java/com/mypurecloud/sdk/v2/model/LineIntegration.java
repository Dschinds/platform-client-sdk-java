package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * LineIntegration
 */

public class LineIntegration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String channelId = null;
  private String webhookUri = null;
  private String status = null;
  private UriReference recipient = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private UriReference createdBy = null;
  private UriReference modifiedBy = null;
  private Integer version = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", required = true, value = "A unique Integration Id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the LINE Integration
   **/
  public LineIntegration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the LINE Integration")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The Channel Id from LINE messenger
   **/
  public LineIntegration channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Channel Id from LINE messenger")
  @JsonProperty("channelId")
  public String getChannelId() {
    return channelId;
  }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  
  /**
   * The Webhook URI to be updated in LINE platform
   **/
  public LineIntegration webhookUri(String webhookUri) {
    this.webhookUri = webhookUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Webhook URI to be updated in LINE platform")
  @JsonProperty("webhookUri")
  public String getWebhookUri() {
    return webhookUri;
  }
  public void setWebhookUri(String webhookUri) {
    this.webhookUri = webhookUri;
  }

  
  /**
   * The status of the LINE Integration
   **/
  public LineIntegration status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the LINE Integration")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The recipient associated to the Line Integration. This recipient is used to associate a flow to an integration
   **/
  public LineIntegration recipient(UriReference recipient) {
    this.recipient = recipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient associated to the Line Integration. This recipient is used to associate a flow to an integration")
  @JsonProperty("recipient")
  public UriReference getRecipient() {
    return recipient;
  }
  public void setRecipient(UriReference recipient) {
    this.recipient = recipient;
  }

  
  /**
   * Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public LineIntegration dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date this Integration was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public LineIntegration dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this Integration was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * User reference that created this Integration
   **/
  public LineIntegration createdBy(UriReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User reference that created this Integration")
  @JsonProperty("createdBy")
  public UriReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UriReference createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * User reference that last modified this Integration
   **/
  public LineIntegration modifiedBy(UriReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User reference that last modified this Integration")
  @JsonProperty("modifiedBy")
  public UriReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UriReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * Version number required for updates.
   **/
  public LineIntegration version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version number required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineIntegration lineIntegration = (LineIntegration) o;
    return Objects.equals(this.id, lineIntegration.id) &&
        Objects.equals(this.name, lineIntegration.name) &&
        Objects.equals(this.channelId, lineIntegration.channelId) &&
        Objects.equals(this.webhookUri, lineIntegration.webhookUri) &&
        Objects.equals(this.status, lineIntegration.status) &&
        Objects.equals(this.recipient, lineIntegration.recipient) &&
        Objects.equals(this.dateCreated, lineIntegration.dateCreated) &&
        Objects.equals(this.dateModified, lineIntegration.dateModified) &&
        Objects.equals(this.createdBy, lineIntegration.createdBy) &&
        Objects.equals(this.modifiedBy, lineIntegration.modifiedBy) &&
        Objects.equals(this.version, lineIntegration.version) &&
        Objects.equals(this.selfUri, lineIntegration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, channelId, webhookUri, status, recipient, dateCreated, dateModified, createdBy, modifiedBy, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    webhookUri: ").append(toIndentedString(webhookUri)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

