package com.company.SQL;

public class WeatherObservationStationV {
//SELECT CITY, LENGTH(CITY) FROM STATION
//WHERE LENGTH(CITY) IN
//(SELECT MIN(LENGTH(CITY)) FROM STATION)
//ORDER BY CITY ASC LIMIT 1;
//
//SELECT CITY, LENGTH(CITY) FROM STATION
//WHERE LENGTH(CITY) IN
//(SELECT MAX(LENGTH(CITY)) FROM STATION)
//ORDER BY CITY ASC LIMIT 1;
}
//REMINDER!!! The subquery runs first, then the where condition is compared to the return of the subquery
//this is return is then formatted into the select fields and the order by and limit clauses are applied as filters