/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.1.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "Capitalization.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

Capitalization::Capitalization(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Capitalization::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Capitalization::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Capitalization::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("smallCamel", m_SmallCamel);
	pt.put("CapitalCamel", m_CapitalCamel);
	pt.put("small_Snake", m_Small_Snake);
	pt.put("Capital_Snake", m_Capital_Snake);
	pt.put("SCA_ETH_Flow_Points", m_SCA_ETH_Flow_Points);
	pt.put("ATT_NAME", m_ATT_NAME);
	return pt;
}

void Capitalization::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_SmallCamel = pt.get("smallCamel", "");
	m_CapitalCamel = pt.get("CapitalCamel", "");
	m_Small_Snake = pt.get("small_Snake", "");
	m_Capital_Snake = pt.get("Capital_Snake", "");
	m_SCA_ETH_Flow_Points = pt.get("SCA_ETH_Flow_Points", "");
	m_ATT_NAME = pt.get("ATT_NAME", "");
}

std::string Capitalization::getSmallCamel() const
{
    return m_SmallCamel;
}

void Capitalization::setSmallCamel(std::string value)
{
    m_SmallCamel = value;
}


std::string Capitalization::getCapitalCamel() const
{
    return m_CapitalCamel;
}

void Capitalization::setCapitalCamel(std::string value)
{
    m_CapitalCamel = value;
}


std::string Capitalization::getSmallSnake() const
{
    return m_Small_Snake;
}

void Capitalization::setSmallSnake(std::string value)
{
    m_Small_Snake = value;
}


std::string Capitalization::getCapitalSnake() const
{
    return m_Capital_Snake;
}

void Capitalization::setCapitalSnake(std::string value)
{
    m_Capital_Snake = value;
}


std::string Capitalization::getSCAETHFlowPoints() const
{
    return m_SCA_ETH_Flow_Points;
}

void Capitalization::setSCAETHFlowPoints(std::string value)
{
    m_SCA_ETH_Flow_Points = value;
}


std::string Capitalization::getATTNAME() const
{
    return m_ATT_NAME;
}

void Capitalization::setATTNAME(std::string value)
{
    m_ATT_NAME = value;
}



std::vector<Capitalization> createCapitalizationVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Capitalization>();
    for (const auto& child: pt) {
        vec.emplace_back(Capitalization(child.second));
    }

    return vec;
}

}
}
}
}

