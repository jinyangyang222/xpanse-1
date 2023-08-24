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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Response
 */
@JsonPropertyOrder({
  Response.JSON_PROPERTY_RESULT_TYPE,
  Response.JSON_PROPERTY_DETAILS,
  Response.JSON_PROPERTY_SUCCESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-24T09:52:10.012096600+08:00[Asia/Shanghai]")
public class Response {
  /**
   * The result code of response.
   */
  public enum ResultTypeEnum {
    SUCCESS("Success"),
    
    RUNTIME_ERROR("Runtime Error"),
    
    PARAMETERS_INVALID("Parameters Invalid"),
    
    TERRAFORM_SCRIPT_INVALID("Terraform Script Invalid"),
    
    UNPROCESSABLE_ENTITY("Unprocessable Entity"),
    
    RESPONSE_NOT_VALID("Response Not Valid"),
    
    FAILURE_WHILE_CONNECTING_TO_BACKEND("Failure while connecting to backend"),
    
    CREDENTIAL_CAPABILITY_NOT_FOUND("Credential Capability Not Found"),
    
    CREDENTIALS_NOT_FOUND("Credentials Not Found"),
    
    CREDENTIAL_VARIABLES_NOT_COMPLETE("Credential Variables Not Complete"),
    
    FLAVOR_INVALID("Flavor Invalid"),
    
    TERRAFORM_EXECUTION_FAILED("Terraform Execution Failed"),
    
    PLUGIN_NOT_FOUND("Plugin Not Found"),
    
    DEPLOYER_NOT_FOUND("Deployer Not Found"),
    
    TERRAFORM_PROVIDER_NOT_FOUND("Terraform Provider Not Found"),
    
    NO_CREDENTIAL_DEFINITION_AVAILABLE("No Credential Definition Available"),
    
    INVALID_SERVICE_STATE("Invalid Service State"),
    
    RESOURCE_INVALID_FOR_MONITORING("Resource Invalid For Monitoring"),
    
    UNHANDLED_EXCEPTION("Unhandled Exception"),
    
    SERVICE_ALREADY_REGISTERED("Service Already Registered"),
    
    ICON_PROCESSING_FAILED("Icon Processing Failed"),
    
    SERVICE_NOT_REGISTERED("Service Not Registered"),
    
    SERVICE_DEPLOYMENT_NOT_FOUND("Service Deployment Not Found"),
    
    RESOURCE_NOT_FOUND("Resource Not Found"),
    
    DEPLOYMENT_VARIABLE_INVALID("Deployment Variable Invalid"),
    
    SERVICE_UPDATE_NOT_ALLOWED("Service Update Not Allowed"),
    
    UNAUTHORIZED("Unauthorized"),
    
    ACCESS_DENIED("Access Denied"),
    
    SENSITIVE_FIELD_ENCRYPTION_OR_DECRYPTION_FAILED_EXCEPTION("Sensitive Field Encryption Or Decryption Failed Exception"),
    
    UNSUPPORTED_ENUM_VALUE("Unsupported Enum Value");

    private String value;

    ResultTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultTypeEnum fromValue(String value) {
      for (ResultTypeEnum b : ResultTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESULT_TYPE = "resultType";
  private ResultTypeEnum resultType;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<String> details = new ArrayList<>();

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public Response() {
  }

  public Response resultType(ResultTypeEnum resultType) {
    
    this.resultType = resultType;
    return this;
  }

   /**
   * The result code of response.
   * @return resultType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESULT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResultTypeEnum getResultType() {
    return resultType;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultType(ResultTypeEnum resultType) {
    this.resultType = resultType;
  }


  public Response details(List<String> details) {
    
    this.details = details;
    return this;
  }

  public Response addDetailsItem(String detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Details of the errors occurred
   * @return details
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetails(List<String> details) {
    this.details = details;
  }


  public Response success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Describes if the request is successful
   * @return success
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.resultType, response.resultType) &&
        Objects.equals(this.details, response.details) &&
        Objects.equals(this.success, response.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultType, details, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

