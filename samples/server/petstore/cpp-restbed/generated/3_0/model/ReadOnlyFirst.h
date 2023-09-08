/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.0.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ReadOnlyFirst.h
 *
 * 
 */

#ifndef ReadOnlyFirst_H_
#define ReadOnlyFirst_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ReadOnlyFirst 
{
public:
    ReadOnlyFirst() = default;
    explicit ReadOnlyFirst(boost::property_tree::ptree const& pt);
    virtual ~ReadOnlyFirst() = default;

    ReadOnlyFirst(const ReadOnlyFirst& other) = default; // copy constructor
    ReadOnlyFirst(ReadOnlyFirst&& other) noexcept = default; // move constructor

    ReadOnlyFirst& operator=(const ReadOnlyFirst& other) = default; // copy assignment
    ReadOnlyFirst& operator=(ReadOnlyFirst&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ReadOnlyFirst members

    /// <summary>
    /// 
    /// </summary>
    std::string getBar() const;
    void setBar(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getBaz() const;
    void setBaz(std::string value);

protected:
    std::string m_Bar = "";
    std::string m_Baz = "";
};

std::vector<ReadOnlyFirst> createReadOnlyFirstVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ReadOnlyFirst>(const ReadOnlyFirst& val) {
    return val.toPropertyTree();
}

template<>
inline ReadOnlyFirst fromPt<ReadOnlyFirst>(const boost::property_tree::ptree& pt) {
    ReadOnlyFirst ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ReadOnlyFirst_H_ */
