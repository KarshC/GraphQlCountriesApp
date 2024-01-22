package com.plcoding.graphqlcountriesapp.domain

interface CountryClient {
    suspend fun getCountries(): List<SimpleCountry>
    suspend fun getDetailedCountry(code: String): DetailedCountry?
}