package by.itacademy.profiler.usecasses.util;

public class ValidationConstants {
    public static final String REGEXP_VALIDATE_EMAIL = "^(?=.{6,50}$)[\\s]*[a-zA-Z0-9]+([!\"#$%&'()*+,\\-.\\/:;<=>?\\[\\]\\^_{}][a-zA-z0-9]+)*@([\\w]+(-[\\w]+)?)(\\.[\\w]+[-][\\w]+)*(\\.[a-z]{2,})+[\\s]*$";

    public static final String REGEXP_VALIDATE_NAME = "^(?=.{1,50}$)[a-zA-Z]+(?:[-' ][a-zA-Z]+)*$";

    public static final String REGEXP_VALIDATE_SURNAME = "^(?=.{1,50}$)[a-zA-Z]+(?:[-' ][a-zA-Z]+)*$";

    public static final String REGEXP_VALIDATE_CELL_PHONE = "^(?=.{1,25}$)[0-9]*$";

    public static final String REGEXP_VALIDATE_CITY = "^(?=.{1,50}$)[a-zA-Z]+(?:[-' ][a-zA-Z]+)*$";
}