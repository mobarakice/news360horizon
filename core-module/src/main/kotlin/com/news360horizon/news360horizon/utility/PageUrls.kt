package com.news360horizon.news360horizon.utility

object PageUrls {
    private const val CONTEXT_PATH = ""

    const val ADMIN_LOGIN_PAGE = "$CONTEXT_PATH/login"
    const val ADMIN_REGISTRATION_PAGE = "$CONTEXT_PATH/admin/registration"
    const val CHANGED_PASSWORD_PAGE = "$CONTEXT_PATH/admin/change-password"

    const val FORGET_PASSWORD_PAGE = "$CONTEXT_PATH/forgot-password"


    const val HOME_PAGE = "$CONTEXT_PATH/admin/home"

    const val CONTENT_LIST_PAGE = "$CONTEXT_PATH/admin/content-list"
    const val CONTENT_SEARCH_PAGE = "$CONTEXT_PATH/admin/search-content"
    const val CONTENT_ADD_PAGE = "$CONTEXT_PATH/admin/content"
    const val CONTENT_EDIT_PAGE = "$CONTEXT_PATH/admin/edit-content"

    const val CATEGORY_LIST_PAGE = "$CONTEXT_PATH/admin/category-list"
    const val CATEGORY_PAGE = "$CONTEXT_PATH/admin/category"
    const val CATEGORY_EDIT_PAGE = "$CONTEXT_PATH/admin/edit-category"

    const val PREFERENCE_LIST_PAGE = "$CONTEXT_PATH/admin/preference-list"
    const val PREFERENCE_PAGE = "$CONTEXT_PATH/admin/preference"
    const val PREFERENCE_EDIT_PAGE = "$CONTEXT_PATH/admin/edit-preference"

    const val ADS_LIST_PAGE = "$CONTEXT_PATH/admin/native-ads-list"
    const val ADS_PAGE = "$CONTEXT_PATH/admin/native-ads"
    const val ADS_EDIT_PAGE = "$CONTEXT_PATH/admin/edit-native-ads"

    const val ERROR_PAGE = "$CONTEXT_PATH/access-denied"
}