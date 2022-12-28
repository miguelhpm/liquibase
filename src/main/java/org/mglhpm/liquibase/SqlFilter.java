package org.mglhpm.liquibase;

import liquibase.changelog.IncludeAllFilter;
import org.apache.commons.lang3.StringUtils;

public class SqlFilter implements IncludeAllFilter {

    private static final String SUFIJO_XML = ".xml";

    /**
     *
     * @param s
     * @return true: permite el archivo | false: bloquea el archivo
     */
    public boolean include(String s) {
        return StringUtils.endsWithIgnoreCase(s, SUFIJO_XML);
    }
}
