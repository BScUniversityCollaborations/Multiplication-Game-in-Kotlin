package com.unipi.p17172p17168p17164.multiplicationgame.utils

import com.google.android.material.behavior.SwipeDismissBehavior
import com.google.android.material.snackbar.BaseTransientBottomBar
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter

// Create a custom object to declare all the constant values in a single file. The constant values declared here is can be used in whole application.
/**
 * A custom object to declare all the constant values in a single file. The constant values declared here is can be used in whole application.
 */
object Constants {

    // General Constants
    const val TAG: String = "[MultiplicationGame]"
    const val SHARED_PREFERENCES_PREFIX: String = "MultiplicationGamePrefs"
    const val LOGGED_IN_EMAIL: String = "logged_in_email"
    const val SPLASH_SCREEN_DELAY: Long = 1500
    const val VOLUME_MEDIUM: Float = 75f
    const val VOLUME_MAX: Float = 100f
    const val DEFAULT_TEST_TIMER_DELAY: Long = 60000
    val DATE_FORMAT: SimpleDateFormat = SimpleDateFormat("dd-MM-yyyy")
    val SNACKBAR_BEHAVIOR = BaseTransientBottomBar.Behavior().apply {
        setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_ANY) }

    // Firebase Constants
    // This is used for the collection name for USERS.
    const val COLLECTION_USERS: String = "users"
    const val COLLECTION_TABLES: String = "tables"
    const val COLLECTION_USER_LOGS: String = "users_logs"
    const val COLLECTION_WARNINGS: String = "warnings"

    // Fields
    const val FIELD_DATE_ADDED: String = "dateAdded"
    const val FIELD_DATE_REGISTERED: String = "dateRegistered"
    const val FIELD_TYPE: String = "type"
    const val FIELD_LOG_ID: String = "logId"
    const val FIELD_EMAIL: String = "email"
    const val FIELD_FULL_NAME: String = "fullName"
    const val FIELD_ID: String = "id"
    const val FIELD_NUM_FIRST: String = "numFirst"
    const val FIELD_NUM_SECOND: String = "numSecond"
    const val FIELD_TABLE_ID: String = "tableId"
    const val FIELD_NUMBER: String = "number"
    const val FIELD_LIMIT: String = "limit"
    const val FIELD_NAME: String = "name"
    const val FIELD_DESC: String = "desc"
    const val FIELD_USER_ID: String = "userId"
    const val TYPE_SKIP: String = "skip"
    const val TYPE_TIME_UP: String = "time_up"
    const val TYPE_MISTAKE: String = "mistake"
    const val TYPE_SOLVED: String = "solved"

    // Intent Extras
    const val EXTRA_USER_EMAIL: String = "extraUserEmail"
    const val EXTRA_USER_DETAILS: String = "extraUserDetails"
    const val EXTRA_NUMBER_FIRST: String = "extraNumberFirst"
    const val EXTRA_NUMBER_SECOND: String = "extraNumberSecond"
    const val EXTRA_CORRECT_ANSWERS: String = "extraCorrectAnswers"
    const val EXTRA_WRONG_ANSWERS: String = "extraWrongAnswers"
    const val EXTRA_LIMIT: String = "extraLimit"
    const val EXTRA_REG_USERS_SNACKBAR: String = "extraShowRegisteredUserSnackbar"
    const val EXTRA_SUCCESS_SNACKBAR: String = "extraShowSuccessSnackbar"
}
// END