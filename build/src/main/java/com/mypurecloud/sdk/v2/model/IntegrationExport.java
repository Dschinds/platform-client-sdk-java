package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntegrationExport
 */

public class IntegrationExport  implements Serializable {
  
  private UriReference integration = null;
  private Boolean shouldExportScreenRecordings = null;

  
  /**
   * The aws-s3-recording-bulk-actions-integration that the policy uses for exports.
   **/
  public IntegrationExport integration(UriReference integration) {
    this.integration = integration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The aws-s3-recording-bulk-actions-integration that the policy uses for exports.")
  @JsonProperty("integration")
  public UriReference getIntegration() {
    return integration;
  }
  public void setIntegration(UriReference integration) {
    this.integration = integration;
  }

  
  /**
   * True if the policy should export screen recordings in addition to the other conversation media. Default = true
   **/
  public IntegrationExport shouldExportScreenRecordings(Boolean shouldExportScreenRecordings) {
    this.shouldExportScreenRecordings = shouldExportScreenRecordings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the policy should export screen recordings in addition to the other conversation media. Default = true")
  @JsonProperty("shouldExportScreenRecordings")
  public Boolean getShouldExportScreenRecordings() {
    return shouldExportScreenRecordings;
  }
  public void setShouldExportScreenRecordings(Boolean shouldExportScreenRecordings) {
    this.shouldExportScreenRecordings = shouldExportScreenRecordings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationExport integrationExport = (IntegrationExport) o;
    return Objects.equals(this.integration, integrationExport.integration) &&
        Objects.equals(this.shouldExportScreenRecordings, integrationExport.shouldExportScreenRecordings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integration, shouldExportScreenRecordings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationExport {\n");
    
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    shouldExportScreenRecordings: ").append(toIndentedString(shouldExportScreenRecordings)).append("\n");
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

