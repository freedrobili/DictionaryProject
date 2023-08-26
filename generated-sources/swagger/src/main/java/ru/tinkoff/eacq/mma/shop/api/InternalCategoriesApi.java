/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ru.tinkoff.eacq.mma.shop.api;

import ru.tinkoff.eacq.mma.shop.api.model.Categories;
import ru.tinkoff.eacq.mma.shop.api.model.CategoriesCreateRequest;
import ru.tinkoff.eacq.mma.shop.api.model.CategoriesResponse;
import ru.tinkoff.eacq.mma.shop.api.model.CategoriesSocialPropertiesResponse;
import ru.tinkoff.eacq.mma.shop.api.model.Error;
import ru.tinkoff.eacq.mma.shop.api.model.Error409;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "InternalCategories", description = "the InternalCategories API")
public interface InternalCategoriesApi {

    /**
     * GET /internal/api/v1/categories
     * Получение списка кодов МСС
     *
     * @param code код МСС (optional)
     * @param name Наименование продуктовой категории (optional)
     * @param viewToClients Флаг видимости клиентам (в ЛК) (optional)
     * @param viewToManagers Флаг видимости менеджерам (в ЛК) (optional)
     * @param needsDocs Флаг необходимости предоставления дополнительных документов (optional)
     * @param product Продукт, или список продуктов, по которым необходимы МСС (optional)
     * @param risky Флаг рисковости МСС (optional)
     * @return Список category (status code 200)
     *         or Bad request (status code 400)
     *         or Not found (status code 404)
     *         or Internal error (status code 500)
     * Описание на wiki
     * @see <a href="https://wiki.tcsbank.ru/pages/viewpage.action?pageId&#x3D;1252320851"> Documentation</a>
     */
    @ApiOperation(value = "", nickname = "internalApiV1CategoriesGet", notes = "Получение списка кодов МСС", response = Categories.class, tags={ "internal categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список category", response = Categories.class),
        @ApiResponse(code = 400, message = "Bad request", response = Error.class),
        @ApiResponse(code = 404, message = "Not found", response = Error.class),
        @ApiResponse(code = 500, message = "Internal error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/internal/api/v1/categories",
        produces = { "application/json" }
    )
    ResponseEntity<Categories> _internalApiV1CategoriesGet(@Pattern(regexp = "^[0-9]{4}$") @ApiParam(value = "код МСС") @Valid @RequestParam(value = "code", required = false) String code,@Size(min = 1, max = 255) @ApiParam(value = "Наименование продуктовой категории") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "Флаг видимости клиентам (в ЛК)") @Valid @RequestParam(value = "viewToClients", required = false) Boolean viewToClients,@ApiParam(value = "Флаг видимости менеджерам (в ЛК)") @Valid @RequestParam(value = "viewToManagers", required = false) Boolean viewToManagers,@ApiParam(value = "Флаг необходимости предоставления дополнительных документов") @Valid @RequestParam(value = "needsDocs", required = false) Boolean needsDocs,@ApiParam(value = "Продукт, или список продуктов, по которым необходимы МСС", allowableValues = "ecom, a2c, c2a, safeDeal") @Valid @RequestParam(value = "product", required = false) String product,@ApiParam(value = "Флаг рисковости МСС") @Valid @RequestParam(value = "risky", required = false) Boolean risky);


    /**
     * POST /internal/api/v1/categories/{productName}
     *
     * @param productName Продукт по которому необходимы МСС (required)
     * @param categoriesCreateRequest Тело запроса создания МСС (optional)
     * @return объект category с полным перечнем реквизитов (status code 201)
     *         or Bad request (status code 400)
     *         or Conflict (status code 409)
     *         or Internal error (status code 500)
     * Описание на wiki
     * @see <a href="https://wiki.tcsbank.ru/pages/viewpage.action?pageId&#x3D;1254823891"> Documentation</a>
     */
    @ApiOperation(value = "", nickname = "internalApiV1CategoriesProductNamePost", notes = "", response = CategoriesResponse.class, tags={ "internal categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "объект category с полным перечнем реквизитов", response = CategoriesResponse.class),
        @ApiResponse(code = 400, message = "Bad request", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error409.class),
        @ApiResponse(code = 500, message = "Internal error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/internal/api/v1/categories/{productName}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CategoriesResponse> _internalApiV1CategoriesProductNamePost(@ApiParam(value = "Продукт по которому необходимы МСС", required = true, allowableValues = "ecom, a2c, c2a, safeDeal") @PathVariable("productName") String productName,@ApiParam(value = "Тело запроса создания МСС") @Valid @RequestBody(required = false) CategoriesCreateRequest categoriesCreateRequest);


    /**
     * GET /internal/api/v1/socialCategories/{categoryCode}
     *
     * @param categoryCode код МСС (required)
     * @return характеристики социальности МСС (status code 200)
     *         or Bad request (status code 400)
     *         or Conflict (status code 409)
     *         or Internal error (status code 500)
     * Описание на wiki
     * @see <a href="https://wiki.tcsbank.ru/pages/viewpage.action?pageId&#x3D;1517426071"> Documentation</a>
     */
    @ApiOperation(value = "", nickname = "internalApiV1SocialCategoriesCategoryCodeGet", notes = "", response = CategoriesSocialPropertiesResponse.class, tags={ "internal categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "характеристики социальности МСС", response = CategoriesSocialPropertiesResponse.class),
        @ApiResponse(code = 400, message = "Bad request", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error409.class),
        @ApiResponse(code = 500, message = "Internal error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/internal/api/v1/socialCategories/{categoryCode}",
        produces = { "application/json" }
    )
    ResponseEntity<CategoriesSocialPropertiesResponse> _internalApiV1SocialCategoriesCategoryCodeGet(@Pattern(regexp = "^[0-9]{4}$") @ApiParam(value = "код МСС", required = true) @PathVariable("categoryCode") String categoryCode);

}
