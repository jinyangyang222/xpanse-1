/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.model.WebhookConfig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TerraformAsyncDeployRequest
 */
@JsonPropertyOrder({
  TerraformAsyncDeployRequest.JSON_PROPERTY_IS_PLAN_ONLY,
  TerraformAsyncDeployRequest.JSON_PROPERTY_VARIABLES,
  TerraformAsyncDeployRequest.JSON_PROPERTY_ENV_VARIABLES,
  TerraformAsyncDeployRequest.JSON_PROPERTY_WEBHOOK_CONFIG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-24T09:52:10.012096600+08:00[Asia/Shanghai]")
public class TerraformAsyncDeployRequest {
  public static final String JSON_PROPERTY_IS_PLAN_ONLY = "isPlanOnly";
  private Boolean isPlanOnly;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private Map<String, Object> variables = new HashMap<>();

  public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
  private Map<String, String> envVariables = new HashMap<>();

  public static final String JSON_PROPERTY_WEBHOOK_CONFIG = "webhookConfig";
  private WebhookConfig webhookConfig;

  public TerraformAsyncDeployRequest() {
  }

  public TerraformAsyncDeployRequest isPlanOnly(Boolean isPlanOnly) {
    
    this.isPlanOnly = isPlanOnly;
    return this;
  }

   /**
   * Flag to control if the deployment must only generate the terraform or it must also apply the changes.
   * @return isPlanOnly
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_PLAN_ONLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPlanOnly() {
    return isPlanOnly;
  }


  @JsonProperty(JSON_PROPERTY_IS_PLAN_ONLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPlanOnly(Boolean isPlanOnly) {
    this.isPlanOnly = isPlanOnly;
  }


  public TerraformAsyncDeployRequest variables(Map<String, Object> variables) {
    
    this.variables = variables;
    return this;
  }

  public TerraformAsyncDeployRequest putVariablesItem(String key, Object variablesItem) {
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Key-value pairs of variables that must be used to execute the Terraform request.
   * @return variables
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getVariables() {
    return variables;
  }


  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVariables(Map<String, Object> variables) {
    this.variables = variables;
  }


  public TerraformAsyncDeployRequest envVariables(Map<String, String> envVariables) {
    
    this.envVariables = envVariables;
    return this;
  }

  public TerraformAsyncDeployRequest putEnvVariablesItem(String key, String envVariablesItem) {
    if (this.envVariables == null) {
      this.envVariables = new HashMap<>();
    }
    this.envVariables.put(key, envVariablesItem);
    return this;
  }

   /**
   * Key-value pairs of variables that must be injected as environment variables to terraform process.
   * @return envVariables
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getEnvVariables() {
    return envVariables;
  }


  @JsonProperty(JSON_PROPERTY_ENV_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvVariables(Map<String, String> envVariables) {
    this.envVariables = envVariables;
  }


  public TerraformAsyncDeployRequest webhookConfig(WebhookConfig webhookConfig) {
    
    this.webhookConfig = webhookConfig;
    return this;
  }

   /**
   * Get webhookConfig
   * @return webhookConfig
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WebhookConfig getWebhookConfig() {
    return webhookConfig;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebhookConfig(WebhookConfig webhookConfig) {
    this.webhookConfig = webhookConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerraformAsyncDeployRequest terraformAsyncDeployRequest = (TerraformAsyncDeployRequest) o;
    return Objects.equals(this.isPlanOnly, terraformAsyncDeployRequest.isPlanOnly) &&
        Objects.equals(this.variables, terraformAsyncDeployRequest.variables) &&
        Objects.equals(this.envVariables, terraformAsyncDeployRequest.envVariables) &&
        Objects.equals(this.webhookConfig, terraformAsyncDeployRequest.webhookConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPlanOnly, variables, envVariables, webhookConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerraformAsyncDeployRequest {\n");
    sb.append("    isPlanOnly: ").append(toIndentedString(isPlanOnly)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    envVariables: ").append(toIndentedString(envVariables)).append("\n");
    sb.append("    webhookConfig: ").append(toIndentedString(webhookConfig)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

