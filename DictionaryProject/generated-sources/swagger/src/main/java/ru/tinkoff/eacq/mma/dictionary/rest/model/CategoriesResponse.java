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
 * Объект МСС
 */
@ApiModel(description = "Объект МСС")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CategoriesResponse  implements Serializable {
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

  @JsonProperty("product")
  private String product;

  @JsonProperty("risky")
  private Boolean risky;

  public CategoriesResponse code(String code) {
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

  public CategoriesResponse name(String name) {
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

  public CategoriesResponse needsDocs(Boolean needsDocs) {
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

  public CategoriesResponse needsDocsReason(String needsDocsReason) {
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

  public CategoriesResponse needsDocsList(String needsDocsList) {
    this.needsDocsList = needsDocsList;
    return this;
  }

  /**
   * Список подтверждающих документов
   * @return needsDocsList
  */
  @ApiModelProperty(value = "Список подтверждающих документов")

@Size(max = 255) 
  public String getNeedsDocsList() {
    return needsDocsList;
  }

  public void setNeedsDocsList(String needsDocsList) {
    this.needsDocsList = needsDocsList;
  }

  public CategoriesResponse viewToClients(Boolean viewToClients) {
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

  public CategoriesResponse viewToManagers(Boolean viewToManagers) {
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

  public CategoriesResponse product(String product) {
    this.product = product;
    return this;
  }

  /**
   * Принадлежность к продуктовой категории
   * @return product
  */
  @ApiModelProperty(required = true, value = "Принадлежность к продуктовой категории")
  @NotNull


  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public CategoriesResponse risky(Boolean risky) {
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
    CategoriesResponse categoriesResponse = (CategoriesResponse) o;
    return Objects.equals(this.code, categoriesResponse.code) &&
        Objects.equals(this.name, categoriesResponse.name) &&
        Objects.equals(this.needsDocs, categoriesResponse.needsDocs) &&
        Objects.equals(this.needsDocsReason, categoriesResponse.needsDocsReason) &&
        Objects.equals(this.needsDocsList, categoriesResponse.needsDocsList) &&
        Objects.equals(this.viewToClients, categoriesResponse.viewToClients) &&
        Objects.equals(this.viewToManagers, categoriesResponse.viewToManagers) &&
        Objects.equals(this.product, categoriesResponse.product) &&
        Objects.equals(this.risky, categoriesResponse.risky);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, needsDocs, needsDocsReason, needsDocsList, viewToClients, viewToManagers, product, risky);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoriesResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needsDocs: ").append(toIndentedString(needsDocs)).append("\n");
    sb.append("    needsDocsReason: ").append(toIndentedString(needsDocsReason)).append("\n");
    sb.append("    needsDocsList: ").append(toIndentedString(needsDocsList)).append("\n");
    sb.append("    viewToClients: ").append(toIndentedString(viewToClients)).append("\n");
    sb.append("    viewToManagers: ").append(toIndentedString(viewToManagers)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

