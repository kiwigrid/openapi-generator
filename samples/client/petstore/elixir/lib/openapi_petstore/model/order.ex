# NOTE: This file is auto generated by OpenAPI Generator 7.0.1-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.Order do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :petId,
    :quantity,
    :shipDate,
    :status,
    :complete
  ]

  @type t :: %__MODULE__{
    :id => integer() | nil,
    :petId => integer() | nil,
    :quantity => integer() | nil,
    :shipDate => DateTime.t | nil,
    :status => String.t | nil,
    :complete => boolean() | nil
  }

  alias OpenapiPetstore.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:shipDate, :datetime, nil)
  end
end

