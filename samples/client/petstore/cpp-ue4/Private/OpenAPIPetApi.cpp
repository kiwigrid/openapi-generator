/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPIPetApi.h"

#include "OpenAPIPetApiOperations.h"
#include "OpenAPIModule.h"

#include "HttpModule.h"
#include "Serialization/JsonSerializer.h"

namespace OpenAPI
{

OpenAPIPetApi::OpenAPIPetApi()
: Url(TEXT("http://petstore.swagger.io/v2"))
{
}

OpenAPIPetApi::~OpenAPIPetApi() {}

void OpenAPIPetApi::SetURL(const FString& InUrl)
{
	Url = InUrl;
}

void OpenAPIPetApi::AddHeaderParam(const FString& Key, const FString& Value)
{
	AdditionalHeaderParams.Add(Key, Value);
}

void OpenAPIPetApi::ClearHeaderParams()
{
	AdditionalHeaderParams.Reset();
}

bool OpenAPIPetApi::IsValid() const
{
	if (Url.IsEmpty())
	{
		UE_LOG(LogOpenAPI, Error, TEXT("OpenAPIPetApi: Endpoint Url is not set, request cannot be performed"));
		return false;
	}

	return true;
}

void OpenAPIPetApi::SetHttpRetryManager(FHttpRetrySystem::FManager& InRetryManager)
{
	if (RetryManager != &InRetryManager)
	{
		DefaultRetryManager.Reset();
		RetryManager = &InRetryManager;
	}
}

FHttpRetrySystem::FManager& OpenAPIPetApi::GetHttpRetryManager()
{
	checkf(RetryManager, TEXT("OpenAPIPetApi: RetryManager is null.  You may have meant to set it with SetHttpRetryManager first, or you may not be using a custom RetryManager at all."))
	return *RetryManager;
}

FHttpRequestRef OpenAPIPetApi::CreateHttpRequest(const Request& Request) const
{
	if (!Request.GetRetryParams().IsSet())
	{
		return FHttpModule::Get().CreateRequest();
	}
	else
	{
		if (!RetryManager)
		{
			// Create default retry manager if none was specified
			DefaultRetryManager = MakeUnique<HttpRetryManager>(6, 60);
			RetryManager = DefaultRetryManager.Get();
		}

		const HttpRetryParams& Params = Request.GetRetryParams().GetValue();
		return RetryManager->CreateRequest(Params.RetryLimitCountOverride, Params.RetryTimeoutRelativeSecondsOverride, Params.RetryResponseCodes, Params.RetryVerbs, Params.RetryDomains);
	}
}

void OpenAPIPetApi::HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const
{
	InOutResponse.SetHttpResponse(HttpResponse);
	InOutResponse.SetSuccessful(bSucceeded);

	if (bSucceeded && HttpResponse.IsValid())
	{
		InOutResponse.SetHttpResponseCode((EHttpResponseCodes::Type)HttpResponse->GetResponseCode());
		FString ContentType = HttpResponse->GetContentType();
		FString Content;

		if (ContentType.IsEmpty())
		{
			return; // Nothing to parse
		}
		else if (ContentType.StartsWith(TEXT("application/json")) || ContentType.StartsWith("text/json"))
		{
			Content = HttpResponse->GetContentAsString();

			TSharedPtr<FJsonValue> JsonValue;
			auto Reader = TJsonReaderFactory<>::Create(Content);

			if (FJsonSerializer::Deserialize(Reader, JsonValue) && JsonValue.IsValid())
			{
				if (InOutResponse.FromJson(JsonValue))
					return; // Successfully parsed
			}
		}
		else if(ContentType.StartsWith(TEXT("text/plain")))
		{
			Content = HttpResponse->GetContentAsString();
			InOutResponse.SetResponseString(Content);
			return; // Successfully parsed
		}

		// Report the parse error but do not mark the request as unsuccessful. Data could be partial or malformed, but the request succeeded.
		UE_LOG(LogOpenAPI, Error, TEXT("Failed to deserialize Http response content (type:%s):\n%s"), *ContentType , *Content);
		return;
	}

	// By default, assume we failed to establish connection
	InOutResponse.SetHttpResponseCode(EHttpResponseCodes::RequestTimeout);
}

FHttpRequestPtr OpenAPIPetApi::AddPet(const AddPetRequest& Request, const FAddPetDelegate& Delegate /*= FAddPetDelegate()*/) const
{
	if (!IsValid())
		return nullptr;

	FHttpRequestRef HttpRequest = CreateHttpRequest(Request);
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);

	HttpRequest->OnProcessRequestComplete().BindRaw(this, &OpenAPIPetApi::OnAddPetResponse, Delegate);
	HttpRequest->ProcessRequest();
	return HttpRequest;
}

void OpenAPIPetApi::OnAddPetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAddPetDelegate Delegate) const
{
	AddPetResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

FHttpRequestPtr OpenAPIPetApi::DeletePet(const DeletePetRequest& Request, const FDeletePetDelegate& Delegate /*= FDeletePetDelegate()*/) const
{
	if (!IsValid())
		return nullptr;

	FHttpRequestRef HttpRequest = CreateHttpRequest(Request);
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);

	HttpRequest->OnProcessRequestComplete().BindRaw(this, &OpenAPIPetApi::OnDeletePetResponse, Delegate);
	HttpRequest->ProcessRequest();
	return HttpRequest;
}

void OpenAPIPetApi::OnDeletePetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FDeletePetDelegate Delegate) const
{
	DeletePetResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

FHttpRequestPtr OpenAPIPetApi::FindPetsByStatus(const FindPetsByStatusRequest& Request, const FFindPetsByStatusDelegate& Delegate /*= FFindPetsByStatusDelegate()*/) const
{
	if (!IsValid())
		return nullptr;

	FHttpRequestRef HttpRequest = CreateHttpRequest(Request);
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);

	HttpRequest->OnProcessRequestComplete().BindRaw(this, &OpenAPIPetApi::OnFindPetsByStatusResponse, Delegate);
	HttpRequest->ProcessRequest();
	return HttpRequest;
}

void OpenAPIPetApi::OnFindPetsByStatusResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FFindPetsByStatusDelegate Delegate) const
{
	FindPetsByStatusResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

FHttpRequestPtr OpenAPIPetApi::FindPetsByTags(const FindPetsByTagsRequest& Request, const FFindPetsByTagsDelegate& Delegate /*= FFindPetsByTagsDelegate()*/) const
{
	if (!IsValid())
		return nullptr;

	FHttpRequestRef HttpRequest = CreateHttpRequest(Request);
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);

	HttpRequest->OnProcessRequestComplete().BindRaw(this, &OpenAPIPetApi::OnFindPetsByTagsResponse, Delegate);
	HttpRequest->ProcessRequest();
	return HttpRequest;
}

void OpenAPIPetApi::OnFindPetsByTagsResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FFindPetsByTagsDelegate Delegate) const
{
	FindPetsByTagsResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

FHttpRequestPtr OpenAPIPetApi::GetPetById(const GetPetByIdRequest& Request, const FGetPetByIdDelegate& Delegate /*= FGetPetByIdDelegate()*/) const
{
	if (!IsValid())
		return nullptr;

	FHttpRequestRef HttpRequest = CreateHttpRequest(Request);
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);

	HttpRequest->OnProcessRequestComplete().BindRaw(this, &OpenAPIPetApi::OnGetPetByIdResponse, Delegate);
	HttpRequest->ProcessRequest();
	return HttpRequest;
}

void OpenAPIPetApi::OnGetPetByIdResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetPetByIdDelegate Delegate) const
{
	GetPetByIdResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

FHttpRequestPtr OpenAPIPetApi::UpdatePet(const UpdatePetRequest& Request, const FUpdatePetDelegate& Delegate /*= FUpdatePetDelegate()*/) const
{
	if (!IsValid())
		return nullptr;

	FHttpRequestRef HttpRequest = CreateHttpRequest(Request);
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);

	HttpRequest->OnProcessRequestComplete().BindRaw(this, &OpenAPIPetApi::OnUpdatePetResponse, Delegate);
	HttpRequest->ProcessRequest();
	return HttpRequest;
}

void OpenAPIPetApi::OnUpdatePetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FUpdatePetDelegate Delegate) const
{
	UpdatePetResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

FHttpRequestPtr OpenAPIPetApi::UpdatePetWithForm(const UpdatePetWithFormRequest& Request, const FUpdatePetWithFormDelegate& Delegate /*= FUpdatePetWithFormDelegate()*/) const
{
	if (!IsValid())
		return nullptr;

	FHttpRequestRef HttpRequest = CreateHttpRequest(Request);
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);

	HttpRequest->OnProcessRequestComplete().BindRaw(this, &OpenAPIPetApi::OnUpdatePetWithFormResponse, Delegate);
	HttpRequest->ProcessRequest();
	return HttpRequest;
}

void OpenAPIPetApi::OnUpdatePetWithFormResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FUpdatePetWithFormDelegate Delegate) const
{
	UpdatePetWithFormResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

FHttpRequestPtr OpenAPIPetApi::UploadFile(const UploadFileRequest& Request, const FUploadFileDelegate& Delegate /*= FUploadFileDelegate()*/) const
{
	if (!IsValid())
		return nullptr;

	FHttpRequestRef HttpRequest = CreateHttpRequest(Request);
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);

	HttpRequest->OnProcessRequestComplete().BindRaw(this, &OpenAPIPetApi::OnUploadFileResponse, Delegate);
	HttpRequest->ProcessRequest();
	return HttpRequest;
}

void OpenAPIPetApi::OnUploadFileResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FUploadFileDelegate Delegate) const
{
	UploadFileResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

}
