SELECT SUM(CITY.POPULATION) FROM CITY JOIN COUNTRY ON CITY.COUNTRYCODE = COUNTRY.CODE WHERE CONTINENT = "Asia";