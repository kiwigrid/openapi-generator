/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * 
 * @export
 */
export const OuterEnumDefaultValue = {
    Placed: 'placed',
    Approved: 'approved',
    Delivered: 'delivered'
} as const;
export type OuterEnumDefaultValue = typeof OuterEnumDefaultValue[keyof typeof OuterEnumDefaultValue];


export function OuterEnumDefaultValueFromJSON(json: any): OuterEnumDefaultValue {
    return OuterEnumDefaultValueFromJSONTyped(json, false);
}

export function OuterEnumDefaultValueFromJSONTyped(json: any, ignoreDiscriminator: boolean): OuterEnumDefaultValue {
    return json as OuterEnumDefaultValue;
}

export function OuterEnumDefaultValueToJSON(value?: OuterEnumDefaultValue | null): any {
    return value as any;
}

