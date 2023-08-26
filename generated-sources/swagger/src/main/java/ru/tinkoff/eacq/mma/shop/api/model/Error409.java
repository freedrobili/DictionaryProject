package ru.tinkoff.eacq.mma.shop.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error409
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Error409  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("description")
  private String description;

  @JsonProperty("resourceId")
  private String resourceId;

  public Error409 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный UUID для логов и отладки
   * @return id
  */
  @ApiModelProperty(required = true, value = "Уникальный UUID для логов и отладки")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Error409 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Код ошибки текстом
   * @return code
  */
  @ApiModelProperty(required = true, value = "Код ошибки текстом")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error409 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Описание ошибки для разработчиков
   * @return message
  */
  @ApiModelProperty(required = true, value = "Описание ошибки для разработчиков")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error409 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибки для пользователей
   * @return description
  */
  @ApiModelProperty(value = "Описание ошибки для пользователей")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Error409 resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Идентификатор сущности
   * @return resourceId
  */
  @ApiModelProperty(required = true, value = "Идентификатор сущности")
  @NotNull


  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error409 error409 = (Error409) o;
    return Objects.equals(this.id, error409.id) &&
        Objects.equals(this.code, error409.code) &&
        Objects.equals(this.message, error409.message) &&
        Objects.equals(this.description, error409.description) &&
        Objects.equals(this.resourceId, error409.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, message, description, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error409 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

