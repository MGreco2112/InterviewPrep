package com.company.SQL;

public class WeatherObservationStationXVIII {
//-- a == MIN(lat_n) FROM station = true
//-- b == MIN(long_w) FROM station = true
//-- c == MAX(lat_n) FROM station = true
//-- d == MAX(long_w) FROM station == true
//
//-- SELECT MIN(lat_n) FROM station AS a;
//-- SELECT MIN(long_w) FROM station AS b;
//-- SELECT MAX(lat_n) FROM station AS c;
//-- SELECT MAX(long_w) FROM STATION AS d;
//
//SELECT ROUND(ABS(MIN(lat_n) - MAX(lat_n)) + ABS(MIN(long_w) - MAX(long_w)),
//            4) FROM STATION;
}
