package ru.tinkoff.eacq.mma.shop.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import ru.tinkoff.eacq.mma.shop.api.model.ShortCategoriesResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Сокращенный список category
 */
@ApiModel(description = "Сокращенный список category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ShortCategories  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("categories")
  @Valid
  private List<ShortCategoriesResponse> categories = null;

  public ShortCategories categories(List<ShortCategoriesResponse> categories) {
    this.categories = categories;
    return this;
  }

  public ShortCategories addCategoriesItem(ShortCategoriesResponse categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ShortCategoriesResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<ShortCategoriesResponse> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortCategories shortCategories = (ShortCategories) o;
    return Objects.equals(this.categories, shortCategories.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortCategories {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

