package org.common.enums.urls;

import org.common.enums.Ports;

public enum CategoryUrl {
//    CATALOG_SERVICE_BASE("http://catalog_service:" + Ports.CATALOG_SERVICE_PORT),
    CATALOG_SERVICE_BASE("http://localhost:" + Ports.CATALOG_SERVICE_PORT.getPort()),
    CATEGORY_API_PATH("/api/category"),
    CATEGORY_ADMIN_API_PATH("/api/admin/category"),
    CATEGORY_ID_PARAMETER(":category-id"),
    GET_ALL_BOOKS_BY_CATEGORY_ID("/" + CATEGORY_ID_PARAMETER.getUrl()),
    CREATE_CATEGORY_PATH(""),
    UPDATE_CATEGORY_BY_ID_PATH("/" + CATEGORY_ID_PARAMETER.getUrl()),
    DELETE_CATEGORY_BY_ID_PATH("/" + CATEGORY_ID_PARAMETER.getUrl());
    private final String url;

    CategoryUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}