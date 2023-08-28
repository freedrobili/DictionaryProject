package ru.tinkoff.eacq.mma.dictionary.rest.model;

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
 * Тело запроса на создание МСС
 */
@ApiModel(description = "Тело запроса на создание МСС")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CategoriesCreateRequest  implements Serializable {
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

  @JsonProperty("viewToClients")
  private Boolean viewToClients;

  @JsonProperty("viewToManagers")
  private Boolean viewToManagers;

  @JsonProperty("risky")
  private Boolean risky;

  public CategoriesCreateRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Код category
   * @return code
  */
  @ApiModelProperty(required = true, value = "Код category")
  @NotNull

@Pattern(regexp = "^[0-9]{4}$") 
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CategoriesCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Наименование продуктовой категории
   * @return name
  */
  @ApiModelProperty(required = true, value = "Наименование продуктовой категории")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoriesCreateRequest needsDocs(Boolean needsDocs) {
    this.needsDocs = needsDocs;
    return this;
  }

  /**
   * Флаг необходимости предоставления дополнительных документов
   * @return needsDocs
  */
  @ApiModelProperty(required = true, value = "Флаг необходимости предоставления дополнительных документов")
  @NotNull


  public Boolean getNeedsDocs() {
    return needsDocs;
  }

  public void setNeedsDocs(Boolean needsDocs) {
    this.needsDocs = needsDocs;
  }

  public CategoriesCreateRequest needsDocsReason(String needsDocsReason) {
    this.needsDocsReason = needsDocsReason;
    return this;
  }

  /**
   * Причина необходимости предоставления дополнительных документов
   * @return needsDocsReason
  */
  @ApiModelProperty(value = "Причина необходимости предоставления дополнительных документов")


  public String getNeedsDocsReason() {
    return needsDocsReason;
  }

  public void setNeedsDocsReason(String needsDocsReason) {
    this.needsDocsReason = needsDocsReason;
  }

  public CategoriesCreateRequest needsDocsList(String needsDocsList) {
    this.needsDocsList = needsDocsList;
    return this;
  }

  /**
   * Список дополнительных документов
   * @return needsDocsList
  */
  @ApiModelProperty(value = "Список дополнительных документов")


  public String getNeedsDocsList() {
    return needsDocsList;
  }

  public void setNeedsDocsList(String needsDocsList) {
    this.needsDocsList = needsDocsList;
  }

  public CategoriesCreateRequest viewToClients(Boolean viewToClients) {
    this.viewToClients = viewToClients;
    return this;
  }

  /**
   * Флаг видимости клиентам (в ЛК)
   * @return viewToClients
  */
  @ApiModelProperty(required = true, value = "Флаг видимости клиентам (в ЛК)")
  @NotNull


  public Boolean getViewToClients() {
    return viewToClients;
  }

  public void setViewToClients(Boolean viewToClients) {
    this.viewToClients = viewToClients;
  }

  public CategoriesCreateRequest viewToManagers(Boolean viewToManagers) {
    this.viewToManagers = viewToManagers;
    return this;
  }

  /**
   * Флаг видимости менеджерам (в Админке)
   * @return viewToManagers
  */
  @ApiModelProperty(required = true, value = "Флаг видимости менеджерам (в Админке)")
  @NotNull


  public Boolean getViewToManagers() {
    return viewToManagers;
  }

  public void setViewToManagers(Boolean viewToManagers) {
    this.viewToManagers = viewToManagers;
  }

  public CategoriesCreateRequest risky(Boolean risky) {
    this.risky = risky;
    return this;
  }

  /**
   * Флаг рисковости
   * @return risky
  */
  @ApiModelProperty(required = true, value = "Флаг рисковости")
  @NotNull


  public Boolean getRisky() {
    return risky;
  }

  public void setRisky(Boolean risky) {
    this.risky = risky;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoriesCreateRequest categoriesCreateRequest = (CategoriesCreateRequest) o;
    return Objects.equals(this.code, categoriesCreateRequest.code) &&
        Objects.equals(this.name, categoriesCreateRequest.name) &&
        Objects.equals(this.needsDocs, categoriesCreateRequest.needsDocs) &&
        Objects.equals(this.needsDocsReason, categoriesCreateRequest.needsDocsReason) &&
        Objects.equals(this.needsDocsList, categoriesCreateRequest.needsDocsList) &&
        Objects.equals(this.viewToClients, categoriesCreateRequest.viewToClients) &&
        Objects.equals(this.viewToManagers, categoriesCreateRequest.viewToManagers) &&
        Objects.equals(this.risky, categoriesCreateRequest.risky);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, needsDocs, needsDocsReason, needsDocsList, viewToClients, viewToManagers, risky);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoriesCreateRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needsDocs: ").append(toIndentedString(needsDocs)).append("\n");
    sb.append("    needsDocsReason: ").append(toIndentedString(needsDocsReason)).append("\n");
    sb.append("    needsDocsList: ").append(toIndentedString(needsDocsList)).append("\n");
    sb.append("    viewToClients: ").append(toIndentedString(viewToClients)).append("\n");
    sb.append("    viewToManagers: ").append(toIndentedString(viewToManagers)).append("\n");
    sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
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

