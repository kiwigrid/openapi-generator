# NOTE: This file is auto generated by OpenAPI Generator 7.0.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.EnumArrays do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :just_symbol,
    :array_enum
  ]

  @type t :: %__MODULE__{
    :just_symbol => String.t | nil,
    :array_enum => [String.t] | nil
  }

  def decode(value) do
    value
  end
end

