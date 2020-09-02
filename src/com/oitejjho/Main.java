package com.oitejjho;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //        System.out.println("hello");
//
//        String date = DateTimeUtil.formatDateTime("2018-03-29T14:46:36.000+07:00", DateFormatConstants.DATE_TIME_FORMAT_YYYY_MM_DD_SSS_WITH_OFFSET_XXX, DateFormatConstants.DATETIME_FORMAT_YYYY_MM_DD_HH_MM_SS_WITH_HYPHEN);
//        System.out.println(date);
        //System.out.println(DateTimeUtil.formatDateTime("2018-03-29T14:46:36.000+0700", DateFormatConstants.DATE_TIME_FORMAT_YYYY_MM_DD_WITH_OFFSET, DateFormatConstants.DATETIME_FORMAT_YYYY_MM_DD_HH_MM_SS_WITH_HYPHEN));


        String dateFormatter = "yyyy[-][/][:]MM[-][/][:]dd[][[ ]['T']HH[-][/][:]mm[-][/][:][ss][.SSS][XXX][Z]]";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormatter);

        /*LocalDate localDate = LocalDate.parse("2014-02-18", dateTimeFormatter);
        localDate = LocalDate.parse("2014/02/18", dateTimeFormatter);
        localDate = LocalDate.parse("2014:02:18", dateTimeFormatter);

        LocalDateTime localDateTime = LocalDateTime.parse("2014-02-18 12-12", dateTimeFormatter);
        localDateTime = LocalDateTime.parse("2014/02/18 12/12", dateTimeFormatter);
        localDateTime = LocalDateTime.parse("2014:02:18 12:12", dateTimeFormatter);

        localDateTime = LocalDateTime.parse("2014-02-18 12-12-12", dateTimeFormatter);
        localDateTime = LocalDateTime.parse("2014/02/18 12/12/12", dateTimeFormatter);
        localDateTime = LocalDateTime.parse("2014:02:18 12:12:12", dateTimeFormatter);

        localDateTime = LocalDateTime.parse("2014-02-18 12-12-12.777", dateTimeFormatter);
        localDateTime = LocalDateTime.parse("2014/02/18 12/12/12.777", dateTimeFormatter);
        localDateTime = LocalDateTime.parse("2014:02:18 12:12:12.777", dateTimeFormatter);

        localDateTime = LocalDateTime.parse("2014-02-18T12-12-12.777", dateTimeFormatter);
        localDateTime = LocalDateTime.parse("2014/02/18T12/12/12.777", dateTimeFormatter);
        localDateTime = LocalDateTime.parse("2014:02:18T12:12:12.777", dateTimeFormatter);*/



//        LocalDateTime localDateTime = LocalDateTime.parse("2014-02-18T12-12-12.777+0700", dateTimeFormatter);
//        localDateTime = LocalDateTime.now();
//        localDateTime = LocalDateTime.parse("2014/02/18T12/12/12.777+0700", dateTimeFormatter);
//        localDateTime = LocalDateTime.parse("2014:02:18T12:12:12.777+0700", dateTimeFormatter);

//        LocalDateTime localDateTime = LocalDateTime.parse("25/03/2020 11:37:38", dateTimeFormatter);
        LocalDateTime localDateTime1 = LocalDateTime.parse("2018-03-29T14:46:36.000+07:00", dateTimeFormatter);
//        localDateTime = LocalDateTime.parse("2014/02/18T12/12/12.777+07:00", dateTimeFormatter);
//        localDateTime = LocalDateTime.parse("2014:02:18T12:12:12.777+07:00", dateTimeFormatter);

//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//        zonedDateTime = ZonedDateTime.now().parse(dateFormatter);

//        ZonedDateTime dateTime = ZonedDateTime.parse("2014-02-18T12-12-12.777+07:00", dateTimeFormatter);
//        System.out.println(dateTime);
    }
}
