/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.distribution.hotel_api_model.auto.util;

/*
 * #%L
 * Hotel API SDK Model
 * %%
 * Copyright (C) 2015 HOTELBEDS TECHNOLOGY, S.L.U.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */


import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.hotelbeds.distribution.hotel_api_model.auto.common.SimpleTypes.SiNo;
import com.hotelbeds.distribution.hotel_api_model.auto.common.SimpleTypes.YesNo;

public final class AssignUtils {
    public static final String DEFAULT_DATE_FORMAT = "yyyyMMdd";
    public static final DateTimeFormatter DEFAULT_DATE_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
    public static final String DEFAULT_TIME_FORMAT = "HHmm";
    public static final DateTimeFormatter DEFAULT_TIME_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_TIME_FORMAT);
    public static final String DEFAULT_DATE_TIME_FORMAT = DEFAULT_DATE_FORMAT + " " + DEFAULT_TIME_FORMAT;
    public static final DateTimeFormatter DEFAULT_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT);
    public static final DateTimeFormatter REST_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final int HOUR_SECONDS = 3600;
    private static final int PRICE_NUMBER_OF_DECIMALS = 2;
    private static final int PERCENTAGE_NUMBER_OF_DECIMALS = 2;
    public static final String COMMA_SEPARATOR = ",";

    private AssignUtils() {
    }

    public static Timestamp getTimestamp(final LocalDateTime datetime) {
        return datetime != null ? Timestamp.valueOf(datetime) : null;
    }

    public static Timestamp getTimestamp(final LocalDate date) {
        return date != null ? Timestamp.valueOf(date.atStartOfDay()) : null;
    }

    public static Timestamp getTimestamp(final ZonedDateTime date) {
        return date != null ? Timestamp.from(date.toInstant()) : null;
    }

    public static LocalDate getLocalDate(final Date date) {
        return date != null ? date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate() : null;
    }

    public static LocalTime getLocalTime(final Timestamp timestamp) {
        return timestamp != null ? timestamp.toLocalDateTime().toLocalTime() : null;
    }

    public static ZonedDateTime getZonedDateTime(final Timestamp timestamp) {
        return timestamp != null ? ZonedDateTime.ofInstant(timestamp.toInstant(), ZoneId.systemDefault()) : null;
    }

    public static Date getDate(final LocalDateTime localDateTime) {
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    public static Date getDate(final LocalDate localDate) {
        Instant instant = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    public static LocalDateTime getLocalDateTime(final Timestamp timestamp) {
        // empty method
        return timestamp != null ? timestamp.toLocalDateTime() : null;
    }

    public static LocalDateTime getLocalDateTime(Date date) {
        Instant instant = Instant.ofEpochMilli(date.getTime());
        LocalDateTime res = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return res;
    }

    public static LocalDate getLocalDate(final String date) {
        return getLocalDate(date, DEFAULT_DATE_FORMATTER);
    }

    public static LocalDate getLocalDate(final String date, final DateTimeFormatter formatter) {
        return date != null ? LocalDate.parse(date, formatter) : null;
    }

    public static LocalDateTime getLocalDateTime(final LocalDate date) {
        return getLocalDateTime(getTimestamp(date));
    }

    public static BigInteger getHourDifference(final ZoneOffset zoneOffset) {
        return zoneOffset != null ? BigInteger.valueOf(zoneOffset.get(ChronoField.OFFSET_SECONDS) / HOUR_SECONDS) : null;
    }

    public static LocalTime getTime(final String time, final DateTimeFormatter formatter) {
        return time != null ? LocalTime.parse(time, formatter) : null;
    }

    public static String getString(final LocalTime time, final DateTimeFormatter formatter) {
        return time != null ? time.format(formatter) : null;
    }

    public static String getString(final LocalDate date, final DateTimeFormatter formatter) {
        return date != null ? date.format(formatter) : null;
    }

    public static String getString(final LocalDateTime dateTime, final DateTimeFormatter formatter) {
        return dateTime != null ? dateTime.format(formatter) : null;
    }

    public static String getString(final LocalDate time) {
        return getString(time, DEFAULT_DATE_FORMATTER);
    }

    public static String getString(final List<String> stringList) {
        return getString(null, stringList);
    }

    public static String getString(final String separator, final List<String> stringList) {
        String result = null;
        if (stringList != null && !stringList.isEmpty()) {
            result = String.join(StringUtils.isNotEmpty(separator) ? separator : COMMA_SEPARATOR, stringList);
        }
        return result;
    }

    public static ZoneOffset getZoneOffset(final BigDecimal hourDifference) {
        int auxValue = 0;
        if (hourDifference != null) {
            auxValue = hourDifference.intValue();
        }
        return ZoneOffset.ofHours(auxValue);
    }

    public static String getString(final Integer number) {
        return number != null ? number.toString() : null;
    }

    public static String getString(final Float number) {
        return number != null ? number.toString() : null;
    }

    public static String getString(final Double number) {
        return number != null ? number.toString() : null;
    }

    public static String getStringNotEmpty(final String string) {
        return StringUtils.isNotEmpty(string) ? string : null;
    }

    public static String getStringNotBlank(final String string) {
        return StringUtils.isNotBlank(string) ? string : null;
    }

    public static Integer safeInteger(final BigDecimal number) {
        Integer result = null;
        if (number != null) {
            result = number.intValue();
        }
        return result;
    }

    public static Integer safeInteger(final String number) {
        Integer result = null;
        if (StringUtils.isNotEmpty(number)) {
            result = Integer.parseInt(number);
        }
        return result;
    }

    public static BigDecimal safeBigDecimal(final String number, final int newScale) {
        BigDecimal result = null;
        if (StringUtils.isNotEmpty(number)) {
            result = new BigDecimal(number, MathContext.DECIMAL64).setScale(newScale, BigDecimal.ROUND_HALF_EVEN);
        }
        return result;
    }

    public static Double safeDouble(final String number) {
        Double result = null;
        if (StringUtils.isNotEmpty(number)) {
            result = Double.parseDouble(number);
        }
        return result;
    }

    public static Short safeShort(final String number) {
        Short result = null;
        if (StringUtils.isNotEmpty(number)) {
            result = Short.parseShort(number);
        }
        return result;
    }

    public static Boolean safeBoolean(final String stringSY) {
        Boolean result = Boolean.FALSE;
        if (StringUtils.isNotEmpty(stringSY) && (SiNo.S.name().equals(stringSY) || YesNo.Y.name().equals(stringSY))) {
            result = Boolean.TRUE;
        }
        return result;
    }

    public static BigDecimal getBigDecimalForPriceTag(final Double amount) {
        if (amount == null) {
            return null;
        }
        return new BigDecimal(amount).setScale(PRICE_NUMBER_OF_DECIMALS, BigDecimal.ROUND_HALF_EVEN);
    }

    public static BigDecimal getBigDecimalForPercentageTag(String amount) {
        return safeBigDecimal(amount, PERCENTAGE_NUMBER_OF_DECIMALS);
    }

    public static BigDecimal getBigDecimalForPercentageTag(Double amount) {
        if (amount == null) {
            return null;
        }
        return new BigDecimal(amount).setScale(PERCENTAGE_NUMBER_OF_DECIMALS, BigDecimal.ROUND_HALF_EVEN);
    }

    public static BigDecimal getBigDecimalForPercentageTag(BigDecimal amount) {
        if (amount == null) {
            return null;
        }
        return amount.setScale(PERCENTAGE_NUMBER_OF_DECIMALS, BigDecimal.ROUND_HALF_EVEN);
    }

    public static BigDecimal getBigDecimalForPriceTag(BigDecimal amount) {
        if (amount == null) {
            return null;
        }
        return amount.setScale(PRICE_NUMBER_OF_DECIMALS, BigDecimal.ROUND_HALF_EVEN);
    }

    public static BigDecimal getBigDecimalForPriceTag(String amount) {
        return safeBigDecimal(amount, PRICE_NUMBER_OF_DECIMALS);
    }

    public static BigDecimal getBigDecimalForPriceTag(float amount) {
        return getBigDecimalForPriceTag(new BigDecimal(amount));
    }

    public static BigDecimal getBigDecimalForPercentageTag(float amount) {
        return getBigDecimalForPercentageTag(new BigDecimal(amount));
    }
}
