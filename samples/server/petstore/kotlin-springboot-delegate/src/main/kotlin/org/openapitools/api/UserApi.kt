/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0-mp-1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package org.openapitools.api

import org.openapitools.model.User
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import io.swagger.annotations.Authorization
import io.swagger.annotations.AuthorizationScope
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@Validated
@Api(value = "user", description = "The user API")
@RequestMapping("\${api.base-path:/v2}")
interface UserApi {

    fun getDelegate(): UserApiDelegate = object: UserApiDelegate {}

    @ApiOperation(
        value = "Create user",
        nickname = "createUser",
        notes = "This can only be done by the logged in user.",
        authorizations = [Authorization(value = "api_key")])
    @ApiResponses(
        value = [ApiResponse(code = 200, message = "successful operation")])
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user"],
            consumes = ["application/json"]
    )
    fun createUser(@ApiParam(value = "Created user object" ,required=true ) @Valid @RequestBody user: User
): ResponseEntity<Unit> {
        return getDelegate().createUser(user);
    }

    @ApiOperation(
        value = "Creates list of users with given input array",
        nickname = "createUsersWithArrayInput",
        notes = "",
        authorizations = [Authorization(value = "api_key")])
    @ApiResponses(
        value = [ApiResponse(code = 200, message = "successful operation")])
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user/createWithArray"],
            consumes = ["application/json"]
    )
    fun createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true ) @Valid @RequestBody user: kotlin.collections.List<User>
): ResponseEntity<Unit> {
        return getDelegate().createUsersWithArrayInput(user);
    }

    @ApiOperation(
        value = "Creates list of users with given input array",
        nickname = "createUsersWithListInput",
        notes = "",
        authorizations = [Authorization(value = "api_key")])
    @ApiResponses(
        value = [ApiResponse(code = 200, message = "successful operation")])
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/user/createWithList"],
            consumes = ["application/json"]
    )
    fun createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true ) @Valid @RequestBody user: kotlin.collections.List<User>
): ResponseEntity<Unit> {
        return getDelegate().createUsersWithListInput(user);
    }

    @ApiOperation(
        value = "Delete user",
        nickname = "deleteUser",
        notes = "This can only be done by the logged in user.",
        authorizations = [Authorization(value = "api_key")])
    @ApiResponses(
        value = [ApiResponse(code = 400, message = "Invalid username supplied"),ApiResponse(code = 404, message = "User not found")])
    @RequestMapping(
            method = [RequestMethod.DELETE],
            value = ["/user/{username}"]
    )
    fun deleteUser(@ApiParam(value = "The name that needs to be deleted", required=true) @PathVariable("username") username: kotlin.String
): ResponseEntity<Unit> {
        return getDelegate().deleteUser(username);
    }

    @ApiOperation(
        value = "Get user by user name",
        nickname = "getUserByName",
        notes = "",
        response = User::class)
    @ApiResponses(
        value = [ApiResponse(code = 200, message = "successful operation", response = User::class),ApiResponse(code = 400, message = "Invalid username supplied"),ApiResponse(code = 404, message = "User not found")])
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user/{username}"],
            produces = ["application/xml", "application/json"]
    )
    fun getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.", required=true) @PathVariable("username") username: kotlin.String
): ResponseEntity<User> {
        return getDelegate().getUserByName(username);
    }

    @ApiOperation(
        value = "Logs user into the system",
        nickname = "loginUser",
        notes = "",
        response = kotlin.String::class)
    @ApiResponses(
        value = [ApiResponse(code = 200, message = "successful operation", response = kotlin.String::class),ApiResponse(code = 400, message = "Invalid username/password supplied")])
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user/login"],
            produces = ["application/xml", "application/json"]
    )
    fun loginUser(@NotNull @Pattern(regexp="^[a-zA-Z0-9]+[a-zA-Z0-9\\.\\-_]*[a-zA-Z0-9]+$") @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String
,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String
): ResponseEntity<kotlin.String> {
        return getDelegate().loginUser(username, password);
    }

    @ApiOperation(
        value = "Logs out current logged in user session",
        nickname = "logoutUser",
        notes = "",
        authorizations = [Authorization(value = "api_key")])
    @ApiResponses(
        value = [ApiResponse(code = 200, message = "successful operation")])
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/user/logout"]
    )
    fun logoutUser(): ResponseEntity<Unit> {
        return getDelegate().logoutUser();
    }

    @ApiOperation(
        value = "Updated user",
        nickname = "updateUser",
        notes = "This can only be done by the logged in user.",
        authorizations = [Authorization(value = "api_key")])
    @ApiResponses(
        value = [ApiResponse(code = 400, message = "Invalid user supplied"),ApiResponse(code = 404, message = "User not found")])
    @RequestMapping(
            method = [RequestMethod.PUT],
            value = ["/user/{username}"],
            consumes = ["application/json"]
    )
    fun updateUser(@ApiParam(value = "name that need to be deleted", required=true) @PathVariable("username") username: kotlin.String
,@ApiParam(value = "Updated user object" ,required=true ) @Valid @RequestBody user: User
): ResponseEntity<Unit> {
        return getDelegate().updateUser(username, user);
    }
}
