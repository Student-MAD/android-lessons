package com.kgoncharov.recyclerview

import android.content.Context

class PreferenceManager(context: Context) {

    companion object {
        private const val PREFERENCES_NAME = "preferences"
        private const val KEY_VALUE = "key"
        private const val KEY_SECOND_VALUE = "key2"
    }

    private val preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

    var testValue: String
        get() = preferences.getString(KEY_VALUE, null) ?: ""
        set(value) = preferences
            .edit()
            .putString(KEY_VALUE, value)
            .apply()

    var secondValue: Boolean
        get() = preferences.getBoolean(KEY_SECOND_VALUE, false)
        set(value) = preferences
            .edit()
            .putBoolean(KEY_SECOND_VALUE, value)
            .apply()
}