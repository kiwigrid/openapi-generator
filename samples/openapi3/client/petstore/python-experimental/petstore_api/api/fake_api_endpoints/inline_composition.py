# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import re  # noqa: F401
import sys  # noqa: F401
import typing
import urllib3
from urllib3._collections import HTTPHeaderDict

from petstore_api import api_client, exceptions
import decimal  # noqa: F401
from datetime import date, datetime  # noqa: F401
from frozendict import frozendict  # noqa: F401

from petstore_api.schemas import (  # noqa: F401
    AnyTypeSchema,
    ComposedSchema,
    DictSchema,
    ListSchema,
    StrSchema,
    IntSchema,
    Int32Schema,
    Int64Schema,
    Float32Schema,
    Float64Schema,
    NumberSchema,
    DateSchema,
    DateTimeSchema,
    DecimalSchema,
    BoolSchema,
    BinarySchema,
    NoneSchema,
    none_type,
    InstantiationMetadata,
    Unset,
    unset,
    ComposedBase,
    ListBase,
    DictBase,
    NoneBase,
    StrBase,
    IntBase,
    Int32Base,
    Int64Base,
    Float32Base,
    Float64Base,
    NumberBase,
    DateBase,
    DateTimeBase,
    BoolBase,
    BinaryBase,
    Schema,
    _SchemaValidator,
    _SchemaTypeChecker,
    _SchemaEnumMaker
)

from petstore_api.model.unknownbasetype import UNKNOWNBASETYPE
from petstore_api.model.composition_in_property import CompositionInProperty

# query params


class CompositionAtRootSchema(
    ComposedSchema
):

    @classmethod
    @property
    def _composed_schemas(cls):
        # we need this here to make our import statements work
        # we must store _composed_schemas in here so the code is only run
        # when we invoke this method. If we kept this at the class
        # level we would get an error because the class level
        # code would be run when this module is imported, and these composed
        # classes don't exist yet because their module has not finished
        # loading
        
        
        class allOf_0(
            _SchemaValidator(
                min_length=1,
            ),
            StrSchema
        ):
            pass
        return {
            'allOf': [
                allOf_0,
            ],
            'oneOf': [
            ],
            'anyOf': [
            ],
        }

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, str, date, datetime, int, float, decimal.Decimal, None, list, tuple, bytes],
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'CompositionAtRootSchema':
        return super().__new__(
            cls,
            *args,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )


class CompositionInPropertySchema(
    DictSchema
):
    
    
    class someProp(
        ComposedSchema
    ):
    
        @classmethod
        @property
        def _composed_schemas(cls):
            # we need this here to make our import statements work
            # we must store _composed_schemas in here so the code is only run
            # when we invoke this method. If we kept this at the class
            # level we would get an error because the class level
            # code would be run when this module is imported, and these composed
            # classes don't exist yet because their module has not finished
            # loading
            
            
            class allOf_0(
                _SchemaValidator(
                    min_length=1,
                ),
                StrSchema
            ):
                pass
            return {
                'allOf': [
                    allOf_0,
                ],
                'oneOf': [
                ],
                'anyOf': [
                ],
            }
    
        def __new__(
            cls,
            *args: typing.Union[dict, frozendict, str, date, datetime, int, float, decimal.Decimal, None, list, tuple, bytes],
            _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
            **kwargs: typing.Type[Schema],
        ) -> 'someProp':
            return super().__new__(
                cls,
                *args,
                _instantiation_metadata=_instantiation_metadata,
                **kwargs,
            )


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        someProp: typing.Union[someProp, Unset] = unset,
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'CompositionInPropertySchema':
        return super().__new__(
            cls,
            *args,
            someProp=someProp,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )
RequestRequiredQueryParams = typing.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing.TypedDict(
    'RequestOptionalQueryParams',
    {
        'compositionAtRoot': CompositionAtRootSchema,
        'compositionInProperty': CompositionInPropertySchema,
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


request_query_composition_at_root = api_client.QueryParameter(
    name="compositionAtRoot",
    style=api_client.ParameterStyle.FORM,
    schema=CompositionAtRootSchema,
    explode=True,
)
request_query_composition_in_property = api_client.QueryParameter(
    name="compositionInProperty",
    style=api_client.ParameterStyle.FORM,
    schema=CompositionInPropertySchema,
    explode=True,
)
# body param


class SchemaForRequestBodyApplicationJson(
    ComposedSchema
):

    @classmethod
    @property
    def _composed_schemas(cls):
        # we need this here to make our import statements work
        # we must store _composed_schemas in here so the code is only run
        # when we invoke this method. If we kept this at the class
        # level we would get an error because the class level
        # code would be run when this module is imported, and these composed
        # classes don't exist yet because their module has not finished
        # loading
        
        
        class allOf_0(
            _SchemaValidator(
                min_length=1,
            ),
            StrSchema
        ):
            pass
        return {
            'allOf': [
                allOf_0,
            ],
            'oneOf': [
            ],
            'anyOf': [
            ],
        }

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, str, date, datetime, int, float, decimal.Decimal, None, list, tuple, bytes],
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'SchemaForRequestBodyApplicationJson':
        return super().__new__(
            cls,
            *args,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )


class SchemaForRequestBodyMultipartFormData(
    DictSchema
):
    
    
    class someProp(
        ComposedSchema
    ):
    
        @classmethod
        @property
        def _composed_schemas(cls):
            # we need this here to make our import statements work
            # we must store _composed_schemas in here so the code is only run
            # when we invoke this method. If we kept this at the class
            # level we would get an error because the class level
            # code would be run when this module is imported, and these composed
            # classes don't exist yet because their module has not finished
            # loading
            
            
            class allOf_0(
                _SchemaValidator(
                    min_length=1,
                ),
                StrSchema
            ):
                pass
            return {
                'allOf': [
                    allOf_0,
                ],
                'oneOf': [
                ],
                'anyOf': [
                ],
            }
    
        def __new__(
            cls,
            *args: typing.Union[dict, frozendict, str, date, datetime, int, float, decimal.Decimal, None, list, tuple, bytes],
            _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
            **kwargs: typing.Type[Schema],
        ) -> 'someProp':
            return super().__new__(
                cls,
                *args,
                _instantiation_metadata=_instantiation_metadata,
                **kwargs,
            )


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        someProp: typing.Union[someProp, Unset] = unset,
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'SchemaForRequestBodyMultipartFormData':
        return super().__new__(
            cls,
            *args,
            someProp=someProp,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )


request_body_unknown_base_type = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationJson),
        'multipart/form-data': api_client.MediaType(
            schema=SchemaForRequestBodyMultipartFormData),
    },
)
_path = '/fake/inlineComposition/'
_method = 'POST'


class SchemaFor200ResponseBodyApplicationJson(
    ComposedSchema
):

    @classmethod
    @property
    def _composed_schemas(cls):
        # we need this here to make our import statements work
        # we must store _composed_schemas in here so the code is only run
        # when we invoke this method. If we kept this at the class
        # level we would get an error because the class level
        # code would be run when this module is imported, and these composed
        # classes don't exist yet because their module has not finished
        # loading
        
        
        class allOf_0(
            _SchemaValidator(
                min_length=1,
            ),
            StrSchema
        ):
            pass
        return {
            'allOf': [
                allOf_0,
            ],
            'oneOf': [
            ],
            'anyOf': [
            ],
        }

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, str, date, datetime, int, float, decimal.Decimal, None, list, tuple, bytes],
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'SchemaFor200ResponseBodyApplicationJson':
        return super().__new__(
            cls,
            *args,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )


class SchemaFor200ResponseBodyMultipartFormData(
    DictSchema
):
    
    
    class someProp(
        ComposedSchema
    ):
    
        @classmethod
        @property
        def _composed_schemas(cls):
            # we need this here to make our import statements work
            # we must store _composed_schemas in here so the code is only run
            # when we invoke this method. If we kept this at the class
            # level we would get an error because the class level
            # code would be run when this module is imported, and these composed
            # classes don't exist yet because their module has not finished
            # loading
            
            
            class allOf_0(
                _SchemaValidator(
                    min_length=1,
                ),
                StrSchema
            ):
                pass
            return {
                'allOf': [
                    allOf_0,
                ],
                'oneOf': [
                ],
                'anyOf': [
                ],
            }
    
        def __new__(
            cls,
            *args: typing.Union[dict, frozendict, str, date, datetime, int, float, decimal.Decimal, None, list, tuple, bytes],
            _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
            **kwargs: typing.Type[Schema],
        ) -> 'someProp':
            return super().__new__(
                cls,
                *args,
                _instantiation_metadata=_instantiation_metadata,
                **kwargs,
            )


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        someProp: typing.Union[someProp, Unset] = unset,
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'SchemaFor200ResponseBodyMultipartFormData':
        return super().__new__(
            cls,
            *args,
            someProp=someProp,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor200ResponseBodyApplicationJson,
        SchemaFor200ResponseBodyMultipartFormData,
    ]
    headers: Unset = unset


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
        'multipart/form-data': api_client.MediaType(
            schema=SchemaFor200ResponseBodyMultipartFormData),
    },
)
_status_code_to_response = {
    '200': _response_for_200,
}
_all_accept_content_types = (
    'application/json',
    'multipart/form-data',
)


class InlineComposition(api_client.Api):

    def inline_composition(
        self: api_client.Api,
        body: typing.Union[SchemaForRequestBodyApplicationJson, SchemaForRequestBodyMultipartFormData, Unset] = unset,
        query_params: RequestQueryParams = frozendict(),
        content_type: str = 'application/json',
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization
    ]:
        """
        testing composed schemas at inline locations
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs(RequestQueryParams, query_params)

        _query_params = []
        for parameter in (
            request_query_composition_at_root,
            request_query_composition_in_property,
        ):
            parameter_data = query_params.get(parameter.name, unset)
            if parameter_data is unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _query_params.extend(serialized_data)

        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)

        _fields = None
        _body = None
        if body is not unset:
            serialized_data = request_body_unknown_base_type.serialize(body, content_type)
            _headers.add('Content-Type', content_type)
            if 'fields' in serialized_data:
                _fields = serialized_data['fields']
            elif 'body' in serialized_data:
                _body = serialized_data['body']
        response = self.api_client.call_api(
            resource_path=_path,
            method=_method,
            query_params=tuple(_query_params),
            headers=_headers,
            fields=_fields,
            body=_body,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            api_response = api_client.ApiResponseWithoutDeserialization(response=response)
        else:
            response_for_status = _status_code_to_response.get(str(response.status))
            if response_for_status:
                api_response = response_for_status.deserialize(response, self.api_client.configuration)
            else:
                api_response = api_client.ApiResponseWithoutDeserialization(response=response)

        if not 200 <= response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)

        return api_response
