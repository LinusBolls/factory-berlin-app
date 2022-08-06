package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.Serializable;

public class PropertyNamingStrategy implements Serializable {
    public static final PropertyNamingStrategy SNAKE_CASE = new SnakeCaseStrategy();
    public static final PropertyNamingStrategy UPPER_CAMEL_CASE = new UpperCamelCaseStrategy();

    public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy {
        public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
            return translate(str);
        }

        public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
            return translate(str);
        }

        public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        public abstract String translate(String str);
    }

    public static class SnakeCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = str.charAt(i3);
                if (i3 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z && i2 > 0 && sb.charAt(i2 - 1) != '_') {
                            sb.append('_');
                            i2++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(charAt);
                    i2++;
                }
            }
            return i2 > 0 ? sb.toString() : str;
        }
    }

    public static class UpperCamelCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            char charAt;
            char upperCase;
            if (str == null || str.length() == 0 || (charAt = str.charAt(0)) == (upperCase = Character.toUpperCase(charAt))) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, upperCase);
            return sb.toString();
        }
    }

    public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
        return str;
    }

    public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
        return str;
    }

    public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }

    public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }
}
