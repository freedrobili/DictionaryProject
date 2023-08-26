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
 * Объект МСС
 */
@ApiModel(description = "Объект МСС")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ShortCategoriesResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("code")
  private String code;

  @JsonProperty("name")
  private String name;

  @JsonProperty("needsDocs")
  private Boolean needsDocs;

  @JsonProperty("needsDocsReason")
  private String needsDocsReason;

  @JsonProperty("needsDocsList")
  private String needsDocsList;

  public ShortCategoriesResponse code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Код МСС
   * @return code
  */
  @ApiModelProperty(required = true, value = "Код МСС")
  @NotNull

@Pattern(regexp = "^[0-9]{4}$") 
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ShortCategoriesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Наименонование продуктовой категории
   * @return name
  */
  @ApiModelProperty(required = true, value = "Наименонование продуктовой категории")
  @NotNull

@Size(min = 1, max = 255) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShortCategoriesResponse needsDocs(Boolean needsDocs) {
    this.needsDocs = needsDocs;
    return this;
  }

  /**
   * Флаг необходимости предоставления подтверждающих документов
   * @return needsDocs
  */
  @ApiModelProperty(required = true, value = "Флаг необходимости предоставления подтверждающих документов")
  @NotNull


  public Boolean getNeedsDocs() {
    return needsDocs;
  }

  public void setNeedsDocs(Boolean needsDocs) {
    this.needsDocs = needsDocs;
  }

  public ShortCategoriesResponse needsDocsReason(String needsDocsReason) {
    this.needsDocsReason = needsDocsReason;
    return this;
  }

  /**
   * Дополнительное условие необходимости предоставления подтверждающих документов
   * @return needsDocsReason
  */
  @ApiModelProperty(value = "Дополнительное условие необходимости предоставления подтверждающих документов")

@Size(max = 255) 
  public String getNeedsDocsReason() {
    return needsDocsReason;
  }

  public void setNeedsDocsReason(String needsDocsReason) {
    this.needsDocsReason = needsDocsReason;
  }

  public ShortCategoriesResponse needsDocsList(String needsDocsList) {
    this.needsDocsList = needsDocsList;
    return this;
  }

  /**
   * Список подтвержадющих документов
   * @return needsDocsList
  */
  @ApiModelProperty(value = "Список подтвержадющих документов")

@Size(max = 255) 
  public String getNeedsDocsList() {
    return needsDocsList;
  }

  public void setNeedsDocsList(String needsDocsList) {
    this.needsDocsList = needsDocsList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortCategoriesResponse shortCategoriesResponse = (ShortCategoriesResponse) o;
    return Objects.equals(this.code, shortCategoriesResponse.code) &&
        Objects.equals(this.name, shortCategoriesResponse.name) &&
        Objects.equals(this.needsDocs, shortCategoriesResponse.needsDocs) &&
        Objects.equals(this.needsDocsReason, shortCategoriesResponse.needsDocsReason) &&
        Objects.equals(this.needsDocsList, shortCategoriesResponse.needsDocsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, needsDocs, needsDocsReason, needsDocsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortCategoriesResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needsDocs: ").append(toIndentedString(needsDocs)).append("\n");
    sb.append("    needsDocsReason: ").append(toIndentedString(needsDocsReason)).append("\n");
    sb.append("    needsDocsList: ").append(toIndentedString(needsDocsList)).append("\n");
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

