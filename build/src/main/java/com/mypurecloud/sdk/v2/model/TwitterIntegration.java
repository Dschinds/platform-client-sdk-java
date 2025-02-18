package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * TwitterIntegration
 */

public class TwitterIntegration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String accessTokenKey = null;
  private String consumerKey = null;
  private String username = null;
  private String userId = null;
  private String status = null;

  /**
   * The type of twitter account to be used for the integration
   */
  public enum TierEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PREMIUM("premium"),
    ENTERPRISE("enterprise");

    private String value;

    TierEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TierEnum fromString(String key) {
      if (key == null) return null;

      for (TierEnum value : TierEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TierEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TierEnum tier = null;
  private String envName = null;
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
   * The name of the Twitter Integration
   **/
  public TwitterIntegration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Twitter Integration")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The Access Token Key from Twitter messenger
   **/
  public TwitterIntegration accessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Access Token Key from Twitter messenger")
  @JsonProperty("accessTokenKey")
  public String getAccessTokenKey() {
    return accessTokenKey;
  }
  public void setAccessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
  }

  
  /**
   * The Consumer Key from Twitter messenger
   **/
  public TwitterIntegration consumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Consumer Key from Twitter messenger")
  @JsonProperty("consumerKey")
  public String getConsumerKey() {
    return consumerKey;
  }
  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }

  
  /**
   * The Username from Twitter
   **/
  public TwitterIntegration username(String username) {
    this.username = username;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Username from Twitter")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * The UserId from Twitter
   **/
  public TwitterIntegration userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UserId from Twitter")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The status of the Twitter Integration
   **/
  public TwitterIntegration status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the Twitter Integration")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The type of twitter account to be used for the integration
   **/
  public TwitterIntegration tier(TierEnum tier) {
    this.tier = tier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of twitter account to be used for the integration")
  @JsonProperty("tier")
  public TierEnum getTier() {
    return tier;
  }
  public void setTier(TierEnum tier) {
    this.tier = tier;
  }

  
  /**
   * The Twitter environment name, e.g.: env-beta (required for premium tier)
   **/
  public TwitterIntegration envName(String envName) {
    this.envName = envName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Twitter environment name, e.g.: env-beta (required for premium tier)")
  @JsonProperty("envName")
  public String getEnvName() {
    return envName;
  }
  public void setEnvName(String envName) {
    this.envName = envName;
  }

  
  /**
   * The recipient associated to the Twitter Integration. This recipient is used to associate a flow to an integration
   **/
  public TwitterIntegration recipient(UriReference recipient) {
    this.recipient = recipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient associated to the Twitter Integration. This recipient is used to associate a flow to an integration")
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
  public TwitterIntegration dateCreated(Date dateCreated) {
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
  public TwitterIntegration dateModified(Date dateModified) {
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
  public TwitterIntegration createdBy(UriReference createdBy) {
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
  public TwitterIntegration modifiedBy(UriReference modifiedBy) {
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
  public TwitterIntegration version(Integer version) {
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
    TwitterIntegration twitterIntegration = (TwitterIntegration) o;
    return Objects.equals(this.id, twitterIntegration.id) &&
        Objects.equals(this.name, twitterIntegration.name) &&
        Objects.equals(this.accessTokenKey, twitterIntegration.accessTokenKey) &&
        Objects.equals(this.consumerKey, twitterIntegration.consumerKey) &&
        Objects.equals(this.username, twitterIntegration.username) &&
        Objects.equals(this.userId, twitterIntegration.userId) &&
        Objects.equals(this.status, twitterIntegration.status) &&
        Objects.equals(this.tier, twitterIntegration.tier) &&
        Objects.equals(this.envName, twitterIntegration.envName) &&
        Objects.equals(this.recipient, twitterIntegration.recipient) &&
        Objects.equals(this.dateCreated, twitterIntegration.dateCreated) &&
        Objects.equals(this.dateModified, twitterIntegration.dateModified) &&
        Objects.equals(this.createdBy, twitterIntegration.createdBy) &&
        Objects.equals(this.modifiedBy, twitterIntegration.modifiedBy) &&
        Objects.equals(this.version, twitterIntegration.version) &&
        Objects.equals(this.selfUri, twitterIntegration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accessTokenKey, consumerKey, username, userId, status, tier, envName, recipient, dateCreated, dateModified, createdBy, modifiedBy, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessTokenKey: ").append(toIndentedString(accessTokenKey)).append("\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
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

