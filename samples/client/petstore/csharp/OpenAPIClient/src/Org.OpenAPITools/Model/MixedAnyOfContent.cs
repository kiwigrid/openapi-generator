/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using System.Reflection;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Mixed anyOf types for testing
    /// </summary>
    [JsonConverter(typeof(MixedAnyOfContentJsonConverter))]
    [DataContract(Name = "MixedAnyOf_content")]
    public partial class MixedAnyOfContent : AbstractOpenAPISchema, IEquatable<MixedAnyOfContent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MixedAnyOfContent" /> class
        /// with the <see cref="string" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of string.</param>
        public MixedAnyOfContent(string actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MixedAnyOfContent" /> class
        /// with the <see cref="bool" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of bool.</param>
        public MixedAnyOfContent(bool actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MixedAnyOfContent" /> class
        /// with the <see cref="int" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of int.</param>
        public MixedAnyOfContent(int actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MixedAnyOfContent" /> class
        /// with the <see cref="decimal" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of decimal.</param>
        public MixedAnyOfContent(decimal actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MixedAnyOfContent" /> class
        /// with the <see cref="MixedSubId" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of MixedSubId.</param>
        public MixedAnyOfContent(MixedSubId actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(MixedSubId))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(bool))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(decimal))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(int))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(string))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: MixedSubId, bool, decimal, int, string");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `string`. If the actual instance is not `string`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of string</returns>
        public string GetString()
        {
            return (string)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `bool`. If the actual instance is not `bool`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of bool</returns>
        public bool GetBool()
        {
            return (bool)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `int`. If the actual instance is not `int`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of int</returns>
        public int GetInt()
        {
            return (int)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `decimal`. If the actual instance is not `decimal`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of decimal</returns>
        public decimal GetDecimal()
        {
            return (decimal)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `MixedSubId`. If the actual instance is not `MixedSubId`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of MixedSubId</returns>
        public MixedSubId GetMixedSubId()
        {
            return (MixedSubId)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MixedAnyOfContent {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, MixedAnyOfContent.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of MixedAnyOfContent
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of MixedAnyOfContent</returns>
        public static MixedAnyOfContent FromJson(string jsonString)
        {
            MixedAnyOfContent newMixedAnyOfContent = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newMixedAnyOfContent;
            }

            try
            {
                newMixedAnyOfContent = new MixedAnyOfContent(JsonConvert.DeserializeObject<MixedSubId>(jsonString, MixedAnyOfContent.SerializerSettings));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newMixedAnyOfContent;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into MixedSubId: {1}", jsonString, exception.ToString()));
            }

            try
            {
                newMixedAnyOfContent = new MixedAnyOfContent(JsonConvert.DeserializeObject<bool>(jsonString, MixedAnyOfContent.SerializerSettings));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newMixedAnyOfContent;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into bool: {1}", jsonString, exception.ToString()));
            }

            try
            {
                newMixedAnyOfContent = new MixedAnyOfContent(JsonConvert.DeserializeObject<decimal>(jsonString, MixedAnyOfContent.SerializerSettings));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newMixedAnyOfContent;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into decimal: {1}", jsonString, exception.ToString()));
            }

            try
            {
                newMixedAnyOfContent = new MixedAnyOfContent(JsonConvert.DeserializeObject<int>(jsonString, MixedAnyOfContent.SerializerSettings));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newMixedAnyOfContent;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into int: {1}", jsonString, exception.ToString()));
            }

            try
            {
                newMixedAnyOfContent = new MixedAnyOfContent(JsonConvert.DeserializeObject<string>(jsonString, MixedAnyOfContent.SerializerSettings));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newMixedAnyOfContent;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into string: {1}", jsonString, exception.ToString()));
            }

            // no match found, throw an exception
            throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as MixedAnyOfContent).AreEqual;
        }

        /// <summary>
        /// Returns true if MixedAnyOfContent instances are equal
        /// </summary>
        /// <param name="input">Instance of MixedAnyOfContent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MixedAnyOfContent input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input).AreEqual;
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// Custom JSON converter for MixedAnyOfContent
    /// </summary>
    public class MixedAnyOfContentJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(MixedAnyOfContent).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            switch(reader.TokenType) 
            {
                case JsonToken.String: 
                    return new MixedAnyOfContent(Convert.ToString(reader.Value));
                case JsonToken.Boolean: 
                    return new MixedAnyOfContent(Convert.ToBoolean(reader.Value));
                case JsonToken.Integer: 
                    return new MixedAnyOfContent(Convert.ToInt32(reader.Value));
                case JsonToken.Float: 
                    return new MixedAnyOfContent(Convert.ToDecimal(reader.Value));
                case JsonToken.StartObject:
                    return MixedAnyOfContent.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return MixedAnyOfContent.FromJson(JArray.Load(reader).ToString(Formatting.None));
                default:
                    return null;
            }
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
